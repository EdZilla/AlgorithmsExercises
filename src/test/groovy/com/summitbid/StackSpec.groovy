package com.summitbid

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Stack)
class StackSpec extends Specification {
	
	Stack stack
	
    def setup() {
	 stack = new Stack()
    }

    def cleanup() {
    }

    void "add a value to the stack"() {
        expect:"expect..."
		printf "got a stack"
		stack
		
		when: "when we add a value to the stack"
		stack.push(1)
		
		then:"stack is size one, and max is 1"
		stack.stack.size() == 1
		stack.max() == 1
		println stack
    }
	
	void "add another larger value to the stack"() {
		when: "add a larger value to the stack" 
		stack.push(1)
		println stack
		stack.max() == 1
		println stack
		stack.push(2)
		
		then: "new max is 2"
		stack.max() == 2
		stack.stack.size() > 0
		println "stack size is ${stack.stack.size()}"
	}
	
	
	void "pop a value off the stack"() {
		expect: "the stack to be some length greater then or equal to 2"
		stack
		stack.push(1)
		println stack
		stack.max() == 1
		stack.push(2)
		println stack
		stack.max() == 2
		stack.stack.size() == 2
		
		when: "we pop..."
		def length = stack.stack.size()
		println stack
		stack.pop()
		println stack
		def oneSmaller = stack.stack.size()
		
		then: "we have a stack one smaller"
		println "length was : ${length}, and is now ${oneSmaller}"
		oneSmaller < length
	}
	
	void "pop a value off the stack, and verify new max"() {
		expect: "push values on the stack"
		stack
		stack.push(1)
		print stack
		stack.max() == 1
		stack.push(2)
		print stack
		stack.max() == 2
		stack.stack.size() == 2
		println stack
		
		when: "we pop..."
		def length = stack.stack.size()
		println stack
		stack.pop()
		println stack
		def oneSmaller = stack.stack.size()
		
		then: "we have a stack one smaller"
		println "length was : ${length}, and is now ${oneSmaller}"
		oneSmaller < length
		
		then: "the new max value is 1"
		println stack
		stack.max() == 1
	}
	
	
	void "peek at the top of the stack"() {
		expect: "a stack"
		stack
		
		when: "push"
		stack.push(1)
		stack.max() == 1
		stack.stack.size() == 1
		then:
		stack.peek() == 1
		
		when: 
		stack.push(99)
		then:
		stack.peek() == 99
	}
}
