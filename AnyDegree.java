
//This code finds the degree of a number using recursion


import java.util.Scanner;

public class AnyDegree{

	public static void main(String[] args){
	
	Scanner input=new Scanner(System.in);

	//Read the number
	System.out.print("Enter the number: ");
	double x=input.nextDouble();

	//Read the degree
	System.out.print("Eneter the degree: ");
	int n=input.nextInt();
	
	//Call the method to calculate the degree
	System.out.println(x+" powered to "+n+" is "+anyDegree(x, n));
	
	}

	public static double anyDegree(double x, int n){
		
		if(n==0){
			//return 1.0 when the degree is 0
			return 1.0;
		}
		else{

			//call the method with one less degree if the degree is not 0
			return x*anyDegree(x, n-1);
		
		}
	}


}