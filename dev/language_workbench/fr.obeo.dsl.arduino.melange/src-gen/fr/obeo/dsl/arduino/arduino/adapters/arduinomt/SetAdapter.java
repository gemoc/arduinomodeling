package fr.obeo.dsl.arduino.arduino.adapters.arduinomt;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.obeo.dsl.arduino.Set;
import fr.obeo.dsl.arduino.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory;
import fr.obeo.dsl.arduino.arduinomt.Expression;
import fr.obeo.dsl.arduino.arduinomt.Instruction;
import fr.obeo.dsl.arduino.arduinomt.Variable;

@SuppressWarnings("all")
public class SetAdapter extends EObjectAdapter<Set> implements fr.obeo.dsl.arduino.arduinomt.Set {
  private ArduinoMTAdaptersFactory adaptersFactory;
  
  public SetAdapter() {
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
  public Variable getVariable() {
    return adaptersFactory.createVariableAdapter(adaptee.getVariable()) ;
  }
  
  @Override
  public void setVariable(final Variable o) {
    adaptee.setVariable(((fr.obeo.dsl.arduino.arduino.adapters.arduinomt.VariableAdapter) o).getAdaptee()) ;
  }
  
  @Override
  public Expression getValue() {
    return adaptersFactory.createExpressionAdapter(adaptee.getValue()) ;
  }
  
  @Override
  public void setValue(final Expression o) {
    adaptee.setValue(((fr.obeo.dsl.arduino.arduino.adapters.arduinomt.ExpressionAdapter) o).getAdaptee()) ;
  }
  
  @Override
  public void execute() {
    org.gemoc.arduino.operationalsemantics.Set_ExecutableAspect.execute(adaptee) ;
  }
}
