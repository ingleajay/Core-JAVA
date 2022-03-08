package io;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamExample {

	public static void main(String[] args) throws IOException {
		
		
		// 2. FileInputStream -  used for reading byte-oriented data like audio and text
        FileInputStream fin=new FileInputStream("F:\\Java\\core java\\src\\com\\io\\output1.txt");    
        int i=0;    
        while((i=fin.read())!=-1){    
         System.out.print((char)i);    
        } 
        fin.close();  
	}
}
