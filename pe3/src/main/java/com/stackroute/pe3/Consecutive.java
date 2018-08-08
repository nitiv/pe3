package com.stackroute.pe3;

public class Consecutive 
{
	public String fun(String str)
	{
		
			String[] arr=str.split(",");
			String s,s1;
			//int[] a;
			int l=arr.length;
			
			int[] a=new int[l];
			for(int i=0;i<l;i++)
			{
				a[i]=Integer.parseInt(arr[i]);
			}
			
			
			//int[] a;
			if(l==7) {
				if((a[0]==a[1]+1) &&(a[1]==a[2]+1) && (a[2]==a[3]+1) && (a[3]==a[4]+1)&& (a[4]==a[5]+1) && (a[5]==a[6]+1) && (a[6]==a[5]-1)) 
				{
					s= str+" are consecutive numbers";
					return s;
				}			
				
			}
			s1=str+" non consecutive numbers";
			return s1 ;
		}
	

}
