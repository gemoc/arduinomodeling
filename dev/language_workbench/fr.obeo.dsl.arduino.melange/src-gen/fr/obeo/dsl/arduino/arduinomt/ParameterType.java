package fr.obeo.dsl.arduino.arduinomt;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.eclipse.emf.common.util.Enumerator;

@SuppressWarnings("all")
public enum ParameterType implements Enumerator {
  DELAY,
  
  LEVEL,
  
  STATUS,
  
  CONSTANT,
  
  SENSOR;
  public final static int DELAY_VALUE = 0;
  
  public final static int LEVEL_VALUE = 0;
  
  public final static int STATUS_VALUE = 0;
  
  public final static int CONSTANT_VALUE = 0;
  
  public final static int SENSOR_VALUE = 0;
  
  private final static ParameterType[] VALUES_ARRAY = new ParameterType[] {
    	DELAY,
    	LEVEL,
    	STATUS,
    	CONSTANT,
    	SENSOR,
    };;
  
  private final static List<ParameterType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));;
  
  public static ParameterType get(final String literal) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
    	ParameterType result = VALUES_ARRAY[i];
    	if (result.toString().equals(literal)) {
    		return result;
    	}
    }
    return null;
  }
  
  public static ParameterType getByName(final String name) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
    	ParameterType result = VALUES_ARRAY[i];
    	if (result.getName().equals(name)) {
    		return result;
    	}
    }
    return null;
  }
  
  public static ParameterType get(final int value) {
    switch (value) {
    	/* true */
    	case DELAY_VALUE: return DELAY;
    }
    return null;
  }
  
  private final int value;
  
  private final String name;
  
  private final String literal;
  
  private ParameterType() {
    this.value = 0;
    this.name = "";
    this.literal = "";
  }
  
  private ParameterType(final int value, final String name, final String literal) {
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
