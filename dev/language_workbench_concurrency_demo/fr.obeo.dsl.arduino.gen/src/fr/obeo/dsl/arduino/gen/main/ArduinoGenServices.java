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
package fr.obeo.dsl.arduino.gen.main;

import java.util.Iterator;

import org.eclipse.emf.common.util.Enumerator;

import fr.obeo.dsl.arduino.BinaryBooleanExpression;
import fr.obeo.dsl.arduino.BinaryBooleanOperatorKind;
import fr.obeo.dsl.arduino.BinaryIntegerExpression;
import fr.obeo.dsl.arduino.BinaryIntegerOperatorKind;
import fr.obeo.dsl.arduino.Constant;
import fr.obeo.dsl.arduino.Expression;
import fr.obeo.dsl.arduino.Instruction;
import fr.obeo.dsl.arduino.BinaryExpression;
import fr.obeo.dsl.arduino.ModuleGet;
import fr.obeo.dsl.arduino.Repeat;
import fr.obeo.dsl.arduino.Sketch;
import fr.obeo.dsl.arduino.UnaryBooleanOperatorKind;
import fr.obeo.dsl.arduino.UnaryIntegerOperatorKind;
import fr.obeo.dsl.arduino.Variable;

public class ArduinoGenServices {

	public int getRepeatInstructionIndex(Sketch sketch, Repeat repeat) {
		int i = 0;
		for (Iterator iterator = sketch.eAllContents(); iterator.hasNext();) {
			Instruction instruction = (Instruction) iterator.next();
			i++;
			if (instruction instanceof Repeat && instruction.equals(repeat)) {
				return i;
			}
		}

		return 0;
	}

	public String getValue(Expression value) {
		if (value instanceof Variable) {
			return ((Variable) value).getName();
		}
		if (value instanceof Constant) {
			return "Constant";//value.getValue();
		}
		if (value instanceof BinaryBooleanExpression) {
			return "(" + getValue(((BinaryExpression) value).getLeft())
					+ getOperator(((BinaryBooleanExpression) value).getOperator())
					+ getValue(((BinaryExpression) value).getRight()) + ")";
		}
		if (value instanceof BinaryIntegerExpression) {
			return "(" + getValue(((BinaryExpression) value).getLeft())
					+ getOperator(((BinaryIntegerExpression) value).getOperator())
					+ getValue(((BinaryExpression) value).getRight()) + ")";
		}
		if (value instanceof ModuleGet) {
			return ((ModuleGet) value).getModule().getName().replaceAll(" ", "");
		}
		return null;
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

}
