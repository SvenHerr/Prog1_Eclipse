package uebungsblatt4;

public class Aufgabe1 
{
	public static void main(String[] args) 
	{
		int matrikelnummer = 6191111;
		
		if(matrikelnummer >= 5000000 && matrikelnummer <= 5199999 || matrikelnummer >= 6100000 && matrikelnummer <=6199999) 
		{
			System.out.println("Matrikelnummer ist gültig");
		}
		else 
		{
			System.out.println("Matrikelnummer ist nicht gültig");
		}
	}
}
