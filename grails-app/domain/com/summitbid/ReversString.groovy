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
class ReversString {

	def reverse(ArrayList inputString) {
		def idx = 0
		ArrayList str = inputString
		println "inputstring: ${inputString}" 
		def start = str[idx]
		def end = str[str.size() - idx - 1] 
		// swap the letter at the ends and move inwards
		// if it's even this will work
		// if it's odd you will do the loop idx < (str.size /2) -1
		for(; idx < str.size()/2 ;)
		{
			println "idx: ${idx}, str : ${str}, size: ${str.size()}"
			println "start: ${start}, end: ${end}"
			str[idx] = end
			str[str.size() - idx +1] = start
			idx++
			start = str[idx]
			end =  str[str.size() - idx +1]
			
		}
		return str
	}
	
    static constraints = {
    }
}
