package org.gemoc.arduino.sequential.xarduino.aspects;

import java.util.Map;
import org.gemoc.arduino.sequential.xarduino.arduino.Project;

@SuppressWarnings("all")
public class Project_ExecutableAspectProjectAspectContext {
  public static final Project_ExecutableAspectProjectAspectContext INSTANCE = new Project_ExecutableAspectProjectAspectContext();

  public static Project_ExecutableAspectProjectAspectProperties getSelf(final Project _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.arduino.sequential.xarduino.aspects.Project_ExecutableAspectProjectAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<Project, Project_ExecutableAspectProjectAspectProperties> map = new java.util.WeakHashMap<org.gemoc.arduino.sequential.xarduino.arduino.Project, org.gemoc.arduino.sequential.xarduino.aspects.Project_ExecutableAspectProjectAspectProperties>();

  public Map<Project, Project_ExecutableAspectProjectAspectProperties> getMap() {
    return map;
  }
}
