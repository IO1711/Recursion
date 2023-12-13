
//Code calculates the factorial of numbers

import java.util.Scanner;

public class Recursion{

	public static void main(String[] args){
	
	int n;

	//Read the number
	System.out.print("Number: ");
	Scanner input=new Scanner(System.in);
	n=input.nextInt();
	
	//Call the method to calculate the factorial
	System.out.println(n+"! is: "+factorial(n));

	xMethod(1234567);

	}

	public static int factorial(int n){

		if(n==0){
			return 1;
		}
		else{
			return n*factorial(n-1);

		}
	}

	public static void xMethod(int n) {
		if (n > 0) {
			System.out.print(n % 10);
			xMethod(n / 10);
		}
}
}