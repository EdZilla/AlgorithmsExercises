package com.summitbid;

interface Stack {

	/**
	 * push a new item onto the stack.
	 * Compare the new item with the latest max value and
	 * set it if it's greater.
	 * @param value
	 * @return true if success, false if error
	 */
	public abstract Boolean push(Integer value);

	/**
	 *
	 * pop the top of the stack
	 * if the stack is empty return null.
	 *
	 * @return nothing
	 */
	public abstract void pop();

	/**
	 * @return return the value on the top of the stack, or null if the stack is empty
	 */
	public abstract Integer peek();

	//	
	public abstract String toString();

}