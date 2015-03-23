/**
InteractiveMultiplier.java prompt the user to input numbers and multiply them
@author talita
@date 07/02/2015
*/

import java.util.Scanner;
public class InteractiveMultiplier {
	public static void main(String args[]){
		double n1;
		double n2;
		double result;
		Scanner userInput;

		//create an instance of type scanner
		userInput = new Scanner (System.in);

		//input
		System.out.println("Enter the first number: ");
		n1 = userInput.nextDouble();
		System.out.println("Enter the second number: ");
		n2 = userInput.nextDouble();

		//process
		result = n1 * n2;

        //output
		System.out.println(n1 + " * " + n2 + " = " + result);
	}
}