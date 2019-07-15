package uebungsblatt2;

public class Aufgabe4 
{
	public static void main(String[]args) 
	{
		int stunden = 12;
		int minuten = 40;
		int sekunden = 3;
	
		// a)
		int aktuelleUhrzeitInSekunden = ((3600 * stunden) + (60 * minuten) + sekunden);
		System.out.println("Sekunden seit Mitternacht: " + aktuelleUhrzeitInSekunden);
		
		// b)
		int sekundenGesamtFür24H = 3600 * 24;
		int sekundenVerbleiben = (int)sekundenGesamtFür24H - aktuelleUhrzeitInSekunden;
		System.out.println("Sekunden verbleiben: " + sekundenVerbleiben);
		
		// c)
				/* Überlegung: 100% sind 86400sekunden 
								10% sind 8640
		 						1% sind 864
				*/
		double vergprozent = ((double)aktuelleUhrzeitInSekunden / sekundenGesamtFür24H)*100 ; 	// Vergangene Prozent vom Tag
		double vergprozent1 = Math.round(100.0 * vergprozent)/100.0;					//Rundet auf zwei Nachkommastellen
		double vergprozent2 = Math.round(10000.0 * vergprozent)/10000.0;				//Rundet auf vier Nachkommastellen
		
		System.out.println("\n" + "Vergangene Prozent des Tages : " + vergprozent1); 	// Auf zwei Stellen gerundet
		System.out.println("Vergangene Prozent des Tages : " + vergprozent2); 			// Auf vier Stellen gerundet
		System.out.println("Vergangene Prozent des Tages : " + vergprozent);
	}
}
