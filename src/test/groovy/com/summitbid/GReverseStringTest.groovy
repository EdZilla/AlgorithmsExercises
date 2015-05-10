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
public class GReverseStringTest {
	
	
	@Test
	//@Ignore
	public void testReverseOddString() {
		
		String str = "interview";
		String revStr = "weivretni";
		println("pre reverse: str is:  " + str);
		String resStr = GReverseString.reverse(str);
		println("post reverse: str is: " + resStr);
		assert resStr instanceof String
		assert revStr instanceof String
		assert resStr.size() == revStr.size()
		assert resStr.length() == revStr.length()
		assert resStr == revStr
	}
	
	@Test
	//@Ignore
	public void testReverseEvenString() {
		
		String str = "interviews";
		String revStr = "sweivretni";
		println("pre reverse: str is:  " + str);
		String resStr = GReverseString.reverse(str);
		println("post reverse: str is: " + resStr);
		assert resStr instanceof String
		assert revStr instanceof String
		assert resStr.size() == revStr.size()
		assert resStr.length() == revStr.length()
		assert resStr == revStr
	}
}