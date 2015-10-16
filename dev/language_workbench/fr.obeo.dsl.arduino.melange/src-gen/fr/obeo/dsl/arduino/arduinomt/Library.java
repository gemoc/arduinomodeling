package fr.obeo.dsl.arduino.arduinomt;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.eclipse.emf.common.util.Enumerator;

@SuppressWarnings("all")
public enum Library implements Enumerator {
  NONE,
  
  SERVO,
  
  MUSIC;
  public final static int NONE_VALUE = 0;
  
  public final static int SERVO_VALUE = 0;
  
  public final static int MUSIC_VALUE = 0;
  
  private final static Library[] VALUES_ARRAY = new Library[] {
    	NONE,
    	SERVO,
    	MUSIC,
    };;
  
  private final static List<Library> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));;
  
  public static Library get(final String literal) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
    	Library result = VALUES_ARRAY[i];
    	if (result.toString().equals(literal)) {
    		return result;
    	}
    }
    return null;
  }
  
  public static Library getByName(final String name) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
    	Library result = VALUES_ARRAY[i];
    	if (result.getName().equals(name)) {
    		return result;
    	}
    }
    return null;
  }
  
  public static Library get(final int value) {
    switch (value) {
    	/* true */
    	case NONE_VALUE: return NONE;
    }
    return null;
  }
  
  private final int value;
  
  private final String name;
  
  private final String literal;
  
  private Library() {
    this.value = 0;
    this.name = "";
    this.literal = "";
  }
  
  private Library(final int value, final String name, final String literal) {
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
