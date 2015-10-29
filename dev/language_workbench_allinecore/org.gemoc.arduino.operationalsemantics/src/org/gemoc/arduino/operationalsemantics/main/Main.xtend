package org.gemoc.arduino.operationalsemantics.main

import fr.obeo.dsl.arduino.Project

import static extension org.gemoc.arduino.operationalsemantics.Project_ExecutableAspect.*

class Main {
	def static void main(Project project) {
		var start = System.nanoTime;
		project.execute();
		var stop = System.nanoTime;
		println("time to execute " + ( stop - start));
	}	
}
