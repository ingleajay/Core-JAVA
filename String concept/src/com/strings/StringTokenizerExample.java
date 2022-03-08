package com.strings;

import java.util.StringTokenizer;

public class StringTokenizerExample {

	public static void main(String[] args) {
		// class allows you to break a String into tokens. It is simple way to break a String
		// hasmoreElement, nextToken, nextToken(delim), countToken,nextElements, hasmoreelements
		
		 StringTokenizer st = new StringTokenizer("my,name,is,khan",",");  
		 while (st.hasMoreTokens()) {  
	         System.out.println(st.nextToken());  
	     }  
		 
		 // Task - str = "10 20 30 40 50";
		 String str = "10 20 30 40 50";
		 StringTokenizer s1 = new StringTokenizer(str," "); 
		 int sum = 0;
		 while (s1.hasMoreTokens()) {  
	        int no =  Integer.parseInt(s1.nextToken());  
	        sum = sum + no;
	     }
		 System.out.println("Sum : " + sum);

		 StringTokenizer s = new StringTokenizer("my,naume,is,khan"); 
	     System.out.println("Next token is : " + s.nextToken("my"));  // it delimit base on string or seq of char
	     
	     StringTokenizer h = new StringTokenizer("Demonstrating methods from StringTokenizer class"," ");    
	     /* Checks if the String has any more tokens */  
	     while (h.hasMoreElements())   
	     {    
	         System.out.println(h.nextToken());    
	     }   
	     
	     StringTokenizer t = new StringTokenizer("Hello Everyone Have a nice day"," ");    
         /* Prints the number of tokens present in the String */  
         System.out.println("Total number of Tokens: "+t.countTokens());    
	}
}
