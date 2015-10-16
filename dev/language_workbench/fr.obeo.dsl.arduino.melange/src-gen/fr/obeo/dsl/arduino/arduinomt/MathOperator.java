package fr.obeo.dsl.arduino.arduinomt;

import fr.obeo.dsl.arduino.arduinomt.Expression;
import fr.obeo.dsl.arduino.arduinomt.Instruction;
import fr.obeo.dsl.arduino.arduinomt.OperatorKind;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public interface MathOperator extends EObject, Expression, Instruction {
  public abstract OperatorKind getOperator();
  
  public abstract void setOperator(final OperatorKind newOperator);
  
  public abstract Expression getLeft();
  
  public abstract void setLeft(final Expression newLeft);
  
  public abstract Expression getRight();
  
  public abstract void setRight(final Expression newRight);
  
  public abstract Object evaluate();
}
