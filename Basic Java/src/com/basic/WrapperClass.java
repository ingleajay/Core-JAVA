package com.basic;

public class WrapperClass {

	public static void main(String[] args) {
		
		// used to convert primitive to object and object to primitive
		// wrapper class has internal utility methods like equals() , toString();
		// Use in serialization - convert object into stream
		// use in synchronization - use objects for multithreading
		// use in collection framework
		// wrapper class is immutable
		// wrapper class can have null but primitivate not have null
		
		// int -> Integer // char -> Character // byte-> Byte // float -> Float // double -> Double // long -> Long // short -> Short
		
		byte b=10;  
		short s=20;  
		int i=20;  
		long l=40;  
		float f=30.0F;  
		double d=60.0D;  
		char c='a';  
		boolean b2=true;   
		
		//Autoboxing: Converting primitives into objects  
		Byte byteobj=b;  
		Short shortobj=s;  
		Integer intobj=i;  
		Long longobj=l;  
		Float floatobj=f;  
		Double doubleobj=d;  
		Character charobj=c;  
		Boolean boolobj=b2;  
		
		//Printing objects  
		System.out.println("---Printing object values---");  
		System.out.println("Byte object: "+byteobj);  
		System.out.println("Short object: "+shortobj);  
		System.out.println("Integer object: "+intobj);  
		System.out.println("Long object: "+longobj);  
		System.out.println("Float object: "+floatobj);  
		System.out.println("Double object: "+doubleobj);  
		System.out.println("Character object: "+charobj);  
		System.out.println("Boolean object: "+boolobj);  
		
		// if we want to equals of two object
		System.out.println(intobj.equals(shortobj)); // check both refrences is same or not
		
		// if we want to convert integer to string
		int a = 10;
		String value = Integer.toString(a);
		System.out.println(value + " " + value.getClass());
		
		
		//Unboxing: Converting Objects to Primitives  
		byte bytevalue=byteobj;  
		short shortvalue=shortobj;  
		int intvalue=intobj;  
		long longvalue=longobj;  
		float floatvalue=floatobj;  
		double doublevalue=doubleobj;  
		char charvalue=charobj;  
		boolean boolvalue=boolobj;  
		
		
		//Printing primitives  
		System.out.println("---Printing primitive values---");  
		System.out.println("byte value: "+bytevalue);  
		System.out.println("short value: "+shortvalue);  
		System.out.println("int value: "+intvalue);  
		System.out.println("long value: "+longvalue);  
		System.out.println("float value: "+floatvalue);  
		System.out.println("double value: "+doublevalue);  
		System.out.println("char value: "+charvalue);  
		System.out.println("boolean value: "+boolvalue);  
		
		
	}

}
