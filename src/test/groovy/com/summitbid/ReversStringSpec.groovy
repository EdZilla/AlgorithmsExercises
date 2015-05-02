package com.summitbid

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(ReversString)
class ReversStringSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "reverse an even string"() {
        expect:"got a string"
		ArrayList str = ['w','e','i','v','r','e','t','n','i']
		ArrayList sln = ['i','n','t','e','r','v','i','e','w']
		ArrayList result
		def rstr = new ReversString()
		rstr
		
		when: "pass it a string"
		result = rstr.reverse(str)
		
		then: "result is reversed"
		println "reverse str is: ${result}"
		result == sln
    }
	
	
}
