package org.gemoc.arduino.design.services;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.gemoc.arduino.operationalsemantics.Pin_EvaluableAspect;
import org.gemoc.execution.concurrent.ccsljavaengine.ui.launcher.Launcher;
import org.gemoc.executionframework.extensions.sirius.services.AbstractGemocDebuggerServices;
import org.osgi.framework.Bundle;

import fr.obeo.dsl.arduino.ArduinoUtils;
import fr.obeo.dsl.arduino.Connector;
import fr.obeo.dsl.arduino.Module;
import fr.obeo.dsl.arduino.Pin;
import fr.obeo.dsl.arduino.Platform;
import fr.obeo.dsl.arduino.Project;
import fr.obeo.dsl.arduino.design.services.ArduinoServices;

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
		return Pin_EvaluableAspect.level(pin);
	}

	public Integer getLevel(Connector connector) {
		return getLevel(connector.getPin());
	}

	public Integer getLevel(Module module) {
		final Project project = getUserRootProject(module);
		
		return getLevel(ArduinoUtils.getPin(project,module));
	}

	protected Project getUserRootProject(EObject obj){
		// not very nice, we suppose that the first loaded resource will contain the root project
		for (Resource res : obj.eResource().getResourceSet().getResources()){
			if(res.getContents().size() > 0 &&  res.getContents().get(0) instanceof Project){
				return (Project)res.getContents().get(0);
			}
		}
		return null;
	}
	
	public Integer getLevel(Platform platform) {
		return 0;
	}
	
	public String getSimulatingImage(Module module) {
		int level = getLevel(module);
		String imageName = getImageLevel(module, level);
		Bundle bundle = org.eclipse.core.runtime.Platform
				.getBundle("org.gemoc.arduino.design");
		URL fileURL = bundle.getEntry("/images/" + imageName);
		if (fileURL == null) {
			ArduinoServices service = new ArduinoServices();
			return service.getImage(module);
		}
		return "/org.gemoc.arduino.design/images/" + imageName;
	}

	private String getImageLevel(Module module, int level) {
		String imageName = module.getImage().substring(0,
				module.getImage().indexOf(".jpg"))
				+ "_" + level + ".jpg";
		return imageName;
	}
	
	public String getModelIdentifier() {
		return Launcher.MODEL_ID;
	}
}
