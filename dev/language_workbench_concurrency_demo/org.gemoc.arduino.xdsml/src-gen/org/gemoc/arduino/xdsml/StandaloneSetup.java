package org.gemoc.arduino.xdsml;

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
    	fr.obeo.dsl.arduino.ArduinoPackage.eNS_URI,
    	fr.obeo.dsl.arduino.ArduinoPackage.eINSTANCE
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
    MelangeRegistry.LanguageDescriptor arduino = new MelangeRegistryImpl.LanguageDescriptorImpl(
    	"org.gemoc.arduino.xdsml.Arduino", "", "http://www.obeo.fr/arduino", "org.gemoc.arduino.xdsml.ArduinoMT"
    ) ;
    arduino.addAdapter("org.gemoc.arduino.xdsml.ArduinoMT", org.gemoc.arduino.xdsml.arduino.adapters.arduinomt.ArduinoAdapter.class) ;
    MelangeRegistry.INSTANCE.getLanguageMap().put(
    	"org.gemoc.arduino.xdsml.Arduino",
    	arduino
    ) ;
    MelangeRegistry.ModelTypeDescriptor arduinoMT = new MelangeRegistryImpl.ModelTypeDescriptorImpl(
    	"org.gemoc.arduino.xdsml.ArduinoMT", "", "http://arduinomt/"
    ) ;
    MelangeRegistry.INSTANCE.getModelTypeMap().put(
    	"org.gemoc.arduino.xdsml.ArduinoMT",
    	arduinoMT
    ) ;
  }
}
