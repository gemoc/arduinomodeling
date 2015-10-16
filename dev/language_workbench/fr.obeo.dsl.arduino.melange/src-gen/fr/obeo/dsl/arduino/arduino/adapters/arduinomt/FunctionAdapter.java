package fr.obeo.dsl.arduino.arduino.adapters.arduinomt;

import fr.inria.diverse.melange.adapters.EListAdapter;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.obeo.dsl.arduino.Function;
import fr.obeo.dsl.arduino.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory;
import fr.obeo.dsl.arduino.arduinomt.Instruction;
import fr.obeo.dsl.arduino.arduinomt.ParameterDefinition;
import org.eclipse.emf.common.util.EList;

@SuppressWarnings("all")
public class FunctionAdapter extends EObjectAdapter<Function> implements fr.obeo.dsl.arduino.arduinomt.Function {
  private ArduinoMTAdaptersFactory adaptersFactory;
  
  public FunctionAdapter() {
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
  public EList<ParameterDefinition> getParamDefs() {
    return EListAdapter.newInstance(adaptee.getParamDefs(), fr.obeo.dsl.arduino.arduino.adapters.arduinomt.ParameterDefinitionAdapter.class) ;
  }
  
  @Override
  public EList<Instruction> getInstructions() {
    return EListAdapter.newInstance(adaptee.getInstructions(), fr.obeo.dsl.arduino.arduino.adapters.arduinomt.InstructionAdapter.class) ;
  }
}
