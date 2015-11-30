package org.gemoc.arduino.operationalsemantics;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import fr.obeo.dsl.arduino.Expression;
import fr.obeo.dsl.arduino.Instruction;
import fr.obeo.dsl.arduino.While;
import org.eclipse.emf.common.util.EList;
import org.gemoc.arduino.operationalsemantics.Control_ExecutableAspect;
import org.gemoc.arduino.operationalsemantics.Expression_EvaluableAspect;
import org.gemoc.arduino.operationalsemantics.Instruction_ExecutableAspect;
import org.gemoc.arduino.operationalsemantics.While_ExecutableAspectWhileAspectProperties;

@Aspect(className = While.class)
@SuppressWarnings("all")
public class While_ExecutableAspect extends Control_ExecutableAspect {
  @OverrideAspectMethod
  @Step
  public static void execute(final While _self) {
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    	@Override
    	public void execute() {
    		org.gemoc.arduino.operationalsemantics.While_ExecutableAspectWhileAspectProperties _self_ = org.gemoc.arduino.operationalsemantics.While_ExecutableAspectWhileAspectContext.getSelf(_self);
    		 if (_self instanceof fr.obeo.dsl.arduino.While){
    		 org.gemoc.arduino.operationalsemantics.While_ExecutableAspect._privk3_execute(_self_, (fr.obeo.dsl.arduino.While)_self);
    		} else  if (_self instanceof fr.obeo.dsl.arduino.Control){
    		 org.gemoc.arduino.operationalsemantics.Control_ExecutableAspect.execute((fr.obeo.dsl.arduino.Control)_self);
    		} else  if (_self instanceof fr.obeo.dsl.arduino.Instruction){
    		 org.gemoc.arduino.operationalsemantics.Instruction_ExecutableAspect.execute((fr.obeo.dsl.arduino.Instruction)_self);
    		} else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    	}
    };
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    if (manager != null) {
    	manager.executeStep(_self,command,"While","execute");
    } else {
    	command.execute();
    }
  }
  
  private static void super_execute(final While _self) {
    org.gemoc.arduino.operationalsemantics.Control_ExecutableAspectControlAspectProperties _self_ = org.gemoc.arduino.operationalsemantics.Control_ExecutableAspectControlAspectContext.getSelf(_self);
     org.gemoc.arduino.operationalsemantics.Control_ExecutableAspect._privk3_execute(_self_, _self);
  }
  
  protected static void _privk3_execute(final While_ExecutableAspectWhileAspectProperties _self_, final While _self) {
    EList<Instruction> _instructions = _self.getInstructions();
    final Instruction first = _instructions.get(0);
    Expression _condition = _self.getCondition();
    Object _evaluate = Expression_EvaluableAspect.evaluate(_condition);
    Boolean condition = ((Boolean) _evaluate);
    while ((condition).booleanValue()) {
      {
        Instruction current = first;
        while ((!Objects.equal(current, null))) {
          {
            Instruction_ExecutableAspect.execute(current);
            Instruction _next = current.getNext();
            current = _next;
          }
        }
        Expression _condition_1 = _self.getCondition();
        Object _evaluate_1 = Expression_EvaluableAspect.evaluate(_condition_1);
        condition = ((Boolean) _evaluate_1);
      }
    }
  }
}
