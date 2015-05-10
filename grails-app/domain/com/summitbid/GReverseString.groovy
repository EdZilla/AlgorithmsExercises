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

	static String reverse(String str) {
		def idx = 0
		//ArrayList str = inputString
		println "input str: ${str}"
		println "inputString isa: " + str.getClass()
		char[] ca = str.toCharArray();
		ca = revca(ca);
		return new StringBuilder().append(ca).toString();
	}
	
	/** 
	 * reverse char array in place
	 * @param ca
	 * @return reversed char array
	 */
	private static char[] revca(char[] ca) {
		int idx = 0;
		char start = ca[idx];
		char end   = ca[ca.length - idx - 1]
		for(; idx < ca.length/2;) {
			ca[idx] = end
			ca[ca.length - idx - 1] = start
			idx++
			start = ca[idx];
			end   = ca[ca.length - idx - 1]
		}
		return ca
	}
	
    static constraints = {
    }
}
