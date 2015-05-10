/**
 * 
 */
package com.summitbid;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.Ignore;

/**
 * @author eyoung2297k
 *
 */
public class JReverseStringTest {

	/**
	 * Test method for {@link com.summitbid.ReverseString#reverse(java.util.ArrayList)}.
	 */
	@Test
	public void testReverseArrayList() {
		
		ArrayList<Character> str = new ArrayList<Character>();
		str.add('i');str.add('n');str.add('t');str.add('e');str.add('r');str.add('v');str.add('i');str.add('e');str.add('w');
		System.out.println("pre reverse: str ArrayList    is" + str);
		str = JReverseString.reverse(str);
		System.out.println("post reverse: str ArrayList is: " + str);
	}
	
	@Test
	//@Ignore
	public void testReverseString() {
		
		String str = "interview";
		System.out.println("pre reverse: str is:  " + str);
		String resStr = JReverseString.reverse(str);
		System.out.println("post reverse: str is: " + resStr);
	}

}
