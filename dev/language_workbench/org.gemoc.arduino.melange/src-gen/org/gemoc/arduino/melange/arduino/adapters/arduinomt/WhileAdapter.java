package org.gemoc.arduino.melange.arduino.adapters.arduinomt;

import fr.inria.diverse.melange.adapters.EListAdapter;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.obeo.dsl.arduino.While;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.arduino.melange.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory;
import org.gemoc.arduino.melange.arduinomt.arduino.Expression;
import org.gemoc.arduino.melange.arduinomt.arduino.Instruction;

@SuppressWarnings("all")
public class WhileAdapter extends EObjectAdapter<While> implements org.gemoc.arduino.melange.arduinomt.arduino.While {
  private ArduinoMTAdaptersFactory adaptersFactory;
  
  public WhileAdapter() {
    super(org.gemoc.arduino.melange.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory.getInstance()) ;
    adaptersFactory = org.gemoc.arduino.melange.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory.getInstance() ;
  }
  
  private Instruction previous;
  
  @Override
  public Instruction getPrevious() {
    return (Instruction) adaptersFactory.createAdapter(adaptee.getPrevious(), eResource) ;
  }
  
  @Override
  public void setPrevious(final Instruction o) {
    if (o != null)
    	adaptee.setPrevious(((org.gemoc.arduino.melange.arduino.adapters.arduinomt.InstructionAdapter) o).getAdaptee()) ;
    else adaptee.setPrevious(null) ;
  }
  
  private Instruction next;
  
  @Override
  public Instruction getNext() {
    return (Instruction) adaptersFactory.createAdapter(adaptee.getNext(), eResource) ;
  }
  
  @Override
  public void setNext(final Instruction o) {
    if (o != null)
    	adaptee.setNext(((org.gemoc.arduino.melange.arduino.adapters.arduinomt.InstructionAdapter) o).getAdaptee()) ;
    else adaptee.setNext(null) ;
  }
  
  private EList<Instruction> instructions;
  
  @Override
  public EList<Instruction> getInstructions() {
    if (instructions == null)
    	instructions = EListAdapter.newInstance(adaptee.getInstructions(), adaptersFactory) ;
    return instructions;
  }
  
  private Expression condition;
  
  @Override
  public Expression getCondition() {
    return (Expression) adaptersFactory.createAdapter(adaptee.getCondition(), eResource) ;
  }
  
  @Override
  public void setCondition(final Expression o) {
    if (o != null)
    	adaptee.setCondition(((org.gemoc.arduino.melange.arduino.adapters.arduinomt.ExpressionAdapter) o).getAdaptee()) ;
    else adaptee.setCondition(null) ;
  }
  
  @Override
  public void execute() {
    org.gemoc.arduino.operationalsemantics.While_ExecutableAspect.execute(adaptee) ;
  }
  
  @Override
  public EClass eClass() {
    return org.gemoc.arduino.melange.arduinomt.arduino.ArduinoPackage.eINSTANCE.getWhile();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.arduino.melange.arduinomt.arduino.ArduinoPackage.WHILE__PREVIOUS:
    		return getPrevious();
    	case org.gemoc.arduino.melange.arduinomt.arduino.ArduinoPackage.WHILE__NEXT:
    		return getNext();
    	case org.gemoc.arduino.melange.arduinomt.arduino.ArduinoPackage.WHILE__INSTRUCTIONS:
    		return getInstructions();
    	case org.gemoc.arduino.melange.arduinomt.arduino.ArduinoPackage.WHILE__CONDITION:
    		return getCondition();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.arduino.melange.arduinomt.arduino.ArduinoPackage.WHILE__PREVIOUS:
    		setPrevious((Instruction) newValue);
    		return;
    	case org.gemoc.arduino.melange.arduinomt.arduino.ArduinoPackage.WHILE__NEXT:
    		setNext((Instruction) newValue);
    		return;
    	case org.gemoc.arduino.melange.arduinomt.arduino.ArduinoPackage.WHILE__INSTRUCTIONS:
    		getInstructions().clear();
    		getInstructions().addAll((Collection<? extends Instruction>) newValue);
    		return;
    	case org.gemoc.arduino.melange.arduinomt.arduino.ArduinoPackage.WHILE__CONDITION:
    		setCondition((Expression) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
  
  @Override
  public void eUnset(final int featureID) {
    switch (featureID) {
    	case org.gemoc.arduino.melange.arduinomt.arduino.ArduinoPackage.WHILE__PREVIOUS:
    		setPrevious((Instruction) null);
    		return;
    	case org.gemoc.arduino.melange.arduinomt.arduino.ArduinoPackage.WHILE__NEXT:
    		setNext((Instruction) null);
    		return;
    	case org.gemoc.arduino.melange.arduinomt.arduino.ArduinoPackage.WHILE__INSTRUCTIONS:
    		getInstructions().clear();
    		return;
    	case org.gemoc.arduino.melange.arduinomt.arduino.ArduinoPackage.WHILE__CONDITION:
    		setCondition((Expression) null);
    		return;
    }
    
    super.eUnset(featureID);
  }
}
