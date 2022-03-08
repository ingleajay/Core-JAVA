package com.arrays;

import java.util.Scanner;

public class intern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String txt = sc.next();
		char[] c = txt.toCharArray();
		int count = 0;
		for(int i=0; i< n; i++) {
			if(!(c[i] == 'a' || c[i] =='i' || c[i] == 'e' || c[i] == 'o' || c[i] == 'u' || c[i] == 'A'|| c[i] == 'I'|| c[i] == 'E'|| c[i] == 'O'|| c[i] == 'U')) {
				count = count + 1;
			}
		}
		System.out.println(count);
	}

}
