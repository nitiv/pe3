package com.stackroute.pe3;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.AfterClass;
import org.junit.Test;
import org.junit.BeforeClass;

import junit.framework.TestCase;
import junit.framework.TestSuite;


public class TestExceptions {
	int[] arr= {1,2,3,4,5,6,7,8,9,10};
	int[] arr2=null;
	int index=11;
	private static  Exceptions obj;
	@BeforeClass
	   public static void setup()
	   {
		   obj = new Exceptions();
	   }
	   @AfterClass
	   public static void teardown()
	   {
		   obj=null;
	   }
	   @Test
	   public void testexception()
	   {
		   assertEquals("null",obj.negativearr(-2));
	   }
	   @Test
	   public void testexception2()
	   {
		   assertEquals("11",obj.arrindex(arr,index));
	   }
	   @Test
	   public void testexception3()
	   {
		   assertEquals("null",obj.nullpoint());
	   }
	   
}