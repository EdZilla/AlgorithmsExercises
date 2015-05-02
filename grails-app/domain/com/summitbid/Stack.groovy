package com.summitbid

class Stack {

	String name = "stack";
	String description = "code a stack with push, pop, peek, max (returns max value on the stack) "
	
	def max = 0;
	
	List ascendingMaxList = []
	List stack = []
	

	/**
	 * push a new item onto the stack.
	 * Compare the new item with the latest max value and
	 * set it if it's greater.
	 * @param value
	 * @return true if success, false if error
	 */
	def push(int value) {
		println "push enter"
		// push it on the stack
		this.stack.add(value);
		
		assert this.stack.size > 0
		// if this is the first value on the stack, then add the index into the list into the acendingMaxList
		if (this.stack.size() == 1) {
			this.ascendingMaxList.add(value)
			this.max = value
			this.stack
		}
		// else compare this value with the current max.
		// if it's greater than the current max, add this index to the head of the max list.
		else if(value > this.max) {
			this.ascendingMaxList.add(value)
			this.max = value
		}

		println "push exit"
		if (this.stack.size() > 0)
			return true
		else 
			return false
	}
	
	/**
	 *
	 * pop the top of the stack
	 * if the stack is empty return null.
	 *
	 * @return nothing
	 */
	def pop() {
		println "pop enter"
		println "   1: stack size is ${this.stack.size()}"
		if(this.stack.size() == 0)
			return 
			
		println "   2: stack size is ${this.stack.size()}"
		// get the value to pop before we pop it off the stack
		def result = this.peek()
		if(this.stack.size() > 0) {
			this.stack.remove(this.stack.size() - 1);
			def newMax = findNewMaxPostPop(result)
		}
		println this.stack
		println "pop exit"
		return 
	}
	
		 
	/**
	 * O(n)
	 * after a pop, we may no longer have the max, if the max was the top of the stack
	 * @return max
	 */
	def findNewMaxPostPop(def value) {
		println "findNewMaxPost enter"
		if( value > this.max) {
			println "ERROR: value popped ${value} is greater then the current max ${this.max}"
		}
		// if the value popped is the max, then the new max is second to last in the ascending value list
		// and remove the previous max. 
		if(value == this.max) {
			println "value passed in is same as max, so we need to remove an element from ascendingMaxList"
			assert this.max == this.ascendingMaxList[this.ascendingMaxList.size() -1]
			this.ascendingMaxList.remove(this.stack.size())
			if(this.ascendingMaxList.size() > 0) {
				this.max = this.ascendingMaxList[this.ascendingMaxList.size() -1]
			}
		}

		println "  new max is: ${this.max}"
		println "findNewMaxPost exit"
		return this.max
	}
	
	/**
	 * @return return the value on the top of the stack, or null if the stack is empty
	 */
	def peek() {
		def result = null
		if(this.stack.size() > 0) {
			result =  this.stack[this.stack.size() -1]
		}
		return result 
	}

	
	/**
	 * return the max value in the stack
	 * O(1)
	 * @return max value of the stack
	 */
	def max() {
		//assert this.ascendingMaxList[this.ascendingMaxList.size() -1] == this.max
		return this.max
	}
	
	String toString() {
		println "  stack         : ${this.stack},  max: ${this.max}, stack size is ${this.stack.size()}"
		println "  ascending list: ${this.ascendingMaxList} "
		return " ** stack: ${this.stack},  max: ${this.max}, stack size is ${this.stack.size()}"
	}

    static constraints = {
    }
}
