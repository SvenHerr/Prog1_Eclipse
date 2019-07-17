package IstiPruefung;

import java.util.Scanner;

public class SpaceInvader 
{
	static String[][] feld = new String[5][8];
	int value;
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
		value = ((int)(Math.random()*8)); 
		//System.out.println(value);
		feld[4][value] = "v";
		
	}
	
	public void bewege(char c) 
	{
		if(c == 'a' && value > 0) 
		{
			feld[4][value] = " ";
			value = value -1;
			feld[4][value] = "v";
			
		}
		else if(c == 'd' && value < 7) 
		{
			feld[4][value] = " ";
			value = value +1;
			feld[4][value] = "v";
		}
	}
	
	public String toString()  // Ka ob das so stimmt. Ist vllt zu kompliziert gelößt
	{
		String result = "";
		for (int i = 0; i < feld.length; i++) 
		{
			for (int k = 0; k < feld[0].length; k++) 
			{
				result = result + feld[i][k];
			}
			result = result + "\n";	
		}
		return result;
	}

	public static void main(String[] args) 
	{	
		SpaceInvader s = new SpaceInvader();
		s.initialisiereFeld();
		System.out.println(s.toString());
		Scanner scan = new Scanner(System.in);
		
		char c = 'o';
		do 
		{
			c = scan.nextLine().charAt(0);
			s.bewege(c);
			System.out.println(s.toString());
		}
		while(c != 'x');
		scan.close();
	}
}
