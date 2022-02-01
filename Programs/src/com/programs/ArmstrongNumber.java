package com.programs;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		// abcd.... = a  ^ n + b ^ n + c ^ n + ......
		// 153: 1 ^ 3 + 5 ^ 3 + 3 ^ 3 = 1 + 125+ 27 = 153
		
		// Check Armstrong Number for 3 digit number - 153
		// task - any no of digit check arm strong no - 9474
		// to generate arm strong from given range - ( m , n )
		
		int n = 9474;
		int t = n;
		int res = 0;
		while (t!= 0)
        {
            int r = t % 10;
           res += Math.pow(r, 4);
           // res = (res) +(r*r*r) ;
            t /= 10;
        }
		if(res == n)
            System.out.println(" is an Armstrong number." + n);
        else
            System.out.println(" is not an Armstrong number." + n);
		
		
		// Task 
		int start = 1;
		int end = 20000;
		// int to staring
	
		for(int no = start; no<=end; no++) {
			int sum = 0;
			int c = no;
			int digit = String.valueOf(c).length();
			while(c != 0) {
				int r = c%10;
				sum += Math.pow(r,digit);
				c/= 10;
			}
			if(sum == no) {
				System.out.println(no);
			}
		}
	}
}

// n = 153 , r = n % 10 => 153 % 10 => 3 , ( r = 3, n=15) => res = 27
// n = 15 , r = n % 10 => 15 % 10 => 5 , ( r = 5, n=1) => res = 125
// n = 1 , r = n % 10 => 1 % 10 => 1 , ( r = 1, n=0) => res = 1
