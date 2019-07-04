package uebungsblatt11;

public class Auto 
{
	private String marke;
	private double hubraum;
	private String farbe;
	private int ps;
	
	public Auto(String marke, double hubraum, String farbe, int ps) 
	{
		this.marke = marke;
		this.hubraum = hubraum;
		this.farbe = farbe;
		this.ps = ps;
	}
	
	public double getHubraum() 
	{
		return this.hubraum;
	}
}
