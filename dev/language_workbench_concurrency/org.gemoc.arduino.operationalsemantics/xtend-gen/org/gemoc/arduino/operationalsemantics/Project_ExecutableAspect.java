package org.gemoc.arduino.operationalsemantics;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.obeo.dsl.arduino.Project;
import fr.obeo.dsl.arduino.Sketch;
import org.gemoc.arduino.operationalsemantics.Project_ExecutableAspectProjectAspectProperties;
import org.gemoc.arduino.operationalsemantics.Project_SetupAspect;
import org.gemoc.arduino.operationalsemantics.Sketch_ExecutableAspect;

@Aspect(className = Project.class)
@SuppressWarnings("all")
public class Project_ExecutableAspect {
  public static void execute(final Project _self) {
    org.gemoc.arduino.operationalsemantics.Project_ExecutableAspectProjectAspectProperties _self_ = org.gemoc.arduino.operationalsemantics.Project_ExecutableAspectProjectAspectContext.getSelf(_self);
    _privk3_execute(_self_, _self);
  }
  
  protected static void _privk3_execute(final Project_ExecutableAspectProjectAspectProperties _self_, final Project _self) {
    Project_SetupAspect.setup(_self);
    final Sketch sketch = _self.getSketch();
    while (true) {
      Sketch_ExecutableAspect.execute(sketch);
    }
  }
}
