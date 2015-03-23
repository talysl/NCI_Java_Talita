/**
Numbers.java arithmetic operations with double and int
@author talita
@date 14/02/2015
*/

public class Numbers{
	public static void main (String args[]){

	//declare variables
	int iNum1, iNum2;
	double dNum1, dNum2, dResult;

	//assign values to the variables
	iNum1 = 5;
	iNum2 = 2;
	dNum1 = 7;
	dNum2 = 3;

	//double division
	dResult = dNum1 / dNum2;
	System.out.println(dResult);

	//declare an int variables
	int iResult;

	//addition with mixed data types - making a conversion
	iResult = iNum1 + (int)dNum1;
	System.out.println(iResult);

	dResult = iNum1 + dNum1;
	System.out.println(dResult);

	//integer division
	dResult = iNum1/iNum2;
	System.out.println(dResult);

	//converting variables
	dResult = (double)iNum1/iNum2;
	System.out.println(dResult);

	//round will round the number to the closest int number
	dResult = Math.round(1.2);
	System.out.println(dResult);
	dResult = Math.round(5.7);
	System.out.println(dResult);

	//ceil will always round the number to a number above
	dResult = Math.ceil(1.2);
	System.out.println(dResult);
	dResult = Math.ceil(5.7);
	System.out.println(dResult);

	//floor will always round the number to a number below
	dResult = Math.floor(1.2);
	System.out.println(dResult);
	dResult = Math.floor(5.7);
	System.out.println(dResult);
	}
}