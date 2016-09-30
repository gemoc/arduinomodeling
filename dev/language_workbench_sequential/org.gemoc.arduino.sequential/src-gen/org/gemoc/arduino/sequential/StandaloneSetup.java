package org.gemoc.arduino.sequential;

import fr.inria.diverse.melange.resource.MelangeRegistry;
import fr.inria.diverse.melange.resource.MelangeRegistryImpl;
import fr.inria.diverse.melange.resource.MelangeResourceFactoryImpl;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

@SuppressWarnings("all")
public class StandaloneSetup {
  public static void doSetup() {
    StandaloneSetup setup = new StandaloneSetup();
    setup.doEMFRegistration();
    setup.doAdaptersRegistration();
  }
  
  public void doEMFRegistration() {
    EPackage.Registry.INSTANCE.put(
    	org.gemoc.arduino.sequential.xarduino.arduino.ArduinoPackage.eNS_URI,
    	org.gemoc.arduino.sequential.xarduino.arduino.ArduinoPackage.eINSTANCE
    );
    
    Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
    	"*",
    	new XMIResourceFactoryImpl()
    );
    Resource.Factory.Registry.INSTANCE.getProtocolToFactoryMap().put(
    	"melange",
    	new MelangeResourceFactoryImpl()
    );
  }
  
  public void doAdaptersRegistration() {
    MelangeRegistry.LanguageDescriptor xArduino = new MelangeRegistryImpl.LanguageDescriptorImpl(
    	"org.gemoc.arduino.sequential.XArduino", "", "http://org.gemoc.arduino.sequential.xarduino/arduino/", "org.gemoc.arduino.sequential.XArduinoMT"
    );
    xArduino.addAdapter("org.gemoc.arduino.sequential.XArduinoMT", org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.XArduinoAdapter.class);
    MelangeRegistry.INSTANCE.getLanguageMap().put(
    	"org.gemoc.arduino.sequential.XArduino",
    	xArduino
    );
    MelangeRegistry.ModelTypeDescriptor xArduinoMT = new MelangeRegistryImpl.ModelTypeDescriptorImpl(
    	"org.gemoc.arduino.sequential.XArduinoMT", "", "http://org.gemoc.arduino.sequential.xarduinomt/"
    );
    MelangeRegistry.INSTANCE.getModelTypeMap().put(
    	"org.gemoc.arduino.sequential.XArduinoMT",
    	xArduinoMT
    );
  }
}
