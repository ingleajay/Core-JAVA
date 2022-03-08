package com.strings;

class BufferAndBuilderMethod{
	void bufferAndbuildermethods() {
		// StringBuffer and StringBuilder append() - concatenates the given argument with this String.
		//methodAppend();
		
		// StringBuffer and StringBuilder insert() -  inserts the given String with this string at the given position.
		//methodInsert();
		
		// StringBuffer and StringBuilder replace() - The replace() method replaces the given String from the specified beginIndex and endIndex.
		//methodReplace();
		
		// StringBuilder and StringBuilder delete() - method of StringBuilder class deletes the string from the specified beginIndex to endIndex.
		//methodDelete();
		
		// StringBuffer and StringBuilder reverse() - method of the StringBuilder class reverses the current String.
		methodReverse();
		
		
	}

	private void methodReverse() {
		StringBuffer sb=new StringBuffer("Hello");  
		sb.reverse();  
		System.out.println(sb);//prints olleH  
		StringBuffer sd=new StringBuffer("Hello");  
		sd.reverse();  
		System.out.println(sd);//prints olleH  
	}

	private void methodDelete() {
		StringBuffer sb=new StringBuffer("Hello");  
		sb.delete(1,3);  
		System.out.println(sb);//prints Hlo  
		StringBuilder sd=new StringBuilder("Hello");  
		sd.delete(1,3);  
		System.out.println(sd);//prints Hlo  
	}

	private void methodReplace() {
		StringBuffer sb=new StringBuffer("Hello");  
		sb.replace(1,2,"Java");  
		System.out.println(sb);//prints HJavalo  
		StringBuilder sd=new StringBuilder("Hello");  
		sd.replace(1,3,"java");  
		System.out.println(sd);//prints HJavalo  
	}

	private void methodInsert() {
		StringBuffer sb=new StringBuffer("Hello ");  
		sb.insert(1,"Java");//now original string is changed  
		System.out.println(sb);//prints HJavaello  
		StringBuilder sd=new StringBuilder("Hello ");  
		sd.insert(1, 99.99);//now original string is changed  
		System.out.println(sd);//prints HJavaello  
	}

	private void methodAppend() {
		StringBuffer sb=new StringBuffer("Hello ");  
		sb.append("Java");//now original string is changed  
		System.out.println(sb);//prints Hello Java 
		StringBuilder sd=new StringBuilder("Hello ");  
		sd.append("Java");//now original string is changed  
		System.out.println(sd);//prints Hello Java  
	}
}

public class StringBufferAndBuilderMethod {

	public static void main(String[] args) {
		BufferAndBuilderMethod sbd = new BufferAndBuilderMethod();
		sbd.bufferAndbuildermethods();
	}
}
