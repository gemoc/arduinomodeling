package fr.obeo.dsl.arduino.arduino.adapters.arduinomt;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.obeo.dsl.arduino.Level;
import fr.obeo.dsl.arduino.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory;
import fr.obeo.dsl.arduino.arduinomt.Expression;
import fr.obeo.dsl.arduino.arduinomt.Instruction;
import fr.obeo.dsl.arduino.arduinomt.Module;
import fr.obeo.dsl.arduino.arduinomt.ParameterDefinition;

@SuppressWarnings("all")
public class LevelAdapter extends EObjectAdapter<Level> implements fr.obeo.dsl.arduino.arduinomt.Level {
  private ArduinoMTAdaptersFactory adaptersFactory;
  
  public LevelAdapter() {
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
  public ParameterDefinition getDefinition() {
    return adaptersFactory.createParameterDefinitionAdapter(adaptee.getDefinition()) ;
  }
  
  @Override
  public void setDefinition(final ParameterDefinition o) {
    adaptee.setDefinition(((fr.obeo.dsl.arduino.arduino.adapters.arduinomt.ParameterDefinitionAdapter) o).getAdaptee()) ;
  }
  
  @Override
  public Module getModule() {
    return adaptersFactory.createModuleAdapter(adaptee.getModule()) ;
  }
  
  @Override
  public void setModule(final Module o) {
    adaptee.setModule(((fr.obeo.dsl.arduino.arduino.adapters.arduinomt.ModuleAdapter) o).getAdaptee()) ;
  }
  
  @Override
  public Expression getLevel() {
    return adaptersFactory.createExpressionAdapter(adaptee.getLevel()) ;
  }
  
  @Override
  public void setLevel(final Expression o) {
    adaptee.setLevel(((fr.obeo.dsl.arduino.arduino.adapters.arduinomt.ExpressionAdapter) o).getAdaptee()) ;
  }
  
  @Override
  public void execute() {
    org.gemoc.arduino.operationalsemantics.Level_ExecutableAspect.execute(adaptee) ;
  }
  
  @Override
  public void call() {
    org.gemoc.arduino.operationalsemantics.ModuleInstruction_CallableAspect.call(adaptee) ;
  }
}
