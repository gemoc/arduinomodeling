package fr.obeo.dsl.arduino.arduinomt;

import fr.obeo.dsl.arduino.arduinomt.BooleanOperator;
import fr.obeo.dsl.arduino.arduinomt.ModuleInstruction;
import fr.obeo.dsl.arduino.arduinomt.Status;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public interface Sensor extends EObject, ModuleInstruction, BooleanOperator {
  public abstract EList<Status> getStatus();
  
  public abstract Object evaluate();
}
