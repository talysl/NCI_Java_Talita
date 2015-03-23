/**
GreetUser.java takes input from user
@author talita
@date 07/02/2015
*/

import java.util.Scanner;
public class GreetUser {
	public static void main (String args[]){
		//declare variable
		String name;
		int age;
		Scanner keyboard;

		//create an object of Scanner class
		keyboard = new Scanner(System.in);

		//input
		//prompt the user to input his name
		System.out.println("Enter your first name: ");
		name = keyboard.next();
		System.out.println("Enter your age: ");
		age = keyboard.nextInt();

		//output
		System.out.println("Hello " + name + "!");
		System.out.println("You're " + age + " years-old.");
	}
}