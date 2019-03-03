import java.io.IOException; 

public class Main 
{
	public static void main(String[] args) throws IOException 
	{
		String StID = "CDDE";
		MesoInherit mesoinherit = new MesoInherit(new MesoStation(StID));
		
		System.out.println("Ascii Ceiling is: " + mesoinherit.getAvg()[0]
			+ ", Ascii Floor is: " + mesoinherit.getAvg()[1]
				+ ", Ascii Average is: " + mesoinherit.getAvg()[2]
					+ ", and Letter Avg is: " + mesoinherit.getLetter());
	}
}