package uebungsblatt5;
import java.util.Scanner;
public class Aufgabe4 
{	
	public static void main(String[] args) 
	{
		//Primzahlen sind nur durch sich selbst und durch 1 ganzzahlig teilbar!
		Scanner scan = new Scanner(System.in);
		System.out.println("Bitte zu untersuchende Zahl eingeben:");
		int eingabezahl = scan.nextInt();
		scan.close();
		boolean prim = true;
			
		for (int i = 2; 2*i < eingabezahl; i++) // 2*1 weil wenn z.B. 3 teilbahr ist muss man nicht noch prüfen ob durch 6 teilbar ( same with 2 and 4 or 5 and 10) 
		{
			if ((eingabezahl % i) == 0 ) // eingegebene Zahl wird Modulo dem i wert gerechnet und wenn es gleich 0 ist wird false ausgegeben
			{
				prim = false ;
				break ;
			}
		}
		if (prim == false)
		{
			System.out.println("Untersuchte Zahl ist keine Primzahl!");
		}
		else
		{ 
			System.out.println("Untersuchte Zahl ist eine Primzahl!");
		}				
	}	
}
