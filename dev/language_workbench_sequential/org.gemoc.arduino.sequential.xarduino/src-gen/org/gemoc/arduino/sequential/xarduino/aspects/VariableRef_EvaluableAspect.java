package org.gemoc.arduino.sequential.xarduino.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.arduino.sequential.xarduino.aspects.BooleanVariable_EvaluableAspect;
import org.gemoc.arduino.sequential.xarduino.aspects.Expression_EvaluableAspect;
import org.gemoc.arduino.sequential.xarduino.aspects.IntegerVariable_EvaluableAspect;
import org.gemoc.arduino.sequential.xarduino.aspects.VariableRef_EvaluableAspectVariableRefAspectProperties;
import org.gemoc.arduino.sequential.xarduino.arduino.BooleanVariable;
import org.gemoc.arduino.sequential.xarduino.arduino.BooleanVariableRef;
import org.gemoc.arduino.sequential.xarduino.arduino.IntegerVariable;
import org.gemoc.arduino.sequential.xarduino.arduino.IntegerVariableRef;
import org.gemoc.arduino.sequential.xarduino.arduino.VariableRef;

@Aspect(className = VariableRef.class)
@SuppressWarnings("all")
public class VariableRef_EvaluableAspect extends Expression_EvaluableAspect {
  @OverrideAspectMethod
  public static Object evaluate(final VariableRef _self) {
    final org.gemoc.arduino.sequential.xarduino.aspects.VariableRef_EvaluableAspectVariableRefAspectProperties _self_ = org.gemoc.arduino.sequential.xarduino.aspects.VariableRef_EvaluableAspectVariableRefAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof org.gemoc.arduino.sequential.xarduino.arduino.VariableRef){
    					result = org.gemoc.arduino.sequential.xarduino.aspects.VariableRef_EvaluableAspect._privk3_evaluate(_self_, (org.gemoc.arduino.sequential.xarduino.arduino.VariableRef)_self);
    } else  if (_self instanceof org.gemoc.arduino.sequential.xarduino.arduino.Expression){
    					result = org.gemoc.arduino.sequential.xarduino.aspects.Expression_EvaluableAspect.evaluate((org.gemoc.arduino.sequential.xarduino.arduino.Expression)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.Object)result;
  }
  
  private static Object super_evaluate(final VariableRef _self) {
    final org.gemoc.arduino.sequential.xarduino.aspects.Expression_EvaluableAspectExpressionAspectProperties _self_ = org.gemoc.arduino.sequential.xarduino.aspects.Expression_EvaluableAspectExpressionAspectContext.getSelf(_self);
    return  org.gemoc.arduino.sequential.xarduino.aspects.Expression_EvaluableAspect._privk3_evaluate(_self_, _self);
  }
  
  protected static Object _privk3_evaluate(final VariableRef_EvaluableAspectVariableRefAspectProperties _self_, final VariableRef _self) {
    boolean _matched = false;
    if (!_matched) {
      if (_self instanceof BooleanVariableRef) {
        _matched=true;
        BooleanVariable _variable = ((BooleanVariableRef) _self).getVariable();
        return BooleanVariable_EvaluableAspect.evaluate(_variable);
      }
    }
    if (!_matched) {
      if (_self instanceof IntegerVariableRef) {
        _matched=true;
        IntegerVariable _variable = ((IntegerVariableRef) _self).getVariable();
        return IntegerVariable_EvaluableAspect.evaluate(_variable);
      }
    }
    EClass _eClass = _self.eClass();
    String _name = _eClass.getName();
    String _plus = ("type not expected: " + _name);
    throw new ClassCastException(_plus);
  }
}
