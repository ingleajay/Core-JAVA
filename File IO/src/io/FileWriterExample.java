package io;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
	
	public static void main(String[] args) throws IOException {
		FileWriter fw=new FileWriter("F:\\Java\\core java\\src\\com\\io\\output2.txt");    
        fw.write("Welcome to codeouter.");    
        fw.close(); 
        System.out.println("Success...");  
	}
}
