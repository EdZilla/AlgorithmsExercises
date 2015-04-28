package com.summitbid

class Stack {

	String name = "stack";
	String description = "code a stack with push, pop, max"
	
	def max = 0;
	
	List ascendingMaxList = []
	List stack = []
	

	/**
	 * push a new item onto the stack.
	 * Compare the new item with the latest max value and
	 * set it if it's greater.
	 * @param value
	 * @return nothing
	 */
	def push(int value) {
		println "push enter"
		this.stack.add(value);
		
		println "  stack size is ${this.stack.size()}"
		assert this.stack.size > 0
		// if the stack is empty, then add the index into the list into the acendingMaxList
		if (!this.stack) {
			this.ascendingMaxList.add(this.stack.indexOf(value))
		}
		// else compare this value with the current max.
		// if it's greater than the current max, add this index to the head of the max list.
		else if(value > this.ascendingMaxList[-1]) {
			this.ascendingMaxList.add(this.stack.indexOf(value))
		}
		println "push exit"
		return this.peek()
	}
	
	/**
	 *
	 * pop the top of the stack and return at value
	 * if the stack is empty return null.
	 *
	 * @return last item in the list or null if the list is empty
	 */
	def pop() {
		println "pop enter"
		println "   1: stack size is ${this.stack.size()}"
		if(this.stack.size() == 0)
			return null
			
		println "   2: stack size is ${this.stack.size()}"
		// get the value to pop before we pop it off the stack
		def result = this.stack[this.stack.size()]
		this.stack.remove(this.stack.size()-1);
		def newMax = findNewMaxPostPop()
		println "pop exit"
		return result
	}
	
		 
	/**
	 * after a pop, we may no longer have the max, if the max was the top of the stack
	 * @return max
	 */
	def findNewMaxPostPop() {
		println "findNewMaxPost enter"
		for(def idx = 0;idx < this.stack.size(); idx++) {
			println "    value at idx ${idx}: ${this.stack[idx]}"
			if (this.max < this.stack[idx]) {
				this.max = this.stack[idx]
			}
		}
		println "findNewMaxPost exit"
		return this.max
	}
	
	/**
	 * @return return the value on the top of the stack
	 */
	def peek() {
		println "peak enter"
		if (this.stack[0]) {
			return this.stack[-1]
		}
	}

	
	/**
	 * return the max value in the stack
	 * O(1)
	 * @return max value of the stack
	 */
	def max() {
		println "max enter"
		assert this.stack.max() == this.max
		println "max exit"
		return this.max
	}
	
	String toString() {
		return "stack: ${this.stack}. stack size is ${this.stack.size()}"
	}

    static constraints = {
    }
}
