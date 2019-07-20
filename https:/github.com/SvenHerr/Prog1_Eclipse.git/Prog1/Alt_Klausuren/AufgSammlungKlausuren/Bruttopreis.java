package AufgSammlungKlausuren;

public class Bruttopreis 
{
	public static double berechneNettopreis(double bruttoPreis, double steuerSatz) 
	{
		return bruttoPreis / (1+steuerSatz );
	}
	
	public static void main(String[]args) 
	{
		System.out.println("Netto Preis: " + berechneNettopreis(1.07, 0.07));
	}
}
