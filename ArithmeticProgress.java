

//This code calculates the sum of the all integers until n


import java.util.Scanner;

public class ArithmeticProgress{

	public static void main(String[] args){
		Scanner input=new Scanner(System.in);

		//Read the number
		System.out.print("Enter the number: ");
		int number=input.nextInt();

		//call the method to calculate
		System.out.println("Sum of the integers until "+number+" is "+progress(number));

	}

	public static int progress(int n){
		if(n==1){
			//return 1 when the number is 1
			return 1;
		}

		else{

			//call the method with the integer that comes before n
			return n+progress(n-1);
		}
	}

}