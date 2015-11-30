package org.gemoc.arduino.operationalsemantics;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import fr.obeo.dsl.arduino.ModuleAssignment;
import org.gemoc.arduino.operationalsemantics.ModuleAssignment_CallableAspectModuleAssignmentAspectProperties;
import org.gemoc.arduino.operationalsemantics.ModuleInstruction_CallableAspect;
import org.gemoc.arduino.operationalsemantics.ModuleInstruction_ExecutableAspect;

@Aspect(className = ModuleAssignment.class)
@SuppressWarnings("all")
public class ModuleAssignment_CallableAspect extends ModuleInstruction_CallableAspect {
  @OverrideAspectMethod
  @Step
  public static void call(final ModuleAssignment _self) {
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    	@Override
    	public void execute() {
    		org.gemoc.arduino.operationalsemantics.ModuleAssignment_CallableAspectModuleAssignmentAspectProperties _self_ = org.gemoc.arduino.operationalsemantics.ModuleAssignment_CallableAspectModuleAssignmentAspectContext.getSelf(_self);
    		 if (_self instanceof fr.obeo.dsl.arduino.ModuleAssignment){
    		 org.gemoc.arduino.operationalsemantics.ModuleAssignment_CallableAspect._privk3_call(_self_, (fr.obeo.dsl.arduino.ModuleAssignment)_self);
    		} else  if (_self instanceof fr.obeo.dsl.arduino.ModuleInstruction){
    		 org.gemoc.arduino.operationalsemantics.ModuleInstruction_CallableAspect.call((fr.obeo.dsl.arduino.ModuleInstruction)_self);
    		} else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    	}
    };
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    if (manager != null) {
    	manager.executeStep(_self,command,"ModuleAssignment","call");
    } else {
    	command.execute();
    }
  }
  
  private static void super_call(final ModuleAssignment _self) {
    org.gemoc.arduino.operationalsemantics.ModuleInstruction_CallableAspectModuleInstructionAspectProperties _self_ = org.gemoc.arduino.operationalsemantics.ModuleInstruction_CallableAspectModuleInstructionAspectContext.getSelf(_self);
     org.gemoc.arduino.operationalsemantics.ModuleInstruction_CallableAspect._privk3_call(_self_, _self);
  }
  
  protected static void _privk3_call(final ModuleAssignment_CallableAspectModuleAssignmentAspectProperties _self_, final ModuleAssignment _self) {
    ModuleInstruction_ExecutableAspect.execute(_self);
  }
}
