package uebungsblatt7;
import java.util.Scanner;
public class Aufgabe3 
{
	public static void main(String []args) 
	{
		System.out.println("Bitte Zahl eingeben: ");
		Scanner scan = new Scanner(System.in);
		int zahl = scan.nextInt();
		System.out.println("Die Fakultät von " + zahl + " ist " + fakultaet(zahl));
		scan.close();
	}
	
	public static int fakultaet(int x) 
	{
		int erg = 1;
		for(int i  = 1 ; i <= x; i++) 
		{
			erg *= i;
		}
		return erg;
	}
}
