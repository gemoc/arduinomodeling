/**
 *  Copyright (c) 2013 Obeo.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *    Obeo - initial API and implementation
 */
package fr.obeo.dsl.arduino.design.services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.ECrossReferenceAdapter;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.sirius.business.api.dialect.DialectManager;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.diagram.DDiagram;
import org.eclipse.sirius.diagram.DDiagramElement;
import org.eclipse.sirius.diagram.DEdge;
import org.eclipse.sirius.ui.business.api.dialect.DialectUIManager;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.sirius.viewpoint.DSemanticDecorator;
import org.eclipse.sirius.viewpoint.description.RepresentationDescription;
import org.eclipse.sirius.viewpoint.description.Viewpoint;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;

import fr.obeo.dsl.arduino.Actuator;
import fr.obeo.dsl.arduino.AnalogPin;
import fr.obeo.dsl.arduino.ArduinoAnalogModule;
import fr.obeo.dsl.arduino.ArduinoBoard;
import fr.obeo.dsl.arduino.ArduinoDigitalModule;
import fr.obeo.dsl.arduino.ArduinoFactory;
import fr.obeo.dsl.arduino.BinaryBooleanExpression;
import fr.obeo.dsl.arduino.BinaryBooleanOperatorKind;
import fr.obeo.dsl.arduino.BinaryExpression;
import fr.obeo.dsl.arduino.BinaryIntegerExpression;
import fr.obeo.dsl.arduino.BinaryIntegerOperatorKind;
import fr.obeo.dsl.arduino.Block;
import fr.obeo.dsl.arduino.Board;
import fr.obeo.dsl.arduino.BooleanConstant;
import fr.obeo.dsl.arduino.BooleanExpression;
import fr.obeo.dsl.arduino.BooleanModuleGet;
import fr.obeo.dsl.arduino.Constant;
import fr.obeo.dsl.arduino.DigitalPin;
import fr.obeo.dsl.arduino.Expression;
import fr.obeo.dsl.arduino.If;
import fr.obeo.dsl.arduino.Instruction;
import fr.obeo.dsl.arduino.IntegerConstant;
import fr.obeo.dsl.arduino.IntegerModuleGet;
import fr.obeo.dsl.arduino.Module;
import fr.obeo.dsl.arduino.ModuleAssignment;
import fr.obeo.dsl.arduino.ModuleGet;
import fr.obeo.dsl.arduino.ModuleInstruction;
import fr.obeo.dsl.arduino.Pin;
import fr.obeo.dsl.arduino.Project;
import fr.obeo.dsl.arduino.Sensor;
import fr.obeo.dsl.arduino.Sketch;
import fr.obeo.dsl.arduino.UnaryBooleanExpression;
import fr.obeo.dsl.arduino.UnaryBooleanOperatorKind;
import fr.obeo.dsl.arduino.UnaryExpression;
import fr.obeo.dsl.arduino.UnaryIntegerExpression;
import fr.obeo.dsl.arduino.UnaryIntegerOperatorKind;
import fr.obeo.dsl.arduino.Variable;
import fr.obeo.dsl.arduino.VariableAssignment;
import fr.obeo.dsl.arduino.VariableDeclaration;
import fr.obeo.dsl.arduino.While;

public class ArduinoServices {

	private static final String IMAGES_PATH = "/fr.obeo.dsl.arduino.design/images/";

	public void updateDigitalPins(ArduinoBoard platform, String totalOfPins) {
		List<DigitalPin> pinsTmp = new ArrayList<DigitalPin>();
		pinsTmp.addAll(platform.getDigitalPins());

		int total = Integer.parseInt(totalOfPins);
		if (total > platform.getDigitalPins().size()) {
			// Create missing pins
			for (int i = pinsTmp.size(); i < total; i++) {
				DigitalPin pin = ArduinoFactory.eINSTANCE.createDigitalPin();
				pin.setId(i);
				platform.getDigitalPins().add(pin);
			}
		} else {
			if (total > 0) {
				// Delete the other pins
				for (int i = total; i < pinsTmp.size(); i++) {
					DigitalPin pin = pinsTmp.get(i);
					EcoreUtil.delete(pin);
				}
			} else {
				platform.getDigitalPins().clear();
			}
		}
	}

