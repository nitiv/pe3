package com.stackroute.pe3;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.AfterClass;
import org.junit.Test;
import org.junit.BeforeClass;

import junit.framework.TestCase;
import junit.framework.TestSuite;


public class TestConsecutive {
	public static  Consecutive obj;
	@BeforeClass
	   public static void setup()
	   {
		   obj = new Consecutive();
	   }
	   @AfterClass
	   public static void teardown()
	   {
		   obj=null;
	   }
	   @Test
	   public void testconsecutive()
	   {
		   assertEquals("98,96,95,94,93 non consecutive numbers",obj.fun("98,96,95,94,93"));
		   
	   }
	   @Test
	   public void testconsecutive2()
	   {
		   assertEquals("54,53,52,51,50,49,48 are consecutive numbers",obj.fun("54,53,52,51,50,49,48"));
		   
	   }
	   @Test
		public void testconsecutive3()
		{
			assertNotEquals(null,obj.fun("98,96,95,94,93"));
		}
	  /* @Test
		public void testconsecutive4()
		{
		
			assertEquals("number of digits should be at-most 7",obj.fun()));
		}*/

}
