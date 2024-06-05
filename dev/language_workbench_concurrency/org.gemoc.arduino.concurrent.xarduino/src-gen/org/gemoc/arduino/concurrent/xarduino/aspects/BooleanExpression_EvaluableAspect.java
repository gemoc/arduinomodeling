package org.gemoc.arduino.concurrent.xarduino.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.gemoc.arduino.concurrent.xarduino.arduino.BooleanExpression;

@Aspect(className = BooleanExpression.class)
@SuppressWarnings("all")
public abstract class BooleanExpression_EvaluableAspect extends Expression_EvaluableAspect {
}
