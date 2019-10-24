package org.gemoc.arduino.sequential.xarduino.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.gemoc.arduino.sequential.xarduino.aspects.BluetoothTransceiver_PushAspect;
import org.gemoc.arduino.sequential.xarduino.aspects.Expression_EvaluableAspect;
import org.gemoc.arduino.sequential.xarduino.aspects.Instruction_UtilitesAspect;
import org.gemoc.arduino.sequential.xarduino.aspects.ModuleAssignment_ExecutableAspectModuleAssignmentAspectProperties;
import org.gemoc.arduino.sequential.xarduino.aspects.ModuleInstruction_ExecutableAspect;
import org.gemoc.arduino.sequential.xarduino.aspects.Pin_EvaluableAspect;
import org.gemoc.arduino.sequential.xarduino.arduino.BluetoothTransceiver;
import org.gemoc.arduino.sequential.xarduino.arduino.BooleanExpression;
import org.gemoc.arduino.sequential.xarduino.arduino.Expression;
import org.gemoc.arduino.sequential.xarduino.arduino.IntegerExpression;
import org.gemoc.arduino.sequential.xarduino.arduino.ModuleAssignment;
import org.gemoc.arduino.sequential.xarduino.arduino.Pin;

@Aspect(className = ModuleAssignment.class)
@SuppressWarnings("all")
public class ModuleAssignment_ExecutableAspect extends ModuleInstruction_ExecutableAspect {
  @Step
  @OverrideAspectMethod
  public static void execute(final ModuleAssignment _self) {
	final org.gemoc.arduino.sequential.xarduino.aspects.ModuleAssignment_ExecutableAspectModuleAssignmentAspectProperties _self_ = org.gemoc.arduino.sequential.xarduino.aspects.ModuleAssignment_ExecutableAspectModuleAssignmentAspectContext
			.getSelf(_self);
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
		@Override
		public void execute() {
			_privk3_execute(_self_, _self);
		}
	};
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
			.getInstance().findStepManager(_self);
	if (manager != null) {
		manager.executeStep(_self, command, "ModuleAssignment", "execute");
	} else {
		command.execute();
	}
	;
	;
}
  
  private static void super_execute(final ModuleAssignment _self) {
    final org.gemoc.arduino.sequential.xarduino.aspects.ModuleInstruction_ExecutableAspectModuleInstructionAspectProperties _self_ = org.gemoc.arduino.sequential.xarduino.aspects.ModuleInstruction_ExecutableAspectModuleInstructionAspectContext.getSelf(_self);
     org.gemoc.arduino.sequential.xarduino.aspects.ModuleInstruction_ExecutableAspect._privk3_execute(_self_, _self);
  }
  
  protected static void _privk3_execute(final ModuleAssignment_ExecutableAspectModuleAssignmentAspectProperties _self_, final ModuleAssignment _self) {
    final Pin pin = Instruction_UtilitesAspect.getPin(_self, _self.getModule());
    Expression _operand = _self.getOperand();
    if ((_operand instanceof IntegerExpression)) {
      Object _evaluate = Expression_EvaluableAspect.evaluate(_self.getOperand());
      Pin_EvaluableAspect.level(pin, ((Integer) _evaluate));
    }
    Expression _operand_1 = _self.getOperand();
    if ((_operand_1 instanceof BooleanExpression)) {
      Object _evaluate_1 = Expression_EvaluableAspect.evaluate(_self.getOperand());
      if ((((Boolean) _evaluate_1)).booleanValue()) {
        Pin_EvaluableAspect.level(pin, Pin_EvaluableAspect.HIGH);
      } else {
        Pin_EvaluableAspect.level(pin, Pin_EvaluableAspect.LOW);
      }
    }
    org.gemoc.arduino.sequential.xarduino.arduino.Module _module = _self.getModule();
    if ((_module instanceof BluetoothTransceiver)) {
      org.gemoc.arduino.sequential.xarduino.arduino.Module _module_1 = _self.getModule();
      BluetoothTransceiver_PushAspect.dataToSend(((BluetoothTransceiver) _module_1)).add(Pin_EvaluableAspect.level(pin));
      org.gemoc.arduino.sequential.xarduino.arduino.Module _module_2 = _self.getModule();
      BluetoothTransceiver_PushAspect.push(((BluetoothTransceiver) _module_2));
    }
  }
}
