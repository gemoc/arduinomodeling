package fr.obeo.dsl.arduino.arduinomt;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.eclipse.emf.common.util.Enumerator;

@SuppressWarnings("all")
public enum ModuleKind implements Enumerator {
  DIGITAL,
  
  ANALOG;
  public final static int DIGITAL_VALUE = 0;
  
  public final static int ANALOG_VALUE = 0;
  
  private final static ModuleKind[] VALUES_ARRAY = new ModuleKind[] {
    	DIGITAL,
    	ANALOG,
    };;
  
  private final static List<ModuleKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));;
  
  public static ModuleKind get(final String literal) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
    	ModuleKind result = VALUES_ARRAY[i];
    	if (result.toString().equals(literal)) {
    		return result;
    	}
    }
    return null;
  }
  
  public static ModuleKind getByName(final String name) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
    	ModuleKind result = VALUES_ARRAY[i];
    	if (result.getName().equals(name)) {
    		return result;
    	}
    }
    return null;
  }
  
  public static ModuleKind get(final int value) {
    switch (value) {
    	/* true */
    	case DIGITAL_VALUE: return DIGITAL;
    }
    return null;
  }
  
  private final int value;
  
  private final String name;
  
  private final String literal;
  
  private ModuleKind() {
    this.value = 0;
    this.name = "";
    this.literal = "";
  }
  
  private ModuleKind(final int value, final String name, final String literal) {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }
  
  public String getName() {
    return name;
  }
  
  public int getValue() {
    return value;
  }
  
  public String getLiteral() {
    return literal;
  }
  
  public String toString() {
    return literal;
  }
}
