package uebungsblatt5;
import java.util.Scanner;
public class Aufgabe1 
{
	public static void main(String[]args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Bitte Falldauer in Sekunden eingeben: ");
		int t = scan.nextInt();
		scan.close();
		double g = 9.80665;
		
		// a)
		System.out.println("teil a)");
		for(int i = 1; i <= t; i++) 
		{
			double erg = 0.5 * g * (i*i);
			System.out.println("Zeit: " + i +" Sekunden: Zurückgelegte Strecke: " + erg +" m ");
		}	
		System.out.println();
		
		// b)
		System.out.println("teil b)");
		for(int i = 1; i <= t; i= i+5) 
		{
			double erg = 0.5 * g * (i*i);
			System.out.println("Zeit: " + i +" Sekunden: Zurückgelegte Strecke: " + erg +" m ");
		}	
	}
}
