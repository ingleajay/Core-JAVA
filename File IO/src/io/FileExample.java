package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FileExample {

	public static void main(String[] args) throws IOException {
		
		// 1. file - store all value one by one 
		// 2. read file and do opeartions - Add, Sub, Mul, Div
		// 3. store your result in new file - result.txt
		
		FileWriter fr = new FileWriter("F:\\Java\\File IO\\src\\io\\output7.txt");
        BufferedWriter b = new BufferedWriter(fr);
        
        b.write("10"); 
        b.newLine();
        b.write("20");
        b.newLine();
        b.close();
        
        FileReader f = new FileReader("F:\\Java\\File IO\\src\\io\\output7.txt");
        BufferedReader g = new BufferedReader(f);
        
        FileWriter res = new FileWriter("F:\\Java\\File IO\\src\\io\\res.txt");
        BufferedWriter r = new BufferedWriter(res);

        String line = "";
        String s[] = null;
        while ((line = g.readLine()) != null) {
            line = line + " " + g.readLine();
            s = line.split("\\s");
            System.out.println("All Operation Done");
        }
        int x = Integer.parseInt(s[0]);
        int y = Integer.parseInt(s[1]);
        add(x,y,r);
        sub(x,y,r);
        mul(x,y,r);
        div(x,y,r);
        r.close();
	}

	
	private static void add(int x, int y, BufferedWriter r) throws IOException {
		int addition = x+y;
        r.write("Addition : "  + addition);
        r.newLine();
	}
	private static void sub(int x, int y, BufferedWriter r) throws IOException {
		int substraction = x-y;
        r.write("substraction : "  + substraction);
        r.newLine();
	}
	private static void mul(int x, int y, BufferedWriter r) throws IOException {
		int multiplication = x*y;
        r.write("multiplication : "  + multiplication);
        r.newLine();
	}
	private static void div(int x, int y, BufferedWriter r) throws IOException {
		int division = x/y;
        r.write("Division : "  + division);
        r.newLine();
	}

}
