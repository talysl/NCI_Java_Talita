/**
SimpleCalculator.java instantiable class
@author talita
@date 19/02/2015
*/
public class SimpleCalculator {
	//declare the instance variables
	private double firstNumber;
	private double secondNumber;
	private double result;

	//only for variables that get input from the user
	//declare setter methods -- one method for each variable
	public void setFirstNumber(double firstNumber){
	this.firstNumber = firstNumber;
	}

	//declare setter method
	//without use "this"
	public void setSecondNumber(double number2){
	secondNumber = number2;
	}

	//declare a method to do the multiplication
	public void multiply(){
		//computation/processing
		result = firstNumber*secondNumber;
	}

	//declare a method for the division
	public void divide(){
		result =firstNumber/secondNumber;
	}

	//define getter methods
	public double getResult(){
		//to "throw out" the result
		return result;
	}
}