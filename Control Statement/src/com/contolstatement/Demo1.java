package com.contolstatement;

public class Demo1 {

	public static void main(String[] args) {
		
		 // while loop 
	     // while loop is used when a number of the iteration of the program is not fixed
		
		// example 1 - to print 1 to 5 numbers
		int i = 1;
		while(i<=5) {
			System.out.println(i);
			i++;
		}
       // i = 1 ; => 1 - ( 1<=5 )
	   // i = 1+1 => 2 - ( 2<=5 )
	   // i = 2+1 => 3 - ( 3<=5 )
	   // i = 3+1 => 4 - ( 4<=5 )
	   // i = 4+1 => 5 - ( 5<=5 )
	   // i = 5+1 => 6 - ( 6<=5) - failed
	   System.out.println("++++++++++++++++++++++++++++++++++++++");	
		
	  // example 2 - to print table of 10 
	  int j = 1;
	  while(j<=10) {
		  System.out.println(j*10);
		  j++;
	  }
	   System.out.println("++++++++++++++++++++++++++++++++++++++");	

	  
	  // example 3 - to get sum of numbers till 5
	  // ex. 1, 2, 3, 4, 5 => 1+2+3+4+5 => 15
	  
	  int k =1 ;
	  int sum = 0;
	  while(k<=5) {
		  sum = sum + k;
		  k++;
	  }
	  System.out.println(sum);
	  
	  // sum = 0 => sum = 0 , k=1  
	  // sum = 0+1 => sum = 1, k=2
	  // sum= 1+2 => sum = 3, k=3 
	  // sum=3+3 => sum = 6, k=4 
	  // sum=6+4 => sum = 10, k=5 
	  // sum = 10+5 => sum = 15, k=6
	  // ( 6<=5) failed
	  
	  System.out.println("++++++++++++++++++++++++++++++++++++++");
	  
	  // example 4 - to identitify even numbers from set of numbers
	  // ex. 1, 2, 3, 4, 5 ...10
	  
	  int l = 1;
	  System.out.println("Even Numbers : ");
	  while(l<=10) {
		  if(l%2==0) {
			  System.out.println(l);
		  }
		  l++;
	  }
	  
	  System.out.println("++++++++++++++++++++++++++++++++++++++");
	  
	  // example 5 - factorial of number => n*(n-1)!
	  // 5! => 120
	  
	  int h = 1; 
	  int no = 5;
	  int f = 1;
	  while(h<=no) {
		  f = f * h;
		  h++;
	  }
	  System.out.println("Fact of " + no + " is " + f );
	  System.out.println("++++++++++++++++++++++++++++++++++++++");
	  
	  // f=1*1 => f = 1 , h=1
	  // f=1*2 => f = 2 , h=2
	  // f=2*3 => f=6, h=3
	  // f=6*4 => f=24 , h=4
	  // f=24*5=> f= 120
	  
	  // example 6 - to print odd series till 10
	  // ex. 1, 3, 5, 7, 9, 11
	  
	  int o = 1;
	  String odd = "";
	  while(o<=10) {
		  if(o%2!=0) {
			  //System.out.println(o);
			  odd = odd + " " + o;
		  }
		  o++;
	  }
	  System.out.println("odd Numbers : " + odd);
	  System.out.println("++++++++++++++++++++++++++++++++++++++");
	  
	  
	  // example 7 - square of numbers till 10
	  
	  int e = 1;
	  while(e<=10) {
		  int sq = e*e;
		  System.out.println(sq);
		  e++;
	  }
	  System.out.println("++++++++++++++++++++++++++++++++++++++");
	  
	  // example 8 - even - square and odd - cube till 10 numbers
	  //ex- 1 4 27 16 125 36 343 64 729 100
	  
	  int y = 1;
	  String n = "";
	  while(y<=10) {
		  if(y%2==0) {
			  n = n + " " +  y*y;
		  }
		  else {
			  n = n + " " + y*y*y;
		  }
		  y++;
	  }
	  System.out.println("series - " + n);
	  System.out.println("++++++++++++++++++++++++++++++++++++++");
	  
	  // example 9 - reverse of number
	  int num = 123;
	  // 123 => 123%10=> 3,  12%10 => 2, 1%10 => 1
	  // r = 3, q = 12,   r = 2 , q = 1,  r=1, q=0
	  
	  int r = 0;
	  int rev=0;
	  while(num != 0 ) {
		  r = num%10;
		  rev = rev *10 + r;
		  num = num / 10;
	  }
	  System.out.println("Reverse no - " + rev);
	  
	  // num=123, r=3, rev=3, num=12 ,
	  // num=12, r=2, rev=3*10+2=32, num=1
	  // num=1, r=1, rev=32*10+1=321, num=0
	  System.out.println("++++++++++++++++++++++++++++++++++++++");
	  
	  
	  // example 10 - check number is palindrome  not
	  // ex. 121 => reverse => 121 = yes
	  // ex. 123 => reverse => 321 = not 
	  // ex. 1221 => reverse => 1221 => yes
	  // ex. 1224 => reverse => 4221 => no
	  
	  int u = 1223;
	  int r1 = 0;
	  int rev1=0;
	  int copy = u;
	  while(u != 0) {
		  r1 = u%10;
		  rev1 = rev1 *10 + r1;
		  u = u / 10;
	  }
	  if(rev1 == copy) {
		  System.out.println(copy + " is palindrome number ");
	  }
	  else {
		  System.out.println(copy + " is not palindrome number");
	  }
	}

}
