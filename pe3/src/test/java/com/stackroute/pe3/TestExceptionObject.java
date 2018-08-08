package com.stackroute.pe3;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.AfterClass;
import org.junit.Test;
import org.junit.BeforeClass;

import junit.framework.TestCase;
import junit.framework.TestSuite;

public class TestExceptionObject {
	
	private static  ExceptionObject obj;
	@BeforeClass
	   public static void setup()
	   {
		   obj = new ExceptionObject();
	   }
	   @AfterClass
	   public static void teardown()
	   {
		   obj=null;
	   }
	   @Test
	   public void testcase1()
	   {
		   assertEquals("exception occured",obj.fun());
	   }
}
