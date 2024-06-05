package org.gemoc.arduino.sequential.xarduino.aspects;

import java.util.Map;
import org.gemoc.arduino.sequential.xarduino.arduino.Block;

@SuppressWarnings("all")
public class Block_ExecutableAspectBlockAspectContext {
  public static final Block_ExecutableAspectBlockAspectContext INSTANCE = new Block_ExecutableAspectBlockAspectContext();

  public static Block_ExecutableAspectBlockAspectProperties getSelf(final Block _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.arduino.sequential.xarduino.aspects.Block_ExecutableAspectBlockAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<Block, Block_ExecutableAspectBlockAspectProperties> map = new java.util.WeakHashMap<org.gemoc.arduino.sequential.xarduino.arduino.Block, org.gemoc.arduino.sequential.xarduino.aspects.Block_ExecutableAspectBlockAspectProperties>();

  public Map<Block, Block_ExecutableAspectBlockAspectProperties> getMap() {
    return map;
  }
}
