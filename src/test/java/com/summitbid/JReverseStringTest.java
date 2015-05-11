/**
 * 
 */
package com.summitbid;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Ignore;

/**
 * @author eyoung2297k
 *
 */
public class JReverseStringTest {

	@Test
	@Ignore
	public void testReverseOddString() {
		
		String str = "interview";
		String sln = "weivretni";
		System.out.println("pre reverse: str is:  " + str);
		String resStr = JReverseString.reverse(str);
		System.out.println("post reverse: str is: " + resStr);
		System.out.println("str length is: " + str.length());
		assert str instanceof String;
		assert resStr instanceof String;
		assert str.length() == resStr.length();
		assert str == sln;
	}
	
	@Test
	@Ignore
	public void testReverseEvenString() {
		
		String str = "interviews";
		String sln = "sweivretni";
		System.out.println("pre reverse: str is:  " + str);
		String resStr = JReverseString.reverse(str);
		System.out.println("post reverse: str is: " + resStr);
		System.out.println("str length is: " + str.length());
		assert str instanceof String;
		assert resStr instanceof String;
		assert str.length() == resStr.length();
		assert str == sln;
	}
	
	@Test
	public void testIsPalindrome() {
		
		String str = "ababa";
		System.out.println("str is:  " + str);
		Boolean isPal = JReverseString.isPalindrome(str);
		assertTrue(isPal);
		
		str = "racecar";
		System.out.println("str is:  " + str);
		isPal = JReverseString.isPalindrome(str);
		assertTrue(isPal);
	}
	
	@Test
	public void testIsNotPalindrome() {
		String str = "interview";
		System.out.println("str is:  " + str);
		Boolean isPal = JReverseString.isPalindrome(str);
		assertFalse(isPal);
	}

}
