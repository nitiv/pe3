package com.stackroute.pe4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class Pe4Test {
	private static Pe4 x;
	@BeforeClass
	public static void setup() {
		x = new Pe4();
	}
	
	@AfterClass
	public static void teardown() {
		x = null;
	}
	
	//Q:1
	@Test
	public void testcheckLongestSubString() {
		assertEquals("abababaaaabababa", x.longestSubString("aabbccabababaaaabababacbabccbcbcb",2));
	}
	
	@Test
	public void testcheckLongestSubStringFailure() {
		assertNotEquals("abababaaaa", x.longestSubString("aabbccabababaaaabababacbabccbcbcb",2));

	}
	
	@Test
	public void testcheckNull() {
		assertNull(x.longestSubString(null,2));
	}
	
	//Q:2
	String s = "Java is java again java again";
	char ch = 'a';
	
	@Test
	public void testcheckOccurence() {
		assertEquals(10, x.checkOccurences(s,ch));
	}
	@Test
	public void testcheckOccurenceFailure() {
		assertNotEquals(5, x.checkOccurences(s, ch));
	}
	@Test
	public void testcheckOccurenceNull() {
		assertNotNull(x.checkOccurences(s, ch));
	}
	
	//Q:3
	@Test
	public void testcheckReplace() {
		assertEquals("faity fry", x.replacedl("daily dry"));
	}
	
	@Test
	public void testcheckReplaceFailure() {
		assertNotEquals("abcd", x.replacedl("daily dry"));
	}
	
	@Test
	public void testcheckReplaceNull() {
		assertNull(x.replacedl(null));
	}
}
