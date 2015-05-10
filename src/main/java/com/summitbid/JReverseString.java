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

	static String reverse(String str) {
		System.out.println("input string: " + str); 
		ArrayList revAL = new ArrayList();
		char[] ca = str.toCharArray();
		for(int idx = 0; idx < str.length(); idx++) {
			revAL.add(ca[idx]);
		}
		System.out.println("   converted str to ArrayList: " + revAL);
		
		String retString = revCAL(revAL).toString();
		assert retString instanceof String;
		return retString;
	}
	
	static ArrayList<Character> reverse(ArrayList<Character> str) {
		str = revCAL(str);
		return str;
	}
	
	private static ArrayList<Character> revCAL(ArrayList<Character> str) {
		int idx = 0;
		System.out.println("  rev enter: input ArrayList: " + str); 
		Character start =  str.get(idx);
		Character end =  str.get(str.size() - idx - 1); 
		// swap the letter at the ends and move inwards
		// if it's even this will work
		// if it's odd you will do the loop idx < (str.size /2) -1
		for(; idx < str.size()/2 ;)
		{
			System.out.println( "  idx: " + idx + " str : " + str + " size: " + str.size());
			System.out.println( "  1: start: " + start + ", end: " + end);
			str.set(idx, end);
			str.set(str.size() - idx - 1,start);
			idx++;
			start = str.get(idx);
			end   = str.get(str.size() - idx - 1);
			System.out.println("  2: start: " + start + ", end: " + end);
		}
		System.out.println("  rev exit: return ArrayList :         " + str);
		return str;
	}
	
	
	private static ArrayList<String> revSAL(ArrayList<String> str) {
		int idx = 0;
		System.out.println("  rev enter: input ArrayList: " + str); 
		String start =  str.get(idx);
		String end =  str.get(str.size() - idx - 1); 
		// swap the letter at the ends and move inwards
		// if it's even this will work
		// if it's odd you will do the loop idx < (str.size /2) -1
		for(; idx < str.size()/2 ;)
		{
			System.out.println( "  idx: " + idx + " str : " + str + " size: " + str.size());
			System.out.println( "  1: start: " + start + ", end: " + end);
			str.set(idx, end);
			str.set(str.size() - idx - 1,start);
			idx++;
			start = str.get(idx);
			end   = str.get(str.size() - idx - 1);
			System.out.println("  2: start: " + start + ", end: " + end);
		}
		System.out.println("  rev exit: return ArrayList :         " + str);
		return str;
	}
}
