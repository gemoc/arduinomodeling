package org.gemoc.arduino.concurrent.xarduino.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.gemoc.arduino.concurrent.xarduino.arduino.IntegerExpression;
import org.gemoc.arduino.concurrent.xarduino.aspects.Expression_EvaluableAspect;

@Aspect(className = IntegerExpression.class)
@SuppressWarnings("all")
public abstract class IntegerExpression_EvaluableAspect extends Expression_EvaluableAspect {
}
