package fr.obeo.dsl.arduino.arduinomt;

import fr.obeo.dsl.arduino.arduinomt.Expression;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public interface Constant extends EObject, Expression {
  public abstract String getValue();
  
  public abstract void setValue(final String newValue);
  
  public abstract Object evaluate();
}
