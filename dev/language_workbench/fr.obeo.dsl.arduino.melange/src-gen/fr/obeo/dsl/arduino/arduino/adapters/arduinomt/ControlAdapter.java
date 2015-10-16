package fr.obeo.dsl.arduino.arduino.adapters.arduinomt;

import fr.inria.diverse.melange.adapters.EListAdapter;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.obeo.dsl.arduino.Control;
import fr.obeo.dsl.arduino.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory;
import fr.obeo.dsl.arduino.arduinomt.Instruction;
import org.eclipse.emf.common.util.EList;

@SuppressWarnings("all")
public class ControlAdapter extends EObjectAdapter<Control> implements fr.obeo.dsl.arduino.arduinomt.Control {
  private ArduinoMTAdaptersFactory adaptersFactory;
  
  public ControlAdapter() {
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
  public void execute() {
    org.gemoc.arduino.operationalsemantics.Control_ExecutableAspect.execute(adaptee) ;
  }
}
