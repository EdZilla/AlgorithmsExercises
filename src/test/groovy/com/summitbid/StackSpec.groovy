package com.summitbid

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
//@TestFor(GStack)
class StackSpec extends Specification {
	
	Stack stack
	
    def setup() {
	 stack = new JStack()
    }

    def cleanup() {
    }

    void "push a value onto the stack"() {
        expect:"expect..."
		println "got an empty stack"
		stack.peek() == null
		
		when: "when we add a value to the stack"
		stack.push(1)
		
		then:"stack is size one, and max is 1"
		stack.stack.size() == 1
		stack.max() == 1
		stack.peek() == 1
		println stack.peek()
    }
	
	void "push another larger value onto the stack"() {
		when: "add a larger value to the stack" 
		stack.push(1)
		stack.max() == 1
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
		stack.max() == 1
		stack.push(2)
		stack.max() == 2
		stack.stack.size() == 2
		
		when: "we pop..."
		def length = stack.stack.size()
		stack.pop()
		def oneSmaller = stack.stack.size()
		
		then: "we have a stack one smaller"
		println "length was : ${length}, and is now ${oneSmaller}"
		oneSmaller < length
		stack.peek() == 1
		stack.stack.size() == 1
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
		println "pop..."
		stack.pop()
		println "pop..."
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
		
		when: 
		stack.pop()
		
		then: 
		stack.peek() == 1
		
		when: 
		stack.push(100)
		
		then: 
		stack.peek() == 100

	}
	
	void "try all kinds of stuff"() {
		expect: " a stack"
		stack
		stack.peek() == null
		
		when: "push a bunch of values, 0 to 5"
		[0,1,2,3,4,5].each {
			stack.push(it)
		}
		
		then: "size is 6, max is 5"
		stack.peek() == 5
		stack.max() == 5
		
		when: "pop the stack"
		stack.pop()
		
		then: 
		stack.peek() == 4
		stack.max() == 4
		
		when: "pop again"
		stack.pop()
		
		then:
		stack.peek() == 3
		stack.max() == 3
		
	}
	
	void "pop down the stack to zero"() {
		expect: " a stack"
		stack
		stack.peek() == null
		
		when: 
		[5,4,3,2,1,0].each {
			stack.push(it)
		}
		
		then: "size is 6, max is 5"
		println stack
		stack.peek() == 0
		stack.max() == 5
		stack.stack.size() == 6

		when: 
		stack.stack.size().times { idx->
			stack.max() == 5
			stack.peek() == idx - 1
			stack.pop()
		}
		
		then: 		
		stack.stack.size() == 0
	}
	

	
}
