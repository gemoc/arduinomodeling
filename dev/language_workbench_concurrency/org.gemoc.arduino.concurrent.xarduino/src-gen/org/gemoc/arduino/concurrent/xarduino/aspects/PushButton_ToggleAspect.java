package org.gemoc.arduino.concurrent.xarduino.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.gemoc.arduino.concurrent.xarduino.arduino.Pin;
import org.gemoc.arduino.concurrent.xarduino.arduino.PushButton;
import org.gemoc.arduino.concurrent.xarduino.aspects.Module_UtilitiesAspect;
import org.gemoc.arduino.concurrent.xarduino.aspects.Pin_EvaluableAspect;
import org.gemoc.arduino.concurrent.xarduino.aspects.PushButton_ToggleAspectPushButtonAspectProperties;

@Aspect(className = PushButton.class)
@SuppressWarnings("all")
public abstract class PushButton_ToggleAspect {
  public static void toggle(final PushButton _self) {
	final org.gemoc.arduino.concurrent.xarduino.aspects.PushButton_ToggleAspectPushButtonAspectProperties _self_ = org.gemoc.arduino.concurrent.xarduino.aspects.PushButton_ToggleAspectPushButtonAspectContext
			.getSelf(_self);
	_privk3_toggle(_self_, _self);
	;
}
  
  public static boolean isPushed(final PushButton _self) {
	final org.gemoc.arduino.concurrent.xarduino.aspects.PushButton_ToggleAspectPushButtonAspectProperties _self_ = org.gemoc.arduino.concurrent.xarduino.aspects.PushButton_ToggleAspectPushButtonAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_isPushed(_self_, _self);
	;
	return (boolean) result;
}
  
  public static void isPushed(final PushButton _self, final boolean isPushed) {
	final org.gemoc.arduino.concurrent.xarduino.aspects.PushButton_ToggleAspectPushButtonAspectProperties _self_ = org.gemoc.arduino.concurrent.xarduino.aspects.PushButton_ToggleAspectPushButtonAspectContext
			.getSelf(_self);
	_privk3_isPushed(_self_, _self, isPushed);
	;
}
  
  protected static void _privk3_toggle(final PushButton_ToggleAspectPushButtonAspectProperties _self_, final PushButton _self) {
    InputOutput.<String>println("xtend toggle() call !!!");
    boolean _isPushed = PushButton_ToggleAspect.isPushed(_self);
    boolean _not = (!_isPushed);
    PushButton_ToggleAspect.isPushed(_self, _not);
    final Pin pin = Module_UtilitiesAspect.getPin(_self);
    boolean _isPushed_1 = PushButton_ToggleAspect.isPushed(_self);
    if (_isPushed_1) {
      Pin_EvaluableAspect.level(pin, Pin_EvaluableAspect.HIGH);
    } else {
      Pin_EvaluableAspect.level(pin, Pin_EvaluableAspect.LOW);
    }
  }
  
  protected static boolean _privk3_isPushed(final PushButton_ToggleAspectPushButtonAspectProperties _self_, final PushButton _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("isIsPushed") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (boolean) ret;
    				}		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.isPushed;
  }
  
  protected static void _privk3_isPushed(final PushButton_ToggleAspectPushButtonAspectProperties _self_, final PushButton _self, final boolean isPushed) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setIsPushed")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, isPushed);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.isPushed = isPushed;
    }
  }
}
