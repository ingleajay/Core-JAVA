package com.contolstatement;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class task {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		String date = sc.next();

        String strPattern = "^(0[1-9]|[12][0-9]|[3][01])/(0[1-9]|1[012])/\\d{4}$";
        String output =  date.matches(strPattern) ? date: "wrong format";
        System.out.println(output);
		
	}
}
