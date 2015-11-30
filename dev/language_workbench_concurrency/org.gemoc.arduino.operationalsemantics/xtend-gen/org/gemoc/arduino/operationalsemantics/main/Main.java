package org.gemoc.arduino.operationalsemantics.main;

import fr.obeo.dsl.arduino.Project;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.gemoc.arduino.operationalsemantics.Project_ExecutableAspect;

@SuppressWarnings("all")
public class Main {
  public static void main(final Project project) {
    long start = System.nanoTime();
    Project_ExecutableAspect.execute(project);
    long stop = System.nanoTime();
    InputOutput.<String>println(("time to execute " + Long.valueOf((stop - start))));
  }
}
