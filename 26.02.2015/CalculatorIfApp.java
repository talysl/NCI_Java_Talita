/** CalculatorIfApp.java
	computes the user's selected operation
	reuse instantiable classes
@author tslima
@date 26.02.2015 */

//the choice of the user will be defined by typing a number for each operation
//e.g.: 1 - addiction, 2 - subtract, etc... So, we will use the condition if/else to perform the app
import java.util.Scanner;
public class CalculatorIfApp{
	public static void main(String args[]){
	//declare variables
	double n1, n2, result;
	//declare a variable to store the user's choice
	int operation;

	//declare and create an object of type Scanner
	Scanner sc = new Scanner(System.in);

	//declare and create an object of type SimpleCalculator
	SimpleCalculator calculator = new SimpleCalculator();

	//tell the user to input an option
	System.out.println("Please, enter an operation by specified below:");
	System.out.println("1. Addiction");
	System.out.println("2. Subtract");
	System.out.println("3. Multiply");
	System.out.println("4. Divide");
	System.out.print("Operation: ");

	//read the input from the user
	operation = sc.nextInt();

	//prompt the user to provide the 2 numbers
	System.out.println("Enter the first number:");
	n1 = sc.nextDouble();
	System.out.println("Enter the second number:");
	n2 = sc.nextDouble();

	//use setter methods to store in the instantiable variable
	calculator.setFirstNumber(n1);
	calculator.setSecondNumber(n2);

	//selection statement based on the user's choice
	//user's choice stored in the variable operation
	if(operation == 1){
		calculator.add();
		System.out.println(calculator.getResult());
		} else if (operation == 2){
			calculator.subtract();
			System.out.println(calculator.getResult());
			}else if (operation == 3){
				calculator.multiply();
				System.out.println(calculator.getResult());
				} else if (operation == 4){
					calculator.divide();
					System.out.println(calculator.getResult());
					}else{
					System.out.println("Selected operation is not valid.");
					}
		System.out.println("Program Finished.");
	}
}