package uebungsblatt3;
import java.util.Scanner;
public class Aufgabe2 
{
	public static void main(String[]args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Bitte Preis von Pizza 1 eingeben");
		double preisP1 = scan.nextDouble();
		System.out.println("Bitte Durchmesser von Pizza 1 eingeben");
		int durchmesserP1 = scan.nextInt();
		
		System.out.println("Bitte Preis von Pizza 2 eingeben");
		double preisP2 = scan.nextDouble();
		System.out.println("Bitte Durchmesser von Pizza 1 eingeben");
		int durchmesserP2 = scan.nextInt();
		
		double preisLeistungP1 = durchmesserP1/preisP1;
		double preisLeistungP2 = durchmesserP2/preisP2;
		
		if(preisLeistungP1 > preisLeistungP2) 
		{
			System.out.println("Größen-/Preisverhältnis von Pizza 1 ist besser");
		}
		else if(preisLeistungP1 == preisLeistungP2) 
		{
			System.out.println("Größen-/Preisverhältnis von beiden Pizzen ist gleich");
		}
		else 
		{
			System.out.println("Größen-/Preisverhältnis von Pizza 2 ist besser");
		}	
		scan.close();
	}
}
