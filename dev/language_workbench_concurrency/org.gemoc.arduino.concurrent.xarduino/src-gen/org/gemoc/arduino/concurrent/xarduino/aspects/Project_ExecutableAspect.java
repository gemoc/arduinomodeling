package org.gemoc.arduino.concurrent.xarduino.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.gemoc.arduino.concurrent.xarduino.arduino.BooleanVariable;
import org.gemoc.arduino.concurrent.xarduino.arduino.IntegerVariable;
import org.gemoc.arduino.concurrent.xarduino.arduino.Pin;
import org.gemoc.arduino.concurrent.xarduino.arduino.Project;
import org.gemoc.arduino.concurrent.xarduino.arduino.PushButton;

@Aspect(className = Project.class)
@SuppressWarnings("all")
public class Project_ExecutableAspect {
  @InitializeModel
  public static void initializeModel(final Project _self, final EList<String> args) {
    final org.gemoc.arduino.concurrent.xarduino.aspects.Project_ExecutableAspectProjectAspectProperties _self_ = org.gemoc.arduino.concurrent.xarduino.aspects.Project_ExecutableAspectProjectAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void initializeModel(EList<String>)
    if (_self instanceof org.gemoc.arduino.concurrent.xarduino.arduino.Project){
    	org.gemoc.arduino.concurrent.xarduino.aspects.Project_ExecutableAspect._privk3_initializeModel(_self_, (org.gemoc.arduino.concurrent.xarduino.arduino.Project)_self,args);
    };
  }

  protected static void _privk3_initializeModel(final Project_ExecutableAspectProjectAspectProperties _self_, final Project _self, final EList<String> args) {
    final Procedure1<EObject> _function = (EObject o) -> {
      if ((o instanceof IntegerVariable)) {
        IntegerVariable_EvaluableAspect.value(((IntegerVariable)o), Integer.valueOf(((IntegerVariable)o).getInitialValue()));
      } else {
        if ((o instanceof BooleanVariable)) {
          BooleanVariable_EvaluableAspect.value(((BooleanVariable)o), Boolean.valueOf(((BooleanVariable)o).isInitialValue()));
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
    IteratorExtensions.<EObject>forEach(_self.eAllContents(), _function);
  }
}
