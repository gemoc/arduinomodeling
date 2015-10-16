package fr.obeo.dsl.arduino.arduino.adapters.arduinomt;

import fr.inria.diverse.melange.adapters.EListAdapter;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.obeo.dsl.arduino.Sketch;
import fr.obeo.dsl.arduino.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory;
import fr.obeo.dsl.arduino.arduinomt.Function;
import fr.obeo.dsl.arduino.arduinomt.Hardware;
import fr.obeo.dsl.arduino.arduinomt.Instruction;
import org.eclipse.emf.common.util.EList;

@SuppressWarnings("all")
public class SketchAdapter extends EObjectAdapter<Sketch> implements fr.obeo.dsl.arduino.arduinomt.Sketch {
  private ArduinoMTAdaptersFactory adaptersFactory;
  
  public SketchAdapter() {
    super(fr.obeo.dsl.arduino.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory.getInstance()) ;
  }
  
  @Override
  public String getName() {
    return adaptee.getName() ;
  }
  
  @Override
  public void setName(final String o) {
    adaptee.setName(o) ;
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
  public Hardware getHardware() {
    return adaptersFactory.createHardwareAdapter(adaptee.getHardware()) ;
  }
  
  @Override
  public void setHardware(final Hardware o) {
    adaptee.setHardware(((fr.obeo.dsl.arduino.arduino.adapters.arduinomt.HardwareAdapter) o).getAdaptee()) ;
  }
  
  @Override
  public EList<Instruction> getInstructions() {
    return EListAdapter.newInstance(adaptee.getInstructions(), fr.obeo.dsl.arduino.arduino.adapters.arduinomt.InstructionAdapter.class) ;
  }
  
  @Override
  public EList<Function> getFunctions() {
    return EListAdapter.newInstance(adaptee.getFunctions(), fr.obeo.dsl.arduino.arduino.adapters.arduinomt.FunctionAdapter.class) ;
  }
  
  @Override
  public void execute() {
    org.gemoc.arduino.operationalsemantics.Sketch_ExecutableAspect.execute(adaptee) ;
  }
}
