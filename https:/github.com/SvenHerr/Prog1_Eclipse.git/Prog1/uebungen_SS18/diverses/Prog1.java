package diverses;

public class Prog1 
{
	public static void main(String[] args) 
	{
		int aktStunden = 12;
		int aktMinuten = 00;
		int aktSekunden = 00;
		int sekundenTotal = 24 * 3600;
		
		
		int sekundenSeitMitternacht = ((aktStunden *3600) + (aktMinuten * 60) + aktSekunden);
		
		int verbleibendenSekundenFuerDiesenTag = sekundenTotal - sekundenSeitMitternacht;
		
		double prozentVomTagSchonVergangen = 100.0 / sekundenTotal * sekundenSeitMitternacht;
		
		
		System.out.println("Sekunden seit Mitternacht:  " + sekundenSeitMitternacht);
		System.out.println("Verbeleibende Sekunden:  " + verbleibendenSekundenFuerDiesenTag);
		System.out.println("Prozent " + prozentVomTagSchonVergangen );
	}
}
