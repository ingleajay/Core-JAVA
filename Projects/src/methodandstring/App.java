package methodandstring;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("::Welcome to Text Util Application:: \n");
		System.out.println("Enter your string");
		String str = sc.nextLine();
		System.out.println("\n1.Upper Case \n2.Lower Case \n3.Sentence Case  \n4.Title case  \n5.Find word"
				+ " \n6.Find charcters \n7.Find digit in text \n8.Exit \n");
		while(true) {
			System.out.println("Enter your choice");
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1 : 
				   String upper = TextUtil.uppercase(str);
				   System.out.println("Upper Case : " + upper);
				   System.out.println(" ");
				   break;
			case 2 : 
				   String lower = TextUtil.lowercase(str);
				   System.out.println("Lower Case : " + lower);
				   System.out.println(" ");
				   break;
			case 3 : 
				   String sentence = TextUtil.sentencecase(str);
				   System.out.println("Sentence Case : " + sentence);
				   System.out.println(" ");
				   break;
			case 4 : 
				   String title = TextUtil.titlecase(str);
				   System.out.println("Title Case : " + title);
				   System.out.println(" ");
				   break;
			case 5 : 
				   int word = TextUtil.wordcase(str);
				   System.out.println("Count word : " + word);
				   System.out.println(" ");
				   break;
			case 6 : 
				   int charcter = TextUtil.charcase(str);
				   System.out.println("Count character : " + charcter);
				   System.out.println(" ");
				   break;
			case 7 : 
				   String digits = TextUtil.digitcase(str);
				   System.out.println("Find digits : " + digits);
				   System.out.println(" ");
				   break;
			case 8 : 
				   System.out.println("Application closed..");
				   System.exit(0);
				   break;
		    default:
		    	System.out.println("You have enter incorrect option");
		    	System.out.println(" ");
			}
		}
	}

}
