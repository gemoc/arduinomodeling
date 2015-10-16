package fr.obeo.dsl.arduino;

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
    	"fr.obeo.dsl.arduino.Arduino", "", "http://www.obeo.fr/arduino", "fr.obeo.dsl.arduino.ArduinoMT"
    ) ;
    arduino.addAdapter("fr.obeo.dsl.arduino.ArduinoMT", fr.obeo.dsl.arduino.arduino.adapters.arduinomt.ArduinoAdapter.class) ;
    MelangeRegistry.INSTANCE.getLanguageMap().put(
    	"fr.obeo.dsl.arduino.Arduino",
    	arduino
    ) ;
    MelangeRegistry.ModelTypeDescriptor arduinoMT = new MelangeRegistryImpl.ModelTypeDescriptorImpl(
    	"fr.obeo.dsl.arduino.ArduinoMT", "", "http://arduinomt/"
    ) ;
    MelangeRegistry.INSTANCE.getModelTypeMap().put(
    	"fr.obeo.dsl.arduino.ArduinoMT",
    	arduinoMT
    ) ;
  }
}
