package com.stackroute.pe3;

public class Exceptions {
	public String nullpointer(int size) 
	{
		return null;
	}
	public String negativearr(int size) {
		
		try {
			int[] a=new int[size];
			
		}
		catch(NegativeArraySizeException e){
			
			return "null";
			
		}
		return null;
	}
	public String arrindex(int[] arr, int index) {
		try {
			//int[] arr1=new int[10];
			//arr1=arr;
			arr[11]=22;
			
		}catch(IndexOutOfBoundsException e)
		{
		 return "11";	
		}
	
		return null;
	}
	public String nullpoint() {
		String str=null;
		try {
			if(str.equals("gif"))
				return "same";
			else
				return "not same";
			
		}catch(NullPointerException e)
		{
			return "null";
		}
	
	
	
			//arr2=null;
			
			
			
			
		
		
	}
}
