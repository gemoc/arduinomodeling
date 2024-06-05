package org.gemoc.arduino.sequential.xarduino.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.gemoc.arduino.sequential.xarduino.arduino.Repeat;

@Aspect(className = Repeat.class)
@SuppressWarnings("all")
public class Repeat_EvaluableAspect extends Control_EvaluableAspect {
  @OverrideAspectMethod
  public static Boolean evaluate(final Repeat _self) {
	final org.gemoc.arduino.sequential.xarduino.aspects.Repeat_EvaluableAspectRepeatAspectProperties _self_ = org.gemoc.arduino.sequential.xarduino.aspects.Repeat_EvaluableAspectRepeatAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_evaluate(_self_, _self);
	;
	return (java.lang.Boolean) result;
}

  @OverrideAspectMethod
  public static void finalize(final Repeat _self) {
	final org.gemoc.arduino.sequential.xarduino.aspects.Repeat_EvaluableAspectRepeatAspectProperties _self_ = org.gemoc.arduino.sequential.xarduino.aspects.Repeat_EvaluableAspectRepeatAspectContext
			.getSelf(_self);
	_privk3_finalize(_self_, _self);
	;
}

  private static Integer i(final Repeat _self) {
    final org.gemoc.arduino.sequential.xarduino.aspects.Repeat_EvaluableAspectRepeatAspectProperties _self_ = org.gemoc.arduino.sequential.xarduino.aspects.Repeat_EvaluableAspectRepeatAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Integer i()
    if (_self instanceof org.gemoc.arduino.sequential.xarduino.arduino.Repeat){
    	result = org.gemoc.arduino.sequential.xarduino.aspects.Repeat_EvaluableAspect._privk3_i(_self_, (org.gemoc.arduino.sequential.xarduino.arduino.Repeat)_self);
    };
    return (java.lang.Integer)result;
  }

  private static void i(final Repeat _self, final Integer i) {
    final org.gemoc.arduino.sequential.xarduino.aspects.Repeat_EvaluableAspectRepeatAspectProperties _self_ = org.gemoc.arduino.sequential.xarduino.aspects.Repeat_EvaluableAspectRepeatAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void i(Integer)
    if (_self instanceof org.gemoc.arduino.sequential.xarduino.arduino.Repeat){
    	org.gemoc.arduino.sequential.xarduino.aspects.Repeat_EvaluableAspect._privk3_i(_self_, (org.gemoc.arduino.sequential.xarduino.arduino.Repeat)_self,i);
    };
  }

  private static Boolean super_evaluate(final Repeat _self) {
    final org.gemoc.arduino.sequential.xarduino.aspects.Control_EvaluableAspectControlAspectProperties _self_ = org.gemoc.arduino.sequential.xarduino.aspects.Control_EvaluableAspectControlAspectContext.getSelf(_self);
    return  org.gemoc.arduino.sequential.xarduino.aspects.Control_EvaluableAspect._privk3_evaluate(_self_, _self);
  }

  protected static Boolean _privk3_evaluate(final Repeat_EvaluableAspectRepeatAspectProperties _self_, final Repeat _self) {
    Boolean resCond = Boolean.valueOf(false);
    Integer _i = Repeat_EvaluableAspect.i(_self);
    int _iteration = _self.getIteration();
    boolean _lessThan = ((_i).intValue() < _iteration);
    resCond = Boolean.valueOf(_lessThan);
    Integer _i_1 = Repeat_EvaluableAspect.i(_self);
    int _plus = ((_i_1).intValue() + 1);
    Repeat_EvaluableAspect.i(_self, Integer.valueOf(_plus));
    return resCond;
  }

  private static void super_finalize(final Repeat _self) {
    final org.gemoc.arduino.sequential.xarduino.aspects.Instruction_ExecutableAspectInstructionAspectProperties _self_ = org.gemoc.arduino.sequential.xarduino.aspects.Instruction_ExecutableAspectInstructionAspectContext.getSelf(_self);
     org.gemoc.arduino.sequential.xarduino.aspects.Instruction_ExecutableAspect._privk3_finalize(_self_, _self);
  }

  protected static void _privk3_finalize(final Repeat_EvaluableAspectRepeatAspectProperties _self_, final Repeat _self) {
    Repeat_EvaluableAspect.i(_self, Integer.valueOf(0));
    return;
  }

  protected static Integer _privk3_i(final Repeat_EvaluableAspectRepeatAspectProperties _self_, final Repeat _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getI") &&
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
    return _self_.i;
  }

  protected static void _privk3_i(final Repeat_EvaluableAspectRepeatAspectProperties _self_, final Repeat _self, final Integer i) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setI")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, i);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.i = i;
    }
  }
}
