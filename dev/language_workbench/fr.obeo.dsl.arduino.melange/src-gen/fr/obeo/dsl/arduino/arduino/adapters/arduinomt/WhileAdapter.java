package fr.obeo.dsl.arduino.arduino.adapters.arduinomt;

import fr.inria.diverse.melange.adapters.EListAdapter;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.obeo.dsl.arduino.While;
import fr.obeo.dsl.arduino.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory;
import fr.obeo.dsl.arduino.arduinomt.BooleanOperator;
import fr.obeo.dsl.arduino.arduinomt.Instruction;
import org.eclipse.emf.common.util.EList;

@SuppressWarnings("all")
public class WhileAdapter extends EObjectAdapter<While> implements fr.obeo.dsl.arduino.arduinomt.While {
  private ArduinoMTAdaptersFactory adaptersFactory;
  
  public WhileAdapter() {
    super(fr.obeo.dsl.arduino.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory.getInstance()) ;
  }
  
  @Override
  public Instruction getPrevious() {
    return adaptersFactory.createInstructionAdapter(adaptee.getPrevious()) ;
  }
  
  @Override
  public void setPrevious(final Instruction o) {
    adaptee.setPrevious(((fr.obeo.dsl.arduino.arduino.adapters.arduinomt.InstructionAdapter) o).getAdaptee()) ;
  }
  
  @Override
  public Instruction getNext() {
    return adaptersFactory.createInstructionAdapter(adaptee.getNext()) ;
  }
  
  @Override
  public void setNext(final Instruction o) {
    adaptee.setNext(((fr.obeo.dsl.arduino.arduino.adapters.arduinomt.InstructionAdapter) o).getAdaptee()) ;
  }
  
  @Override
  public EList<Instruction> getInstructions() {
    return EListAdapter.newInstance(adaptee.getInstructions(), fr.obeo.dsl.arduino.arduino.adapters.arduinomt.InstructionAdapter.class) ;
  }
  
  @Override
  public BooleanOperator getCondition() {
    return adaptersFactory.createBooleanOperatorAdapter(adaptee.getCondition()) ;
  }
  
  @Override
  public void setCondition(final BooleanOperator o) {
    adaptee.setCondition(((fr.obeo.dsl.arduino.arduino.adapters.arduinomt.BooleanOperatorAdapter) o).getAdaptee()) ;
  }
  
  @Override
  public void execute() {
    org.gemoc.arduino.operationalsemantics.While_ExecutableAspect.execute(adaptee) ;
  }
}
