package com.stackroute.pe3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.AfterClass;
import org.junit.Test;
import org.junit.BeforeClass;

import junit.framework.TestCase;
import junit.framework.TestSuite;


public class TestChessboard 
{
	String[][] check= new String[][]{{"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},
									{"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"},
									{"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},
									{"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"},
									{"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},
									{"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"},
									{"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},
									{"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"}};
	private static Chessboard obj;
   @BeforeClass
   public static void setup()
   {
	   obj = new Chessboard();
   }
   @AfterClass
   public static void teardown()
   {
	   obj=null;
   }

	@Test
	public void testChess()
	{
		/*int chessarry[][]=obj.fun();
		String str="";
		for(int i=0;i<8;i++)
		{
			for(int j=0;j<8;j++)
			{
				str=str+chessarry[i][j];
			}
			str=str+'\n';
		}*/
		String[][] str=obj.fun();
		assertEquals(check,str);
		
	}
	@Test
	public void testChess2()
	{
		assertNotEquals(null,obj.fun());
	}
	/*@Test
	public void testChess3()
	{
		String str=obj.fun();
		assertEquals(check.length(),str.length());
	}*/
}
