package com.programs;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		// abcd.... = a  ^ n + b ^ n + c ^ n + ......
		// 153: 1 ^ 3 + 5 ^ 3 + 3 ^ 3 = 1 + 125+ 27 = 153
		
		// Check Armstrong Number for 3 digit number
		int n = 153;
		int t = n;
		int res = 0;
		while (n!= 0)
        {
            int r = n % 10;
            res += Math.pow(r, 3);
            n /= 10;
        }
		if(res == t)
            System.out.println(" is an Armstrong number." + t);
        else
            System.out.println(" is not an Armstrong number." + t);
	}
}

// n = 153 , r = n % 10 => 153 % 10 => 3 , ( r = 3, n=15) => res = 27
// n = 15 , r = n % 10 => 15 % 10 => 5 , ( r = 5, n=1) => res = 125
// n = 1 , r = n % 10 => 1 % 10 => 1 , ( r = 1, n=0) => res = 1
