package org.gemoc.arduino.sequential.execarduino.trace.tracemanager;

import java.util.List;
import fr.inria.diverse.trace.gemoc.api.IStepFactory;

public class ArduinoTraceStepFactory implements IStepFactory {

	@Override
	public org.gemoc.executionframework.engine.mse.MSEOccurrence createMSEOccurrence(
			org.gemoc.executionframework.engine.mse.MSE mse, List<Object> parameters, List<Object> result) {

		String stepRule = fr.inria.diverse.trace.commons.EcoreCraftingUtil.getFQN(mse.getCaller().eClass(), ".") + "."
				+ mse.getAction().getName();
		org.gemoc.executionframework.engine.mse.MSEOccurrence mseocc = null;

		if (stepRule.equalsIgnoreCase("arduino.BluetoothTransceiver.push")) {
			mseocc = arduinoTrace.Steps.StepsFactory.eINSTANCE.createArduino_BluetoothTransceiver_Push();
		} else

		if (stepRule.equalsIgnoreCase("arduino.Delay.execute")) {
			mseocc = arduinoTrace.Steps.StepsFactory.eINSTANCE.createArduino_Delay_Execute();
		} else

		if (stepRule.equalsIgnoreCase("arduino.If.execute")) {
			mseocc = arduinoTrace.Steps.StepsFactory.eINSTANCE.createArduino_If_Execute();
		} else

		if (stepRule.equalsIgnoreCase("arduino.ModuleAssignment.execute")) {
			mseocc = arduinoTrace.Steps.StepsFactory.eINSTANCE.createArduino_ModuleAssignment_Execute();
		} else

		if (stepRule.equalsIgnoreCase("arduino.Project.setup")) {
			mseocc = arduinoTrace.Steps.StepsFactory.eINSTANCE.createArduino_Project_Setup();
		} else

		if (stepRule.equalsIgnoreCase("arduino.Repeat.execute")) {
			mseocc = arduinoTrace.Steps.StepsFactory.eINSTANCE.createArduino_Repeat_Execute();
		} else

		if (stepRule.equalsIgnoreCase("arduino.VariableAssignment.execute")) {
			mseocc = arduinoTrace.Steps.StepsFactory.eINSTANCE.createArduino_VariableAssignment_Execute();
		} else

		if (stepRule.equalsIgnoreCase("arduino.VariableDeclaration.execute")) {
			mseocc = arduinoTrace.Steps.StepsFactory.eINSTANCE.createArduino_VariableDeclaration_Execute();
		}

		else
			mseocc = org.gemoc.executionframework.engine.mse.MseFactory.eINSTANCE.createMSEOccurrence();

		if (mseocc != null) {
			mseocc.setMse(mse);
			mseocc.getParameters().addAll(parameters);
			mseocc.getResult().addAll(result);
		}
		return mseocc;
	}
}
