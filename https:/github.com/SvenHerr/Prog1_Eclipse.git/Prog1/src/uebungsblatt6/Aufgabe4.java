package uebungsblatt6;

public class Aufgabe4 
{
	public static void main(String[] args) 
	{
		System.out.println(berechnePotenz(7.0, 5));
	}
	public static double berechnePotenz(double zahl, int potenz) 
	{
		double erg = 1.0;
		for(int i = 1; i <= potenz; i++) 
		{
			erg = erg * zahl;
		}	
		return erg;
	}
}