	public void updateAnalogPins(ArduinoBoard platform, String totalOfPins) {
		List<AnalogPin> pinsTmp = new ArrayList<AnalogPin>();
		pinsTmp.addAll(platform.getAnalogPins());

		int total = Integer.parseInt(totalOfPins);
		if (total > platform.getAnalogPins().size()) {
			// Create missing pins
			for (int i = pinsTmp.size(); i < total; i++) {
				AnalogPin pin = ArduinoFactory.eINSTANCE.createAnalogPin();
				pin.setId(i);
				platform.getAnalogPins().add(pin);
			}
		} else {
			if (total > 0) {
				// Delete the other pins
				for (int i = total; i < pinsTmp.size(); i++) {
					AnalogPin pin = pinsTmp.get(i);
					EcoreUtil.delete(pin);
				}
			} else {
				platform.getAnalogPins().clear();
			}
		}
	}

	public Module getModule(Pin pin) {
		Module res = null;
		if (pin instanceof AnalogPin) {
			res = ((AnalogPin) pin).getModule();
		} else if (pin instanceof DigitalPin) {
			res = ((DigitalPin) pin).getModule();
		}
		return res;
	}

	public String getImage(Module module) {
//		String imageName = module.getImage();
		return getImage("");
	}

	public String getImage(ArduinoBoard platform) {
//		String imageName = platform.getImage();
		return getImage("");
	}

	private String getImage(String imageName) {
		if (imageName != null && imageName.length() > 0) {
			return IMAGES_PATH + imageName;
		}
		return IMAGES_PATH + "default.svg";
	}

	public List<Board> getPlatforms(EObject object) {
		List<Board> result = Lists.newArrayList();
		Session session = SessionManager.INSTANCE.getSession(object);

		for (Resource resource : session.getSemanticResources()) {
			for (Iterator<EObject> iterator = resource.getAllContents(); iterator
					.hasNext();) {
				EObject content = iterator.next();
				if (content instanceof Board) {
					result.add((Board) content);
				}
			}
		}

		return result;
	}

	public List<Module> getModules(EObject object) {
		List<Module> result = Lists.newArrayList();
		Session session = SessionManager.INSTANCE.getSession(object);

		for (Resource resource : session.getSemanticResources()) {
			for (Iterator<EObject> iterator = resource.getAllContents(); iterator
					.hasNext();) {
				EObject content = iterator.next();
				if (content instanceof Module) {
					result.add((Module) content);
				}
			}
		}
		return result;
	}

	public List<Module> getActuators(Sketch sketch) {
		List<Module> result = new ArrayList<>();
		List<Module> modules = ImmutableList
				.copyOf(getConnectedModules(sketch.getProject().getBoard()));

		for (Module module : modules) {
			if (module instanceof Actuator) {
				result.add(module);
			}
		}
		return result;
	}

	public List<Module> getSensors(Sketch sketch) {
		List<Module> result = new ArrayList<>();
		List<Module> modules = ImmutableList
				.copyOf(getConnectedModules(sketch.getProject().getBoard()));

		for (Module module : modules) {
			if (module instanceof Sensor) {
				result.add(module);
			}
		}
		return result;
	}

	public List<Module> getLevelModules(Sketch sketch) {
		List<Module> result = new ArrayList<Module>();
		List<Module> modules = ImmutableList.copyOf(getActuators(sketch));

		for (Module module : modules) {
			if (module.isLevel()) {
				result.add(module);
			}
		}
		return result;
	}

	public Sketch getSketch(EObject eObject) {
		if (eObject instanceof Sketch) {
			return (Sketch) eObject;
		}

		while (eObject != null && !(eObject instanceof Sketch)) {
			eObject = eObject.eContainer();
		}

		return (Sketch) eObject;
	}

