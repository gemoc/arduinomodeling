package org.gemoc.arduino.concurrent;

import fr.inria.diverse.melange.resource.MelangeRegistry;
import fr.inria.diverse.melange.resource.MelangeRegistryImpl;
import fr.inria.diverse.melange.resource.MelangeResourceFactoryImpl;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

@SuppressWarnings("all")
public class StandaloneSetup {
  public static void doSetup() {
    StandaloneSetup setup = new StandaloneSetup() ;
    setup.doEMFRegistration() ;
    setup.doAdaptersRegistration() ;
  }
  
  public void doEMFRegistration() {
    EPackage.Registry.INSTANCE.put(
    	org.gemoc.arduino.concurrent.execarduino.arduino.ArduinoPackage.eNS_URI,
    	org.gemoc.arduino.concurrent.execarduino.arduino.ArduinoPackage.eINSTANCE
    ) ;
    
    Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
    	"*",
    	new XMIResourceFactoryImpl()
    ) ;
    Resource.Factory.Registry.INSTANCE.getProtocolToFactoryMap().put(
    	"melange",
    	new MelangeResourceFactoryImpl()
    ) ;
  }
  
  public void doAdaptersRegistration() {
    MelangeRegistry.LanguageDescriptor arduinoConcurrent = new MelangeRegistryImpl.LanguageDescriptorImpl(
    	"org.gemoc.arduino.concurrent.ArduinoConcurrent", "", "http://execarduino/", "org.gemoc.arduino.concurrent.ArduinoConcurrentMT"
    ) ;
    arduinoConcurrent.addAdapter("org.gemoc.arduino.concurrent.ArduinoConcurrentMT", org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.ArduinoConcurrentAdapter.class) ;
    MelangeRegistry.INSTANCE.getLanguageMap().put(
    	"org.gemoc.arduino.concurrent.ArduinoConcurrent",
    	arduinoConcurrent
    ) ;
    MelangeRegistry.ModelTypeDescriptor arduinoConcurrentMT = new MelangeRegistryImpl.ModelTypeDescriptorImpl(
    	"org.gemoc.arduino.concurrent.ArduinoConcurrentMT", "", "http://arduinoconcurrentmt/"
    ) ;
    MelangeRegistry.INSTANCE.getModelTypeMap().put(
    	"org.gemoc.arduino.concurrent.ArduinoConcurrentMT",
    	arduinoConcurrentMT
    ) ;
  }
}
