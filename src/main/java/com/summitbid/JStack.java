package com.summitbid;

import java.util.ArrayList;

class JStack implements Stack {

	String name = "stack";
	String description = "code a stack with push, pop, peek, max (returns max value on the stack) ";
	
	int max = 0;
	
	ArrayList<Integer> ascendingMaxList = new ArrayList<Integer>();
	ArrayList<Integer> stack = new ArrayList<Integer>();


	/* (non-Javadoc)
	 * @see com.summitbid.Stack#push(java.lang.Integer)
	 */
	@Override
	public Boolean push(Integer value) {
		System.out.println("push enter");
		// push it on the stack
		this.stack.add(value);
		
		assert this.stack.size() > 0;
		// if this is the first value on the stack, then add the index into the list into the acendingMaxList
		if (this.stack.size() == 1) {
			this.ascendingMaxList.add(value);
			this.max = value;
		}
		// else compare this value with the current max.
		// if it's greater than the current max, add this index to the head of the max list.
		else if(value > this.max) {
			this.ascendingMaxList.add(value);
			this.max = value;
		}

		System.out.println("push exit");
		if (this.stack.size() > 0)
			return true;
		else 
			return false;
	}
	
	/* (non-Javadoc)
	 * @see com.summitbid.Stack#pop()
	 */
	@Override
	public void pop() {
//		println "pop enter"
//		println "   1: stack size is ${this.stack.size()}"
		if(this.stack.size() == 0)
			return; 
//			
//		println "   2: stack size is ${this.stack.size()}"
//		// get the value to pop before we pop it off the stack
		int result = this.peek();
//		if(this.stack.size() > 0) {
			this.stack.remove(this.stack.size() - 1);
			int newMax = findNewMaxPostPop(result);
//		}
//		println this.stack
//		println "pop exit"
		return;
	}
//	
//		 
//	/**
//	 * O(n)
//	 * after a pop, we may no longer have the max, if the max was the top of the stack
//	 * @return max
//	 */
	Integer findNewMaxPostPop(int value) {
//		println "findNewMaxPost enter"
		if( value > this.max) {
			System.out.println( "ERROR: value popped " + value + " is greater then the current max " + this.max);
		}
//		// if the value popped is the max, then the new max is second to last in the a)scending value list
//		// and remove the previous max. 
		if(value == this.max) {
//			println "value passed in is same as max, so we need to remove an element from ascendingMaxList"
			assert this.max == this.ascendingMaxList.get(this.ascendingMaxList.size() -1);
			this.ascendingMaxList.remove(this.stack.size());
			if(this.ascendingMaxList.size() > 0) {
				this.max = this.ascendingMaxList.get(this.ascendingMaxList.size() -1);
			}
		}
//
//		println "  new max is: ${this.max}"
//		println "findNewMaxPost exit"
		return this.max;
	}
	
	/* (non-Javadoc)
	 * @see com.summitbid.Stack#peek()
	 */
	@Override
	public Integer peek() {
		Integer result = null;
		if(this.stack.size() > 0) {
			result =  this.stack.get(this.stack.size() -1);
		}
		return result;
	}


	/**
	 * return the max value in the stack
	 * O(1)
	 * @return max value of the stack
	 */
	Integer max() {
//		//assert this.ascendingMaxList[this.ascendingMaxList.size() -1] == this.max
		return this.max;
	}
//	
	/* (non-Javadoc)
	 * @see com.summitbid.Stack#toString()
	 */
	@Override
	public String toString() {
//		println "  stack         : ${this.stack},  max: ${this.max}, stack size is ${this.stack.size()}"
//		println "  ascending list: ${this.ascendingMaxList} "
		return " ** stack: " + this.stack + ",  max: " + this.max + ", stack size is " + this.stack.size();
	}

    
}
