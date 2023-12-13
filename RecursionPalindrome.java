

//Code checks words if they are palindrome or not using recursion with a helper method

import java.util.Scanner;

public class RecursionPalindrome{

	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a word: ");
		String n=input.nextLine();
		
		
		if(checkPalindrome(n))
			System.out.println(n+" is a palindrome");
		else
			System.out.println(n+" is not a palindrome");
		
		

	}

	public static boolean checkPalindrome(String n){
		
		return isPalindrome(n, 0, n.length()-1);
	}

	public static boolean isPalindrome(String n, int low, int high){
		if(high<=low){
			return true;
		}
		else if(n.charAt(low)!=n.charAt(high)){
			return false;
		}
		else
			return isPalindrome(n, low+1, high-1);

	}

}

