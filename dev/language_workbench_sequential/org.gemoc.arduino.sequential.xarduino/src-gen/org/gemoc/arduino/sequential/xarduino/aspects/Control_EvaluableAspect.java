package org.gemoc.arduino.sequential.xarduino.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.gemoc.arduino.sequential.xarduino.aspects.Control_EvaluableAspectControlAspectProperties;
import org.gemoc.arduino.sequential.xarduino.aspects.Instruction_ExecutableAspect;
import org.gemoc.arduino.sequential.xarduino.arduino.Control;

@Aspect(className = Control.class)
@SuppressWarnings("all")
public class Control_EvaluableAspect extends Instruction_ExecutableAspect {
  public static Boolean evaluate(final Control _self) {
    final org.gemoc.arduino.sequential.xarduino.aspects.Control_EvaluableAspectControlAspectProperties _self_ = org.gemoc.arduino.sequential.xarduino.aspects.Control_EvaluableAspectControlAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof org.gemoc.arduino.sequential.xarduino.arduino.If){
    					result = org.gemoc.arduino.sequential.xarduino.aspects.If_EvaluableAspect.evaluate((org.gemoc.arduino.sequential.xarduino.arduino.If)_self);
    } else  if (_self instanceof org.gemoc.arduino.sequential.xarduino.arduino.Repeat){
    					result = org.gemoc.arduino.sequential.xarduino.aspects.Repeat_EvaluableAspect.evaluate((org.gemoc.arduino.sequential.xarduino.arduino.Repeat)_self);
    } else  if (_self instanceof org.gemoc.arduino.sequential.xarduino.arduino.While){
    					result = org.gemoc.arduino.sequential.xarduino.aspects.While_EvaluableAspect.evaluate((org.gemoc.arduino.sequential.xarduino.arduino.While)_self);
    } else  if (_self instanceof org.gemoc.arduino.sequential.xarduino.arduino.Control){
    					result = org.gemoc.arduino.sequential.xarduino.aspects.Control_EvaluableAspect._privk3_evaluate(_self_, (org.gemoc.arduino.sequential.xarduino.arduino.Control)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.Boolean)result;
  }
  
  protected static Boolean _privk3_evaluate(final Control_EvaluableAspectControlAspectProperties _self_, final Control _self) {
    return null;
  }
}
