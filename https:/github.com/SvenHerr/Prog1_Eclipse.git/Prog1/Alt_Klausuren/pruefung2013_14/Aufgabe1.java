package pruefung2013_14;

public class Aufgabe1 
{
	public static boolean istZweistellig(int zahl) 
	{
		if(zahl < 0) 
		{
			zahl = zahl * (-1);
		}
		
		if(zahl < 100 && zahl > 10) 
		{
			return true;
		}else 
		{
			return false;
		}
	}
	
	public static void main(String[] args) 
	{
		System.out.println(istZweistellig(9)); 		// false
		System.out.println(istZweistellig(-9)); 	// false
		
		System.out.println(istZweistellig(15)); 	// true
		System.out.println(istZweistellig(-15)); 	// true
		
		System.out.println(istZweistellig(99));		// true
		System.out.println(istZweistellig(-99));	// true
		
		System.out.println(istZweistellig(100));	// false
		System.out.println(istZweistellig(-100));	// false
	}
}
