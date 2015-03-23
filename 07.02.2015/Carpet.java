/**
Carpet.java Calculus of the price of a carpet per m^2
@author talita
@date 07/02/2015
*/

import java.util.Scanner;
public class Carpet {
	public static void main (String args[]){

		//declarate variables
		double length;
		double width;
		double area;
		double priceMeter;
		priceMeter = 6.45;
		double total;
		Scanner keyboard;

		//create an instance of type scanner
		keyboard = new Scanner (System.in);

		//input
		System.out.println("Please type the length of the room:");
		length = keyboard.nextDouble();
		System.out.println("and the width of the room:");
		width = keyboard.nextDouble();

		//process
		area = length * width;
		total = priceMeter * area;

		//output
		System.out.println("Your carpet will cost: " + total + " euros.");
	}
}