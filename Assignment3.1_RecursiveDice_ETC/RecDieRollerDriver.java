/*********************************************************************
// RecDieRollerDriver.java   Data Structures
//
/* Die Roller Driver class that rolls for a 2 a given number of times. The average number of rolls per 2 is calculated
* @author Ethan Craycroft
* @version 1.0
* Assignment 3.1
* CS-215-ON Spring 2022
//********************************************************************
*/
public class RecDieRollerDriver 
{
	public static void main(String[]args)
	{
		double total=0;
		int count = 0;
		RecDieRoller dice = new RecDieRoller();
		while(count < 1000)
		{
			total+= dice.roll();
			count++;
		}
		System.out.println("Total number of rolls: " + (int)total);
		System.out.println("The mean number of rolls to roll a 2 out of 1000 iterations was: " + (total/1000));
	}//end main
}//end class
