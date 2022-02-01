package com.programs;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		
		// aba is palindrome , abba is palindrome
		
		System.out.println("Enter your string");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		// method 1: -> case sensitive 
		int res = checkPalindrome(str);
		
		if(res == 0)
		 System.out.println("String is plaindrome");
		else
		 System.out.println("String is not palindrome");	

		// method 2 : -> not case sensitive
		int res1 = checkPalin(str);
		if(res1 == 0)
			 System.out.println("String is plaindrome");
		else
			 System.out.println("String is not palindrome");
		
		// method 3 : -> string buffer
		int res2  = checkpal(str);
		if(res2 == 0)
			 System.out.println("String is plaindrome");
		else
			 System.out.println("String is not palindrome");
	}

	private static int checkpal(String str) {
		StringBuffer s = new StringBuffer(str);
		s.reverse();
		if(str.equalsIgnoreCase(s.toString()))
			return 0;
		else
			return -1;
	}

	private static int checkPalin(String str) {
		// Radar -> radaR => lower case 
		int len = str.length()-1;
		String res = "";
		for(int i=len; i>=0;i--) {
			res = res + str.charAt(i);
		}
		if (str.toLowerCase().equals(res.toLowerCase())) {
			return 0;
		}
		else {
			return -1;
		}
	}

	private static int checkPalindrome(String str) {
		int j = str.length()-1;
		for(int i=0; i<=j;i++) {
			if(str.charAt(i) != str.charAt(j)) {
				return -1;
			}
			j--;
		}
		return 0;
	}
}

// Method 1 : 
// abba ->i=0, j=3 => (a==a) 
//      ->i=1, j=2 => (b==b)
//      ->i=2, j=1 => (b==b)
//      ->i=3, j=0 => (a==a)
//      ->i=4 , j=-1-> fail
