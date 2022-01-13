package com.basic;

public class DataTypeConversion {

	public static void main(String[] args) {
		
		// String to int
		stringToint();
		
		// int to String
		intTostring();
		
		//String to Long
		stringTolong();
		
		//Long to String
		longTostring();
		
		//String to float
		strignTofloat();
		
		//Float to String
		floatTostring();
		
		// String to double
		stringTodouble();
		
		// double to String
		doubleTostring();
		
		// String to char
		stringTochar();
		
		// char to String
		charTostring();
		
		// String to boolean
		stringToboolean();
		
		// boolean to String
		booleanTostring();
		
		// int to long
		intTolong();
		
		// long to int
		longToint();
		
		// int to double
		intTodouble();
		
		// double to int
		doubleToint();
		
		// char to int
		charToint();
		
		// int to char
		intTochar();
		
		// binary to decimal
		binaryTodecimal();
		
		// decimal to binary
		decimalTobinary();
		
		// hex to decimal
		hexTodecimal();
		
		// decimal to hex
		decimalTohex();
		
		//Octal to Decimal
		octalTodecimal();
		
		// decimal to octal
		decimalTooctal();
	}

	private static void decimalTooctal() {
		System.out.println("decimal to octal : "+ Integer.toOctalString(81));  // 81/8 = 1 , 10/8 = 2 , 1/0 = 1 => 121 
	}

	private static void octalTodecimal() {
		System.out.println("octal to decimal : " + Integer.parseInt("121",8)); // 1*8^2+2*8^1+1*8^0 => 81 
	}

	private static void decimalTohex() {
		System.out.println("decimal to hex : " + Integer.toHexString(121));  // 121/16 => 9 , 9/16 = 7 => (79)
	}

	private static void hexTodecimal() {
		System.out.println("Hex to decimal : " +Integer.parseInt("Ab",16)); // 10*16 + 11 => 171
	}

	private static void decimalTobinary() {
		System.out.println("Decimal to Binary : " + Integer.toBinaryString(10)); // 10/2 = 0 , 5/2 = 1 , 2/2 = 0 , 1/0 = 1 => 1010
	}

	private static void binaryTodecimal() {
		System.out.println("Binary to decimal : " + Integer.parseInt("1010",2)); // 1*2^3 + 0*2^2 + 1*2^1 + 0*2^0 => 10
	}

	private static void intTochar() {
		int a=65;  
		char c=(char)a;  
		System.out.println("int to char way :" + c);
	}

	private static void charToint() {
		char c1='a'; 
		char c2='1';  
		int a=c1;  // Get ASCII value
		int b=c2;  
		int w2=Character.getNumericValue(c2);  // Character.getNumericValue()
		int w3=Integer.parseInt(String.valueOf(c2));  
		System.out.println("char to int way 1 : " + a + "  " + b); 
		System.out.println("char to int way 2 : " + w2);  
		System.out.println("char to int way 3 : " + w3);  
	}

	private static void doubleToint() {
		Double d=new Double(10.5);   //  intValue() method
		int w1=d.intValue();  
		System.out.println("double to int : " + w1); 
	}

	private static void intTodouble() {
		int i=200;  
		double w1=i;  // direct method 
		Double w2= new Double(i); // double object
		Double w3=Double.valueOf(i); //  Double.vauleOf 
		System.out.println("int to double way 1: " + w1); 
		System.out.println("int to double way 2: " + w2); 
		System.out.println("int to double way 3: " + w3);  

	}

	private static void longToint() {
		long l=500;  
		int w1=(int)l; // type casting  
		Long j= new Long(10);  // with long object
		int w2=j.intValue();  
		System.out.println("Long to int way 1 : " + w1); 
		System.out.println("Long to int way 2 : " + w2);  

	}

	private static void intTolong() {
		int i=200;  
		long w1=i;               // with direct method
		Long w2=Long.valueOf(i); // with Long.valueof
		Long w3= new Long(i);     // with Long object 
		System.out.println("int to long way1: " + w1);  
		System.out.println("int to long way2: " + w2); 
		System.out.println("int to long way3: " + w3); 
	}

