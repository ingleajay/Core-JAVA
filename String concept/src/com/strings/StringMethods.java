package com.strings;

class ExamplesOfMethods {
	void stringmethods() {
		
		// String charAt() - returns a char value at the given index number
		//methodCharAt();
		
		// String compareTo() - method compares the given string with the current string lexicographically. It returns a + , - , 0.
		methodCompareTo();
		
		//String concat() - method combines specified string at the end of this string.
		//methodConcat();
		
		//  String contains() - method searches the sequence of characters in this string. return boolean
		methodContains();
		
		// String indexOf() - method returns the position of the first occurrence of the specified character or string in a specified string.
		methodIndexOf();
		
		// String replace() - method returns a string replacing all the old char or CharSequence to new char or CharSequence.
		methodReplace();
		
		// String split() - method splits this string against given regular expression and returns a char array.
		//methodSplit();
		
		// String length() - finds the length of a string.
		//methodLength();
		
		// String substring() - returns a part of the string.
		methodSubstring();
		
		//  String trim() - method eliminates leading and trailing spaces
		methodtrim();
		
		// String toLowerCase() -returns the string in lowercase letter. 
		methodLowerCase();
		
		// String toUpperCase() - method returns the string in uppercase letter
		//methodupperCase();
	}

	private void methodupperCase() {
		String s1="hello string";  
		String s1upper=s1.toUpperCase();  
		System.out.println(s1upper); 
	}

	private void methodLowerCase() {
		String s1="JAVATPOINT HELLO stRIng";  
		String s1lower=s1.toLowerCase();  
		System.out.println(s1lower); 
	}

	private void methodtrim() {
		String s1="  hello string   ";  
		System.out.println(s1+" javatpoint " + " : " + s1.length());//without trim()  
		s1 = s1.trim();
		System.out.println(s1 +" javatpoint " + " : "+ s1.length());//with trim()  
	}

	private void methodSubstring() {
		String s1="javatpoint";  
		System.out.println(s1.substring(2,4));//returns va  
		System.out.println(s1.substring(2));//returns vatpoint  
	}

	private void methodLength() {
		String name = "Ajay";
		System.out.println("String length : " + name.length());
		name = name.concat(" Ingle ");
		System.out.println("String length : " + name.length());
	}

	private void methodSplit() {
		String name = "Ajay manohar Ajay Ingle Ajay";
		String[] words=name.split("\\s");//splits the string based on whitespace
		System.out.println("Words : " + words[0]);
		for(String w:words){  
			System.out.println(w);  
	    }  
	}

	private void methodReplace() {
		String name = "Ajay manohar Ajay Ingle Ajay";
	    System.out.println("String replace : " + name.replace("Ajay", "Vijay"));
	    System.out.println("String replace by char  : " + name.replace("ay", "sanam"));
	}

	private void methodIndexOf() {
		// if not containe - index = -1 , found = specific index
		 String name = "Ajay manohar Ingle";
	     System.out.println("String index : " + name.indexOf("ingle"));
	     System.out.println("String index : " + name.indexOf("Ingle"));
	     
	     // give index and search onwords string
	     System.out.println("String index by from index : " + name.indexOf("Ingle", 14));
	     
	     // give index and serach for char onwords
	     System.out.println("Char serach : " + name.indexOf("a")); // first search first index
	}

	private void methodContains() {
		// It is case sensitive - lower and upper different
		// limitation : it is not give you index of it contains => use indexOf()
		String name = "Ajay manohar Ingle";
	     System.out.println("String contains : " + name.contains("ingle"));
	     System.out.println("String contains : " + name.contains("Ingle"));
	}

	private void methodConcat() {
		String s1 = "Ajay";
		s1 = s1.concat("manohar");
		s1 = s1.concat("Ingle").concat(" from IT / B");
		String s2 = " & pointer is ".concat("9.8");
		s1 = s1.concat(s2);
		System.out.println("My data : " + s1);
	}

	private void methodCompareTo() {
		// if s1 > s2, it returns positive number  => s1 after s2
		// if s1 < s2, it returns negative number  => s1 before s2
		// if s1 == s2, it returns 0               => s1 == s2
		
		String s1="Hello";  
		String s2="hello"; 
		String s3 = "A";
		String s4 = "B";
		String s5 = "XYZ";
		System.out.println(s1.compareTo(s2)); // "Hello , hello" => "hello" is after "Hello"
		System.out.println(s1.compareTo(s3)); // "A, hello"  => "hello" is after "A"
		System.out.println(s3.compareTo(s4)); // "A , B"   => A is before B
		System.out.println(s1.compareTo(s5)); // "hello , zebra" => "hello" is before "zebra"
	}

	private void methodCharAt() {
		// print odd position index value
		String name = "Manohar";
		for(int i=0; i<name.length();i++) {
			if(i%2!=0)
			 System.out.println("Charter at index : " + i + " is " + name.charAt(i));
		}
	}
}

public class StringMethods {

	public static void main(String[] args) {
		
		ExamplesOfMethods e = new ExamplesOfMethods();
		e.stringmethods();
	}
}
