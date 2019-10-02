package assignment2;

import java.util.Scanner;

public class q6 {
	public static void main (String args []) {
		
	
	System.out.println("----Using IF ELSE statements-----");
	System.out.println("Enter a character : ");
	Scanner sc = new Scanner(System.in);
	char ch = sc.next().
			charAt(0);
	if (ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' || ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
	System.out.println("Given character is an vowel");
	}
	else 
		System.out.println("Given character is a consonant");
	
	
	System.out.println();
	
	System.out.println("------using SWITCH CASE statements-------");
	
	
	switch (ch) {
	case'A' : System.out.println("Given character is an vowel");break;
	case'E' : System.out.println("Given character is an vowel");break;
	case'I' : System.out.println("Given character is an vowel");break;
	case'O' : System.out.println("Given character is an vowel");break;
	case'U' : System.out.println("Given character is an vowel");break;
	case'a' : System.out.println("Given character is an vowel");break;
	case'e' : System.out.println("Given character is an vowel");break;
	case'i' : System.out.println("Given character is an vowel");break;
	case'o' : System.out.println("Given character is an vowel");break;
	case'u' : System.out.println("Given character is an vowel");break;
	default: System.out.println("Given character is a consonant");
	
	
	
	}
	
	
	}
}
