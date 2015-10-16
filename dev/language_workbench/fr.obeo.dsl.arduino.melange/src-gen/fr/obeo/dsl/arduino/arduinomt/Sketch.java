package fr.obeo.dsl.arduino.arduinomt;

import fr.obeo.dsl.arduino.arduinomt.Function;
import fr.obeo.dsl.arduino.arduinomt.Hardware;
import fr.obeo.dsl.arduino.arduinomt.Instruction;
import fr.obeo.dsl.arduino.arduinomt.NamedElement;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public interface Sketch extends EObject, NamedElement, Instruction {
  public abstract Hardware getHardware();
  
  public abstract void setHardware(final Hardware newHardware);
  
  public abstract EList<Instruction> getInstructions();
  
  public abstract EList<Function> getFunctions();
  
  public abstract void execute();
}
