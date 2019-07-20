package AufgSammlungKlausuren;

public class HarmonischeReihe 
{
	public static void main(String[]args) 
	{
		int anzahl = 10000;
		
		double d = 0.0;
		for(int i  = 1; i <= anzahl; i++) 
		{
			d += ((Math.pow(-1, (i+1))) / i);
			System.out.println("Nr.: " +i +"Erg.: "+ d);
		}	
	}
}
