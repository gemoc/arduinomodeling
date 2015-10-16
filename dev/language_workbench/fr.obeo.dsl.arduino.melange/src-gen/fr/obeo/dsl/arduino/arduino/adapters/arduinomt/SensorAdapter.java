package fr.obeo.dsl.arduino.arduino.adapters.arduinomt;

import fr.inria.diverse.melange.adapters.EListAdapter;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.obeo.dsl.arduino.Sensor;
import fr.obeo.dsl.arduino.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory;
import fr.obeo.dsl.arduino.arduinomt.Expression;
import fr.obeo.dsl.arduino.arduinomt.Instruction;
import fr.obeo.dsl.arduino.arduinomt.Module;
import fr.obeo.dsl.arduino.arduinomt.OperatorKind;
import fr.obeo.dsl.arduino.arduinomt.ParameterDefinition;
import fr.obeo.dsl.arduino.arduinomt.Status;
import org.eclipse.emf.common.util.EList;

@SuppressWarnings("all")
public class SensorAdapter extends EObjectAdapter<Sensor> implements fr.obeo.dsl.arduino.arduinomt.Sensor {
  private ArduinoMTAdaptersFactory adaptersFactory;
  
  public SensorAdapter() {
    super(fr.obeo.dsl.arduino.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory.getInstance()) ;
  }
  
  @Override
  public OperatorKind getOperator() {
    return fr.obeo.dsl.arduino.arduinomt.OperatorKind.get(adaptee.getOperator().getValue());
  }
  
  @Override
  public void setOperator(final OperatorKind o) {
    adaptee.setOperator(fr.obeo.dsl.arduino.OperatorKind.get(o.getValue())) ;
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
  public Expression getLeft() {
    return adaptersFactory.createExpressionAdapter(adaptee.getLeft()) ;
  }
  
  @Override
  public void setLeft(final Expression o) {
    adaptee.setLeft(((fr.obeo.dsl.arduino.arduino.adapters.arduinomt.ExpressionAdapter) o).getAdaptee()) ;
  }
  
  @Override
  public Expression getRight() {
    return adaptersFactory.createExpressionAdapter(adaptee.getRight()) ;
  }
  
  @Override
  public void setRight(final Expression o) {
    adaptee.setRight(((fr.obeo.dsl.arduino.arduino.adapters.arduinomt.ExpressionAdapter) o).getAdaptee()) ;
  }
  
  @Override
  public EList<Status> getStatus() {
    return EListAdapter.newInstance(adaptee.getStatus(), fr.obeo.dsl.arduino.arduino.adapters.arduinomt.StatusAdapter.class) ;
  }
  
  @Override
  public Object evaluate() {
    return org.gemoc.arduino.operationalsemantics.Sensor_EvaluableAspect.evaluate(adaptee) ;
  }
  
  @Override
  public void execute() {
    org.gemoc.arduino.operationalsemantics.ModuleInstruction_ExecutableAspect.execute(adaptee) ;
  }
  
  @Override
  public void call() {
    org.gemoc.arduino.operationalsemantics.ModuleInstruction_CallableAspect.call(adaptee) ;
  }
  
  @Override
  public Number evaluateAsNumber() {
    return org.gemoc.arduino.operationalsemantics.Expression_EvaluableAspect.evaluateAsNumber(adaptee) ;
  }
  
  @Override
  public Boolean evaluateAsBoolean() {
    return org.gemoc.arduino.operationalsemantics.Expression_EvaluableAspect.evaluateAsBoolean(adaptee) ;
  }
}
