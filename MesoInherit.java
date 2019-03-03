public class MesoInherit extends MesoAbstract
{
	
	public MesoInherit(MesoStation meso)
	{
		super(meso);
	}
	
   public int[] getAvg()
   {
	   int floor; 
	   int ceiling;
	   int average;
	   
	   double sum = 0;
	   
	   char[] station  = MesoStat.toCharArray();
	   for (int i = 0; i < STATION_LENGTH; i++) 
	   {
		   sum+= (int) station[i];
	   }
	   
	   sum = sum/STATION_LENGTH;
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
	   
	   int[] intArr = new int[3];
	   intArr[0] = ceiling;
	   intArr[1] = floor;
	   intArr[2] = average;
	   
	   return intArr;
   }
   
   public char getLetter()
   {
	   int[] intArr = this.getAvg();
	   char average = (char) intArr[2];
	   return average;
   }
}//TODO