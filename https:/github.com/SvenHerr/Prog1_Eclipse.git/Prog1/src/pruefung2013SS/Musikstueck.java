package pruefung2013SS;

public class Musikstueck 
{
	private String interpret;
	private String liedname;
	private int laenge;
	
	public static int STANDARTLAENGE = 240;
	
	public Musikstueck(String interpret, String liedname, int laenge) 
	{
		if(laenge > 60 && laenge < 600) 
		{
			this.laenge = laenge;
		}
		else 
		{
			this.laenge = STANDARTLAENGE;
		}
		this.interpret = interpret;
		this.liedname = liedname;
	}
	public int getLaenge() 
	{
		return this.laenge;
	}
	public String getInterpret() 
	{
		return this.interpret;
	}
	public void setLaenge(int laenge) 
	{
		if(laenge > 60 && laenge < 600) 
		{
			this.laenge = laenge;
		}
	}
}
