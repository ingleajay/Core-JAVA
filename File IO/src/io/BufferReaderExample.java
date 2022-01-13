package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderExample {

	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("F:\\Java\\core java\\src\\com\\io\\output1.txt");    
        BufferedReader b = new BufferedReader(fr);
        int i;    
        while((i=b.read())!=-1){  
        System.out.print((char)i);  
        }  
        b.close();    
        fr.close();  
	}

}
