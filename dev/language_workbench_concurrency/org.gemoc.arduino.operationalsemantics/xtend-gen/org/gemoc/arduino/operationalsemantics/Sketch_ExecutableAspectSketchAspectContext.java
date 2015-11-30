package org.gemoc.arduino.operationalsemantics;

import fr.obeo.dsl.arduino.Sketch;
import java.util.Map;
import org.gemoc.arduino.operationalsemantics.Sketch_ExecutableAspectSketchAspectProperties;

@SuppressWarnings("all")
public class Sketch_ExecutableAspectSketchAspectContext {
  public final static Sketch_ExecutableAspectSketchAspectContext INSTANCE = new Sketch_ExecutableAspectSketchAspectContext();
  
  public static Sketch_ExecutableAspectSketchAspectProperties getSelf(final Sketch _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.arduino.operationalsemantics.Sketch_ExecutableAspectSketchAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Sketch, Sketch_ExecutableAspectSketchAspectProperties> map = new java.util.WeakHashMap<fr.obeo.dsl.arduino.Sketch, org.gemoc.arduino.operationalsemantics.Sketch_ExecutableAspectSketchAspectProperties>();
  
  public Map<Sketch, Sketch_ExecutableAspectSketchAspectProperties> getMap() {
    return map;
  }
}
