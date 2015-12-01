import 'platform:/resource/org.gemoc.arduino.melange/model-gen/ArduinoMT.ecore'

ECLimport  "platform:/plugin/fr.inria.aoste.timesquare.ccslkernel.model/ccsllibrary/kernel.ccslLib"
ECLimport  "platform:/plugin/fr.inria.aoste.timesquare.ccslkernel.model/ccsllibrary/CCSL.ccslLib"


package arduino

--context Project
-- def : execute : Event = self.execute()
-- 
 
context Instruction
 def : start : Event = self.execute() 
 def : stop  : Event = self
 

context Sketch
	inv S_nonReentrant:
		Relation Alternates(self.start, self.stop)
		
	inv S_startInternalFirst:
		let s_firstInternalInstructionStart : Event = Expression Inf(self.instructions.start) in
		Relation Precedes(self.start, s_firstInternalInstructionStart)		

	inv S_stopInternalFirst:
		let s_lastInternalInstructionStop : Event = Expression Sup(self.instructions.stop) in
		Relation Precedes(s_lastInternalInstructionStop, self.stop)	

context Instruction
	inv I_OrderEnforcement:
		(self.next <> null) implies
		(Relation Precedes(self.stop, self.next.start))
	
context ModuleInstruction
	inv MI_atomic:
		Relation Coincides(self.start, self.stop)

context Delay
	inv D_NonAtomic:
		Relation Alternates(self.start, self.stop) 

context VariableDeclaration
	inv VD_atomic:
		Relation Coincides(self.start, self.stop)
 
context Control
	inv C_nonReentrant:
		Relation Alternates(self.start, self.stop)
	
	inv C_startInternalFirst:
		let c_firstInternalInstructionStart : Event = Expression Inf(self.instructions.start) in
		Relation Precedes(self.start, c_firstInternalInstructionStart)		

	inv C_stopInternalFirst:
		let c_lastInternalInstructionStop : Event = Expression Sup(self.instructions.stop) in
		Relation Precedes(c_lastInternalInstructionStop, self.stop)		
		
endpackage


