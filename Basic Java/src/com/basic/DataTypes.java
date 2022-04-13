package com.basic;

public class DataTypes {

	public static void main(String[] args) {
		
		// It's same as int data type, It saves memory space. 
		// It is 4 times smaller than the integer. = 1 byte = 8 bit
		byte stud_age = 10;
		byte stud_marks = (byte) 98.4f;
	    System.out.println("Student age:" + stud_age); 
	    System.out.println("Student marks:" + stud_marks); 
	    
	    // Short data type is 2 byte and it can also be used as int data type
	    // It is 2 times smaller than the integer. = 2 byte = 16 bit 
	    short age = 20;
        System.out.println("Student age:" + age); 
        
        // Int data type is 4 byte.
        int stud_mark = (int) 20.5f;
        System.out.println("Student marks:" + stud_mark); 
        
        // Long data type is 8 byte. if you want more space than integer then use long data type.
        long stud_stock = 222222222L;
        System.out.println("Student stocks:" + stud_stock);
        
        // Float data type is used to store decimal value. it is 4 byte.
        float mark = 20.5f;
        System.out.println("Student marks:" + mark); 
        
        // Double data type is 8 byte and the range of double type is unlimited.
        double stud_stocks = 20.555555d;
        System.out.println("Student stocks:" + stud_stocks); 
        
        // Char data type is 2 byte. It is used to store character value.
        char stud_divison = 'B';
        System.out.println("Student division:" + stud_divison); 
        
        // Boolean is data type return value true and false. 
        // It is used in tacking conditions. it is only one bit.
        boolean stud_pass = true;
        System.out.println("Student pass" + stud_pass); 
        
        // String is a non-primitive data type. it is used to store strings in variables.
        String stud_name = "Ajay";
        System.out.println("Student name" + stud_name); 

	}

}
