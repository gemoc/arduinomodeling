/* $Id: KermetaExampleWizard.java,v 1.2 2008-10-30 16:45:57 dvojtise Exp $
 * Project    : fr.irisa.triskell.kermeta
 * File       : KermetaExampleWizard.java
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Authors : 
 *        	dvojtise <dvojtise@irisa.fr>
 */
package org.gemoc.arduinomodeling.sampledeployer.wizards;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.gemoc.arduinomodeling.sampledeployer.Activator;

import fr.inria.diverse.commons.eclipse.jface.wizards.AbstractExampleWizard;

public class ArduinoModelingSequentialLanguageExampleWizard
	extends AbstractExampleWizard {
	
	protected Collection<ProjectDescriptor> getProjectDescriptors() {		
		// We need the statements example to be unzipped along with the
		// EMF library example model, edit and editor examples
		List<ProjectDescriptor> projects = new ArrayList<ProjectDescriptor>(1);
		
		// sequential projects
		projects.add(new ProjectDescriptor(Activator.PLUGIN_ID, "zips/org.gemoc.arduino.sequential", 						"org.gemoc.arduino.sequential"));
		projects.add(new ProjectDescriptor(Activator.PLUGIN_ID, "zips/org.gemoc.arduino.sequential.design.zip", 			"org.gemoc.arduino.sequential.design"));
		projects.add(new ProjectDescriptor(Activator.PLUGIN_ID, "zips/org.gemoc.arduino.sequential.execarduino.zip", 		"org.gemoc.arduino.sequential.execarduino"));
		projects.add(new ProjectDescriptor(Activator.PLUGIN_ID, "zips/org.gemoc.arduino.sequential.execarduino.trace.zip", 	"org.gemoc.arduino.sequential.execarduino.trace"));
		projects.add(new ProjectDescriptor(Activator.PLUGIN_ID, "zips/org.gemoc.arduino.sequential.model.zip", 				"org.gemoc.arduino.sequential.model"));
		projects.add(new ProjectDescriptor(Activator.PLUGIN_ID, "zips/org.gemoc.arduino.sequential.model.edit.zip", 		"org.gemoc.arduino.sequential.model.edit"));
		projects.add(new ProjectDescriptor(Activator.PLUGIN_ID, "zips/org.gemoc.arduino.sequential.operationalsemantics.zip", "org.gemoc.arduino.sequential.operationalsemantics"));

		return projects;
	}

	@Override
	protected AbstractUIPlugin getContainerPlugin() {
		
		return Activator.getDefault();
	}

	@Override
	public void error(String message, Throwable e) {
		Activator.getDefault().error(message, e);
	}

	@Override
	public ActionIfProjectExist getActionIfProjectExist(IProject project) {		
		return ActionIfProjectExist.ASKUSER;
	}
}