	private List<Module> getConnectedModules(Board board) {
		List<Module> result = new ArrayList<>();
		if (board instanceof ArduinoBoard) {
			ArduinoBoard arduinoBoard = (ArduinoBoard) board;
			for (AnalogPin pin : arduinoBoard.getAnalogPins()) {
				final Module module = pin.getModule();
				if (module != null) {
					result.add(module);
				}
			}
			for (DigitalPin pin : arduinoBoard.getDigitalPins()) {
				final Module module = pin.getModule();
				if (module != null) {
					result.add(module);
				}
			}
		}
		return result;
	}

	public String computeExpressionLabel(fr.obeo.dsl.arduino.ModuleAssignment e) {
		String label = e.getModule().getName();
		if (e.getOperand() instanceof BooleanConstant) {
			if (((BooleanConstant)e.getOperand()).isValue()){
				label += " : on";
			}else{
				label += " : off";
			}
		}
		if (e.getOperand() instanceof IntegerConstant) {
			label += " : "+((IntegerConstant)e.getOperand()).getValue();
		}
		return label;
	}

	public String computeExpressionLabel(fr.obeo.dsl.arduino.Module e) {
		String label = e.getName();
		return label;
	}
	
	public String computeLinkLabel(DDiagramElement edgeLink) {
		String label = "";
		if (edgeLink instanceof DEdge
				&& ((DEdge) edgeLink).getTargetNode() instanceof DSemanticDecorator) {
			EObject target = ((DSemanticDecorator) ((DEdge) edgeLink)
					.getTargetNode()).getTarget();
			if (target instanceof ModuleAssignment) {
				ModuleAssignment ms = (ModuleAssignment) target;
				if (ms.getOperand() instanceof BooleanConstant) {
					if (((BooleanConstant)ms.getOperand()).isValue()){
						label = "on";
					}else{
						label = "off";
					}
				}
			}
		}

		return label;
	}


	public String computeLabel(Expression Expression) {
		if (Expression instanceof Variable) {
			return ((Variable) Expression).getName();
		}
		if (Expression instanceof BooleanConstant) {
			return String.valueOf(((BooleanConstant) Expression).isValue());
		}
		if (Expression instanceof IntegerConstant) {
			return String.valueOf(((IntegerConstant) Expression).getValue());
		}
		if (Expression instanceof ModuleGet) {
			return "get("+((ModuleGet) Expression).getModule().getName()+")";
		}
		if (Expression instanceof BinaryBooleanExpression) {
			String label = "";
			label += computeLabel(((BinaryBooleanExpression)Expression).getLeft()) + " ";
			label += getOperator(((BinaryBooleanExpression)Expression).getOperator());
			label += " " + computeLabel(((BinaryBooleanExpression)Expression).getRight());
			return label;
		}
		if (Expression instanceof BinaryIntegerExpression) {
			return "(" + computeLabel(((BinaryExpression) Expression).getLeft())
					+ getOperator(((BinaryIntegerExpression) Expression).getOperator())
					+ computeLabel(((BinaryExpression) Expression).getRight()) + ")";
		}
		if (Expression instanceof BinaryBooleanExpression) {
			return "(" + computeLabel(((BinaryExpression) Expression).getLeft())
					+ getOperator(((BinaryBooleanExpression) Expression).getOperator())
					+ computeLabel(((BinaryExpression) Expression).getRight()) + ")";
		}


		return "null";
	}


