package org.gemoc.arduino.concurrent.xarduino.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.gemoc.arduino.concurrent.xarduino.arduino.BinaryExpression;

@Aspect(className = BinaryExpression.class)
@SuppressWarnings("all")
public abstract class BinaryExpression_EvaluableAspect extends Expression_EvaluableAspect {
}
