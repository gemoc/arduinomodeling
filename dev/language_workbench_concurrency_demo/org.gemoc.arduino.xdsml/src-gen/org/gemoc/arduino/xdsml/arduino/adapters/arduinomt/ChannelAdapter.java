package org.gemoc.arduino.xdsml.arduino.adapters.arduinomt;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.obeo.dsl.arduino.Channel;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.arduino.xdsml.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory;

@SuppressWarnings("all")
public class ChannelAdapter extends EObjectAdapter<Channel> implements org.gemoc.arduino.xdsml.arduinomt.arduino.Channel {
  private ArduinoMTAdaptersFactory adaptersFactory;
  
  public ChannelAdapter() {
    super(org.gemoc.arduino.xdsml.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory.getInstance()) ;
    adaptersFactory = org.gemoc.arduino.xdsml.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory.getInstance() ;
  }
  
  @Override
  public String getName() {
    return adaptee.getName() ;
  }
  
  @Override
  public void setName(final String o) {
    adaptee.setName(o) ;
  }
  
  @Override
  public int getInRate() {
    return adaptee.getInRate() ;
  }
  
  @Override
  public void setInRate(final int o) {
    adaptee.setInRate(o) ;
  }
  
  @Override
  public int getOutRate() {
    return adaptee.getOutRate() ;
  }
  
  @Override
  public void setOutRate(final int o) {
    adaptee.setOutRate(o) ;
  }
  
  @Override
  public int getCapacity() {
    return adaptee.getCapacity() ;
  }
  
  @Override
  public void setCapacity(final int o) {
    adaptee.setCapacity(o) ;
  }
  
  @Override
  public int getCurrentSize() {
    return adaptee.getCurrentSize() ;
  }
  
  @Override
  public void setCurrentSize(final int o) {
    adaptee.setCurrentSize(o) ;
  }
  
  private org.gemoc.arduino.xdsml.arduinomt.arduino.Thread source;
  
  @Override
  public org.gemoc.arduino.xdsml.arduinomt.arduino.Thread getSource() {
    return (org.gemoc.arduino.xdsml.arduinomt.arduino.Thread) adaptersFactory.createAdapter(adaptee.getSource(), eResource) ;
  }
  
  @Override
  public void setSource(final org.gemoc.arduino.xdsml.arduinomt.arduino.Thread o) {
    if (o != null)
    	adaptee.setSource(((org.gemoc.arduino.xdsml.arduino.adapters.arduinomt.ThreadAdapter) o).getAdaptee()) ;
    else adaptee.setSource(null) ;
  }
  
  private org.gemoc.arduino.xdsml.arduinomt.arduino.Thread target;
  
  @Override
  public org.gemoc.arduino.xdsml.arduinomt.arduino.Thread getTarget() {
    return (org.gemoc.arduino.xdsml.arduinomt.arduino.Thread) adaptersFactory.createAdapter(adaptee.getTarget(), eResource) ;
  }
  
  @Override
  public void setTarget(final org.gemoc.arduino.xdsml.arduinomt.arduino.Thread o) {
    if (o != null)
    	adaptee.setTarget(((org.gemoc.arduino.xdsml.arduino.adapters.arduinomt.ThreadAdapter) o).getAdaptee()) ;
    else adaptee.setTarget(null) ;
  }
  
  @Override
  public void read() {
    org.gemoc.arduino.operationalsemantics.Channel_ExecutableAspect.read(adaptee) ;
  }
  
  @Override
  public void write() {
    org.gemoc.arduino.operationalsemantics.Channel_ExecutableAspect.write(adaptee) ;
  }
  
  @Override
  public EClass eClass() {
    return org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.eINSTANCE.getChannel();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.CHANNEL__NAME:
    		return getName();
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.CHANNEL__SOURCE:
    		return getSource();
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.CHANNEL__TARGET:
    		return getTarget();
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.CHANNEL__IN_RATE:
    		return getInRate();
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.CHANNEL__OUT_RATE:
    		return getOutRate();
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.CHANNEL__CAPACITY:
    		return getCapacity();
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.CHANNEL__CURRENT_SIZE:
    		return getCurrentSize();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.CHANNEL__NAME:
    		setName((String) newValue);
    		return;
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.CHANNEL__SOURCE:
    		setSource((org.gemoc.arduino.xdsml.arduinomt.arduino.Thread) newValue);
    		return;
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.CHANNEL__TARGET:
    		setTarget((org.gemoc.arduino.xdsml.arduinomt.arduino.Thread) newValue);
    		return;
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.CHANNEL__IN_RATE:
    		setInRate((int) newValue);
    		return;
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.CHANNEL__OUT_RATE:
    		setOutRate((int) newValue);
    		return;
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.CHANNEL__CAPACITY:
    		setCapacity((int) newValue);
    		return;
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.CHANNEL__CURRENT_SIZE:
    		setCurrentSize((int) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
  
  @Override
  public void eUnset(final int featureID) {
    switch (featureID) {
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.CHANNEL__NAME:
    		setName((String) null);
    		return;
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.CHANNEL__SOURCE:
    		setSource((org.gemoc.arduino.xdsml.arduinomt.arduino.Thread) null);
    		return;
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.CHANNEL__TARGET:
    		setTarget((org.gemoc.arduino.xdsml.arduinomt.arduino.Thread) null);
    		return;
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.CHANNEL__IN_RATE:
    		setInRate((Integer) null);
    		return;
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.CHANNEL__OUT_RATE:
    		setOutRate((Integer) null);
    		return;
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.CHANNEL__CAPACITY:
    		setCapacity((Integer) null);
    		return;
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.CHANNEL__CURRENT_SIZE:
    		setCurrentSize((Integer) null);
    		return;
    }
    
    super.eUnset(featureID);
  }
}
