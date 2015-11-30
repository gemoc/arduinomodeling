package org.gemoc.arduino.operationalsemantics;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.obeo.dsl.arduino.Instruction;
import fr.obeo.dsl.arduino.Sketch;
import org.gemoc.arduino.operationalsemantics.Instruction_ExecutableAspect;
import org.gemoc.arduino.operationalsemantics.Sketch_ExecutableAspectSketchAspectProperties;

@Aspect(className = Sketch.class)
@SuppressWarnings("all")
public class Sketch_ExecutableAspect extends Instruction_ExecutableAspect {
  @OverrideAspectMethod
  public static void execute(final Sketch _self) {
    org.gemoc.arduino.operationalsemantics.Sketch_ExecutableAspectSketchAspectProperties _self_ = org.gemoc.arduino.operationalsemantics.Sketch_ExecutableAspectSketchAspectContext.getSelf(_self);
     if (_self instanceof fr.obeo.dsl.arduino.Sketch){
     org.gemoc.arduino.operationalsemantics.Sketch_ExecutableAspect._privk3_execute(_self_, (fr.obeo.dsl.arduino.Sketch)_self);
    } else  if (_self instanceof fr.obeo.dsl.arduino.Instruction){
     org.gemoc.arduino.operationalsemantics.Instruction_ExecutableAspect.execute((fr.obeo.dsl.arduino.Instruction)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  private static void super_execute(final Sketch _self) {
    org.gemoc.arduino.operationalsemantics.Instruction_ExecutableAspectInstructionAspectProperties _self_ = org.gemoc.arduino.operationalsemantics.Instruction_ExecutableAspectInstructionAspectContext.getSelf(_self);
     org.gemoc.arduino.operationalsemantics.Instruction_ExecutableAspect._privk3_execute(_self_, _self);
  }
  
  protected static void _privk3_execute(final Sketch_ExecutableAspectSketchAspectProperties _self_, final Sketch _self) {
    final Instruction first = _self.getNext();
    Instruction current = first;
    while ((!Objects.equal(current, null))) {
      {
        if ((!(current instanceof Sketch))) {
          Instruction_ExecutableAspect.execute(current);
        }
        Instruction _next = current.getNext();
        current = _next;
      }
    }
  }
}
