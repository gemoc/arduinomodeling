package fr.obeo.dsl.arduino;

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

	/**
	 * Gets the {@link Pin} {@link Connector connected} to the given
	 * {@link Module}.
	 * 
	 * @param project the {@link Project}
	 * @param module
	 *            the {@link Module}
	 * @return the {@link Pin} {@link Connector connected} to the given
	 *         {@link Module} if any, <code>null</code> otherwise
	 */
	public static Pin getPin(Project project, Module module) {
		Pin res = null;

		final Board board = project.getBoard();
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

}