	public String computeLabel(While instruction) {
		String label = "While ";
		if (instruction.getCondition() == null){
			label+= "null condition";
			return label;
		}
		Expression cond = instruction.getCondition();
		if (cond instanceof BinaryBooleanExpression 
				&& ((BinaryBooleanExpression)instruction.getCondition()).getLeft() != null
				&& ((BinaryBooleanExpression)instruction.getCondition()).getRight() != null) {
			label += computeLabel(((BinaryBooleanExpression)cond).getLeft()) + " ";
			label += getOperator(((BinaryBooleanExpression)cond).getOperator());
			label += " " + computeLabel(((BinaryBooleanExpression)cond).getRight());
		}
		if (cond instanceof BooleanModuleGet 
				&& 
			((BooleanModuleGet)cond).getModule() != null) {
			label += computeLabel(cond);
		}
		
		return label;
	}

	public String computeLabelOperator(BinaryIntegerOperatorKind operator) {
		return getOperator(operator);
	}
	public String computeLabelOperator(BinaryBooleanOperatorKind operator) {
		return getOperator(operator);
	}
	public String computeLabelOperator(UnaryIntegerOperatorKind operator) {
		return getOperator(operator);
	}
	public String computeLabelOperator(UnaryBooleanOperatorKind operator) {
		return getOperator(operator);
	}

	public String computeLabelOperator(BinaryIntegerExpression operator) {
		return getOperator(operator.getOperator());
	}
	public String computeLabelOperator(BinaryBooleanExpression operator) {
		return getOperator(operator.getOperator());
	}
	public String computeLabelOperator(UnaryIntegerExpression operator) {
		return getOperator(operator.getOperator());
	}
	public String computeLabelOperator(UnaryBooleanExpression operator) {
		return getOperator(operator.getOperator());
	}
	
	public String computeLabel(ModuleGet instruction) {
		return instruction.getModule().getName();
	}
	public String computeLabel(IntegerModuleGet instruction) {
		return instruction.getModule().getName();
	}
	public String computeLabel(BooleanModuleGet instruction) {
		return instruction.getModule().getName();
	}

	public String computeLabel(If instruction) {
		String label = "If ";
		if (instruction.getCondition() != null) {
			label += computeLabel(instruction.getCondition());
		}
		return label;
	}

	public String computeLabel(VariableAssignment set) {
		String label = "Set ";
		if (set.getVariable() != null && set.getOperand() != null) {
			label += set.getVariable().getName() + " = "
					+ computeLabel(set.getOperand());
		}
		return label;
	}

	public String computeLabel(String operator) {
		return getOperator(getOperator(operator));
	}

	public String getOperator(Enumerator operator) {
		return "operator not supported";
	}
	public String getOperator(BinaryIntegerOperatorKind operator) {
		switch (operator) {
		case DIV:
			return "/";
		case MAX:
			return "max";
		case MIN:
			return "min";
		case MINUS:
			return "-";
		case MUL:
			return "*";
		case PLUS:
			return "+";
		case POURCENT:
			return "%";
		}
		return null;
	}
	
	public String getOperator(UnaryIntegerOperatorKind operator) {
		switch (operator) {
		case MINUS:
			return "-";
		case SQUARE_ROOT:
			return "sqrt";
		}
		return null;
	}
	
	public String getOperator(UnaryBooleanOperatorKind operator) {
		switch (operator) {
		case NOT:
			return "!";
		}
		return null;
	}
	
	public String getOperator(BinaryBooleanOperatorKind operator) {
		switch (operator) {
		case AND:
			return "&";
		case DIFFERENT:
			return "!=";
		case EQUAL:
			return "==";
		case OR:
			return "or";
		case SUP:
			return ">";
		case SUP_OR_EQUAL:
			return ">=";
		case INF:
			return "<";
		case INF_OR_EQUAL:
			return "<=";
		}
		return null;
	}

