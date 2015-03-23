/**
Challenge66.java
@author talita
@date 21/02/2015
*/

import java.util.Scanner;

public class Challenge66{
	public static void main (String args []){

	//input
	//declaring variables
	double velocity, timeTotal;
	double maxHr = 15.00;
	int blockNum, membNum, memBlocks;
	int leng = 3945;

	//creating a new object to get data from the user
	Scanner keyboard;
	keyboard = new Scanner (System.in);
	System.out.println("Please, enter the speed: ");
	velocity = keyboard.nextDouble();
	System.out.println("Please, enter the number of teammembers: ");
	membNum = keyboard.nextInt();

	//creating a new object Route66
	Route66 performRoute;
	performRoute = new Route66();

	//calling/invoking an method from the object route66 -- setter methods
	performRoute.setSpeed(velocity);
	performRoute.setMembersNum(membNum);

	//process
	performRoute.completeTime();
	timeTotal = performRoute.getTotalTime();

	performRoute.numberBlocks();
	blockNum = (int)performRoute.getBlockNumbers();

	performRoute.fullBlocks();
	memBlocks = (int)performRoute.getMemberBlocks();

	//output
	System.out.println("Your team total time will be: " + timeTotal);
	System.out.println("Your team number of full blocks will be:" + blockNum);
	System.out.println("The number of blocks each team member will perform: " + memBlocks);
	}
}