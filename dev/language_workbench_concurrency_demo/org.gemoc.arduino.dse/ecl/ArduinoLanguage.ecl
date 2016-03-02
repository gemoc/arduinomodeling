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

	def:execute: Event = self  
	def:synchronize: Event = self    
	def:startEv:Event = self  
	
	inv executeAllInstructions:
		let instruExec : Event = Expression Union(self.blocks.oclAsType(ThreadInstructionBlock).execInstruction) in
		Relation Coincides(self.execute, instruExec)
		
context ThreadInstructionBlock

	inv ThreadInstructionBlock_OrderEnforcement:
		let nbCycle : Integer = self.thread.oclAsType(Thread).nbCycle in
		 Relation ThreadDecl (
			self.execInstruction,
			self.next.execInstruction,
			self.thread.oclAsType(Thread).startEv	 ,
			nbCycle 
		)   
		
context SynchronizationBlock
	inv synchronize:
		Relation Coincides(self.execInstruction, self.thread.synchronize)

context Channel	  
	
	def : push :Event = self 
	def : pop :Event = self

	inv ChannelSDF: 
		let capacity : Integer = self.oclAsType(Channel).capacity in
		let inRate : Integer = self.oclAsType(Channel).inRate in
		let outRate : Integer = self.oclAsType(Channel).outRate in
		let currentSize : Integer = self.oclAsType(Channel).currentSize in
		
		 Relation ChannelDecl (
			self.push,
			self.pop,
			capacity,
			inRate,
			outRate,
			currentSize		  
		)    
			          
	inv Channel_push:
		Relation Coincides(self.source.oclAsType(Thread).synchronize, self.push)
	
	inv Channel_pop:
		Relation Coincides(self.pop,self.target.oclAsType(Thread).synchronize)
	       
context Board
	def : execBoard : Event = self
	--def : idleBoard: Event = self       
	
	inv ThreadCanExecuteIfBoardExecute:
		let allThreadsExecutions : Event = Expression Union(self.threads.oclAsType(Thread).execute) in
		Relation Coincides(self.execBoard, allThreadsExecutions)
			
	--inv ExecutingXorIdle:
		--Relation BoardDecl (
		--	self.execBoard  
--		)   
		
	--inv oneThreadAtATime:
	--	Relation Exclusion(self.threads.oclAsType(Thread).execute)

context Link	  
		
	def : writeLink :Event = self
	def : readLink :Event = self
    
    inv ChannelsWritingCoincidesWithLinkWriting:
		let allChannelsWriting : Event = Expression Union(self.channels.oclAsType(Channel).push) in
		Relation Coincides(self.writeLink, allChannelsWriting)
    
    inv ChannelsReadingCoincidesWithLinkReading:
		let allChannelsReading: Event = Expression Union(self.channels.oclAsType(Channel).pop) in
		Relation Coincides(self.readLink, allChannelsReading)
    
endpackage


