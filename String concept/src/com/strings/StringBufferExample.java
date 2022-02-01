package com.strings;

public class StringBufferExample {

	public static void main(String[] args) {
		// Every method is non-synchronized -> Big rice plate -> 10 person to eat -> simul -> come -> eating 
		// Need : if content is changes frequently use string buffer
		// String buffer is not uses string constant pool concept
		// String buffer is mutable -> can be modify
		// Every time sepreated objects created if we have modification to obejcts it get modified
		// All wrapper class is immuatble
		
		// by string buffer : mutable - modifiable
		StringBuffer a=new StringBuffer("Namrata");   
		a.append(" Ajay");
		System.out.println("String Buffer : " + a + "  : " + a.length());
				
	    // Object equals method works like refrences same or not
		StringBuffer s3=new StringBuffer("Namrata");
		StringBuffer s4=new StringBuffer("Namrata");
		System.out.println("By ==  : " + (s3 == s4)); // points to refrences same or not s1 and s2 different object
		System.out.println("By equals()  : " + (s3.equals(s4))); // it is not override by Object Class so it works like equals method of Object class
				
		// capacity = how many char value is hold
		// default capacity = 16
		// new capacity = (old capacity + 1 ) * 2;
		// Find Capacity of default
		StringBuffer b=new StringBuffer(); 
		System.out.println("Capacity of string buffer default : " + b.capacity());
		b.append("abcdefghijklmnop");
		b.append("q");
		System.out.println("Capacity of string buffer updated : " + b.capacity());
		b.append("r");
		System.out.println("Capacity of string buffer updated : " + b.capacity());

		// Find capacity with intial 
		StringBuffer c=new StringBuffer(5);
		System.out.println("Capacity of string buffer default : " + c.capacity());
		c.append("abcde");
		c.append("f"); // 5+1 = 6*2 = 12
		System.out.println("Capacity of string buffer updated : " + c.capacity());
		c.append("12312312312"); // only enter 11 char here because f is 1 char alredy inserted
		c.append("2"); // 12+1  = 13*2 = 26
		System.out.println("Capacity of string buffer updated : " + c.capacity());
		
		// find capacity with string
		StringBuffer f=new StringBuffer("Ajay"); // => new capacity = string.length() + 16 = 4+16 = 20
		System.out.println("Capacity of string buffer default : " + f.capacity());
		f.append("qweasdzxcqweasdz");   
		System.out.println("Capacity of string buffer updated : " + f.capacity());
		f.append("xcre");//=> ( 20 + 1 ) *2 = 42;
		System.out.println("Capacity of string buffer updated : " + f.capacity());
		f.append("g"); 
		System.out.println("Capacity of string buffer updated : " + f.capacity());
		
		// StringBuffer to StringBuilder
		StringBuffer n = new StringBuffer();
		System.out.println("n : " + n.getClass());
		n.append("hey");
		StringBuilder m = new StringBuilder(n);
		m.append("jay");
		System.out.println("n to m : " + m.getClass());
	}
}
