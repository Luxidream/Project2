public class MesoInherit extends MesoAbstract
{
	
	public MesoInherit(MesoStation meso)
	{
		/*
		 * The abstract class's constructor handles this by assigning a value to MesoStat
		 */
		super(meso);
	}
	
   public int[] getAvg()
   {
	   int floor; 
	   int ceiling;
	   int average;
	   
	   double sum = 0;
	   
	   /*
	    * Convert the station ID to a char array. We then iterate over the char array, typecasting each value to an 
	    * int and incrementing a "sum" variable by these values.
	    */
	   
	   char[] station  = MesoStat.toCharArray();
	   for (int i = 0; i < STATION_LENGTH; i++) 
	   {
		   sum+= (int) station[i];
	   }
	   
	   //Find the average
	   sum = sum/STATION_LENGTH;
	   
	   /*
	    * Here we use two different rounding methods to determine the floor and ceiling, truncation and Math.round.
	    * Math.round will round to the nearest integer, while truncation does exactly what it says on the tin.
	    */
	   
	   floor = (int) sum;
	   ceiling = (int) Math.round(sum);
	   
	   /*
	    * If the floor is the same as the ceiling, then the number was rounded down.
	    */
	   if (floor == ceiling) 
	   {
		   ceiling++;
		   average = floor;
	   }
	   /*
	    * Otherwise, it was rounded up, and the correct average should be so as well.
	    */
	   
	   else 
	   {
		   average = ceiling;
	   }
	   
	   /*
	    * Assign values to int array before returning
	    */
	   
	   int[] intArr = new int[3];
	   intArr[0] = ceiling;
	   intArr[1] = floor;
	   intArr[2] = average;
	   
	   return intArr;
   }
   
   public char getLetter()
   {
	   /*
	    * First, we use the previous method to obtain the average for this station.
	    */
	   
	   int[] intArr = this.getAvg();
	   
	   /*
	    * Then, this task can be easily completed by typecasting the average to a character.
	    */
	   
	   char average = (char) intArr[2];
	   return average;
   }
}//TODO