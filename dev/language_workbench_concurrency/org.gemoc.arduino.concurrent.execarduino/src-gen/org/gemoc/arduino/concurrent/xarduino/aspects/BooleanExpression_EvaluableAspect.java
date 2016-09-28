package org.gemoc.arduino.concurrent.xarduino.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.gemoc.arduino.concurrent.xarduino.arduino.BooleanExpression;
import org.gemoc.arduino.concurrent.xarduino.aspects.Expression_EvaluableAspect;

@Aspect(className = BooleanExpression.class)
@SuppressWarnings("all")
public abstract class BooleanExpression_EvaluableAspect extends Expression_EvaluableAspect {
}
