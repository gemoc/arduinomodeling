package org.gemoc.arduino.sequential.execarduino.aspects;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.gemoc.arduino.sequential.execarduino.arduino.Block;
import org.gemoc.arduino.sequential.execarduino.arduino.If;
import org.gemoc.arduino.sequential.execarduino.aspects.Block_ExecutableAspect;
import org.gemoc.arduino.sequential.execarduino.aspects.Control_ExecutableAspect;
import org.gemoc.arduino.sequential.execarduino.aspects.If_EvaluableAspect;
import org.gemoc.arduino.sequential.execarduino.aspects.If_ExecutableAspectIfAspectProperties;

@Aspect(className = If.class)
@SuppressWarnings("all")
public class If_ExecutableAspect extends Control_ExecutableAspect {
  @Step
  @OverrideAspectMethod
  public static void execute(final If _self) {
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    	@Override
    	public void execute() {
    		org.gemoc.arduino.sequential.execarduino.aspects.If_ExecutableAspectIfAspectProperties _self_ = org.gemoc.arduino.sequential.execarduino.aspects.If_ExecutableAspectIfAspectContext.getSelf(_self);
    		 if (_self instanceof org.gemoc.arduino.sequential.execarduino.arduino.If){
    		 org.gemoc.arduino.sequential.execarduino.aspects.If_ExecutableAspect._privk3_execute(_self_, (org.gemoc.arduino.sequential.execarduino.arduino.If)_self);
    		} else  if (_self instanceof org.gemoc.arduino.sequential.execarduino.arduino.Control){
    		 org.gemoc.arduino.sequential.execarduino.aspects.Control_ExecutableAspect.execute((org.gemoc.arduino.sequential.execarduino.arduino.Control)_self);
    		} else  if (_self instanceof org.gemoc.arduino.sequential.execarduino.arduino.Instruction){
    		 org.gemoc.arduino.sequential.execarduino.aspects.Instruction_ExecutableAspect.execute((org.gemoc.arduino.sequential.execarduino.arduino.Instruction)_self);
    		} else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    	}
    };
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    if (manager != null) {
    	manager.executeStep(_self,command,"If","execute");
    } else {
    	command.execute();
    }
  }
  
  private static void super_execute(final If _self) {
    org.gemoc.arduino.sequential.execarduino.aspects.Control_ExecutableAspectControlAspectProperties _self_ = org.gemoc.arduino.sequential.execarduino.aspects.Control_ExecutableAspectControlAspectContext.getSelf(_self);
     org.gemoc.arduino.sequential.execarduino.aspects.Control_ExecutableAspect._privk3_execute(_self_, _self);
  }
  
  protected static void _privk3_execute(final If_ExecutableAspectIfAspectProperties _self_, final If _self) {
    Boolean _evaluate = If_EvaluableAspect.evaluate(_self);
    if ((_evaluate).booleanValue()) {
      Block _block = _self.getBlock();
      Block_ExecutableAspect.execute(_block);
    } else {
      Block _elseBlock = _self.getElseBlock();
      boolean _notEquals = (!Objects.equal(_elseBlock, null));
      if (_notEquals) {
        Block _elseBlock_1 = _self.getElseBlock();
        Block_ExecutableAspect.execute(_elseBlock_1);
      }
    }
  }
}
