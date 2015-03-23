/**
CalculatorApp.java reuse the instantiable class SimpleCalculator to perform the arithmedic operation
@author talita
@date 19/02/2015
*/

import java.util.Scanner;
public class CalculatorApp{
	public static void main(String args[]){
	//input
	//declare variables
	double num1, num2, res;
	//declare a variable of type scanner
	Scanner key;
	//create an object/instance of type scanner
	key = new Scanner(System.in);
	System.out.println("Enter a number: ");
	num1 = key.nextDouble();
	System.out.println("Enter another number: ");
	num2 = key.nextDouble();

	//processing
	//declare a variable named calculator of type Simple Calculator
	SimpleCalculator calculator;
	//create an object/instance of type simple calculator
	calculator = new SimpleCalculator();

	//give/store the input values in the instance calculator
	//use the setter methods
	calculator.setFirstNumber(num1);
	calculator.setSecondNumber(num2);

	//perform multiplication
	calculator.multiply();

	//output
	//use getter method to get the result from instance variable simple calculator
	res = calculator.getResult();
	System.out.println(res);
	}
}