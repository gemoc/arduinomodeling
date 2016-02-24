import 'platform:/resource/fr.obeo.dsl.arduino/model/arduino.ecore'
--import 'arduino.ecore'
ECLimport "platform:/resource/org.gemoc.arduino.mocc/mocc/Arduino.moccml"
--ECLimport "Arduino.moccml"
ECLimport  "platform:/plugin/fr.inria.aoste.timesquare.ccslkernel.model/ccsllibrary/kernel.ccslLib"
ECLimport  "platform:/plugin/fr.inria.aoste.timesquare.ccslkernel.model/ccsllibrary/CCSL.ccslLib"


package arduino	
	
context ThreadInstructionBlock
	def:execInstruction: Event = self.execute()  
		
	
context Thread

	def:execute: Event = self.execute()  
	def:synchronize: Event = self.synchronize()       
	
	inv executeAllInstructions:
		let instruExec : Event = Expression Union(self.blocks.oclAsType(ThreadInstructionBlock).execInstruction) in
		Relation Coincides(self.execute, instruExec)

	--inv executeAllInstructionsInv:
		--let instruExec2 : Event = Expression Union(self.blocks.oclAsType(ThreadInstructionBlock).execInstruction) in
		--Relation Coincides(instruExec2, self.execute)
	
	--inv Thread_StartInstructionFirst:
		--let test : Event = Expression Inf(self.first.execInstruction,self.blocks.execInstruction) in
	--	Relation Precedes(self.first.execInstruction, self.first.oclAsType(SynchronizationBlock).next.execInstruction)
		
	-- Blocked cannot precess acce
	--inv S_startInternalFirst:
	--	let s_firstInternalInstructionStart : Event = Expression Inf(self.first.execInstruction) in
	--	Relation Precedes(self.execute, s_firstInternalInstructionStart)	
		
	

	-- only one instruction at time
	--inv oneInstructionAtATime:
	--	Relation Exclusion(self.block.oclAsType(Block).instructions.oclAsType(Instruction).execInstruction)
		
	--inv executeInstruction:
	--	let instruExec : Event = Expression Union(self.block.oclAsType(Block).instructions.oclAsType(Instruction).execInstruction) in
	--	Relation Coincides(self.execute, instruExec)

context InstructionBlock
	
	--inv I_OrderEnforcemenIbt:
	--	(self.next <> null ) implies
	--	(Relation Precedes(self.execInstruction, self.next.oclAsType(SynchronizationBlock).execInstruction))	
	
	 inv Instruction_OrderEnforcement:
		 Relation ThreadDecl (
			self.execInstruction,
			self.next.oclAsType(SynchronizationBlock).execInstruction	  
		)    

	--
	inv InstructionStartFirst:
		Relation Precedes (self.execInstruction , self.next.oclAsType(SynchronizationBlock).execInstruction)

context SynchronizationBlock
	
	--inv I_OrderEnforcementSb:
	--	(self.previous <> null ) implies
	--	(Relation Precedes(self.previous.oclAsType(InstructionBlock).execInstruction, self.execInstruction) )
	inv Sync_OrderEnforcement:
		 Relation ThreadDecl (
			self.execInstruction,
			self.next.oclAsType(InstructionBlock).execInstruction	  
		) 
	
	inv synchronize:
		Relation Coincides(self.execInstruction, self.thread.synchronize)
			
	inv SyncStartFirst:
		Relation Precedes (self.execInstruction, self.next.oclAsType(InstructionBlock).execInstruction)	
			
context Channel	  
		
	def : write :Event = self.write() 
	def : read :Event = self.read()

	inv ChannelSDF: 
		let capacity : Integer = self.oclAsType(Channel).capacity in
		let inRate : Integer = self.oclAsType(Channel).inRate in
		let outRate : Integer = self.oclAsType(Channel).outRate in
		let currentSize : Integer = self.oclAsType(Channel).currentSize in
		
		 Relation ChannelDecl (
			self.write,
			self.read,
			capacity,
			inRate,
			outRate,
			currentSize		  
		)    
			          
	inv write_push:
		Relation Coincides(self.source.oclAsType(Thread).synchronize, self.write)
	
	inv read_pop:
		Relation Coincides(self.read,self.target.oclAsType(Thread).synchronize)
	       
