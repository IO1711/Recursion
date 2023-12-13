
//Code calculates the degree of the number 2

import java.util.Scanner;

public class DegreeTwo{

	public static void main(String[] args){
	
	Scanner input=new Scanner(System.in);

	//read the degree
	System.out.print("Enter the degree: ");
	int n=input.nextInt();

	//call the method to calculate
	System.out.println("2 powered to "+n+" is "+twoDegree(n));

	input.close();
	
	}

	public static int twoDegree(int n){
		if(n==0){
			return 1;
		}
		else{
			return 2*twoDegree(n-1);

		}
	}


}