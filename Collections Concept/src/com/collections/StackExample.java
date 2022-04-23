package com.collections;

import java.util.Scanner;
import java.util.Stack;

public class StackExample {
	
//	1. The stack is a linear data structure that is used to store the collection of objects
//	2. It is based on Last-In-First-Out (LIFO).
//	3. we have opeation - pop,push,peek
//	Default size = 10
//	Where to use: Reverse of string , Text editor ( undo ) , Balanced Parathesis


	public static void main(String[] args) {
		Scanner cp = new Scanner(System.in);
        int c = cp.nextInt();
        Stack<Integer> s = new Stack<>();
        // push ele
        for (int i = 0; i < c; i++) {
            Scanner sc = new Scanner(System.in);
            int d = sc.nextInt();
            s.push(d);
        }
        System.out.println("statck ele : " + s);
        // pop ele
        int y = s.pop();
        System.out.println("POP value: " + y);
        // peek
        int x = s.peek();
        System.out.println("Top most element in statck : " + x);
        
        boolean res = s.empty();
        System.out.println("Check stack empty ? " + res);
        
        System.out.println(reversestring("Ajay"));
	}

	private static String reversestring(String str) {
		char[] reverseString = new char[str.length()];
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
  
        int i = 0;
        while (!stack.isEmpty()) {
            reverseString[i++] = stack.pop();
        }
        return new String(reverseString);
	}
}
