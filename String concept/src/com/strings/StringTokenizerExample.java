package com.strings;

import java.util.StringTokenizer;

public class StringTokenizerExample {

	public static void main(String[] args) {
		// class allows you to break a String into tokens. It is simple way to break a String
		// hasmoreElement, nextToken, nextToken(delim), countToken,nextElements, hasmoreelements
		
		 StringTokenizer st = new StringTokenizer("my name is khan"," ");  
		 while (st.hasMoreTokens()) {  
	         System.out.println(st.nextToken());  
	     }  

		 StringTokenizer s = new StringTokenizer("jay,my,name,is,khan"); 
	     System.out.println("Next token is : " + s.nextToken(","));  
	     
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
