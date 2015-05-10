package com.summitbid;
import java.util.ArrayList;
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
class JReverseString {

	/**
	 * Take a string and reverse it.
	 * Note: java.util.String is immutable, so we can't do it in place, 
	 * and so  we need to create an intermediary data structure 
	 * and reverse it.   
	 * @param str string to be reversed
	 * @return a new, reversed string
	 */
	static String reverse(String str) {
		System.out.println("input string: " + str); 
		char[] ca = str.toCharArray();

		ca = revCA(ca);
		StringBuilder foo = new StringBuilder();
		foo.append(ca);
		assert foo.toString() instanceof String;
		assert str.length() == foo.toString().length();
		return foo.toString();
	}
	
	/**
	 * Take a character array and reverse it in place.
	 * O(n/2)
	 * @param ca
	 * @return the reversed char array
	 */
	private static char[] revCA(char[] ca) {
		int idx = 0;
		char start = ca[idx];
		char end =   ca[ca.length - idx -1];
		for(idx = 0;idx < ca.length/2; ) {
			ca[idx] = end;
			ca[ca.length - idx -1] = start;
			idx++;
			start = ca[idx];
			end =   ca[ca.length - idx -1];
		}
		return ca;
	}
}
