package com.summitbid

import grails.test.mixin.TestFor
import spock.lang.Specification
import org.junit.Test;
import org.junit.Ignore;

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(GReverseString)
class ReverseStringSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }


	void "reverse an even numbered string"() {
		expect:"got a string"
		String str = "sweivretni"
		String sln = "interviews"
		println "original str is: ${str}"
		println "solution str is: ${sln}"
		
		when: "pass it a string"
		def result = GReverseString.reverse(str)
		//result = JReverseString.reverse(str)
		
		then: "result is reversed"
		println "original str is: ${str}"
		println "reversed str is: ${result}"
		sln.getClass() == String
		result.getClass() == String
		result.size() == sln.size()
		result == sln
	}
	
	void "reverse an odd numbered string"() {
		expect:"got a string"
		String str = "weivretni"
		String sln = "interview"
		println "original str is: ${str}"
		println "solution str is: ${sln}"
		
		when: "pass it a string"
		def result = GReverseString.reverse(str)
		//result = JReverseString.reverse(str)
		
		then: "result is reversed"
		println "original str is: ${str}"
		println "reversed str is: ${result}"
		sln.getClass() == String
		result.getClass() == String
		result.size() == sln.size()
		result == sln
	}
	
	
}
