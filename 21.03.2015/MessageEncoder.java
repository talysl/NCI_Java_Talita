/**MessageEncoder.java instantiable class
@author Talita Lima
@date 21.03.2015
*/

public class MessageEncoder{
	//instace variables
	private String message;
	private String encodedMessage;

	//declare constructor
	public MessageEncoder(){
		message = " ";
		encodedMessage = " ";
	}

	//declare a setter method
	public void setMessage(String aMessage){
		message = aMessage;
	}

	//declare a getter method
	public String getEncodedMessage(){
		return encodedMessage;
	}

	//declare processing which encodes the message
	public void encodeMessage(){
		//declare a local variable
		StringBuffer buffer = new StringBuffer(); //string buffer to be able to manipule the words
		//traverse the message
		int len = message.length();
		for(int i = len - 1; i>= 0; i--){
			//retrieve a letter
			char letter = message.charAt(i);
			switch (letter){
				case 'a':
				case 'A':
					buffer.append(1);
					break;

				case 'e':
				case 'E':
					buffer.append(5);
					break;

				case 'i':
				case 'I':
					buffer.append(9);
					break;

				case 'o':
				case 'O':
					buffer.append(15);
					break;

				case 'u':
				case 'U':
					buffer.append(21);
					break;

				default:
					buffer.append(letter);
					break;
			}
		}
	encodedMessage = buffer.toString();
	}
}