import java.util.Scanner;

public class Aufgabenblatt8 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Bitte Zahl eingeben: ");
		double zahl = scan.nextDouble();
		
		System.out.println("Anfangszahl: "+zahl + "\n" +"Ergebnis:     "+ GebrochenerAnteil(zahl));
		
		scan.close();
	}
	
	public static double GebrochenerAnteil(double wert) 
	{
		boolean wertIstNegativ = false;
		if(wert < 0) 
		{
			wertIstNegativ = true;
			wert =  wert*-1.0;
		}
		
		while(wert >1) 
		{
			wert = wert-1.0;
		}
		
		if(wertIstNegativ) 
		{
			wert = wert*-1.0;
		}
		
		 wert = Math.round(wert*1000)/1000.0; // Probiere es auch ohne dieses runden aus! Damit du siehst was passiert.
		
		return wert;
	}
	
	public static double GebrochenerAnteil2(double wert) 
	{
		boolean wertIstNegativ = false;
		if(wert < 0) 
		{
			wertIstNegativ = true;
		}
		
		do
		{
			if(wertIstNegativ) 
			{
				wert = wert+1.0;
			}else 
			{
				wert = wert-1.0;
			}
			
		}while(wert >1 && wert >1);
		
		 wert = Math.round(wert*1000)/1000.0; // Probiere es auch ohne dieses runden aus! Damit du siehst was passiert.
		
		return wert;
	}
}
