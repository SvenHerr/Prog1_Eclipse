package RonnyAufgaben;

public class Berechnungschaos 
{

	public static void main(String[] args) 
	{
		System.out.println("ergebnis: " + Berechne(423125));
		//Berechne(423125);

	}
	public static double Berechne(int zahl) 
	{
		if(zahl < 111111 || zahl > 999999) 
		{
			return -1;
		}
		
		double erstezahl = (int) zahl/100000;
		System.out.println("soll 4 " + erstezahl);
		double viertezahl = (int) (zahl/100) % 10;
		System.out.println("soll 1 " + viertezahl);
		double zweitezahl = (int) (zahl/10000) % 10;
		System.out.println("soll 2 " + zweitezahl);
		double sechstezahl = (int) zahl % 10;
		System.out.println("soll 5 " + sechstezahl);
		double drittezahl = (int) (zahl/1000) % 10;
		System.out.println("soll 3 " + drittezahl);
		double fünftezahl = (int) (zahl/10) % 10;
		System.out.println("soll 2 " + fünftezahl);
		
		double sum = (erstezahl/viertezahl + zweitezahl/sechstezahl) * (drittezahl/fünftezahl);
		sum = Math.round(sum * 100.0) / 100.0;
		
		return sum;
	}
}
