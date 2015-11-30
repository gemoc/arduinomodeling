package org.gemoc.arduino.operationalsemantics;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import fr.obeo.dsl.arduino.IntegerConstant;
import org.gemoc.arduino.operationalsemantics.Expression_EvaluableAspect;
import org.gemoc.arduino.operationalsemantics.IntegerConstant_ExecutableAspectIntegerConstantAspectProperties;

@Aspect(className = IntegerConstant.class)
@SuppressWarnings("all")
public class IntegerConstant_ExecutableAspect extends Expression_EvaluableAspect {
  @OverrideAspectMethod
  @Step
  public static Object evaluate(final IntegerConstant _self) {
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    	@Override
    	public void execute() {
    		org.gemoc.arduino.operationalsemantics.IntegerConstant_ExecutableAspectIntegerConstantAspectProperties _self_ = org.gemoc.arduino.operationalsemantics.IntegerConstant_ExecutableAspectIntegerConstantAspectContext.getSelf(_self);
    		 if (_self instanceof fr.obeo.dsl.arduino.IntegerConstant){
    		addToResult( org.gemoc.arduino.operationalsemantics.IntegerConstant_ExecutableAspect._privk3_evaluate(_self_, (fr.obeo.dsl.arduino.IntegerConstant)_self));
    		} else  if (_self instanceof fr.obeo.dsl.arduino.Expression){
    		addToResult( org.gemoc.arduino.operationalsemantics.Expression_EvaluableAspect.evaluate((fr.obeo.dsl.arduino.Expression)_self));
    		} else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    	}
    };
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    if (manager != null) {
    	manager.executeStep(_self,command,"IntegerConstant","evaluate");
    } else {
    	command.execute();
    }
    return (java.lang.Object)command.getResult();
  }
  
  private static Object super_evaluate(final IntegerConstant _self) {
    org.gemoc.arduino.operationalsemantics.Expression_EvaluableAspectExpressionAspectProperties _self_ = org.gemoc.arduino.operationalsemantics.Expression_EvaluableAspectExpressionAspectContext.getSelf(_self);
    return  org.gemoc.arduino.operationalsemantics.Expression_EvaluableAspect._privk3_evaluate(_self_, _self);
  }
  
  protected static Object _privk3_evaluate(final IntegerConstant_ExecutableAspectIntegerConstantAspectProperties _self_, final IntegerConstant _self) {
    return Integer.valueOf(_self.getValue());
  }
}