context Board
		def : execBoard : Event = self
		def : idleBoard: Event = self       
		--def : allThreadsExecutions : Event = Expression Union(self.threads.oclAsType(Thread).execute)
	
		inv ThreadCanExecuteIfBoardExecute:
			let allThreadsExecutions : Event = Expression Union(self.threads.oclAsType(Thread).execute) in
			Relation Coincides(self.execBoard, allThreadsExecutions)
			
		inv ExecutingXorIdle:
			Relation BoardDecl (
				self.execBoard,
				self.idleBoard	  
			)   
		
		inv oneThreadAtATime:
			Relation Exclusion(self.threads.oclAsType(Thread).execute)
		
	--	inv ExecutesItsAllocatedThreads:
	--		let allThreadsExecutions : Event = Expression Union(self.threads.oclAsType(Thread).execute()) in
	--		Relation Coincides(execute, allThreadsExecutions)


--context SharedVariableAccess
-- Cannot have two access that coincide   
	--def:blocked: Event = self.isLocked  
--	def:access: Event = self.access()  
	
--	inv accessSynchonously:
--		Relation Coincides(access, self.sharedVariable.access)

--context SharedVariable
-- Cannot have two access that coincide   
	--def:blocked: Event = self.isLocked  
--	def:access: Event = self.access()  
	 
	--def:lock: Event = self.isLocked
	--def:unlock: Event = self.isLocked = false
--	inv oneAccessAtTime:
--		Relation Exclusion(self.access)
	
	--inv sharing:
	--	Relation sharedVariableDecl (
	--			self.,
	--			self.itsInputPort.oclAsType(InputPort).owner.oclAsType(Block).execute, 
	--			capacity,
	--			inRate,
	--			outRate,
	--			currentSize		  
	--		)   
		
	--inv oneAccessAtTime:
	--	Relation Coincides(self.access, self.)

-- Blocked cannot precess acce
	--inv S_startInternalFirst:
	--	let s_firstInternalInstructionStart : Event = Expression Inf(self.instructions.start) in
	--	Relation Precedes(self.start, s_firstInternalInstructionStart)	

--context Project
-- def : execute : Event = self.execute()
-- 

