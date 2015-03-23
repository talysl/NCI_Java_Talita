/**PigLatin1.java move the first letter to the end of the word and add the "ay" to the end
@author Talita Lima
@date 21.03.2015
*/

import java.util.Scanner;
public class PigLatin1{
	public static void main (String args[]){
		//declare variables
		String word;
		StringBuffer buffer;
		Scanner sc = new Scanner(System.in);

		//create the object of type StringBuffer
		buffer = new StringBuffer();

		//input
		//prompt to the user to provide a word
		System.out.println("Enter a word");
		word = sc.next(); //read a word

		//processing
		//reverse our word from the second letter adding it to the end of the word
		int len = word.length();
		for (int i = 1; i < len; i++){
			//retrieve one character
			char letter = word.charAt(i);

			//add the character to the buffer
			buffer.append(letter);//our buffer that was empty, now will add the new character to the end
		}

		//"appyh"
		//add the first character to the buffer
		//retrieve first letter of the word
		char firstLetter = word.charAt(0);
		buffer.append(firstLetter);

		//append the "ay" at the end of the translation
		buffer.append("ay");

		//convert the translated word to a string
		String translateWord = buffer.toString();

		//output
		System.out.println("Translated word: " + translateWord);
	}

}