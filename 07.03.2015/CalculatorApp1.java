import java.util.Scanner;
public class CalculatorApp1{
	public static void main (String args[]){

	//declare variables
	double n1,n2,result;
	Scanner sc;
	SimpleCalculator calculator;

	//create objects
	sc = new Scanner(System.in);
	calculator = new SimpleCalculator();

		for (int i=1; i<=3; i++){
		//input
		System.out.println("Enter the first number: ");
		n1 = sc.nextDouble();

		System.out.println("Enter the second number: ");
		n2 = sc.nextDouble();

		calculator.setFirstNumber(n1);
		calculator.setSecondNumber(n2);

		//tell the calculator to perform the operation
		calculator.multiply();

		//output
		System.out.println(calculator.getResult());
		}
	}
}