package com.strings;

public class StringExample {
	
	// Need of String : 
	// -> In application 80% we use String data type because it makes your application secure.
	// -> ex. bank application - username and password is string type so hacker will not change value
	
	// 1. String -> string is object that represents sequence of character value ex. abcd = "abcd"
	// 2. String is immutable -> means value can not be change -> reason -> SCP ( String Constant Pool ) 
	// 3. We will store string values in heap as well as SCP ( String Constant Pool ) 
			// -> heap -> It's memory inside JVM which holds object's value 
	        // -> SCP  -> 1. SCP is inside Heap memory
	        //            2. SCP is a separate place in the heap memory where the values of all the strings store.
			//            3. It stores value when we use String literals
	        //            4. Single Objects can be pointed by many references.
			// Adv - 1. improve performance , improve memory management
	        // ex. Voter registration 
	               // -> String vcity = "Mumbai"; -> voter person is in mumbai city -> all person object is pointed to vcity  

	public static void main(String[] args) {
		
		//by String Literal => we don't have heap , we have only String constant pool - object's value store
		// if objects already presnt then JVM will not create again it will reuse that prevoius object
		String name="Namrata"; 
		name.concat("Mohite"); // string is immutable
		//name = name.concat(" Mohite"); // but if we want then we can do this way
		System.out.println("By litreals : " + name);
				
		//by new keyword => we have heap and string constant pool - object created both
		String name2 = new String("Namrata");
		name2.concat("Mohite");
		System.out.println("By new keyword : " + name2);
		
		//Example 1 : understand heap and String constant pool
		String m = new String("Mano");
		String n = new String("Mano");
		String k = "Mano";
		String l = "Mano";
		// Heap area : m -> "Mano" , n -> "Mano" different object 
		// SCP : K,l -> "Mano" one object
		
		
		// Example 2 : 
		String u = new String("Ajay");
		u.concat("Manohar");
		u = u.concat(" Ingle");
		System.out.println("My Name : " + u);
		// heap -> u -> "Ajay" , u is not pointed to "Ajay Manohar" , updated => u -> "Ajay Ingle"
		// SCp -> "Ajay" , "Manohar" ,"Ingle"
		
		// Example3 : 
		String g  = new String("Banana");
		g.concat("Milk");
		String r = g.concat("egg");
		r.concat("Tomato");
		System.out.println("G : " + g + " r : "  + r);
		// heap -> g->Bannna, g is not point to - "Bannna Milk" , r -> "banana egg" , r is not point to - "Bannna egg tomato"
		// SCp -> Banana, Milk, egg, tomato

		// Example4 : 
		String f = "Ajay"; 
		String h = new String(f);
		h.concat("Manohar");
		String i = h.concat(f);
		i.concat(h);
		System.out.println(i + " " + h);
		//Heap -> h -> Ajay, h !-> Ajay Manohar , i -> AjayAjay
		// SCP -> Ajay, Manohar
		
		
		// by == and equals 
		String s1 = new String("Ajay");
		String s2 = new String("Ajay");
		System.out.println("By ==  : " + (s1 == s2) + " " + (s1.hashCode() == s2.hashCode())); // points to references same or not s1 and s2
		System.out.println("By equals()  : " + (s1.equals(s2))); // points to value of object same or not override by Object class
		
		
		// After oops : 
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

// Object Class -> equals() -> used to equal refrences of object 
             // -> if it's override by String class -> used to equal value of object 
