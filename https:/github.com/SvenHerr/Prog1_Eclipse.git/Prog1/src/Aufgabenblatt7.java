import java.util.Scanner;


public class Aufgabenblatt7 
{
	/*		Aufgabenstellung:
	 * 		a) Schreiben Sie eine Methode, die eine übergebene Zahl auf‐ oder abrundet. 
	  		Beispiele: 3,2 wird auf 3 abgerundet, 3,5 auf 4 aufgerundet.
			b) Schreiben Sie eine weitere Methode, welche eine übergebene Zahl auf eine bestimmte Anzahl Nachkommastellen rundet. 
			Die Anzahl der Nachkommastellen soll anhand eines zusätzlich übergebenen Parameters bestimmt werden können. 
			Hinweis: Die Verwendung sämtlicher Methoden aus der Klasse Math ist untersagt!
	 */

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in); 
		float scanFloat;
		int scanInt;
		
		// Aufgabe 2a.
		System.out.println("Bitte Zahl eingeben: ");
		scanFloat = scanner.nextFloat();
		System.out.println(roundNumber(scanFloat)); 
		
		
		// Aufgabe 2b
		/*System.out.println("Bitte Zahl eingeben: ");
		scanFloat = scanner.nextFloat();
		System.out.println("Bitte Anzahl der Nachkommastellen angeben: ");
		scanInt = scanner.nextInt();
		System.out.println(rundeAufXNachkommastellen(scanFloat, scanInt)); 
		*/
		scanner.close();
	}
	
	// Kann man vllt bisschen einfacher lösen
	public static double roundNumber(double zahl)  // hier könntest du eigentlich auch einen int zurück geben
	{
		
		int result = 0;
		double zahlAnfang = zahl; // einfach nur speichern damit wir am ende schauen können ob die Zahl negativ war oder nicht.
		
		
		if(zahlAnfang < 0)  // Wenn die zahl am anfang kleiner "0" ist, dann ist es eine minuszahl
		{
			zahl = zahl * -1; //  *-1 (damit die Zahl Positiv wird und wir einfach damit weiter rechnen können).
		}
		
		int zahlOhneKomma = (int)zahl; //in einen int casten damit alles nach dem komma abgeschnitten wird.
		
		zahl = zahl - zahlOhneKomma; //  (bsp. zahl= 3,5 und zahl1= 3) dann ziehen wir von den 3,5 die 3 ab damit wir 0,5 erhalten.
		 
		if(zahl >= 0.5)   // hier runden wir auf 
		{
			if(zahlAnfang < 0) // hier Prüfen wir ob die Zahl negativ war oder nicht, wenn ja dann machen wir die Zahl wieder negativ
			{
				result= (zahlOhneKomma+1) *-1;
				return result; // das wird zurück gegeben wenn die zahl negativ war
			}
			return result = zahlOhneKomma+1; // das wird zurück gegeben wenn die zahl positiv war
		}else 
		{
			if(zahlAnfang < 0)  // hier runden wir ab
			{
				result= (zahlOhneKomma) *-1;
				return result;
			}
			result = zahlOhneKomma;
			return result;
		}
	}
	
	public static float rundeAufXNachkommastellen(float zahl, int anzahlNachkommaStellen) 
	{
		// float benutzen, weil double so kacke rundet.
		float faktor = 10.0f;
		for(int i = 1; i< anzahlNachkommaStellen; i++) // schliefe, weil man kann nicht z.B. 10*anzahlNachkommaStellen machen, 
		{												// weil das würde dann z.B. 10*2 ergeben und wir wollen nicht 20 sondern 100 haben
			faktor = faktor * 10.0f; 
		}
	
		int zahl1 = (int) (zahl * faktor); 
		float ergebnis =  zahl1/faktor; 
		
		return ergebnis;
	}
}
