package uebungsblatt4;

public class Aufgabe2 
{
	public static void main(String[]args) 
	{
		int stunde = 23;
		int minute = 30;
		int sekunde = 10;
		
		if((stunde >= 0 && stunde <= 23) && (minute >= 0 && minute <= 60) && (sekunde >= 0 && sekunde <= 60)) 
		{
			System.out.println("Die Uhrzeit ist gültig");
		}
		else 
		{
			System.out.println("Die Uhrzeit ist nicht gültig");
		}
	}
}
