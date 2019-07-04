package pruefung2013_14;

public class SaftGetraenk extends Getraenk
{
	private double fruchtgehalt;
	
	public SaftGetraenk(String name, double menge, double preis, double fruchtgehalt) 
	{
		super(name, menge, preis);   // ???
		
		if(fruchtgehalt > 5.0 && fruchtgehalt < 50.0) 
		{
			this.fruchtgehalt = fruchtgehalt;
		}
		else 
		{
			this.fruchtgehalt = DEFAULTWERT;
		}
	}
	
	public void setFruchtgehalt(double fruchtgehalt) 
	{
		if(fruchtgehalt > 5.0 && fruchtgehalt < 50.0) 
		{
			this.fruchtgehalt = fruchtgehalt;
		}
	}
	
	public double getFruchtgehalt() 
	{
		return this.fruchtgehalt;
	}
	
	public String toString() 
	{
		
		return ("Name: " + name + "\n" + "Menge:" + menge +"\n" + "Preis: " + preis);
	}
}
