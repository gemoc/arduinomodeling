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
package org.gemoc.arduino.design.services;

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
import org.gemoc.arduino.execarduino.arduino.AnalogPin;
import org.gemoc.arduino.execarduino.arduino.ArduinoAnalogModule;
import org.gemoc.arduino.execarduino.arduino.ArduinoBoard;
import org.gemoc.arduino.execarduino.arduino.ArduinoDigitalModule;
import org.gemoc.arduino.execarduino.arduino.ArduinoFactory;
import org.gemoc.arduino.execarduino.arduino.BinaryBooleanExpression;
import org.gemoc.arduino.execarduino.arduino.BinaryBooleanOperatorKind;
import org.gemoc.arduino.execarduino.arduino.BinaryExpression;
import org.gemoc.arduino.execarduino.arduino.BinaryIntegerExpression;
import org.gemoc.arduino.execarduino.arduino.BinaryIntegerOperatorKind;
import org.gemoc.arduino.execarduino.arduino.Block;
import org.gemoc.arduino.execarduino.arduino.Board;
import org.gemoc.arduino.execarduino.arduino.BooleanConstant;
import org.gemoc.arduino.execarduino.arduino.BooleanExpression;
import org.gemoc.arduino.execarduino.arduino.BooleanModuleGet;
import org.gemoc.arduino.execarduino.arduino.BooleanVariable;
import org.gemoc.arduino.execarduino.arduino.BooleanVariableRef;
import org.gemoc.arduino.execarduino.arduino.Constant;
import org.gemoc.arduino.execarduino.arduino.DigitalPin;
import org.gemoc.arduino.execarduino.arduino.Expression;
import org.gemoc.arduino.execarduino.arduino.If;
import org.gemoc.arduino.execarduino.arduino.Instruction;
import org.gemoc.arduino.execarduino.arduino.IntegerConstant;
import org.gemoc.arduino.execarduino.arduino.IntegerModuleGet;
import org.gemoc.arduino.execarduino.arduino.IntegerVariable;
import org.gemoc.arduino.execarduino.arduino.IntegerVariableRef;
import org.gemoc.arduino.execarduino.arduino.LED;
import org.gemoc.arduino.execarduino.arduino.Module;
import org.gemoc.arduino.execarduino.arduino.ModuleAssignment;
import org.gemoc.arduino.execarduino.arduino.ModuleGet;
import org.gemoc.arduino.execarduino.arduino.ModuleInstruction;
import org.gemoc.arduino.execarduino.arduino.Pin;
import org.gemoc.arduino.execarduino.arduino.Project;
import org.gemoc.arduino.execarduino.arduino.Sketch;
import org.gemoc.arduino.execarduino.arduino.UnaryBooleanExpression;
import org.gemoc.arduino.execarduino.arduino.UnaryBooleanOperatorKind;
import org.gemoc.arduino.execarduino.arduino.UnaryExpression;
import org.gemoc.arduino.execarduino.arduino.UnaryIntegerExpression;
import org.gemoc.arduino.execarduino.arduino.UnaryIntegerOperatorKind;
import org.gemoc.arduino.execarduino.arduino.Variable;
import org.gemoc.arduino.execarduino.arduino.VariableAssignment;
import org.gemoc.arduino.execarduino.arduino.VariableDeclaration;
import org.gemoc.arduino.execarduino.arduino.VariableRef;
import org.gemoc.arduino.execarduino.arduino.While;
import org.gemoc.arduino.execarduino.aspects.ArduinoUtils;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;

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
				pin.setName(""+i);
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
				pin.setName(""+i);
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

	public List<AnalogPin> getAnalogPins(EObject obj) {
		List<AnalogPin> result = new ArrayList<>();
		for (int i = 0; i < 6; i++) {
			result.add(ArduinoFactory.eINSTANCE.createAnalogPin());
		}
		return result;
	}

	public List<DigitalPin> getDigitalPins(EObject obj) {
		List<DigitalPin> result = new ArrayList<>();
		for (int i = 0; i < 6; i++) {
			result.add(ArduinoFactory.eINSTANCE.createDigitalPin());
		}
		return result;
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

//	public String getImage(Module module) {
//		// String imageName = module.getImage();
//		return getImage("");
//	}

	public String getImage(LED led) {
		Integer level = ArduinoUtils.getPin(led).getLevel();
		if (level != null && level > 0) {
			switch (led.getColor()) {
			case BLUE: return "/org.gemoc.arduino.design/images/dfrobot/blue_led_1023.jpg";
			case RED: return "/org.gemoc.arduino.design/images/dfrobot/red_led_1023.jpg";
			case WHITE: return "/org.gemoc.arduino.design/images/dfrobot/white_led_1023.jpg";
			}
		}
		switch (led.getColor()) {
		case BLUE: return "/fr.obeo.dsl.arduino.design/images/dfrobot/blue_led.jpg";
		case RED: return "/fr.obeo.dsl.arduino.design/images/dfrobot/red_led.jpg";
		case WHITE: return "/fr.obeo.dsl.arduino.design/images/dfrobot/white_led.jpg";
		}
		return "";
	}

	public String getImage(ArduinoBoard platform) {
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
			for (Iterator<EObject> iterator = resource.getAllContents(); iterator.hasNext();) {
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
			for (Iterator<EObject> iterator = resource.getAllContents(); iterator.hasNext();) {
				EObject content = iterator.next();
				if (content instanceof Module) {
					result.add((Module) content);
				}
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

	public List<EObject> getConnectedModules(EObject board) {
		List<EObject> result = new ArrayList<>();
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

	public String computeExpressionLabel(ModuleAssignment e) {
		String label = e.getModule().getName();
		if (e.getOperand() instanceof BooleanConstant) {
			if (((BooleanConstant) e.getOperand()).isValue()) {
				label += " : on";
			} else {
				label += " : off";
			}
		}
		if (e.getOperand() instanceof IntegerConstant) {
			label += " : " + ((IntegerConstant) e.getOperand()).getValue();
		}
		return label;
	}

	public String computeExpressionLabel(Module e) {
		String label = e.getName();
		return label;
	}

	public String computeLinkLabel(DDiagramElement edgeLink) {
		String label = "";
		if (edgeLink instanceof DEdge && ((DEdge) edgeLink).getTargetNode() instanceof DSemanticDecorator) {
			EObject target = ((DSemanticDecorator) ((DEdge) edgeLink).getTargetNode()).getTarget();
			if (target instanceof ModuleAssignment) {
				ModuleAssignment ms = (ModuleAssignment) target;
				if (ms.getOperand() instanceof BooleanConstant) {
					if (((BooleanConstant) ms.getOperand()).isValue()) {
						label = "on";
					} else {
						label = "off";
					}
				}
			}
		}

		return label;
	}

	public String computeLabel(Expression Expression) {
		if (Expression instanceof BooleanVariableRef) {
			return ((BooleanVariableRef) Expression).getVariable().getName();
		}
		if (Expression instanceof IntegerVariableRef) {
			return ((IntegerVariableRef) Expression).getVariable().getName();
		}
		if (Expression instanceof BooleanConstant) {
			return String.valueOf(((BooleanConstant) Expression).isValue());
		}
		if (Expression instanceof IntegerConstant) {
			return String.valueOf(((IntegerConstant) Expression).getValue());
		}
		if (Expression instanceof ModuleGet) {
			return "get(" + ((ModuleGet) Expression).getModule().getName() + ")";
		}
		if (Expression instanceof BinaryBooleanExpression) {
			String label = "";
			label += computeLabel(((BinaryBooleanExpression) Expression).getLeft()) + " ";
			label += getOperator(((BinaryBooleanExpression) Expression).getOperator());
			label += " " + computeLabel(((BinaryBooleanExpression) Expression).getRight());
			return label;
		}
		if (Expression instanceof BinaryIntegerExpression) {
			String label = "(";
			label += computeLabel(((BinaryExpression) Expression).getLeft());
			label += getOperator(((BinaryIntegerExpression) Expression).getOperator());
			label += computeLabel(((BinaryExpression) Expression).getRight());
			label += ")";
			return label;
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
		if (instruction.getCondition() == null) {
			label += "null condition";
			return label;
		}
		Expression cond = instruction.getCondition();
		if (cond instanceof BinaryBooleanExpression
				&& ((BinaryBooleanExpression) instruction.getCondition()).getLeft() != null
				&& ((BinaryBooleanExpression) instruction.getCondition()).getRight() != null) {
			label += computeLabel(((BinaryBooleanExpression) cond).getLeft()) + " ";
			label += getOperator(((BinaryBooleanExpression) cond).getOperator());
			label += " " + computeLabel(((BinaryBooleanExpression) cond).getRight());
		}
		if (cond instanceof BooleanModuleGet && ((BooleanModuleGet) cond).getModule() != null) {
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
			label += set.getVariable().getName() + " = " + computeLabel(set.getOperand());
		}
		return label;
	}

	public String computeLabel(VariableRef ref) {
		if (ref instanceof IntegerVariableRef) {
			IntegerVariable var = ((IntegerVariableRef) ref).getVariable();
			if (var != null) {
				return var.getName();
			}
		} else if (ref instanceof IntegerVariableRef) {
			BooleanVariable var = ((BooleanVariableRef) ref).getVariable();
			if (var != null) {
				return var.getName();
			}
		}
		return "";
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
			IntegerConstant constant = ArduinoFactory.eINSTANCE.createIntegerConstant();
			constant.setValue(Integer.parseInt(expression));
			return constant;
		}
		IntegerVariable var = ArduinoFactory.eINSTANCE.createIntegerVariable();
		IntegerVariableRef varRef = ArduinoFactory.eINSTANCE.createIntegerVariableRef();
		var.setName(expression);
		varRef.setVariable(var);
		// var.setExpression("0");
		return varRef;
	}

	private boolean isInteger(String s) {
		try {
			Integer.parseInt(s);
		} catch (NumberFormatException e) {
			return false;
		}
		return true;
	}

	// public void editLabel(While instruction, Sketch sketch, String left,
	// String operator, String right) {
	// BooleanExpression condition =
	// ((BooleanExpression)instruction.getCondition());
	// if (condition == null) {
	// condition = ArduinoFactory.eINSTANCE.createBooleanExpression();
	// sketch.getInstructions().add(condition);
	// instruction.setCondition(condition);
	// }
	//
	// Expression oldLeft = condition.getLeft();
	// Expression oldRight = condition.getRight();
	//
	// condition.setLeft(getExpression(sketch, left));
	// condition.setOperator(getOperator(operator));
	// condition.setRight(getExpression(sketch, right));
	//
	// deleteUnusedExpression(sketch, oldLeft);
	// deleteUnusedExpression(sketch, oldRight);
	// }

	public void editLabel(VariableAssignment instruction, Sketch sketch, String variable, String Expression) {
		// Expression oldVariable = instruction.getVariable();
		Expression oldExpression = instruction.getOperand();
		instruction.setVariable((Variable) getExpression(sketch, variable));
		instruction.setOperand(getExpression(sketch, Expression));

		// Clean unused Expressions
		// deleteUnusedExpression(sketch, oldVariable);
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
		while (it.hasNext()) {
			EObject eo = it.next();
			if (eo instanceof VariableDeclaration) {
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
			return instructions.get(instructions.size() - 1);
		}
		return null;
	}

	public EObject getNextInstruction(EObject current) {
		EObject res = null;
		if (current instanceof Instruction) {
			Block block = (Block) current.eContainer();
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
			List<Instruction> instructions = ((Sketch) current).getBlock().getInstructions();
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
			List<Instruction> instructions = ((Sketch) container).getBlock().getInstructions();
			for (Instruction instruction : instructions) {
				if (instruction instanceof ModuleGet) {
					if (
					// instruction.getNext() == null ||
					isNotUsedAnymore((Sketch) container, (ModuleGet) instruction)) {
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
		while (it.hasNext()) {
			EObject eo = it.next();
			if (eo instanceof BooleanExpression) {
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
		} else if (container instanceof UnaryExpression) {
			Expression Expression = ((UnaryExpression) container).getOperand();
			if (Expression instanceof Constant) {
				constants.add((Constant) Expression);
			}
		} else if (container instanceof BinaryExpression) {
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
		for (Iterator<EObject> iterator = sketch.eAllContents(); iterator.hasNext();) {
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

	public EObject removeWire(Board board, Module module) {
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
		return null;
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
		if (project == null) {
			return false;
		}
		List<Sketch> sketches = project.getSketches();
		return !sketches.isEmpty();
	}

	public boolean isValidConnector(Module module, Pin pin) {
		boolean result = false;
		if (pin instanceof AnalogPin) {
			result = module instanceof ArduinoAnalogModule;
		} else if (pin instanceof DigitalPin) {
			result = module instanceof ArduinoDigitalModule;
		}
		return result;
	}

	public boolean isValidHardware(Project project) {
		return !project.getBoards().isEmpty();
	}

	public boolean isUploadable(Project project) {
		return isValidHardware(project) && isValidSketch(project);
	}

	public String getImage(ModuleInstruction instruction) {
		return "/fr.obeo.dsl.arduino.design/images/default.svg";
		// return "/fr.obeo.dsl.arduino.design/images/"
		// + instruction.getModule().getImage();
	}

	public String getImage(ModuleGet instruction) {
		// if (instruction instanceof LED) {
		// switch (((LED)instruction).getColor()) {
		// case BLUE:
		// return
		//
		//
		// }
		// }
		return "/fr.obeo.dsl.arduino.design/images/default.svg";
		// return "/fr.obeo.dsl.arduino.design/images/"
		// + instruction.getModule().getImage();
	}

	public void addVariable(Instruction container, Variable variable) {
		if (container instanceof BinaryExpression) {
			if (variable instanceof IntegerVariable) {
				IntegerVariableRef ref = ArduinoFactory.eINSTANCE.createIntegerVariableRef();
				ref.setVariable((IntegerVariable) variable);
				addMathOperatorExpression((BinaryExpression) container, ref);
			} else {
				IntegerVariableRef ref = ArduinoFactory.eINSTANCE.createIntegerVariableRef();
				ref.setVariable((IntegerVariable) variable);
				addMathOperatorExpression((BinaryExpression) container, ref);
			}
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

	public void updateExpression(Instruction container, Expression newExpression, Expression oldExpression) {
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
		DialectUIManager.INSTANCE.openEditor(session, hardwareDiagram, new NullProgressMonitor());
	}

	public void openSketchDiagram(Sketch sketch) {
		Session session = SessionManager.INSTANCE.getSession(sketch);
		DRepresentation sketchDiagram = getSketchDiagram(sketch);
		DialectUIManager.INSTANCE.openEditor(session, sketchDiagram, new NullProgressMonitor());
	}

	private RepresentationDescription getDiagramDescription(Session session, String diagramDescriptionName) {
		for (Viewpoint vp : session.getSelectedViewpoints(false)) {
			for (RepresentationDescription representationDescription : vp.getOwnedRepresentations()) {
				if (representationDescription.getName().equals(diagramDescriptionName)) {
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

	public DRepresentation getDiagram(Session session, String diagramName) {
		Collection<DRepresentation> representations = DialectManager.INSTANCE.getAllRepresentations(session);
		DRepresentation diagram = null;
		for (DRepresentation representation : representations) {
			if (diagramName.equals(representation.getName())) {
				diagram = representation;
			}
		}
		return diagram;
	}

	private DRepresentation getDiagram(EObject semantic, String diagramName, String diagramDescriptionName) {
		Session session = SessionManager.INSTANCE.getSession(semantic);
		DRepresentation diagram = getDiagram(session, diagramName);
		// Create representation if does not exist
		if (diagram == null) {
			diagram = (DDiagram) DialectManager.INSTANCE.createRepresentation(diagramName, semantic,
					getDiagramDescription(session, diagramDescriptionName), session, new NullProgressMonitor());
		}

		return diagram;
	}
}
