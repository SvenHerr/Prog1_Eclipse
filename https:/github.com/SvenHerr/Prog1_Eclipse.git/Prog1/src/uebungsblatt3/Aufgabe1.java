package uebungsblatt3;
import java.util.Scanner;
public class Aufgabe1 
{
	
	public static void main(String[]args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Bitte Zahl eingeben");
		
		int zahl = scan.nextInt();
		if(zahl % 7 == 0) 
		{
			System.out.println("Die Zahl ist ganzzahlig durch 7 teilbar");
		}else 
		{
			System.out.println("Die Zahl ist nicht ganzzahlig durch 7 teilbar");
		}
		scan.close();
	}
}
