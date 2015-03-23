/**
Route66.java instantiable class
@author talita
@date 21/02/2015
*/

public class Route66{

	//declaring and initializing instant variables
	private double speed;
	private double totalTime;
	private double maxHours = 15.00;
	private int length = 3945;
	private int blockNumbers;
	private int membersNum;
	private int memberBlocks;

	//declaring setter methods
	//data from the user
	public void setSpeed (double speed){
		this.speed = speed;
		}

	public void setMembersNum (int membersNum){
		this.membersNum = membersNum;
		}

	//declaring methods
	//to compute the time will take to complete
	public void completeTime(){
		totalTime = (double)length * speed;
		}

	//to compute number of full 15hours blocks to be cycled
	public void numberBlocks(){
		blockNumbers = (int)(totalTime/maxHours);
		}

	//number of full blocks each team member will cycle
	public void fullBlocks(){
		memberBlocks = blockNumbers/membersNum;
		}

	//declaring getter methods
	public double getTotalTime(){
		return totalTime;
		}

	public double getBlockNumbers(){
		return blockNumbers;
		}

	public double getMemberBlocks(){
		return memberBlocks;
		}

}