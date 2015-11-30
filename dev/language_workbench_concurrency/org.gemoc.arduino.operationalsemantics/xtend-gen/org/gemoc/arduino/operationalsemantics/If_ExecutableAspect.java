package org.gemoc.arduino.operationalsemantics;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import fr.obeo.dsl.arduino.BooleanExpression;
import fr.obeo.dsl.arduino.Expression;
import fr.obeo.dsl.arduino.If;
import fr.obeo.dsl.arduino.Instruction;
import fr.obeo.dsl.arduino.Module;
import fr.obeo.dsl.arduino.ModuleGet;
import fr.obeo.dsl.arduino.Sensor;
import org.eclipse.emf.common.util.EList;
import org.gemoc.arduino.operationalsemantics.Control_ExecutableAspect;
import org.gemoc.arduino.operationalsemantics.Expression_EvaluableAspect;
import org.gemoc.arduino.operationalsemantics.If_ExecutableAspectIfAspectProperties;
import org.gemoc.arduino.operationalsemantics.Instruction_ExecutableAspect;

@Aspect(className = If.class)
@SuppressWarnings("all")
public class If_ExecutableAspect extends Control_ExecutableAspect {
  @OverrideAspectMethod
  @Step
  public static void execute(final If _self) {
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    	@Override
    	public void execute() {
    		org.gemoc.arduino.operationalsemantics.If_ExecutableAspectIfAspectProperties _self_ = org.gemoc.arduino.operationalsemantics.If_ExecutableAspectIfAspectContext.getSelf(_self);
    		 if (_self instanceof fr.obeo.dsl.arduino.If){
    		 org.gemoc.arduino.operationalsemantics.If_ExecutableAspect._privk3_execute(_self_, (fr.obeo.dsl.arduino.If)_self);
    		} else  if (_self instanceof fr.obeo.dsl.arduino.Control){
    		 org.gemoc.arduino.operationalsemantics.Control_ExecutableAspect.execute((fr.obeo.dsl.arduino.Control)_self);
    		} else  if (_self instanceof fr.obeo.dsl.arduino.Instruction){
    		 org.gemoc.arduino.operationalsemantics.Instruction_ExecutableAspect.execute((fr.obeo.dsl.arduino.Instruction)_self);
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
    org.gemoc.arduino.operationalsemantics.Control_ExecutableAspectControlAspectProperties _self_ = org.gemoc.arduino.operationalsemantics.Control_ExecutableAspectControlAspectContext.getSelf(_self);
     org.gemoc.arduino.operationalsemantics.Control_ExecutableAspect._privk3_execute(_self_, _self);
  }
  
  protected static void _privk3_execute(final If_ExecutableAspectIfAspectProperties _self_, final If _self) {
    Boolean resCond = Boolean.valueOf(false);
    Expression _condition = _self.getCondition();
    if ((_condition instanceof BooleanExpression)) {
      Expression _condition_1 = _self.getCondition();
      Object _evaluate = Expression_EvaluableAspect.evaluate(_condition_1);
      resCond = ((Boolean) _evaluate);
    }
    Expression _condition_2 = _self.getCondition();
    if ((_condition_2 instanceof ModuleGet)) {
      Expression _condition_3 = _self.getCondition();
      Module m = ((ModuleGet) _condition_3).getModule();
      if ((m instanceof Sensor)) {
        boolean _isLevel = ((Sensor)m).isLevel();
        resCond = Boolean.valueOf(_isLevel);
      }
    }
    if ((resCond).booleanValue()) {
      EList<Instruction> _instructions = _self.getInstructions();
      Instruction current = _instructions.get(0);
      while ((!Objects.equal(current, null))) {
        {
          Instruction_ExecutableAspect.execute(current);
          Instruction _next = current.getNext();
          current = _next;
        }
      }
    }
  }
}
