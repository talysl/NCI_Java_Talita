/**
Multiplier.java multiply two numbers
@author talita
@date 05/02/2015
*/
public class Multiplier {
	public static void main(String args[]){
		//declare a variable to store the first number
		//declare and initialize a variable
		double n1 = 40.55;
		//declare another variable to store the second variable
		int n2;
		//assigning a value to the variable
		n2 = 194;
		double result;

		//processing
		result = n1 * n2;

		//output
		//display the result of multiplication
		System.out.print(n1);
		System.out.print("*");
		System.out.print(n2);
		System.out.print("=");
		System.out.println(result);

		//another way the same information
		System.out.println(n1 + " * " + n2 + "=" + result);

		//declare an integer constant
		final int NUMBER_OF_JAVA_CLASSES = 4;
		System.out.println(NUMBER_OF_JAVA_CLASSES);
		}
}