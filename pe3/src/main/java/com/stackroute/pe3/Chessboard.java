package com.stackroute.pe3;


public class Chessboard 
{
    public String[][] fun()
    {
    	String[][] st=new String[8][8];
    //	String[][] chess;
    	for(int i=0;i<8;i++)
    	{
    		for(int j=0;j<8;j++)
    		{
    			if((i+j)%2==0)
    			
    			{
    				st[i][j]= "WW|";
    			}
    			else{
    				st[i][j]="BB|";
    			}
    		}
    	}
    	
    	
        return st;
    }
}