	public Enumerator getOperator(String operator) {
		
		if (operator.equals("/") || operator.equals("div")) {
			return BinaryIntegerOperatorKind.DIV;
		}
		if (operator.equals("max")) {
			return BinaryIntegerOperatorKind.MAX;
		}
		if (operator.equals("min")) {
			return BinaryIntegerOperatorKind.MIN;
		}
		if (operator.equals("-") || operator.equals("minus")) {
			return BinaryIntegerOperatorKind.MINUS;
		}
		if (operator.equals("*") || operator.equals("mul")) {
			return BinaryIntegerOperatorKind.MUL;
		}
		if (operator.equals("+") || operator.equals("plus")) {
			return BinaryIntegerOperatorKind.PLUS;
		}
		if (operator.equals("%") || operator.equals("pourcent")) {
			return BinaryIntegerOperatorKind.POURCENT;
		}
		
		if (operator.equals("&") || operator.equals("and")) {
			return BinaryBooleanOperatorKind.AND;
		}
		if (operator.equals("!=") || operator.equals("diff")) {
			return BinaryBooleanOperatorKind.DIFFERENT;
		}
		if (operator.equals("==") || operator.equals("equal")) {
			return BinaryBooleanOperatorKind.EQUAL;
		}
		if (operator.equals("<") || operator.equals("lower")) {
			return BinaryBooleanOperatorKind.INF;
		}
		if (operator.equals("<=") || operator.equals("lowerOrEqual")) {
			return BinaryBooleanOperatorKind.INF_OR_EQUAL;
		}
		if (operator.equals("or")) {
			return BinaryBooleanOperatorKind.OR;
		}
		if (operator.equals(">") || operator.equals("upper")) {
			return BinaryBooleanOperatorKind.SUP;
		}
		if (operator.equals(">=") || operator.equals("upperOrEqual")) {
			return BinaryBooleanOperatorKind.SUP_OR_EQUAL;
		}
		if (operator.equals("not")) {
			return UnaryBooleanOperatorKind.NOT;
		}
	
		return null;
	}

	public Expression getExpression(Sketch sketch, String expression) {
		if (isInteger(expression)) {
			fr.obeo.dsl.arduino.IntegerConstant constant = ArduinoFactory.eINSTANCE
					.createIntegerConstant();
			constant.setValue(Integer.parseInt(expression));
			return constant;
		}
		Variable var = ArduinoFactory.eINSTANCE.createIntegerVariable();
		var.setName(expression);
//		var.setExpression("0");
		return var;
	}

	private boolean isInteger(String s) {
		try {
			Integer.parseInt(s);
		} catch (NumberFormatException e) {
			return false;
		}
		return true;
	}

//	public void editLabel(While instruction, Sketch sketch, String left,
//			String operator, String right) {
//		BooleanExpression condition = ((BooleanExpression)instruction.getCondition());
//		if (condition == null) {
//			condition = ArduinoFactory.eINSTANCE.createBooleanExpression();
//			sketch.getInstructions().add(condition);
//			instruction.setCondition(condition);
//		}
//
//		Expression oldLeft = condition.getLeft();
//		Expression oldRight = condition.getRight();
//
//		condition.setLeft(getExpression(sketch, left));
//		condition.setOperator(getOperator(operator));
//		condition.setRight(getExpression(sketch, right));
//
//		deleteUnusedExpression(sketch, oldLeft);
//		deleteUnusedExpression(sketch, oldRight);
//	}

	public void editLabel(VariableAssignment instruction, Sketch sketch, String variable,
			String Expression) {
		Expression oldVariable = instruction.getVariable();
		Expression oldExpression = instruction.getOperand();
		instruction.setVariable((Variable) getExpression(sketch, variable));
		instruction.setOperand(getExpression(sketch, Expression));

		// Clean unused Expressions
		deleteUnusedExpression(sketch, oldVariable);
		deleteUnusedExpression(sketch, oldExpression);
	}

	public void editLabel(Expression Expression, String newExpression) {

	}

	public void deleteUnusedExpressions(Sketch sketch) {
		ImmutableList<Instruction> instructions = ImmutableList.copyOf(sketch.getBlock().getInstructions());
		for (Instruction instruction : instructions) {
			if (instruction instanceof Expression) {
				deleteUnusedExpression(sketch, (Expression) instruction);
			}
		}
	}

