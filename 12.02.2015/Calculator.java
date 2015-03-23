/**
Calculator.java is an app to calculate basic calculus
@author talita
@date 12/02/2015
*/
public class Calculator {
	//declare instance variables
	//describe the states of the Calculator object
	private double result;
	private boolean isScientific = false;

	//implement or declare behaviour
	public void add(double n1, double n2){
		//perform the addiction
		result = n1 + n2;
		//output the result
		System.out.println(n1 + " + " + n2 + " = " + result);
	}

	public void sub(double number1, double number2){
		result = number1 - number2;
		System.out.println(number1 + " - " + number2 + " = " + result);
	}

	public void mult(double number1, double number2){
		result = number1 * number2;
		System.out.println(number1 + " * " + number2 + " = " + result);
	}

	public void div(double number1, double number2){
		result = number1 / number2;
		System.out.println(number1 + " / " + number2 + " = " + result);
	}

	public static void main(String args[]){
		//declare and create an object of type calculator
		Calculator myCalc = new Calculator();

		//declare variables
		double num1, num2;

		//store some values in the variables
		num1 = 6;
		num2 = 7;

		//call the methods of the calculator
		myCalc.add(num1,num2);
		myCalc.sub(num1,num2);
		myCalc.mult(num1,num2);
		myCalc.div (num1,num2);
	}
}
//P.S.: n1, number1, num1 are all the same number stored in different variables names. Also for n2, number2, num2.