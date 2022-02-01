package controlstatement;

import java.util.Scanner;

public class StarMenuDrivenProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("::Welcome to Star Menu driven code:: \n");
		System.out.println("Enter no of rows and columns ( square matrix ) : ");
		int no = sc.nextInt();
		while(true) {
			System.out.println("1.Left Star pattern \n2.Right Star Pattern \n3.Pyramid Star Pattern \n4.Exit\n");
			System.out.println("Enter your choice");
			int choice = sc.nextInt();
			int row, col, space;
			for(row=1;row<=no;row++) {
				for(space=1;space<=no-row;space++) {
					if(choice==1 || choice==3) {
						System.out.print(" ");
					}
				}
				for(col=1;col<=row;col++) {
					if(choice==1 || choice == 2) {
					  System.out.print("*");
					}
					else if(choice == 3) {
						System.out.print(" *");
					}
				}
				System.out.println();
			}
			if(choice == 4) {
				System.exit(0);
			}
		}
	}
}



        