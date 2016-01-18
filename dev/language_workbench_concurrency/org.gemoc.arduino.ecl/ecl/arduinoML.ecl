import 'platform:/resource/fr.obeo.dsl.arduino/model/arduino.ecore'

ECLimport  "platform:/plugin/fr.inria.aoste.timesquare.ccslkernel.model/ccsllibrary/kernel.ccslLib"
ECLimport  "platform:/plugin/fr.inria.aoste.timesquare.ccslkernel.model/ccsllibrary/CCSL.ccslLib"


package arduino

--context Project
-- def : execute : Event = self.execute()
-- 

context Instruction
 def : start : Event = self.execute() 
 def : stop  : Event = self.finalize()
 

context Control
def : doEvaluate : Event = self.evaluate() [res] switch case self.res = true force evaluatedToTrue;
														case self.res = false force evaluatedToFalse;
def : evaluatedToTrue : Event = self
def : evaluatedToFalse : Event = self

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
		(self.next <> null ) implies
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
 
context VariableAssignment
	inv VA_atomic:
		Relation Coincides(self.start, self.stop)
 
context If
	inv I_nonReentrant:
		Relation Alternates(self.start, self.stop)
		
	inv I_startMeansEvaluate:
		Relation Coincides(self.start, self.doEvaluate)
		
	inv I_evaluatingResultsInTrueOrFalse:
		let i_trueOrFalse : Event = Expression Union(self.evaluatedToFalse, self.evaluatedToTrue) in
		Relation Precedes(self.doEvaluate, i_trueOrFalse)
	
	inv I_trueExclusifFalse:
		Relation Exclusion(self.evaluatedToFalse, self.evaluatedToTrue)	
	
	inv I_startInternalFirst:
		let i_firstInternalInstructionStart : Event = Expression Inf(self.instructions.start) in
		Relation Precedes(self.evaluatedToTrue, i_firstInternalInstructionStart)		

	inv I_stopInternalFirst:
		let i_lastInternalInstructionStop : Event = Expression Sup(self.instructions.stop) in
		let i_eitherlastInstructionOrEvaluatedToFalse : Event = Expression Union(i_lastInternalInstructionStop, self.evaluatedToFalse) in
		Relation Precedes(i_eitherlastInstructionOrEvaluatedToFalse, self.stop)		


context While
		
	inv W_startOrFinishLoopMeansEvaluate:
		let w_lastInternalInstructionStop : Event = Expression Sup(self.instructions.stop) in
		let w_startOrEndLoop : Event = Expression Union(self.start, w_lastInternalInstructionStop) in
		Relation Coincides(w_startOrEndLoop, self.doEvaluate)
		
	inv W_evaluatingResultsInTrueOrFalse:
		let w_trueOrFalse : Event = Expression Union(self.evaluatedToFalse, self.evaluatedToTrue) in
		Relation Precedes(self.doEvaluate, w_trueOrFalse)
	
	inv W_trueExclusifFalse:
		Relation Exclusion(self.evaluatedToFalse, self.evaluatedToTrue)	
	
	inv W_startInternalFirst:
		let w_firstInternalInstructionStart : Event = Expression Inf(self.instructions.start) in
		Relation Precedes(self.evaluatedToTrue, w_firstInternalInstructionStart)		
		
	inv W_stopwhenEvaluatedFalse:
		Relation Coincides(self.evaluatedToFalse, self.stop)	
		
context Repeat
		
	inv R_startMeansEvaluate:
		let r_lastInternalInstructionStop : Event = Expression Sup(self.instructions.stop) in
		let r_startOrEndLoop : Event = Expression Union(self.start, r_lastInternalInstructionStop) in
		Relation Coincides(r_startOrEndLoop, self.doEvaluate)
		
	inv R_evaluatingResultsInTrueOrFalse:
		let r_trueOrFalse : Event = Expression Union(self.evaluatedToFalse, self.evaluatedToTrue) in
		Relation Precedes(self.doEvaluate, r_trueOrFalse)
	
	inv R_trueExclusifFalse:
		Relation Exclusion(self.evaluatedToFalse, self.evaluatedToTrue)	
	
	inv R_startInternalFirst:
		let r_firstInternalInstructionStart : Event = Expression Inf(self.instructions.start) in
		Relation Precedes(self.evaluatedToTrue, r_firstInternalInstructionStart)		
		
--	inv R_lastInternalInstructionTriggerStartAgain:
--		let r_lastInternalInstructionStop : Event = Expression Sup(self.instructions.stop) in
--		let one : Integer = 1 in
--		let r_startMinusFirst : Event = Expression DelayFor(self.start, self.start, one) in
--		Relation Causes(r_lastInternalInstructionStop, r_startMinusFirst)	

	inv R_stopwhenEvaluatedFalse:
		Relation Coincides(self.evaluatedToFalse, self.stop)	

endpackage


