package fr.obeo.dsl.arduino.arduino.adapters.arduinomt;

import fr.inria.diverse.melange.adapters.EListAdapter;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.obeo.dsl.arduino.FunctionCall;
import fr.obeo.dsl.arduino.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory;
import fr.obeo.dsl.arduino.arduinomt.Function;
import fr.obeo.dsl.arduino.arduinomt.Instruction;
import fr.obeo.dsl.arduino.arduinomt.Parameter;
import org.eclipse.emf.common.util.EList;

@SuppressWarnings("all")
public class FunctionCallAdapter extends EObjectAdapter<FunctionCall> implements fr.obeo.dsl.arduino.arduinomt.FunctionCall {
  private ArduinoMTAdaptersFactory adaptersFactory;
  
  public FunctionCallAdapter() {
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
  public Function getDefinition() {
    return adaptersFactory.createFunctionAdapter(adaptee.getDefinition()) ;
  }
  
  @Override
  public void setDefinition(final Function o) {
    adaptee.setDefinition(((fr.obeo.dsl.arduino.arduino.adapters.arduinomt.FunctionAdapter) o).getAdaptee()) ;
  }
  
  @Override
  public EList<Parameter> getParameters() {
    return EListAdapter.newInstance(adaptee.getParameters(), fr.obeo.dsl.arduino.arduino.adapters.arduinomt.ParameterAdapter.class) ;
  }
  
  @Override
  public void execute() {
    org.gemoc.arduino.operationalsemantics.FunctionCall_ExecutableAspect.execute(adaptee) ;
  }
}
