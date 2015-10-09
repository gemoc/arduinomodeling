package org.gemoc.arduino.design.services;

import java.util.ArrayList;
import java.util.List;

import org.gemoc.arduino.operationalsemantics.Pin_EvaluableAspect;
import org.gemoc.gemoc_language_workbench.extensions.sirius.services.AbstractGemocDebuggerServices;

import fr.obeo.dsl.arduino.ArduinoUtils;
import fr.obeo.dsl.arduino.Connector;
import fr.obeo.dsl.arduino.Module;
import fr.obeo.dsl.arduino.Pin;
import fr.obeo.dsl.arduino.Platform;
import fr.obeo.dsl.arduino.Project;

public class ArduinoDebuggerServices extends AbstractGemocDebuggerServices{

	@Override
	protected List<StringCouple> getRepresentationRefreshList() {
		final List<StringCouple> res = new ArrayList<StringCouple>();

		res.add(new StringCouple("Hardware", "Simulator"));
		res.add(new StringCouple("Sketch", "Simulator"));
		res.add(new StringCouple("Function", "Simulator"));

		return res;
	}

	public Integer getLevel(Pin pin) {
		return Pin_EvaluableAspect.getLevel(pin);
	}

	public Integer getLevel(Connector connector) {
		return getLevel(connector.getPin());
	}

	public Integer getLevel(Module module) {
		final Project project = (Project) (module.eContainer());
		return getLevel(ArduinoUtils.getPin(project,module));
	}

	public Integer getLevel(Platform platform) {
		return 0;
	}
}
