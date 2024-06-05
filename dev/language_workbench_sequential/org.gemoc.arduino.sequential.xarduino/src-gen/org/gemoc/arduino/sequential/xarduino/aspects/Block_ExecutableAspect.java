package org.gemoc.arduino.sequential.xarduino.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.eclipse.emf.common.util.EList;
import org.gemoc.arduino.sequential.xarduino.arduino.Block;
import org.gemoc.arduino.sequential.xarduino.arduino.Instruction;

@Aspect(className = Block.class)
@SuppressWarnings("all")
public class Block_ExecutableAspect {
  public static void execute(final Block _self) {
	final org.gemoc.arduino.sequential.xarduino.aspects.Block_ExecutableAspectBlockAspectProperties _self_ = org.gemoc.arduino.sequential.xarduino.aspects.Block_ExecutableAspectBlockAspectContext
			.getSelf(_self);
	_privk3_execute(_self_, _self);
	;
}

  protected static void _privk3_execute(final Block_ExecutableAspectBlockAspectProperties _self_, final Block _self) {
    EList<Instruction> _instructions = _self.getInstructions();
    for (final Instruction i : _instructions) {
      Instruction_ExecutableAspect.execute(i);
    }
  }
}
