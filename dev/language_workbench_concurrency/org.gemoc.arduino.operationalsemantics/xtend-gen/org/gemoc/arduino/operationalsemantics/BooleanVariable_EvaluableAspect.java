package org.gemoc.arduino.operationalsemantics;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.obeo.dsl.arduino.BooleanVariable;
import org.gemoc.arduino.operationalsemantics.BooleanVariable_EvaluableAspectBooleanVariableAspectProperties;
import org.gemoc.arduino.operationalsemantics.Expression_EvaluableAspect;

@Aspect(className = BooleanVariable.class)
@SuppressWarnings("all")
public class BooleanVariable_EvaluableAspect extends Expression_EvaluableAspect {
  @OverrideAspectMethod
  public static Object evaluate(final BooleanVariable _self) {
    org.gemoc.arduino.operationalsemantics.BooleanVariable_EvaluableAspectBooleanVariableAspectProperties _self_ = org.gemoc.arduino.operationalsemantics.BooleanVariable_EvaluableAspectBooleanVariableAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof fr.obeo.dsl.arduino.BooleanVariable){
    result = org.gemoc.arduino.operationalsemantics.BooleanVariable_EvaluableAspect._privk3_evaluate(_self_, (fr.obeo.dsl.arduino.BooleanVariable)_self);
    } else  if (_self instanceof fr.obeo.dsl.arduino.Expression){
    result = org.gemoc.arduino.operationalsemantics.Expression_EvaluableAspect.evaluate((fr.obeo.dsl.arduino.Expression)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.Object)result;
  }
  
  public static Boolean value(final BooleanVariable _self) {
    org.gemoc.arduino.operationalsemantics.BooleanVariable_EvaluableAspectBooleanVariableAspectProperties _self_ = org.gemoc.arduino.operationalsemantics.BooleanVariable_EvaluableAspectBooleanVariableAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_value(_self_, _self);
    return (java.lang.Boolean)result;
  }
  
  public static void value(final BooleanVariable _self, final Boolean value) {
    org.gemoc.arduino.operationalsemantics.BooleanVariable_EvaluableAspectBooleanVariableAspectProperties _self_ = org.gemoc.arduino.operationalsemantics.BooleanVariable_EvaluableAspectBooleanVariableAspectContext.getSelf(_self);
    _privk3_value(_self_, _self,value);
  }
  
  private static Object super_evaluate(final BooleanVariable _self) {
    org.gemoc.arduino.operationalsemantics.Expression_EvaluableAspectExpressionAspectProperties _self_ = org.gemoc.arduino.operationalsemantics.Expression_EvaluableAspectExpressionAspectContext.getSelf(_self);
    return  org.gemoc.arduino.operationalsemantics.Expression_EvaluableAspect._privk3_evaluate(_self_, _self);
  }
  
  protected static Object _privk3_evaluate(final BooleanVariable_EvaluableAspectBooleanVariableAspectProperties _self_, final BooleanVariable _self) {
    return BooleanVariable_EvaluableAspect.value(_self);
  }
  
  protected static Boolean _privk3_value(final BooleanVariable_EvaluableAspectBooleanVariableAspectProperties _self_, final BooleanVariable _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getValue") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (java.lang.Boolean) ret;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.value;
  }
  
  protected static void _privk3_value(final BooleanVariable_EvaluableAspectBooleanVariableAspectProperties _self_, final BooleanVariable _self, final Boolean value) {
    _self_.value = value; try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setValue")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, value);
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
  }
}
