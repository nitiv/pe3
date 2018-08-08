package com.stackroute.pe3;

public class ExceptionObject 
{
	public  static void  main(String[] args)throws Exception
	{
		
			try 
			{
				String s="exception occurred";
				throw new Exception(s);
			}
			catch(Exception e)
			{
				 System.out.println(e);
			}
			finally {
				System.out.println("Finally block executed");
			}
			
		
			
	}
}
