#Demo Concurrent ArduinoModeling : the bluetooth broadcast Example.

## Presentation
This demo features 3 arduino boards: 
- one Master with 3 toggleButtons and a bluetooth emmitter
- 2 slaves with 3 leds and a bluetooth reciever


The goal of the demo is to show some of the element of a


After initialization, each board does a loop (for real board the loop should probably be infinite, for the demo it has been limited to 8 loops)



A video of this demo is available here https://youtu.be/dtJZyK1RM2A (done by Julien)

## Scenario

*In the scenario, :arrow_forward: indicates actions to do and :eyes: indicates elements to observe.*

- :arrow_forward: Start engine. Run > Debug configuration... > GEMOC Concurrent eXecutable Model > BroadcastExemple. *In the Engine addons tab, make sure to use only the MultiBranch Reflective Trace.*
- :arrow_forward: Reorganise the views. Use the modeling perspective, make sure to have the 2 diagrams visibles (Hardware and Sketch Blinker), make sure to have the Logical Step view, the Stimuli manager view and the MultiBranch timeline view visibles  (the other view will not be used in this demo)
-  :eyes: in the hardware diagram observe the physical architecture (board buttons, leds, bluetooth), in the Sketch blinker observe the corresponding behavior for each board.

> The Stimuli manager view is used to force push button up or down. This is done on the MSE_buttonX_toggleIt events which are considered as envitronment stimulus. (Forcing these events limits the number of Logical steps)

- :arrow_forward: Force button 1 and 3 to be pushed, force button 2 not to be pushed at first step.

- :arrow_forward: Select the logical step that starts all boards (ie. does all applicable actions in parallel)(usually the last one)
- :eyes: In the sketch diagram, the initial instruction of each board is started. In the Harware diagram, the pushbuttons 1 & 3 are highlighted.
- :arrow_forward: In the stimuli manager, force pushbutton 1 & 3 down. 

- :arrow_forward: select the logical step that maximizes parallel actions *(usually the last one)* until the slaves are waiting on the get(bluetooth) 
- - :eyes:

execute step by step the only instruction possible 
	while going in the "then" part of the "if" note the change of the "inputValue" that'll be sent by the bluetooh
	
when there are again some alternative : 
	note that master_send is mandatory with slave_receive
	
	

TODO add a reset of the master inputValue after having sent the message
	
## Discussion and possible future work

- This demo highlight the need for heterogeneous models and model coordination as the one proposed in GEMOC (using BCOoL).
- The graphical syntax is quite verbose, a variant with a textual syntax for the algorithm part would be more concise. (see feature request https://github.com/gemoc/gemoc-studio/issues/16 )