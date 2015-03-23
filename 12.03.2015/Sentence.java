/*Setence.java
@author Talita
@date 12.03.2015*/

public class Sentence{
	//declare instance variables
	String sentence;
	private int counter;

	public Sentence(){
		sentence = "";
	}

	public Sentence(String mySentence){
		sentence = mySentence;
	}

	public void computeWordCount(){
		//declare and initialize the counter
		int index = 0;
		int len = sentence.length();
		while(index < len){//condition
			//processing
			char c = sentence.charAt(index);
			//check whether the character is a space
			if (c == ' '){
				counter++;//we have just seen a word
			}
			//progression
			index++;
		}
		counter++; // add 1 for the last word
	}

}