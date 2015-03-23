/** PersonApp.java reuses the instantiable class person.java
@author Talita
@date 21.02.2015*/


public class PersonApp{
	public static void main(String args[]){
		//declare a variable of type person
		//using a constructor
		Person p1;

		//create an object of type person
		p1 = new Person("Danny",true,26);
		p1.setName("Danny");

		//call/invoke a method on object p1
		p1.printDetails();

		Person p2 = new Person();
		p2.printDetails();







	}
}