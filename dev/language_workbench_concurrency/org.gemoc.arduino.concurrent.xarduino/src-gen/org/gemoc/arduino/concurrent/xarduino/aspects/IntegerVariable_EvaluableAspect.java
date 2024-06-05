package org.gemoc.arduino.concurrent.xarduino.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.gemoc.arduino.concurrent.xarduino.arduino.IntegerVariable;

@Aspect(className = IntegerVariable.class)
@SuppressWarnings("all")
public class IntegerVariable_EvaluableAspect extends Variable_EvaluableAspect {
  @OverrideAspectMethod
  public static Object evaluate(final IntegerVariable _self) {
	final org.gemoc.arduino.concurrent.xarduino.aspects.IntegerVariable_EvaluableAspectIntegerVariableAspectProperties _self_ = org.gemoc.arduino.concurrent.xarduino.aspects.IntegerVariable_EvaluableAspectIntegerVariableAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_evaluate(_self_, _self);
	;
	return (java.lang.Object) result;
}

  public static Integer value(final IntegerVariable _self) {
	final org.gemoc.arduino.concurrent.xarduino.aspects.IntegerVariable_EvaluableAspectIntegerVariableAspectProperties _self_ = org.gemoc.arduino.concurrent.xarduino.aspects.IntegerVariable_EvaluableAspectIntegerVariableAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_value(_self_, _self);
	;
	return (java.lang.Integer) result;
}

  public static void value(final IntegerVariable _self, final Integer value) {
	final org.gemoc.arduino.concurrent.xarduino.aspects.IntegerVariable_EvaluableAspectIntegerVariableAspectProperties _self_ = org.gemoc.arduino.concurrent.xarduino.aspects.IntegerVariable_EvaluableAspectIntegerVariableAspectContext
			.getSelf(_self);
	_privk3_value(_self_, _self, value);
	;
}

  protected static Object _privk3_evaluate(final IntegerVariable_EvaluableAspectIntegerVariableAspectProperties _self_, final IntegerVariable _self) {
    return IntegerVariable_EvaluableAspect.value(_self);
  }

  protected static Integer _privk3_value(final IntegerVariable_EvaluableAspectIntegerVariableAspectProperties _self_, final IntegerVariable _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getValue") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (java.lang.Integer) ret;
    				} else {
    						return null;
    					}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.value;
  }

  protected static void _privk3_value(final IntegerVariable_EvaluableAspectIntegerVariableAspectProperties _self_, final IntegerVariable _self, final Integer value) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setValue")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, value);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.value = value;
    }
  }
}
