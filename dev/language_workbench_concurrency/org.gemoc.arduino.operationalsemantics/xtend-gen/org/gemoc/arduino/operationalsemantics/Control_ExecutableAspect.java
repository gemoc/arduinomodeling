package org.gemoc.arduino.operationalsemantics;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.obeo.dsl.arduino.Control;
import org.gemoc.arduino.operationalsemantics.Control_ExecutableAspectControlAspectProperties;
import org.gemoc.arduino.operationalsemantics.Instruction_ExecutableAspect;

@Aspect(className = Control.class)
@SuppressWarnings("all")
public class Control_ExecutableAspect extends Instruction_ExecutableAspect {
  @OverrideAspectMethod
  public static void execute(final Control _self) {
    org.gemoc.arduino.operationalsemantics.Control_ExecutableAspectControlAspectProperties _self_ = org.gemoc.arduino.operationalsemantics.Control_ExecutableAspectControlAspectContext.getSelf(_self);
     if (_self instanceof fr.obeo.dsl.arduino.Repeat){
     org.gemoc.arduino.operationalsemantics.Repeat_ExecutableAspect.execute((fr.obeo.dsl.arduino.Repeat)_self);
    } else  if (_self instanceof fr.obeo.dsl.arduino.While){
     org.gemoc.arduino.operationalsemantics.While_ExecutableAspect.execute((fr.obeo.dsl.arduino.While)_self);
    } else  if (_self instanceof fr.obeo.dsl.arduino.If){
     org.gemoc.arduino.operationalsemantics.If_ExecutableAspect.execute((fr.obeo.dsl.arduino.If)_self);
    } else  if (_self instanceof fr.obeo.dsl.arduino.Control){
     org.gemoc.arduino.operationalsemantics.Control_ExecutableAspect._privk3_execute(_self_, (fr.obeo.dsl.arduino.Control)_self);
    } else  if (_self instanceof fr.obeo.dsl.arduino.Instruction){
     org.gemoc.arduino.operationalsemantics.Instruction_ExecutableAspect.execute((fr.obeo.dsl.arduino.Instruction)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  private static void super_execute(final Control _self) {
    org.gemoc.arduino.operationalsemantics.Instruction_ExecutableAspectInstructionAspectProperties _self_ = org.gemoc.arduino.operationalsemantics.Instruction_ExecutableAspectInstructionAspectContext.getSelf(_self);
     org.gemoc.arduino.operationalsemantics.Instruction_ExecutableAspect._privk3_execute(_self_, _self);
  }
  
  protected static void _privk3_execute(final Control_ExecutableAspectControlAspectProperties _self_, final Control _self) {
  }
}
