package uebungsblatt11;

public class Aufgabe1 
{

	public static void main(String[] args) 
	{
		String satz = "Im Jahre 1492 segelte Columbus nach Indien.";
		char feldZumUebergeben[] = satz.toCharArray();
		System.out.println(ziffernZaehlen(feldZumUebergeben));
	}
	
	public static int ziffernZaehlen(char feld[]) 
	{
		int erg = 0;
		for(int i = 0; i < feld.length; i++) 
		{
			if(feld[i] >= '0' && feld[i] <= '9') 
			{
				erg++;
			}
		}
		return erg;
	}
}
