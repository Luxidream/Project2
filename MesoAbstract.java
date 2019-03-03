public abstract class MesoAbstract 
{
	protected String MesoStat;
	final int STATION_LENGTH = 4;
	
   public MesoAbstract(MesoStation meso) 
   {
	 MesoStat = meso.getStID();  
   }
   public abstract int[] getAvg();
   public abstract char getLetter();

}
