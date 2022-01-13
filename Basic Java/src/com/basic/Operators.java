package com.basic;

public class Operators {

	public static void main(String[] args) {
		
		// Unary operator needs only one operand to perform any operation 
		int age = 20;
        System.out.println("Unary : " + (age++) + " " + (age--) +
        		" " + (++age) + " " + (--age));
        
        // Arithmetic operators are used to perform add, sub, mul, div.
        int x = 10;
        int y = 20;
        System.out.println("Arithmetic : " + (x+y) + " " + (x-y) + " " + (x*y) + 
        		" " + (x/y) + " " + (x%y) ); 

        // Shift operator has left operators and right operators.
        int p = 10;
        int q = 2;
        System.out.println("Shift : " + (p >> q) + " " + (p << q)); 
        
        // x >> y is right shift = 10>>2 => 10/(2^2) = 2
        //x << y is left shift = 10 << 2 => 10*2^2 = 40
        
        // Relational operator has comparison and equality (< , > , <=, >=, ==, !=)
        int e = 10;
        int f = 20;
        System.out.println("Relational : " + (e < f) + " " + (e > f) + " " + (e <= f) +
        		" " + (e >= f) + " " + (e == f) + " " + (e != f)); 
        
        // Bitwise operators have three things – (&, |, ^) it is return value after operation.
        int a = 10;
        int b = 20;
        System.out.println("Bitwise : " + (a & b) + " " + (a | b) + " " + (a ^ b));
        
        // Logical && and Logical ||. It returns the true and false.
        int v = 10;
        int u = 20;
        System.out.println("Logical : " + ((v > u) && (v > u)) + " " + ((v > u) || (u < v)));
        
        // The ternary operator is the conditional operator.
        int i = 10;
        int j = 20;
        int res = (i > j) ? i : j;
        System.out.println("Ternary : " + res); 
        
        // Assignment operator is assigned value to a variable.
        int m = 10;
        int n = 20;
        m += n; // m = m + n => 30
        m -= n; // m = m - n  => 10
        m *= n; // m = m * n => 200
        m /= n; // m = m / n => 10
        System.out.println("Assignment : " + m);
        
	}

}
