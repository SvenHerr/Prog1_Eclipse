package diverses;
import java.util.Scanner;

public class PizzaRechner 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		int scannerEingabeDurchmesserPizza1, scannerEingabePreisPizza1;
		
		int scannerEingabeDurchmesserPizza2, scannerEingabePreisPizza2; 
		
		double Flaecheninhalt= 0;
		
		double Ergebnis1 = 0, Ergebnis2 = 0;
		
		while(Ergebnis2 == 0) 
		{
		
		System.out.println("Bitte den Durchmesser der Pizza 1 eingeben:");
		scannerEingabeDurchmesserPizza1 =scan.nextInt();
		
		do 
		{
			if(scannerEingabeDurchmesserPizza1 == 26 || scannerEingabeDurchmesserPizza1 == 28|| scannerEingabeDurchmesserPizza1 == 30 )
			{
				System.out.println("Bitte Preis Pizza 1 eingeben");
				scannerEingabePreisPizza1 = scan.nextInt();
			
				Flaecheninhalt = Math.round(Math.PI* ((scannerEingabeDurchmesserPizza1/2)*(scannerEingabeDurchmesserPizza1/2)));
				Ergebnis1 = Flaecheninhalt / scannerEingabePreisPizza1;	
			}
			else 
			{
				System.out.println("Wir haben leider nur 26, 28 und 30cm Durchmesser ");
				System.out.println("Bitte erneut den Durchmesser eingeben");
				break;
			}
		
			System.out.println("Bitte den Durchmesser der Pizza 2 eingeben:");
			scannerEingabeDurchmesserPizza2 =scan.nextInt();
		
			if(scannerEingabeDurchmesserPizza2 == 26 || scannerEingabeDurchmesserPizza2 == 28|| scannerEingabeDurchmesserPizza2 == 30 )
			{
				System.out.println("Bitte Preis Pizza 2 eingeben");
				scannerEingabePreisPizza2 = scan.nextInt();
			
				Flaecheninhalt = Math.round(Math.PI* ((scannerEingabeDurchmesserPizza2/2)*(scannerEingabeDurchmesserPizza2/2)));
				Ergebnis2 = Flaecheninhalt / scannerEingabePreisPizza2;
			}
			else 
			{
				break;
			}
		
		
		if(Ergebnis1 > Ergebnis2) 
		{
			System.out.println("Pizza 1 hat das bessere Preis/Leistungsverhältnis");
			break;
		}
		else if (Ergebnis1 < Ergebnis2)
		{
			System.out.println("Pizza 2 hat das bessere Preis/Leistungsverhältnis");
			break;
		}
		else 
		{
			System.out.println("Die Pizzen sind gleich");
			break;
		}
		}while(true);
		
		//scan.close();
		}
	}
}
