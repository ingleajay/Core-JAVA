package com.strings;

// new operator - objects creates in heap area
// String("Ajay") - objects creates in string constant pool


public class StringExample {

	public static void main(String[] args) {
		
		
		//Example 1 : understand heap and String constant pool
		String m = new String("Mano");
		String n = new String("Mano");
		String k = "Mano";
		String l = "Mano";
		// Heap area : m -> "Mano" , n -> "Mano" different object and SCP : K,l -> "Mano" one object
		
		
		// Example 2 : 
		String u = new String("Ajay");
		u.concat("Manohar");
		u = u.concat(" Ingle");
		System.out.println("My Name : " + u);
		// heap -> u -> "Ajay" , u is not pointed to "Ajay Manohar " , u -> "Ajay Ingle"
		// SCp -> "Ajay" , "Manohar" ,"Ingle"
		
		// Example3 : 
		String g  = new String("Banana");
		g.concat("Milk");
		String r = g.concat("egg");
		r.concat("Tomato");
		System.out.println("G : " + g + " r : "  + r);
		// heap -> g->Bannna, "Bannna Milk" , r -> "banana egg" , "Bannna egg tomato"

		//by String Literal => we don't have heap , we have only String constant pool - object created
		// if objects already presnt then JVM will not create again it will reuse that prevoius object
		String name="Namrata"; 
		name.concat("Mohite");
		name = name.concat(" Mohite"); // if create this way still first object of string is not modifiable
		System.out.println("By litreals : " + name);
		
		//by new keyword => we have heap and string constant pool - object created both
		String name2 = new String("Namrata");
		name2.concat("Mohite");
		System.out.println("By new keyword : " + name2);
		
		// by == and equals 
		String s1 = new String("Ajay");
		String s2 = new String("Ajay");
		System.out.println("By ==  : " + (s1 == s2)); // points to refrences same or not s1 and s2 different object
		System.out.println("By equals()  : " + (s1.equals(s2))); // points to value of object same or not override by Object class
		
		// String constructors : => empty, string litreal, stringbuffer obj, string builder obj, char[] c;
		// covert string buffer , string builder to string
		StringBuffer sb = new StringBuffer("Ajay");
		StringBuilder sd = new StringBuilder("Ajay");
		String cc = new String(sb);
		String dd = new String(sd);
		cc.concat("Ingle");
		System.out.println("String buffer into string : " + cc);
		System.out.println("String builder into string : " + (cc == dd));
		
		char[] ch = {'a','j','a','u'};
		String d = new String(ch);
		System.out.println("Char Array into string : " + d);
		
	}
}
