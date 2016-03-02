package org.gemoc.arduino.xdsml.arduino.adapters.arduinomt;

import fr.inria.diverse.melange.adapters.EListAdapter;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.obeo.dsl.arduino.Link;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.arduino.xdsml.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory;
import org.gemoc.arduino.xdsml.arduinomt.arduino.Board;
import org.gemoc.arduino.xdsml.arduinomt.arduino.Channel;

@SuppressWarnings("all")
public class LinkAdapter extends EObjectAdapter<Link> implements org.gemoc.arduino.xdsml.arduinomt.arduino.Link {
  private ArduinoMTAdaptersFactory adaptersFactory;
  
  public LinkAdapter() {
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
  
  private Board inBoard;
  
  @Override
  public Board getInBoard() {
    return (Board) adaptersFactory.createAdapter(adaptee.getInBoard(), eResource) ;
  }
  
  @Override
  public void setInBoard(final Board o) {
    if (o != null)
    	adaptee.setInBoard(((org.gemoc.arduino.xdsml.arduino.adapters.arduinomt.BoardAdapter) o).getAdaptee()) ;
    else adaptee.setInBoard(null) ;
  }
  
  private Board outBoard;
  
  @Override
  public Board getOutBoard() {
    return (Board) adaptersFactory.createAdapter(adaptee.getOutBoard(), eResource) ;
  }
  
  @Override
  public void setOutBoard(final Board o) {
    if (o != null)
    	adaptee.setOutBoard(((org.gemoc.arduino.xdsml.arduino.adapters.arduinomt.BoardAdapter) o).getAdaptee()) ;
    else adaptee.setOutBoard(null) ;
  }
  
  private EList<Channel> channels;
  
  @Override
  public EList<Channel> getChannels() {
    if (channels == null)
    	channels = EListAdapter.newInstance(adaptee.getChannels(), adaptersFactory) ;
    return channels;
  }
  
  @Override
  public EClass eClass() {
    return org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.eINSTANCE.getLink();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.LINK__NAME:
    		return getName();
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.LINK__IN_BOARD:
    		return getInBoard();
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.LINK__OUT_BOARD:
    		return getOutBoard();
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.LINK__CHANNELS:
    		return getChannels();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.LINK__NAME:
    		setName((String) newValue);
    		return;
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.LINK__IN_BOARD:
    		setInBoard((Board) newValue);
    		return;
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.LINK__OUT_BOARD:
    		setOutBoard((Board) newValue);
    		return;
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.LINK__CHANNELS:
    		getChannels().clear();
    		getChannels().addAll((Collection<? extends Channel>) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
  
  @Override
  public void eUnset(final int featureID) {
    switch (featureID) {
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.LINK__NAME:
    		setName((String) null);
    		return;
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.LINK__IN_BOARD:
    		setInBoard((Board) null);
    		return;
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.LINK__OUT_BOARD:
    		setOutBoard((Board) null);
    		return;
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.LINK__CHANNELS:
    		getChannels().clear();
    		return;
    }
    
    super.eUnset(featureID);
  }
}
