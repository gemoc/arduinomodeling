import 'platform:/resource/org.gemoc.arduino.concurrent.execarduino/model/ExecArduino.ecore'
import _'http://www.eclipse.org/emf/2002/Ecore'

ECLimport  "platform:/plugin/fr.inria.aoste.timesquare.ccslkernel.model/ccsllibrary/kernel.ccslLib"
ECLimport  "platform:/plugin/fr.inria.aoste.timesquare.ccslkernel.model/ccsllibrary/CCSL.ccslLib"

package arduino

--context Project
-- def : execute : Event = self.execute()
-- 

context Instruction
 def : start : Event = self.execute() 
 def : stop  : Event = self.finalize()
 
context Sketch
 def : start : Event = self
 def : stop  : Event = self

context Control
def : doEvaluate : Event = self.evaluate() [res] switch case self.res = true force evaluatedToTrue;
														case self.res = false force evaluatedToFalse;
def : evaluatedToTrue : Event = self
def : evaluatedToFalse : Event = self

context Sketch 
	inv S_nonReentrant:
		Relation Alternates(self.start, self.stop)
		
	inv S_startInternalFirst:
		Relation Precedes(self.start, self.block.instructions->first().start)		

	inv S_stopInternalFirst:
		Relation Precedes(self.block.instructions->last().stop, self.stop)	

context Instruction
	inv I_OrderEnforcement:
		(self.oclAsType(ecore::EObject).eContainer().oclAsType(Block).instructions->last() <> self) implies
		let indexOfNextInstruction : Integer = self.oclAsType(ecore::EObject).eContainer().oclAsType(Block).instructions->indexOf(self)+1 in
		(Relation Precedes(self.stop, self.oclAsType(ecore::EObject).eContainer().oclAsType(Block).instructions->at(indexOfNextInstruction).start))	

context Instruction
	inv I_atomicbutDelayAndControl:
		((not (self.oclIsKindOf(Delay))) and (not (self.oclIsKindOf(Control)))) implies
		(Relation Coincides(self.start, self.stop))

context Delay
	inv D_NonAtomic:
		Relation Alternates(self.start, self.stop) 
 
context If
	inv I_nonReentrant:
		Relation Alternates(self.start, self.stop)
		
	inv I_startMeansEvaluate:
		Relation Precedes(self.start, self.doEvaluate)
		
	inv I_evaluatingResultsInTrueOrFalse:
		let i_trueOrFalse : Event = Expression Union(self.evaluatedToFalse, self.evaluatedToTrue) in
		Relation Precedes(self.doEvaluate, i_trueOrFalse)
	
	inv I_trueExclusifFalse:
		Relation Exclusion(self.evaluatedToFalse, self.evaluatedToTrue)	
	
	inv I_startInternalofThen:
		Relation Coincides(self.evaluatedToTrue, self.block.instructions->first().start)		
		
	inv I_startInternalofElse:
		Relation Coincides(self.evaluatedToFalse, self.elseBlock.instructions->first().start)	

	inv I_stopInternalFirst:
		let i_lastInstructionfromthenOrElse : Event = Expression Union(self.block.instructions->last().stop, self.elseBlock.instructions->last().stop) in
		Relation Precedes(i_lastInstructionfromthenOrElse, self.stop)		


context While
	
	inv W_startOrFinishLoopMeansEvaluate:
		let w_startOrEndLoop : Event = Expression Union(self.start, self.block.instructions->last().stop) in
		Relation Coincides(w_startOrEndLoop, self.doEvaluate)
		
	inv W_evaluatingResultsInTrueOrFalse:
		let w_trueOrFalse : Event = Expression Union(self.evaluatedToFalse, self.evaluatedToTrue) in
		Relation Precedes(self.doEvaluate, w_trueOrFalse)
	
	inv W_trueExclusifFalse:
		Relation Exclusion(self.evaluatedToFalse, self.evaluatedToTrue)	
	
	inv W_startInternalFirst:
		Relation Precedes(self.evaluatedToTrue, self.block.instructions->first().start)		
		
	inv W_stopwhenEvaluatedFalse:
		Relation Coincides(self.evaluatedToFalse, self.stop)	
		
context Repeat
		
	inv R_startMeansEvaluate:
		let r_startOrEndLoop : Event = Expression Union(self.start, self.block.instructions->last().stop) in
		Relation Precedes(r_startOrEndLoop, self.doEvaluate)
		
	inv R_evaluatingResultsInTrueOrFalse:
		let r_trueOrFalse : Event = Expression Union(self.evaluatedToFalse, self.evaluatedToTrue) in
		Relation Precedes(self.doEvaluate, r_trueOrFalse)
	
	inv R_trueExclusifFalse:
		Relation Exclusion(self.evaluatedToFalse, self.evaluatedToTrue)	
	
	inv R_startInternalFirst:
		Relation Precedes(self.evaluatedToTrue, self.block.instructions->first().start)		
		
--	inv R_lastInternalInstructionTriggerStartAgain:
--		let r_lastInternalInstructionStop : Event = Expression Sup(self.instructions.stop) in
--		let one : Integer = 1 in
--		let r_startMinusFirst : Event = Expression DelayFor(self.start, self.start, one).oclAsType(ecore::EObject).eContainer().oclAsType(Block)	Relation Causes(r_lastInternalInstructionStop, r_startMinusFirst)	

	inv R_stopwhenEvaluatedFalse:
		Relation Coincides(self.evaluatedToFalse, self.stop)	

endpackage