	private void deleteUnusedExpression(Sketch sketch, Expression Expression) {
		if (Expression != null && isNotUsedAnymore(sketch, Expression)) {
			EcoreUtil.delete(Expression);
		}
	}

	private boolean isNotUsedAnymore(Sketch sketch, Expression Expression) {
		ResourceSet resourceSet = Expression.eResource().getResourceSet();
		ECrossReferenceAdapter adapter = new ECrossReferenceAdapter();
		resourceSet.eAdapters().add(adapter);
		Collection<Setting> refs = adapter.getInverseReferences(Expression, true);
		return refs.size() == 1;
	}

	public List<VariableDeclaration> getVariableDeclarations(EObject container) {
		List<VariableDeclaration> variableDeclarations = Lists.newArrayList();
		TreeIterator<EObject> it = container.eAllContents();
		while(it.hasNext()){
			EObject eo = it.next();
			if (eo instanceof VariableDeclaration){
				variableDeclarations.add((VariableDeclaration) eo);
			}
		}
		return variableDeclarations;
	}
	
	public EObject getConnectedPin(EObject module) {
		return module.eContainer();
	}
	
	public Instruction getLastInstruction(Block block) {
		List<Instruction> instructions = block.getInstructions();
		if (!instructions.isEmpty()) {
			return instructions.get(instructions.size()-1);
		}
		return null;
	}
	
	public EObject getNextInstruction(EObject current) {
		EObject res = null;
		if (current instanceof Instruction) {
			Block block = (Block)current.eContainer();
			List<Instruction> instructions = block.getInstructions();
			int index = instructions.indexOf(current);
			if (index != -1) {
				index++;
				if (index == instructions.size() && block instanceof Sketch) {
					res = block;
				} else if (index < instructions.size()) {
					res = instructions.get(index);
				}
			}
		} else if (current instanceof Sketch) {
			List<Instruction> instructions = ((Sketch)current).getBlock().getInstructions();
			res = instructions.isEmpty() ? null : instructions.get(0);
		}
		return res;
	}

	public List<BinaryIntegerExpression> getNumericalExpressions(EObject container) {
		List<BinaryIntegerExpression> expressions = Lists.newArrayList();
		if (container instanceof VariableAssignment) {
			Expression Expression = ((VariableAssignment) container).getOperand();
			if (Expression instanceof BinaryIntegerExpression) {
				expressions.add((BinaryIntegerExpression) Expression);
			}
		} else if (container instanceof BinaryExpression) {
			Expression left = ((BinaryExpression) container).getLeft();
			Expression right = ((BinaryExpression) container).getRight();
			if (left instanceof BinaryIntegerExpression) {
				expressions.add((BinaryIntegerExpression) left);
			}
			if (right instanceof BinaryIntegerExpression) {
				expressions.add((BinaryIntegerExpression) right);
			}
		}
		return expressions;
	}

	public List<ModuleGet> getModuleGets(EObject container) {
		List<ModuleGet> moduleGetters = Lists.newArrayList();
		if (container instanceof Sketch) {
			List<Instruction> instructions = ((Sketch) container).getBlock()
					.getInstructions();
			for (Instruction instruction : instructions) {
				if (instruction instanceof ModuleGet) {
					if (
//							instruction.getNext() == null ||
							isNotUsedAnymore((Sketch) container,
									(ModuleGet) instruction)) {
						moduleGetters.add((ModuleGet) instruction);
					}
				}
			}
		} else if (container instanceof BinaryExpression) {
			Expression left = ((BinaryExpression) container).getLeft();
			Expression right = ((BinaryExpression) container).getRight();
			if (left instanceof ModuleGet) {
				moduleGetters.add((ModuleGet) left);
			}
			if (right instanceof ModuleGet) {
				moduleGetters.add((ModuleGet) right);
			}
		}
		return moduleGetters;
	}

