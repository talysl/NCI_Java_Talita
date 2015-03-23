/** SumWhileDemo.java
	calculate the sum 1, n
@author tslima
@date 05.03.2015 */

import java.util.Scanner;
public class SumWhileDemo{
	public static void main(String args[]){

	//declare variables
	int n, sum, i;
	Scanner sc = new Scanner (System.in);

	System.out.println("Enter a value for n: ");
	n = sc.nextInt();

	sum = 0;
	i = 1; //initialization of the loop control variables

		while(i <= n){
		sum = sum + i; //add i to previous sum
		i = i + 1; //progression
		System.out.println("Calculating...");
		}

	//output
	System.out.println ("sum" + "=" + sum);

			sum = 0;
			for (int j = 0; j <= n; j++){
				sum = sum + j;
			}

	//output2
	System.out.println ("new sum" + "=" + sum);
	}
}