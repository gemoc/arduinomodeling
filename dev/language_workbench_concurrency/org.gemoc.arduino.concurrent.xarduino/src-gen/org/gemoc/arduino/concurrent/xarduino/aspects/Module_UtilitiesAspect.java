package org.gemoc.arduino.concurrent.xarduino.aspects;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.gemoc.arduino.concurrent.xarduino.arduino.AnalogPin;
import org.gemoc.arduino.concurrent.xarduino.arduino.ArduinoAnalogModule;
import org.gemoc.arduino.concurrent.xarduino.arduino.ArduinoBoard;
import org.gemoc.arduino.concurrent.xarduino.arduino.ArduinoDigitalModule;
import org.gemoc.arduino.concurrent.xarduino.arduino.Board;
import org.gemoc.arduino.concurrent.xarduino.arduino.DigitalPin;
import org.gemoc.arduino.concurrent.xarduino.arduino.Pin;
import org.gemoc.arduino.concurrent.xarduino.arduino.Project;

@Aspect(className = org.gemoc.arduino.concurrent.xarduino.arduino.Module.class)
@SuppressWarnings("all")
public class Module_UtilitiesAspect {
  private static Project getProject(final org.gemoc.arduino.concurrent.xarduino.arduino.Module _self) {
    final org.gemoc.arduino.concurrent.xarduino.aspects.Module_UtilitiesAspectModuleAspectProperties _self_ = org.gemoc.arduino.concurrent.xarduino.aspects.Module_UtilitiesAspectModuleAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Project getProject()
    if (_self instanceof org.gemoc.arduino.concurrent.xarduino.arduino.Module){
    	result = org.gemoc.arduino.concurrent.xarduino.aspects.Module_UtilitiesAspect._privk3_getProject(_self_, (org.gemoc.arduino.concurrent.xarduino.arduino.Module)_self);
    };
    return (org.gemoc.arduino.concurrent.xarduino.arduino.Project)result;
  }

  protected static Pin getPin(final org.gemoc.arduino.concurrent.xarduino.arduino.Module _self) {
    final org.gemoc.arduino.concurrent.xarduino.aspects.Module_UtilitiesAspectModuleAspectProperties _self_ = org.gemoc.arduino.concurrent.xarduino.aspects.Module_UtilitiesAspectModuleAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Pin getPin()
    if (_self instanceof org.gemoc.arduino.concurrent.xarduino.arduino.Module){
    	result = org.gemoc.arduino.concurrent.xarduino.aspects.Module_UtilitiesAspect._privk3_getPin(_self_, (org.gemoc.arduino.concurrent.xarduino.arduino.Module)_self);
    };
    return (org.gemoc.arduino.concurrent.xarduino.arduino.Pin)result;
  }

  protected static Project _privk3_getProject(final Module_UtilitiesAspectModuleAspectProperties _self_, final org.gemoc.arduino.concurrent.xarduino.arduino.Module _self) {
    Project project = null;
    EObject current = _self.eContainer();
    while ((current != null)) {
      {
        if ((current instanceof Project)) {
          project = ((Project) current);
          return project;
        }
        current = current.eContainer();
      }
    }
    return project;
  }

  protected static Pin _privk3_getPin(final Module_UtilitiesAspectModuleAspectProperties _self_, final org.gemoc.arduino.concurrent.xarduino.arduino.Module _self) {
    Pin pin = null;
    final Project project = Module_UtilitiesAspect.getProject(_self);
    EList<Board> _boards = project.getBoards();
    for (final Board board : _boards) {
      if (((board != null) && (board instanceof ArduinoBoard))) {
        ArduinoBoard arduinoBoard = ((ArduinoBoard) board);
        EList<AnalogPin> _analogPins = arduinoBoard.getAnalogPins();
        for (final AnalogPin analogPin : _analogPins) {
          ArduinoAnalogModule _module = analogPin.getModule();
          boolean _equals = Objects.equal(_module, _self);
          if (_equals) {
            return analogPin;
          }
        }
        EList<DigitalPin> _digitalPins = arduinoBoard.getDigitalPins();
        for (final DigitalPin digitalPin : _digitalPins) {
          ArduinoDigitalModule _module_1 = digitalPin.getModule();
          boolean _equals_1 = Objects.equal(_module_1, _self);
          if (_equals_1) {
            return digitalPin;
          }
        }
      }
    }
    return pin;
  }
}