	public List<BooleanExpression> getBooleanExpressions(EObject container) {
		List<BooleanExpression> booleanExpressions = Lists.newArrayList();
		Iterator<EObject> it = container.eContents().iterator();
		while(it.hasNext()){
			EObject eo = it.next();
			if (eo instanceof BooleanExpression){
				booleanExpressions.add((BooleanExpression) eo);
			}
		}
		return booleanExpressions;
	}

	public List<Constant> getConstants(EObject container) {
		List<Constant> constants = Lists.newArrayList();
		if (container instanceof VariableAssignment) {
			Expression Expression = ((VariableAssignment) container).getOperand();
			if (Expression instanceof Constant) {
				constants.add((Constant) Expression);
			}
		}else if (container instanceof UnaryExpression) {
			Expression Expression = ((UnaryExpression) container).getOperand();
			if (Expression instanceof Constant) {
				constants.add((Constant) Expression);
			}
		}  else if (container instanceof BinaryExpression) {
			Expression left = ((BinaryExpression) container).getLeft();
			Expression right = ((BinaryExpression) container).getRight();
			if (left instanceof Constant) {
				constants.add((Constant) left);
			}
			if (right instanceof Constant) {
				constants.add((Constant) right);
			}
		}
		return constants;
	}

	public IntegerConstant createConstant(Sketch sketch, int expression) {
		for (Iterator<EObject> iterator = sketch.eAllContents(); iterator
				.hasNext();) {
			EObject object = iterator.next();
			if (object instanceof IntegerConstant) {
				if (((IntegerConstant) object).getValue() == expression) {
					return (IntegerConstant) object;
				}
			}
		}

		IntegerConstant constant = ArduinoFactory.eINSTANCE.createIntegerConstant();
		constant.setValue(expression);
		return constant;
	}

	public void removeWire(Board board, Module module) {
		if (board instanceof ArduinoBoard) {
			boolean found = false;
			ArduinoBoard arduinoBoard = (ArduinoBoard) board;
			for (AnalogPin pin : arduinoBoard.getAnalogPins()) {
				if (pin.getModule() == module) {
					pin.setModule(null);
					found = true;
					break;
				}
			}
			if (!found) {
				for (DigitalPin pin : arduinoBoard.getDigitalPins()) {
					pin.setModule(null);
					break;
				}
			}
		}
	}

	public void removeWire(Board board) {
		if (board instanceof ArduinoBoard) {
			ArduinoBoard arduinoBoard = (ArduinoBoard) board;
			for (AnalogPin pin : arduinoBoard.getAnalogPins()) {
				pin.setModule(null);
			}
			for (DigitalPin pin : arduinoBoard.getDigitalPins()) {
				pin.setModule(null);
			}
		}
	}

	public boolean isValidSketch(Project project) {
		Sketch sketch = project.getSketch();
		if (sketch == null) {
			return false;
		}
		fr.obeo.dsl.arduino.utils.ArduinoServices service = new fr.obeo.dsl.arduino.utils.ArduinoServices();
		return service.isValidSketch(sketch);
	}
	
	public boolean isValidConnector(Module module, Pin pin) {
		boolean result = false;
		if (pin instanceof AnalogPin) {
			result = module instanceof ArduinoAnalogModule;
		} else if (pin instanceof DigitalPin){
			result = module instanceof ArduinoDigitalModule;
		}
		return result;
	}

	public boolean isValidHardware(Project project) {
		return project.getBoard() != null;
	}

	public boolean isUploadable(Project project) {
		return isValidHardware(project) && isValidSketch(project);
	}

	public String getImage(ModuleInstruction instruction) {
		return "/fr.obeo.dsl.arduino.design/images/default.svg";
//		return "/fr.obeo.dsl.arduino.design/images/"
//				+ instruction.getModule().getImage();
	}

	public String getImage(ModuleGet instruction) {
		return "/fr.obeo.dsl.arduino.design/images/default.svg";
//		return "/fr.obeo.dsl.arduino.design/images/"
//				+ instruction.getModule().getImage();
	}
	
