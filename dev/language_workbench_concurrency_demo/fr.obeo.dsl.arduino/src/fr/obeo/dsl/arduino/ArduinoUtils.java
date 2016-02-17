package fr.obeo.dsl.arduino;

import java.util.Iterator;
import java.util.List;

import javax.management.OperationsException;

import org.eclipse.emf.ecore.EObject;

/**
 * Utility class for arduino.
 * 
 * @author <a href="mailto:yvan.lussaud@obeo.fr">Yvan Lussaud</a>
 *
 */
public final class ArduinoUtils {

	private ArduinoUtils() {
		// nothing to do here
	}
	

	public static Board getBoard(Project project, String boardName) {
		if(project.getBoards() !=null){
			for(Board b : project.getBoards()){
				if(b.getName().equals(boardName)){
					return b;
				}
			}
		}
		return null;
	}
	
	/**
	 * Gets the {@link Pin} {@link Connector connected} to the given
	 * {@link Module}.
	 * 
	 * @param board the {@link Board}
	 * @param module
	 *            the {@link Module}
	 * @return the {@link Pin} {@link Connector connected} to the given
	 *         {@link Module} if any, <code>null</code> otherwise
	 */
	public static Pin getPin(Project project, Module module) {
		Pin res = null;

		final Board board = getContainingBoard(project, module);
		if (board != null && board instanceof ArduinoBoard) {
			ArduinoBoard arduinoBoard = (ArduinoBoard) board;
			for (AnalogPin pin : arduinoBoard.getAnalogPins()) {
				if (pin.getModule() == module) {
					res = pin;
					break;
				}
			}
			if (res == null) {
				for (DigitalPin pin : arduinoBoard.getDigitalPins()) {
					if (pin.getModule() == module) {
						res = pin;
						break;
					}
				}
			}
		}

		return res;
	}

	/**
	 * Gets the {@link Module} {@link Connector connected} to the given
	 * {@link Pin}.
	 * @param project the {@link Project}
	 * @param module
	 *            the {@link Module}
	 * @return the {@link Module} {@link Connector connected} to the given
	 *         {@link Pin} if any, <code>null</code> otherwise
	 */
	public static Module getModule(Pin pin) {
		Module res = null;
		if (pin instanceof AnalogPin) {
			res = ((AnalogPin) pin).getModule();
		} else if (pin instanceof DigitalPin) {
			res = ((DigitalPin) pin).getModule();
		}
		return res;
	}

	/**
	 * Gets the {@link Module} {@link Connector connected} to the given
	 * {@link Pin}.
	 * @param project the {@link Project}
	 * @param module
	 *            the {@link Module}
	 * @return the {@link Module} {@link Connector connected} to the given
	 *         {@link Pin} if any, <code>null</code> otherwise
	 */
	public static Board getContainingBoard(Project project, Module module) {
		for(Board board : project.getBoards()){
			if(board instanceof ArduinoBoard){
				ArduinoBoard ab = (ArduinoBoard)board;
				for(AnalogPin ap : ab.getAnalogPins()){
					if(ap.getModule().equals(module)){
						return board;
					}
				}
				for(DigitalPin dp : ab.getDigitalPins()){
					if(dp.getModule().equals(module)){
						return board;
					}
				}
			}
		}
		return null;
	}
	
	/**
	 * Gets the containing {@link Project} of the given {@link EObject}.
	 * 
	 * @param eObj
	 *            the {@link OperationsException}
	 * @return the containing {@link Project} of the given {@link EObject} if
	 *         any, <code>null</code> otherwise
	 */
	public static Project getContainingProject(EObject eObj) {
		Project res = null;

		EObject current = eObj.eContainer();
		while (current != null) {
			if (current instanceof Project) {
				res = (Project) current;
				break;
			}
			current = current.eContainer();
		}

		return res;
	}
	
/*	public Instruction getNextInstruction(Thread thread){
		Iterator<Instruction> iter = thread.getBlock().getInstructions().iterator();
		Instruction nextInstruction = thread.getCurrentInstruction();
		while(iter.hasNext()){
			if(iter.equals(thread.getCurrentInstruction())){
				if(iter instanceof Control){
					
				}else{
					nextInstruction = iter.next();
				}
			}	
		}
	}
	
	private List<Instruction> instructionsOfABlock(Block bloc){
		var instructions = new ArrayList<Instruction>();
		for(Instruction inst : instructions){
			if(inst instanceof Control){
				Control control = (Control)inst;
				control.getBlock()
			}
		}
	}*/

}
