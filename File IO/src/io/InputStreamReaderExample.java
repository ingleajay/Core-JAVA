package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderExample {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		// InputStreamReader -  It reads bytes and decodes them into characters using a specified charset
		InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);
        int n1 = Integer.parseInt(br.readLine());
        float n2 = Float.parseFloat(br.readLine());
        System.out.println("This Task is performed by : ");
        String name = br.readLine();
        float res = n1 - n2;
        System.out.println("Subtraction : " + res);
        System.out.println("Performed By : " + name);
	}

}
