package com.summitbid

/**
 * From Shutterstock interview
 * Reverse a string
1 - Write code to reverse a string *in place*
str = “interview”

— your code —
str == “weivretni”
rstr == "interview"
     idx = 0
    char start = str[idx]
    char end  = str[str.size() - idx + 1]

// swap the letter at the ends and move inwards
// if it's even this will work
// if it's odd you will do the loop idx < (str.size /2) -1
for( idx < str.size()/2 ) 
{
    str[idx] = end
    str[str.size() - idx +1] = start
    idx++
    start = str[idx]
    end =  str[str.size() - idx +1]
}

 * @author eyoung2297k
 *
 */
class GReverseString {

	static def reverse(def inputString) {
		def idx = 0
		//ArrayList str = inputString
		println "inputstring: ${inputString}" 
		def start = inputString[idx]
		def end = inputString[inputString.size() - idx - 1] 
		// swap the letter at the ends and move inwards
		// if it's even this will work
		// if it's odd you will do the loop idx < (str.size /2) -1
		for(; idx < inputString.size()/2 ;)
		{
			println "idx: ${idx}, str : ${inputString}, size: ${inputString.size()}"
			println "1: start: ${start}, end: ${end}"
			inputString[idx] = end[0]
			inputString[inputString.size() - idx - 1] = start[0]
			idx++
			start = inputString[idx]
			end =  inputString[inputString.size() - idx - 1]
			println "2: start: ${start}, end: ${end}"
		}
		return inputString
	}
	
    static constraints = {
    }
}
