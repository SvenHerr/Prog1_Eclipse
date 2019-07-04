package pruefung2013_14;

public class Getraenk 
{
	private String name;
	private double menge;
	private double preis;
	
	public static final double DEFAULTWERT = -1.0;

	public Getraenk(String name, double menge, double preis) 
	{
		this.name = name;
		if(menge > 0 && menge <= 1.0) 
		{
			this.menge = menge;
		}
		else 
		{
			this.menge = DEFAULTWERT;
		}
		
		if(preis >= 1.0 && preis <= 8.0) 
		{
			this.preis = preis;
		}
		else 
		{
			this.preis = DEFAULTWERT;
		}
	}
	
	public void setMenge(double menge) 
	{
		if(menge > 0 && menge <= 1.0) 
		{
			this.menge = menge;
		}
	}
	
	public void setPreis(double preis) 
	{
		if(preis >= 1.0 && preis <= 8.0) 
		{
			this.preis = preis;
		}
	}
	public String toString() 
	{
		return ("Name: " + name + "\n" + "Menge:" + menge +"\n" + "Preis: " + preis);
	}
}
