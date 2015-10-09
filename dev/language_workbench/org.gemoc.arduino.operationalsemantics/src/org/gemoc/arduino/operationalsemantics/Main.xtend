package org.gemoc.arduino.operationalsemantics

import fr.obeo.dsl.arduino.Project

import static extension org.gemoc.arduino.operationalsemantics.Project_ExecutableAspect.*

class Main {
	
	public static final Integer LOW = Integer.valueOf(0);
	public static final Integer HIGH = Integer.valueOf(1023);
	
	def static void main(Project project) {
		var start = System.nanoTime;
		project.execute();
		var stop = System.nanoTime;
		println("time to execute " + ( stop - start));
	}	
}
