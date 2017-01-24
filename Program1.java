//jorge Berroa
//j3354457
//
import java.io.*;


public class Program1 {


   public static void main(String [] args) {
	   int array[]=new int[5];
	   int total=CantHasSum(array);  // no need to worry about this it wont be run anyways as the professor said...
	   System.out.println(total);
   }
	public static int CantHasSum(int [] array) 
	{
		int sum=1;
		if(array[0]>1||array==null||array[0]==0) // checking to see if i have to check the array if not return 1 for these cases 
			return 1;
		for(int i=1;i<array.length;i++) // loop through the array if the sum+2 is greater than the array index keep adding all the nubers else return sum+1 
		{
			if(array[i]>=sum+2)
				return sum+1;
			sum+=array[i];
		}
		return sum+1; // if there are no possibilities of having the lowest sum in the array add 1 to the sum and return 
	}
	public static int difficultyRating() 
	{
    	return 3;  // only rated 3 because i rounded it up but i thought it was more of a 2.6 or 2.7
	}
}