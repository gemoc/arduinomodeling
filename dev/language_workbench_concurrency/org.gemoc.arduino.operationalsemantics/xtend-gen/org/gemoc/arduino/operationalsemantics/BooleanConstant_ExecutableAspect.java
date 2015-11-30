package org.gemoc.arduino.operationalsemantics;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import fr.obeo.dsl.arduino.BooleanConstant;
import org.gemoc.arduino.operationalsemantics.BooleanConstant_ExecutableAspectBooleanConstantAspectProperties;
import org.gemoc.arduino.operationalsemantics.Expression_EvaluableAspect;

@Aspect(className = BooleanConstant.class)
@SuppressWarnings("all")
public class BooleanConstant_ExecutableAspect extends Expression_EvaluableAspect {
  @OverrideAspectMethod
  @Step
  public static Object evaluate(final BooleanConstant _self) {
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    	@Override
    	public void execute() {
    		org.gemoc.arduino.operationalsemantics.BooleanConstant_ExecutableAspectBooleanConstantAspectProperties _self_ = org.gemoc.arduino.operationalsemantics.BooleanConstant_ExecutableAspectBooleanConstantAspectContext.getSelf(_self);
    		 if (_self instanceof fr.obeo.dsl.arduino.BooleanConstant){
    		addToResult( org.gemoc.arduino.operationalsemantics.BooleanConstant_ExecutableAspect._privk3_evaluate(_self_, (fr.obeo.dsl.arduino.BooleanConstant)_self));
    		} else  if (_self instanceof fr.obeo.dsl.arduino.Expression){
    		addToResult( org.gemoc.arduino.operationalsemantics.Expression_EvaluableAspect.evaluate((fr.obeo.dsl.arduino.Expression)_self));
    		} else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    	}
    };
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    if (manager != null) {
    	manager.executeStep(_self,command,"BooleanConstant","evaluate");
    } else {
    	command.execute();
    }
    return (java.lang.Object)command.getResult();
  }
  
  private static Object super_evaluate(final BooleanConstant _self) {
    org.gemoc.arduino.operationalsemantics.Expression_EvaluableAspectExpressionAspectProperties _self_ = org.gemoc.arduino.operationalsemantics.Expression_EvaluableAspectExpressionAspectContext.getSelf(_self);
    return  org.gemoc.arduino.operationalsemantics.Expression_EvaluableAspect._privk3_evaluate(_self_, _self);
  }
  
  protected static Object _privk3_evaluate(final BooleanConstant_ExecutableAspectBooleanConstantAspectProperties _self_, final BooleanConstant _self) {
    return Boolean.valueOf(_self.isValue());
  }
}