	private static void booleanTostring() {
		boolean b1=true;  
		boolean b2=false;  
		String w11=String.valueOf(b1);   // String.valueOf()
		String w12=String.valueOf(b2);  
		String w21=Boolean.toString(b1);  // Boolean.toString()
		String w22=Boolean.toString(b2);  
		System.out.println("boolean to String: way 1: " + w11 + " " + w12); 
		System.out.println("boolean to String: way 2: " + w21 + " " + w22);  

	}

	private static void stringToboolean() {
		
		String s1="true";  
		String s2="TRue";  
		String s3="ok";  
		boolean w11=Boolean.parseBoolean(s1);  // Boolean.parseBoolean()
		boolean w12=Boolean.parseBoolean(s2);  
		boolean w13=Boolean.parseBoolean(s3);  
		boolean w21=Boolean.parseBoolean(s1);  //Boolean.parseBoolean()
		boolean w22=Boolean.parseBoolean(s2);  
		boolean w23=Boolean.parseBoolean(s3); 
		System.out.println("String to boolean way 1 : " + w11 + " " + w12 + " " + w13);  
		System.out.println("String to boolean way 2 : " + w21 + " " + w22 + " " + w23);  

	}

	private static void charTostring() {
		char c='S';  
		String w1=String.valueOf(c);  // String.valueOf 
		System.out.println("char to String way 1: "+w1);  
		
		String w2=Character.toString(c);  
		System.out.println("char to String way 2: "+w2);  
	}

	private static void stringTochar() {
		String s="hello";  
		
		for(int i=0;i<s.length();i++) { // charAt() method
		 char w1=s.charAt(i); 
		 System.out.println("String to Char way 1: "+ w1); 
		}
		
		char[] w2=s.toCharArray();    // toCharArray() method
		for(int i=0;i<w2.length;i++){    
		 System.out.println("String to Char way 2: "+w2[i]);   
		}
	}

	private static void doubleTostring() {
		double d=12.3; 
		String w1=String.valueOf(d);   // String.valueOf()
		String w2=Double.toString(d);  	// Double.toString()
		System.out.println("Double To String way 1 : " + w1);  
		System.out.println("DOuble To String way 2 : " + w2); 
	}

	private static void stringTodouble() {
		String s="23.6";  
		double d=Double.parseDouble("23.6");  
		System.out.println("String to double : " + d); 
	}

	private static void floatTostring() {
		float f=12.3f; 
		String w1=String.valueOf(f);   // String.valueOf()
		String w2 =Float.toString(f);  	// Float.toString()
		System.out.println("Float To String way 1 : " + w1);  
		System.out.println("Float To String way 2 : " + w2);  

	}

	private static void strignTofloat() {
		String s="23.6";  
		float f=Float.parseFloat("23.6");  
		System.out.println("String To Float : " + f); 
	}

	private static void longTostring() {
		long i=9993939399L;  
		String w1 = String.valueOf(i);   // String.valueOf()
		String w2 =Long.toString(i);       // Long.toString()
		System.out.println("Long to String way 1 : " + w1); 
		System.out.println("Long to String way 2 : " + w2); 
	}

	private static void stringTolong() {
		String s="9990449935";  
		long l=Long.parseLong(s);  
		System.out.println("String to Long : " + l);  
	}

	private static void intTostring() {
		int i=10;  
		String w1=String.valueOf(i);   //  String.valueOf()
		String w2=Integer.toString(i); //  Integer.toString()
		String w3=String.format("%d",i);  // String.format()
		
		System.out.println("Integer to String way 1: " + w1);
		System.out.println("Integer to String way 2: " + w2);
		System.out.println("Integer to String way 3: " + w3);

	}

	private static void stringToint() {
		String a="200";
		String b = "100";
		int i=Integer.parseInt(a);
		int j=Integer.parseInt(b);
		System.out.println("String to Integer : " + (i+j));
	}

}
