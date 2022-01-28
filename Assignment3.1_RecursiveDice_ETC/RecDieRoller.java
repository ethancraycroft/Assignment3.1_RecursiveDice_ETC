/*********************************************************************
// RecDieRoller.java   Data Structures
//
/* Die Roller class that rolls a die until the result is a 2 - keeps count of number of rolls until a 2 is rolled
* @author Ethan Craycroft
* @version 1.0
* Assignment 3.1
* CS-215-ON Spring 2022
//********************************************************************
*/
import java.util.Random;

public class RecDieRoller 
{
	int count = 1;
	int tempCount = 0;
	
	/**
	 * This method rolls the die until a 2 is the result
	 * @return tempCount - the number of rolls it takes to roll a 2
	 */
	public int roll()
	{
		Random random = new Random();
		int dieFace = random.nextInt(6) + 1;
		System.out.println(dieFace);
		if(dieFace == 2)
		{
			System.out.println("Number of rolls: " + count);
			tempCount = count;
			count = 1;
			return tempCount;
		}
		else
		{
			count++;
			roll();
		}
		return tempCount;
	}//end roll
	
}//end class

