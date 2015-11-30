package org.gemoc.arduino.operationalsemantics;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import fr.obeo.dsl.arduino.ArduinoUtils;
import fr.obeo.dsl.arduino.BooleanExpression;
import fr.obeo.dsl.arduino.Expression;
import fr.obeo.dsl.arduino.IntegerExpression;
import fr.obeo.dsl.arduino.Module;
import fr.obeo.dsl.arduino.ModuleAssignment;
import fr.obeo.dsl.arduino.Pin;
import fr.obeo.dsl.arduino.Project;
import org.gemoc.arduino.operationalsemantics.Expression_EvaluableAspect;
import org.gemoc.arduino.operationalsemantics.ModuleAssignment_ExecutableAspectModuleAssignmentAspectProperties;
import org.gemoc.arduino.operationalsemantics.ModuleInstruction_ExecutableAspect;
import org.gemoc.arduino.operationalsemantics.Pin_EvaluableAspect;

@Aspect(className = ModuleAssignment.class)
@SuppressWarnings("all")
public class ModuleAssignment_ExecutableAspect extends ModuleInstruction_ExecutableAspect {
  @OverrideAspectMethod
  @Step
  public static void execute(final ModuleAssignment _self) {
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    	@Override
    	public void execute() {
    		org.gemoc.arduino.operationalsemantics.ModuleAssignment_ExecutableAspectModuleAssignmentAspectProperties _self_ = org.gemoc.arduino.operationalsemantics.ModuleAssignment_ExecutableAspectModuleAssignmentAspectContext.getSelf(_self);
    		 if (_self instanceof fr.obeo.dsl.arduino.ModuleAssignment){
    		 org.gemoc.arduino.operationalsemantics.ModuleAssignment_ExecutableAspect._privk3_execute(_self_, (fr.obeo.dsl.arduino.ModuleAssignment)_self);
    		} else  if (_self instanceof fr.obeo.dsl.arduino.ModuleInstruction){
    		 org.gemoc.arduino.operationalsemantics.ModuleInstruction_ExecutableAspect.execute((fr.obeo.dsl.arduino.ModuleInstruction)_self);
    		} else  if (_self instanceof fr.obeo.dsl.arduino.Instruction){
    		 org.gemoc.arduino.operationalsemantics.Instruction_ExecutableAspect.execute((fr.obeo.dsl.arduino.Instruction)_self);
    		} else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    	}
    };
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    if (manager != null) {
    	manager.executeStep(_self,command,"ModuleAssignment","execute");
    } else {
    	command.execute();
    }
  }
  
  private static void super_execute(final ModuleAssignment _self) {
    org.gemoc.arduino.operationalsemantics.ModuleInstruction_ExecutableAspectModuleInstructionAspectProperties _self_ = org.gemoc.arduino.operationalsemantics.ModuleInstruction_ExecutableAspectModuleInstructionAspectContext.getSelf(_self);
     org.gemoc.arduino.operationalsemantics.ModuleInstruction_ExecutableAspect._privk3_execute(_self_, _self);
  }
  
  protected static void _privk3_execute(final ModuleAssignment_ExecutableAspectModuleAssignmentAspectProperties _self_, final ModuleAssignment _self) {
    Project _containingProject = ArduinoUtils.getContainingProject(_self);
    Module _module = _self.getModule();
    final Pin pin = ArduinoUtils.getPin(_containingProject, _module);
    Expression _operand = _self.getOperand();
    if ((_operand instanceof IntegerExpression)) {
      Expression _operand_1 = _self.getOperand();
      Object _evaluate = Expression_EvaluableAspect.evaluate(_operand_1);
      Pin_EvaluableAspect.level(pin, ((Integer) _evaluate));
    }
    Expression _operand_2 = _self.getOperand();
    if ((_operand_2 instanceof BooleanExpression)) {
      Expression _operand_3 = _self.getOperand();
      Object _evaluate_1 = Expression_EvaluableAspect.evaluate(_operand_3);
      if ((((Boolean) _evaluate_1)).booleanValue()) {
        Pin_EvaluableAspect.level(pin, Pin_EvaluableAspect.HIGH);
      } else {
        Pin_EvaluableAspect.level(pin, Pin_EvaluableAspect.LOW);
      }
    }
  }
}
