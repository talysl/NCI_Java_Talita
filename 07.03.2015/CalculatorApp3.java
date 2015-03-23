import java.util.Scanner;
public class CalculatorApp3{
	public static void main (String args[]){

	//declare variables
	double n1,n2,result;
	Scanner sc;
	SimpleCalculator calculator;

	//create objects
	sc = new Scanner(System.in);
	calculator = new SimpleCalculator();

	String answer;

		do {
		//input
		System.out.println("Enter the first number: ");
		n1 = sc.nextDouble();

		System.out.println("Enter the second number: ");
		n2 = sc.nextDouble();

		calculator.setFirstNumber(n1);
		calculator.setSecondNumber(n2);
		calculator.multiply();
		System.out.println(calculator.getResult());

		System.out.println("Enter yes to continue, anything else to stop the program");
		answer = sc.next();

		//convert to lower case to test the condition
		answer = answer.toLowerCase();
			}while (answer.equals("yes"));

			System.out.println ("Program finished...");
	}
}