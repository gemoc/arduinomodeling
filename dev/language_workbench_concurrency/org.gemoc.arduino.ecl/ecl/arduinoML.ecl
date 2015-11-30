import 'platform:/resource/fr.obeo.dsl.arduino/model/arduino.ecore'

ECLimport  "platform:/plugin/fr.inria.aoste.timesquare.ccslkernel.model/ccsllibrary/kernel.ccslLib"
ECLimport  "platform:/plugin/fr.inria.aoste.timesquare.ccslkernel.model/ccsllibrary/CCSL.ccslLib"


package arduino

context BooleanExpression
 def : start : Event = self.evaluate() future (self.stop)
 def : stop : Event = self
 
 inv nonReentrant:
 	Relation Alternates(self.start, self.stop)
 
 def : eval : Event = self.evaluate()[res] switch case (self.res = true) force trueBranch;
 												  case (self.res = false) force falseBranch;
 def : trueBranch : Event = self
 def : falseBranch : Event = self
endpackage


