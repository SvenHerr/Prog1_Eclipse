package IstiPruefung;

public class Hotelzimmer 
{
	public static int zaehleGanzzahligTeilbar(int feld[], int wert) 
	{
		int erg = 0;
		for(int i = 0; i < feld.length; i++) 
		{
			double temp = (double)feld[i] / wert; // 7 / 2 = 3,5
			int zahlenOhneKomma = (int) temp;  // 3
			double nurNachkommastellen = temp - zahlenOhneKomma; // 3,5 - 3 = 0,5
			
			if(nurNachkommastellen == 0) 
			{
				erg++;
			}
		}
		return erg;
	}
	
	public static void main(String [] args) 
	{
		int feld [] = {7,2,26,5,8,9,21,47,12,1};
		
		System.out.println();
		
		int wieVielGanzzahlige  = zaehleGanzzahligTeilbar(feld, 2);
		System.out.println("Ergebnis: " +wieVielGanzzahlige);	
		System.out.println();
		
		String a = "Hallo";
		String b = "Hallo";
		
		if(a.equals("Hallo")) 
		{
			System.out.println("ok");
		}
		if(a == b) 
		{
			System.out.println("auch ok");
		}	
	}
}
