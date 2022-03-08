package com.programs;

import java.util.Scanner;


public class demo {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		String inputString = sc.nextLine();
		
		StringBuffer instr = new StringBuffer(inputString);
		StringBuffer cutstr = new StringBuffer();
		StringBuffer tutstr = new StringBuffer();
		StringBuffer outstr = new StringBuffer();
		int t;
		for(int i=0; i<instr.length(); i++) {
	         if(instr.charAt(i) == 'a'|| instr.charAt(i) == 'e'|| instr.charAt(i) == 'i' || instr.charAt(i) == 'o' || instr.charAt(i) == 'u') {
	        	 cutstr.append(instr.charAt(i));
	         }
	         else {
	        	 tutstr.append(instr.charAt(i));
	         }
	      }
		if(cutstr.isEmpty()) {
			cutstr.append("NA");
		}
		
		char charArray[] = cutstr.toString().toCharArray();
		int temp;
		int size = charArray.length;
		for(int i = 0; i <size ; i++ ) {
	         for(int j = i+1; j < size; j++) {
	        	
	            if(charArray[i]>charArray[j]) {
	               temp = charArray[i];
	               charArray[i] = charArray[j];
	               charArray[j] = (char) temp;
	            }
	            
	         }
	    }
		outstr.append(charArray);
		char fvowel = outstr.toString().charAt(0);
		int index = instr.toString().indexOf(fvowel);
		outstr.append(index);
		char con[] = tutstr.toString().toCharArray();
		int tp;
		int s = con.length;
		for(int i = 0; i <s ; i++ ) {
	         for(int j = i+1; j < s; j++) {
	            if(con[i]>con[j]) {
	               temp = con[i];
	               con[i] = con[j];
	               con[j] = (char) temp;
	            }
	         }
	    }
		outstr.append(con);
		char lconst = outstr.toString().charAt(outstr.length()-1);
		int i = instr.toString().lastIndexOf(lconst);
		outstr.append(i);
		StringBuffer r = outstr;
		if(outstr.toString().contains("AN")) {
			r = outstr.delete(0,2);
			r.insert(0, "NA");
		}
		System.out.println(r);
		
	}
}
