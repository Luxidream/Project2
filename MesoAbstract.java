public abstract class MesoAbstract 
{
	protected String MesoStat;
	//We don't care about any station length that isn't 4
	final int STATION_LENGTH = 4;
	
   public MesoAbstract(MesoStation meso) 
   {
	 MesoStat = meso.getStID();  
   }
   //MesoInherit will implement these abstract methods
   public abstract int[] getAvg();
   public abstract char getLetter();

}