	public void addVariable(Instruction container, Variable variable) {
		if (container instanceof BinaryExpression) {
			addMathOperatorExpression((BinaryExpression) container, variable);
		} else if (container instanceof VariableAssignment) {
			((VariableAssignment) container).setVariable(variable);
		}
		deleteUnusedExpressions(getSketch(variable));
	}

	public void addExpression(Instruction container, Constant Expression) {
		if (container instanceof BinaryExpression) {
			addMathOperatorExpression((BinaryExpression) container, Expression);
		} else if (container instanceof VariableAssignment) {
			((VariableAssignment) container).setOperand(Expression);
		}
		deleteUnusedExpressions(getSketch(Expression));
	}

	private void addMathOperatorExpression(BinaryExpression container, Expression Expression) {
		Expression left = container.getLeft();
		Expression right = container.getRight();

		if (left == null && right == null) {
			container.setLeft(Expression);
		} else if (left != null && right == null) {
			container.setRight(Expression);
		} else if (left == null && right != null) {
			container.setLeft(Expression);
		} else if (left != null && right != null) {
			container.setLeft(Expression);
		}
		deleteUnusedExpressions(getSketch(Expression));
	}

	public void updateExpression(Instruction container, Expression newExpression,
			Expression oldExpression) {
		if (container instanceof VariableAssignment) {
			if (newExpression instanceof Variable) {
				((VariableAssignment) container).setVariable((Variable) newExpression);
			} else {
				((VariableAssignment) container).setOperand(newExpression);
			}
		} else if (container instanceof BinaryExpression) {
			Expression left = ((BinaryExpression) container).getLeft();
			Expression right = ((BinaryExpression) container).getRight();
			if (oldExpression.equals(left)) {
				((BinaryExpression) container).setLeft(newExpression);
			} else if (oldExpression.equals(right)) {
				((BinaryExpression) container).setRight(newExpression);
			}

		}
		deleteUnusedExpressions(getSketch(container));
	}

	public void openHardwareDiagram(Board hardware) {
		Session session = SessionManager.INSTANCE.getSession(hardware);
		DRepresentation hardwareDiagram = getBoardDiagram(hardware);
		DialectUIManager.INSTANCE.openEditor(session, hardwareDiagram,
				new NullProgressMonitor());
	}

	public void openSketchDiagram(Sketch sketch) {
		Session session = SessionManager.INSTANCE.getSession(sketch);
		DRepresentation sketchDiagram = getSketchDiagram(sketch);
		DialectUIManager.INSTANCE.openEditor(session, sketchDiagram,
				new NullProgressMonitor());
	}

	private RepresentationDescription getDiagramDescription(Session session,
			String diagramDescriptionName) {
		for (Viewpoint vp : session.getSelectedViewpoints(false)) {
			for (RepresentationDescription representationDescription : vp
					.getOwnedRepresentations()) {
				if (representationDescription.getName().equals(
						diagramDescriptionName)) {
					return representationDescription;
				}
			}
		}
		return null;
	}

	private DRepresentation getBoardDiagram(Board board) {
		return getDiagram(board, "Hardware", "Hardware");
	}

	private DRepresentation getSketchDiagram(Sketch sketch) {
		return getDiagram(sketch, "Sketch", "Sketch");
	}

	private DRepresentation getDiagram(EObject semantic, String diagramName, String diagramDescriptionName) {
		fr.obeo.dsl.arduino.utils.ArduinoServices service = new fr.obeo.dsl.arduino.utils.ArduinoServices();
		Session session = SessionManager.INSTANCE.getSession(semantic);
		DRepresentation diagram = service.getDiagram(session, diagramName);
		// Create representation if does not exist
		if (diagram == null) {
			diagram = (DDiagram) DialectManager.INSTANCE.createRepresentation(
					diagramName, semantic,
					getDiagramDescription(session, diagramDescriptionName),
					session, new NullProgressMonitor());
		}

		return diagram;
	}
}
