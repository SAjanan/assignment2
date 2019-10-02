package assignment2;

import java.util.Scanner;

 public class q7 {
	public static void main(String args []) {
	
	System.out.println("Enter the word(without space) : ");
	
	Scanner sc = new Scanner(System.in);
	String str= sc.next();
		int count=0;
	for(int i=0; i<str.length(); i++){
		if(str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I' || str.charAt(i)=='O' || str.charAt(i)=='U' || str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u' || str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I' || str.charAt(i)=='O' || str.charAt(i)=='U'){
			
			count++;
			}
		}
	System.out.println("Number of vowels are : "+count);
	int cons=str.length()-count;
	System.out.println("Number of consonants are : "+cons);

	}
}
