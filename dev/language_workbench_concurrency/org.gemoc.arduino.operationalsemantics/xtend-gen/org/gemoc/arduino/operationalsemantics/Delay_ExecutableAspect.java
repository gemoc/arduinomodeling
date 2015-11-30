package org.gemoc.arduino.operationalsemantics;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import fr.obeo.dsl.arduino.Delay;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.gemoc.arduino.operationalsemantics.Delay_ExecutableAspectDelayAspectProperties;
import org.gemoc.arduino.operationalsemantics.Utilities_ExecutableAspect;

@Aspect(className = Delay.class)
@SuppressWarnings("all")
public class Delay_ExecutableAspect extends Utilities_ExecutableAspect {
  @OverrideAspectMethod
  @Step
  public static void execute(final Delay _self) {
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    	@Override
    	public void execute() {
    		org.gemoc.arduino.operationalsemantics.Delay_ExecutableAspectDelayAspectProperties _self_ = org.gemoc.arduino.operationalsemantics.Delay_ExecutableAspectDelayAspectContext.getSelf(_self);
    		 if (_self instanceof fr.obeo.dsl.arduino.Delay){
    		 org.gemoc.arduino.operationalsemantics.Delay_ExecutableAspect._privk3_execute(_self_, (fr.obeo.dsl.arduino.Delay)_self);
    		} else  if (_self instanceof fr.obeo.dsl.arduino.Utilities){
    		 org.gemoc.arduino.operationalsemantics.Utilities_ExecutableAspect.execute((fr.obeo.dsl.arduino.Utilities)_self);
    		} else  if (_self instanceof fr.obeo.dsl.arduino.Instruction){
    		 org.gemoc.arduino.operationalsemantics.Instruction_ExecutableAspect.execute((fr.obeo.dsl.arduino.Instruction)_self);
    		} else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    	}
    };
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    if (manager != null) {
    	manager.executeStep(_self,command,"Delay","execute");
    } else {
    	command.execute();
    }
  }
  
  private static void super_execute(final Delay _self) {
    org.gemoc.arduino.operationalsemantics.Utilities_ExecutableAspectUtilitiesAspectProperties _self_ = org.gemoc.arduino.operationalsemantics.Utilities_ExecutableAspectUtilitiesAspectContext.getSelf(_self);
     org.gemoc.arduino.operationalsemantics.Utilities_ExecutableAspect._privk3_execute(_self_, _self);
  }
  
  protected static void _privk3_execute(final Delay_ExecutableAspectDelayAspectProperties _self_, final Delay _self) {
    try {
      int _value = _self.getValue();
      Thread.sleep(_value);
    } catch (final Throwable _t) {
      if (_t instanceof InterruptedException) {
        final InterruptedException e = (InterruptedException)_t;
        e.printStackTrace();
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
}
