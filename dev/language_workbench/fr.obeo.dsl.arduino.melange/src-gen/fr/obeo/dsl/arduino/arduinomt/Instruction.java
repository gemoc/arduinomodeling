package fr.obeo.dsl.arduino.arduinomt;

import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public interface Instruction extends EObject {
  public abstract Instruction getPrevious();
  
  public abstract void setPrevious(final Instruction newPrevious);
  
  public abstract Instruction getNext();
  
  public abstract void setNext(final Instruction newNext);
  
  public abstract void execute();
}
