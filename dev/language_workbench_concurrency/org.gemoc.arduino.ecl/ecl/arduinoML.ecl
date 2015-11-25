import 'platform:/resource/fr.obeo.dsl.arduino.melange/model-gen/ArduinoMT.ecore'

package arduino


context Project
 def : run : Event = self.execute()

endpackage