--context Instruction
-- def : start : Event = self.execute() 
-- def : stop  : Event = self.finalize()
-- 
--
--context Control
--def : doEvaluate : Event = self.evaluate() [res] switch case self.res = true force evaluatedToTrue;
--														case self.res = false force evaluatedToFalse;
--def : evaluatedToTrue : Event = self
--def : evaluatedToFalse : Event = self
--
--context Sketch 
--	inv S_nonReentrant:
--		Relation Alternates(self.start, self.stop)
--		
--	inv S_startInternalFirst:
--		let s_firstInternalInstructionStart : Event = Expression Inf(self.instructions.start) in
--		Relation Precedes(self.start, s_firstInternalInstructionStart)		
--
--	inv S_stopInternalFirst:
--		let s_lastInternalInstructionStop : Event = Expression Sup(self.instructions.stop) in
--		Relation Precedes(s_lastInternalInstructionStop, self.stop)	
--
--context Instruction
--	inv I_OrderEnforcement:
--		(self.next <> null ) implies
--		(Relation Precedes(self.stop, self.next.start))
--	
--context ModuleInstruction
--	inv MI_atomic:
--		Relation Coincides(self.start, self.stop)
--
--context Delay
--	inv D_NonAtomic:
--		Relation Alternates(self.start, self.stop) 
--
--context VariableDeclaration
--	inv VD_atomic:
--		Relation Coincides(self.start, self.stop)
-- 
--context VariableAssignment
--	inv VA_atomic:
--		Relation Coincides(self.start, self.stop)
-- 
--context If
--	inv I_nonReentrant:
--		Relation Alternates(self.start, self.stop)
--		
--	inv I_startMeansEvaluate:
--		Relation Coincides(self.start, self.doEvaluate)
--		
--	inv I_evaluatingResultsInTrueOrFalse:
--		let i_trueOrFalse : Event = Expression Union(self.evaluatedToFalse, self.evaluatedToTrue) in
--		Relation Precedes(self.doEvaluate, i_trueOrFalse)
--	
--	inv I_trueExclusifFalse:
--		Relation Exclusion(self.evaluatedToFalse, self.evaluatedToTrue)	
--	
--	inv I_startInternalFirst:
--		let i_firstInternalInstructionStart : Event = Expression Inf(self.instructions.start) in
--		Relation Precedes(self.evaluatedToTrue, i_firstInternalInstructionStart)		
--
--	inv I_stopInternalFirst:
--		let i_lastInternalInstructionStop : Event = Expression Sup(self.instructions.stop) in
--		let i_eitherlastInstructionOrEvaluatedToFalse : Event = Expression Union(i_lastInternalInstructionStop, self.evaluatedToFalse) in
--		Relation Precedes(i_eitherlastInstructionOrEvaluatedToFalse, self.stop)		
--
--
--context While
--		
--	inv W_startOrFinishLoopMeansEvaluate:
--		let w_lastInternalInstructionStop : Event = Expression Sup(self.instructions.stop) in
--		let w_startOrEndLoop : Event = Expression Union(self.start, w_lastInternalInstructionStop) in
--		Relation Coincides(w_startOrEndLoop, self.doEvaluate)
--		
--	inv W_evaluatingResultsInTrueOrFalse:
--		let w_trueOrFalse : Event = Expression Union(self.evaluatedToFalse, self.evaluatedToTrue) in
--		Relation Precedes(self.doEvaluate, w_trueOrFalse)
--	
--	inv W_trueExclusifFalse:
--		Relation Exclusion(self.evaluatedToFalse, self.evaluatedToTrue)	
--	
--	inv W_startInternalFirst:
--		let w_firstInternalInstructionStart : Event = Expression Inf(self.instructions.start) in
--		Relation Precedes(self.evaluatedToTrue, w_firstInternalInstructionStart)		
--		
--	inv W_stopwhenEvaluatedFalse:
--		Relation Coincides(self.evaluatedToFalse, self.stop)	
--		
--context Repeat
--		
--	inv R_startMeansEvaluate:
--		let r_lastInternalInstructionStop : Event = Expression Sup(self.instructions.stop) in
--		let r_startOrEndLoop : Event = Expression Union(self.start, r_lastInternalInstructionStop) in
--		Relation Coincides(r_startOrEndLoop, self.doEvaluate)
--		
--	inv R_evaluatingResultsInTrueOrFalse:
--		let r_trueOrFalse : Event = Expression Union(self.evaluatedToFalse, self.evaluatedToTrue) in
--		Relation Precedes(self.doEvaluate, r_trueOrFalse)
--	
--	inv R_trueExclusifFalse:
--		Relation Exclusion(self.evaluatedToFalse, self.evaluatedToTrue)	
--	
--	inv R_startInternalFirst:
--		let r_firstInternalInstructionStart : Event = Expression Inf(self.instructions.start) in
--		Relation Precedes(self.evaluatedToTrue, r_firstInternalInstructionStart)		
--		
----	inv R_lastInternalInstructionTriggerStartAgain:
----		let r_lastInternalInstructionStop : Event = Expression Sup(self.instructions.stop) in
----		let one : Integer = 1 in
----		let r_startMinusFirst : Event = Expression DelayFor(self.start, self.start, one) in
----		Relation Causes(r_lastInternalInstructionStop, r_startMinusFirst)	
--
--	inv R_stopwhenEvaluatedFalse:
--		Relation Coincides(self.evaluatedToFalse, self.stop)	

endpackage


