package IstiPruefung;

public class AlkoholAufgabe 
{
	static final double dichte = 0.8;
	
	public static double berechneMasse(double volumen, double alkoholvolumenanteil) 
	{
		return (volumen * alkoholvolumenanteil * dichte);
	}
	
	public static double berechneAlkKonzentration(double alkoholmasse, double gewicht, char g) 
	{
		if(g != 'm' && g != 'w' && g != 'j') 
		{
			System.out.println("Fehler:...");
			return -1.0;
		}
		
		double r = 0.0;
		
		if(g == 'm') 
		{
			r = 0.7;
		}
		else if(g == 'w') 
		{
			r = 0.6;
		}
		else 
		{
			r = 0.5;
		}
		
		return (alkoholmasse / (gewicht * r));	
	}
	
	public static void main(String[]args) 
	{
		double bier = berechneMasse(1000, 0.05);
		System.out.println(bier);
		
		double alkKonzentration = berechneAlkKonzentration(bier , 70,'m');
		System.out.println("Alkohol anteil im Blut: " + alkKonzentration);
		if(alkKonzentration >= 0.5) 
		{
			System.out.println("Sie dürfen kein Auto mehr fahren!!!");
		}
		else if(alkKonzentration < 0.5 && alkKonzentration > 0.3) 
		{
			System.out.println("Sie sollten kein Auto mehr fahren!!!");
		}
	}
}
