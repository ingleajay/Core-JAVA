package com.strings;

// Every method is non-synchronized

public class StringBuilderExample {

	public static void main(String[] args) {
		
				// need : It overcome problem of string buffer - make all methods sync to no-sync
		
		        // by string buffer : mutable - modifiable
				StringBuilder a=new StringBuilder("Namrata");   
				a.append(" Ajay");
				System.out.println("String Buffer : " + a + "  : " + a.length());
						
			    // Object equals method works like refrences same or not
				StringBuilder s3=new StringBuilder("Namrata");
				StringBuilder s4=new StringBuilder("Namrata");
				System.out.println("By ==  : " + (s3 == s4)); // points to refrences same or not s1 and s2 different object
				System.out.println("By equals()  : " + (s3.equals(s4))); // it is not override by Object Class so it works like equals method of Object class
						
				// capacity = how many char value is hold
				// default capacity = 16
				// new capacity = (old capacity + 1 ) * 2;
				// Find Capacity of default
				StringBuilder b=new StringBuilder(); 
				System.out.println("Capacity of string buffer default : " + b.capacity());
				b.append("abcdefghijklmnop");
				b.append("q");
				System.out.println("Capacity of string buffer updated : " + b.capacity());
				b.append("r");
				System.out.println("Capacity of string buffer updated : " + b.capacity());

				// Find capacity with intial 
				StringBuilder c=new StringBuilder(5);
				System.out.println("Capacity of string buffer default : " + c.capacity());
				c.append("abcde");
				c.append("f");
				System.out.println("Capacity of string buffer updated : " + c.capacity());
				c.append("g");
				System.out.println("Capacity of string buffer updated : " + c.capacity());
				
				// find capacity with string
				StringBuilder f=new StringBuilder("Ajay"); // => new capacity = string.length() + 16 = 4+16 = 20
				System.out.println("Capacity of string buffer default : " + f.capacity());
				f.append("qweasdzxcqweasdzxcre"); //=> ( 20 + 1 ) *2 = 42;
				System.out.println("Capacity of string buffer updated : " + f.capacity());
				f.append("g"); 
				System.out.println("Capacity of string buffer updated : " + f.capacity());
				
				// StringBuffer to StringBuilder
				StringBuilder m = new StringBuilder();
				System.out.println("m : " + m.getClass());
				m.append("hey");
				StringBuffer n = new StringBuffer(m);
				n.append("jay");
				System.out.println("n to m : " + n.getClass());

	}

}
