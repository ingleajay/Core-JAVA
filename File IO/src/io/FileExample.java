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
		
		FileWriter fr = new FileWriter("C:\\Users\\ADMIN\\OneDrive\\Desktop\\file.txt");
        BufferedWriter b = new BufferedWriter(fr);
        
        b.write("10"); 
        b.newLine();
        b.write("20");
        b.newLine();
        b.close();
        
        FileReader f = new FileReader("C:\\Users\\ADMIN\\OneDrive\\Desktop\\file.txt");
        BufferedReader g = new BufferedReader(f);
        
        FileWriter res = new FileWriter("C:\\Users\\ADMIN\\OneDrive\\Desktop\\res.txt");
        BufferedWriter r = new BufferedWriter(res);

        String line = "";
        List<String> s = null;
        while ((line = g.readLine()) != null) {
            line = line + " " + g.readLine();
            String[] a = line.split("\\s");
            s = Arrays.asList(a);
            System.out.println("All Operation Done");
        }
        int x = Integer.parseInt(s.get(0));
        int y = Integer.parseInt(s.get(1));
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
