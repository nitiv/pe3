package com.stackroute.pe4;

import java.util.HashSet;
import java.util.Set;

public class Pe4 {
	public static final int CHAR_RANGE = 128;
	public String longestSubString(String string, int k) {
		
	//k=2;
		if(string==null) {
			return null;
		}
		 int end = 0, begin = 0;

	       
	        Set<Character> window = new HashSet();      
	        int[] freq = new int[CHAR_RANGE];     
	        for (int low = 0, high = 0; high < string.length(); high++)
	        {
	            window.add(string.charAt(high));
	            freq[string.charAt(high)]++;
	            while (window.size() > k)
	            {
	              
	                if (--freq[string.charAt(low)] == 0) {
	                    window.remove(string.charAt(low));
	                }

	                low++;        
	            }

	        
	            if (end - begin < high - low)
	            {
	                end = high;
	                begin = low;
	            }
	        }
	        return string.substring(begin, end + 1);
	
	
		
		
	}

	public int checkOccurences(String string, char a) {
		//int n=Matches(string, a);
		/*if(string==null) {
			return 0;
		}else {*/
		int cn = string.length()- string.replaceAll(String.valueOf(a),"").length();
		return cn;
	}

	public String replacedl(String string) {
		if(string==null) {
			return null;
		}else {
		String str = string.replace('d', 'f');
		String str1=str.replace('l', 't');
		
		return str1;
	}}
	

}
