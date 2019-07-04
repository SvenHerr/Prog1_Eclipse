package pruefung2015;

public class Aufgabe1 
{
	public static double berechneProzent(int zahl1, int zahl2) 
	{
		if(zahl1 < 0 || zahl2 < 0) 
		{
			return -1.0;
		}
		
		return ((zahl1/100.0) * zahl2);
	}
	
	public static void main(String[]args) 
	{
		System.out.println(berechneProzent(250, 10));
		System.out.println(berechneProzent(250, -10));
		System.out.println(berechneProzent(30, 5));
	}
}
