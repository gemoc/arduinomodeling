package org.gemoc.arduino.concurrent.xarduino.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.gemoc.arduino.concurrent.xarduino.arduino.BooleanVariable;
import org.gemoc.arduino.concurrent.xarduino.arduino.IntegerVariable;
import org.gemoc.arduino.concurrent.xarduino.arduino.Pin;
import org.gemoc.arduino.concurrent.xarduino.arduino.Project;
import org.gemoc.arduino.concurrent.xarduino.arduino.PushButton;
import org.gemoc.arduino.concurrent.xarduino.aspects.BooleanVariable_EvaluableAspect;
import org.gemoc.arduino.concurrent.xarduino.aspects.IntegerVariable_EvaluableAspect;
import org.gemoc.arduino.concurrent.xarduino.aspects.Pin_EvaluableAspect;
import org.gemoc.arduino.concurrent.xarduino.aspects.Project_ExecutableAspectProjectAspectProperties;
import org.gemoc.arduino.concurrent.xarduino.aspects.PushButton_ToggleAspect;

@Aspect(className = Project.class)
@SuppressWarnings("all")
public class Project_ExecutableAspect {
  @InitializeModel
  public static void initializeModel(final Project _self, final EList<String> args) {
    final org.gemoc.arduino.concurrent.xarduino.aspects.Project_ExecutableAspectProjectAspectProperties _self_ = org.gemoc.arduino.concurrent.xarduino.aspects.Project_ExecutableAspectProjectAspectContext.getSelf(_self);
    _privk3_initializeModel(_self_, _self,args);;
  }
  
  protected static void _privk3_initializeModel(final Project_ExecutableAspectProjectAspectProperties _self_, final Project _self, final EList<String> args) {
    TreeIterator<EObject> _eAllContents = _self.eAllContents();
    final Procedure1<EObject> _function = (EObject o) -> {
      if ((o instanceof IntegerVariable)) {
        int _initialValue = ((IntegerVariable)o).getInitialValue();
        IntegerVariable_EvaluableAspect.value(((IntegerVariable)o), Integer.valueOf(_initialValue));
      } else {
        if ((o instanceof BooleanVariable)) {
          boolean _isInitialValue = ((BooleanVariable)o).isInitialValue();
          BooleanVariable_EvaluableAspect.value(((BooleanVariable)o), Boolean.valueOf(_isInitialValue));
        } else {
          if ((o instanceof Pin)) {
            Pin_EvaluableAspect.level(((Pin) o), Integer.valueOf(0));
          } else {
            if ((o instanceof PushButton)) {
              PushButton_ToggleAspect.isPushed(((PushButton) o), false);
            }
          }
        }
      }
    };
    IteratorExtensions.<EObject>forEach(_eAllContents, _function);
  }
}
