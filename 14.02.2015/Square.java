/**
Square.java calculus of a square area and ask the user to give an input
@author talita
@date 07/02/2015
*/
//when you need to ask an input for the user you use fist of all this line of code
import java.util.Scanner;
public class Square {
	public static void main(String args[]){
		 int length;
		 int area;
		 //the class name Scanner plus the name of variable which is assigned a reference to an object of type
		 //scanner SC plus the argument in this case is systemin
		 Scanner sc = new Scanner(System.in);
		 //you must give a text for the user to give the input
		 System.out.println ("Enter the length of a side of a square: ");
		 length=sc.nextInt();
		 area = length * length;
		 System.out.println("If you have a length" + " = " + length);
		 System.out.println("calculating " + length + " * " + length + " = " + area);
		 System.out.println("So, your area will be " + area);
	}
}