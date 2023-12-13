
//Code calculates the fibonacci number a certain index

import java.util.Scanner;

public class Fibonacci{

	public static void main(String[] args){
		Scanner input=new Scanner(System.in);

		//read the index
		System.out.print("Enter the index: ");
		int n=input.nextInt();

		//call the method
		System.out.println("Fibonacci number at the index "+n+" is "+fibonacci(n));

		

	}

	public static int fibonacci(int n){
		if(n==0){
			return 0;
		}
		else if(n==1){
			return 1;
		}
		else{
			return fibonacci(n-2)+fibonacci(n-1);
		}
	}

}
