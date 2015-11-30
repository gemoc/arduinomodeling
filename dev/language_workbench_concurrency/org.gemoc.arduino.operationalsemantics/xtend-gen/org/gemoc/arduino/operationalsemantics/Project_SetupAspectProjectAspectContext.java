package org.gemoc.arduino.operationalsemantics;

import fr.obeo.dsl.arduino.Project;
import java.util.Map;
import org.gemoc.arduino.operationalsemantics.Project_SetupAspectProjectAspectProperties;

@SuppressWarnings("all")
public class Project_SetupAspectProjectAspectContext {
  public final static Project_SetupAspectProjectAspectContext INSTANCE = new Project_SetupAspectProjectAspectContext();
  
  public static Project_SetupAspectProjectAspectProperties getSelf(final Project _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.arduino.operationalsemantics.Project_SetupAspectProjectAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Project, Project_SetupAspectProjectAspectProperties> map = new java.util.WeakHashMap<fr.obeo.dsl.arduino.Project, org.gemoc.arduino.operationalsemantics.Project_SetupAspectProjectAspectProperties>();
  
  public Map<Project, Project_SetupAspectProjectAspectProperties> getMap() {
    return map;
  }
}
