package org.gemoc.arduino.concurrent.xarduino.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.gemoc.arduino.concurrent.xarduino.arduino.Pin;

@Aspect(className = Pin.class)
@SuppressWarnings("all")
public class Pin_EvaluableAspect {
  public static final Integer LOW = Integer.valueOf(0);

  public static final Integer HIGH = Integer.valueOf(1023);

  public static Integer level(final Pin _self) {
	final org.gemoc.arduino.concurrent.xarduino.aspects.Pin_EvaluableAspectPinAspectProperties _self_ = org.gemoc.arduino.concurrent.xarduino.aspects.Pin_EvaluableAspectPinAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_level(_self_, _self);
	;
	return (java.lang.Integer) result;
}

  public static void level(final Pin _self, final Integer level) {
	final org.gemoc.arduino.concurrent.xarduino.aspects.Pin_EvaluableAspectPinAspectProperties _self_ = org.gemoc.arduino.concurrent.xarduino.aspects.Pin_EvaluableAspectPinAspectContext
			.getSelf(_self);
	_privk3_level(_self_, _self, level);
	;
}

  protected static Integer _privk3_level(final Pin_EvaluableAspectPinAspectProperties _self_, final Pin _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getLevel") &&
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
    return _self_.level;
  }

  protected static void _privk3_level(final Pin_EvaluableAspectPinAspectProperties _self_, final Pin _self, final Integer level) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setLevel")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, level);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.level = level;
    }
  }
}
