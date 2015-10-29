package org.gemoc.arduino.operationalsemantics.trace.tracemanager;

import fr.inria.diverse.trace.api.ITraceManager;
import fr.inria.diverse.trace.gemoc.traceaddon.AbstractTraceAddon;

import org.eclipse.emf.ecore.resource.Resource;

public class ArduinoTraceEngineAddon extends AbstractTraceAddon {

	@Override
	public ITraceManager constructTraceManager(Resource exeModel,
			Resource traceResource) {
		return new ArduinoTraceManager(exeModel, traceResource);
	}

}