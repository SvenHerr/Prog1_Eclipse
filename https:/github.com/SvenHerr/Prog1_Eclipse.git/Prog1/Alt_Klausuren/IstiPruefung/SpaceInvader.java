package IstiPruefung;

public class SpaceInvader 
{
	static String[][] feld = new String[5][8];

	public void initialisiereFeld() 
	{
		// obere Reihe mit bösen Aliens befüllen
		for (int i = 0; i < feld[0].length; i++) 
		{
			feld[0][i] = "o";
		}
		
		// drei Zeilen mit Leerzeichen füllen !!!!! Beachte "length - 1" weil man die letzte Reihe nicht befüllen will. Da kommt später das Raumschiff hin
		for (int i = 1; i < feld.length ; i++) 
		{
			for (int k = 0; k < feld[0].length; k++) 
			{
				feld[i][k] = " ";
			}
		}
		
		// Raumschiff setzen
		int value = ((int)(Math.random()*8)); 
		//System.out.println(value);
		feld[4][value] = "v";
		
	}

	public static void main(String[] args) 
	{	
		SpaceInvader s = new SpaceInvader();
		s.initialisiereFeld();
		for (int i = 0; i < feld.length; i++) 
		{
			for (int k = 0; k < feld[0].length; k++) 
			{
				System.out.print(feld[i][k]);
			}
			System.out.println();
			
		}	
	}
}
