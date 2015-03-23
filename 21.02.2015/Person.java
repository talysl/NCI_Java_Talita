/** Person.java -- an instantiable class
@author Talita
@date 21.02.2015*/

public class Person {
	//declare instance variables
	private String name;
	private int age;
	private boolean enjoysReading;

	//creating constructors
	public Person(){
	}

	public Person(String name, boolean enjoysReading, int age){
		this.name = name;
		this.age = age;
		this.enjoysReading = enjoysReading;
	}

	//overload constructors
	public Person (String name){
		this.name = name;
	}

	public Person (String name, int age){
		this.name = name;
		this.age = age;
	}

	public Person (int age, String name){
		this.age = age;
		this.name = name;
	}

	//declare a setter for the name
	public void setName(String name){
		this.name = name;
	}


	public void printDetails(){
		//display a person's details
		System.out.println(name);
		System.out.println(age);
		System.out.println(enjoysReading);

	}
}