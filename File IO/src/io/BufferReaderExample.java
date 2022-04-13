package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderExample {

	public static void main(String[] args) throws IOException {
		// It makes the performance fast.used to read the text from a character-based input stream.
		FileReader fr=new FileReader("F:\\Java\\File IO\\src\\io\\output3.txt");    
        BufferedReader b = new BufferedReader(fr);
        int i;    
        while((i=b.read())!=-1){  
        System.out.print((char)i);  
        }  
        b.close();    
        fr.close();  
	}

}
