package org.gemoc.arduino.operationalsemantics;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.obeo.dsl.arduino.BooleanVariable;
import fr.obeo.dsl.arduino.Connector;
import fr.obeo.dsl.arduino.IntegerVariable;
import fr.obeo.dsl.arduino.Pin;
import fr.obeo.dsl.arduino.Project;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.gemoc.arduino.operationalsemantics.BooleanVariable_EvaluableAspect;
import org.gemoc.arduino.operationalsemantics.IntegerVariable_EvaluableAspect;
import org.gemoc.arduino.operationalsemantics.Pin_EvaluableAspect;
import org.gemoc.arduino.operationalsemantics.Project_SetupAspectProjectAspectProperties;

@Aspect(className = Project.class)
@SuppressWarnings("all")
public class Project_SetupAspect {
  public static void setup(final Project _self) {
    org.gemoc.arduino.operationalsemantics.Project_SetupAspectProjectAspectProperties _self_ = org.gemoc.arduino.operationalsemantics.Project_SetupAspectProjectAspectContext.getSelf(_self);
    _privk3_setup(_self_, _self);
  }
  
  protected static void _privk3_setup(final Project_SetupAspectProjectAspectProperties _self_, final Project _self) {
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
            Integer _valueOf = Integer.valueOf(0);
            Pin_EvaluableAspect.level(((Pin) o), _valueOf);
          } else {
            if ((o instanceof Connector)) {
              Pin _pin = ((Connector) o).getPin();
              Integer _valueOf_1 = Integer.valueOf(0);
              Pin_EvaluableAspect.level(_pin, _valueOf_1);
            }
          }
        }
      }
    };
    IteratorExtensions.<EObject>forEach(_eAllContents, _function);
  }
}
