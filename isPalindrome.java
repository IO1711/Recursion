
//This code checks the word if it is a palindrome and shows the reverse of the word

import java.util.Scanner;

public class isPalindrome{

	public static void main(String[] args){
		Scanner input=new Scanner(System.in);

		//Read the word
		System.out.print("Enter a word: ");
		String n=input.nextLine();
		
		//call the first method to check the word
		if(checkPalindrome(n))
			System.out.println(n+" is a palindrome");
		else
			System.out.println(n+" is not a palindrome");

		//call the second method to print the reverse of the word
		reverseString(n);
		

	}

	//method to check the word
	public static boolean checkPalindrome(String n){
		
		if(n.length()<=1)
			return true;
		else if(n.charAt(0)!=n.charAt(n.length()-1))
			return false;
		else
			return checkPalindrome(n.substring(1, n.length()-1));
	}


	//method that prints the reverse of the word
	public static void reverseString(String n){
		if(n.length()!=1){
		
			System.out.print(n.charAt(n.length()-1));
			
			reverseString(n.substring(0, n.length()-1));
		}
		else{
			System.out.println(n);
		}
		

	}

}

