package RonnyAufgaben;

public class Dreitagebart 
{
	
	/*
	 * Schreibe ein Programm, das einen Wert ausgibt. 
	 * Er soll als Gleitkommawert (Double) in der Variable d gespeichert werden. 
	 * d berechnet sich aus 0,5. Dieser Wert wird geteilt durch die Zahl der Sekunden, 
	 * die ein Tag hat, multipliziert mit 3. Das Ergebnis sollte sein, 
	 * wie viele Centimeter der Bart einer Person pro Sekunde wächst, 
	 * wenn er nach drei Tagen eine Länge von 0,5 Centimetern hat.
	 */
	
	public static void Berechne() 
	{
		double d = 0.5;
		d = d / ((3600 * 24)*3);
		
		System.out.println(d);
	}
	
	public static void main(String[]args) 
	{
		Berechne();
	}

}
