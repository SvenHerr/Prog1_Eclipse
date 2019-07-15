package diverses;
public class Blatt10Aufgabe2A 
{
	public static void main(String []args) 
	{
		if(args.length == 0) 
		{
			System.out.println("Keine Werte eingegeben");
		}
		else if(args.length != 2 || args[1].length() == 0)
		{
			System.out.println("Zweites Feld ist leer");
		}else 
		{
			try 
			{
				double zahlA = Double.valueOf(args[0]);
				double zahlB = Double.valueOf(args[1]);
				System.out.println("Ergebnis: " + zahlA*zahlB);
				
			}catch(Exception e) 
			{
				System.out.println("Fehler: Eins der Felder konnte nicht in eine Zahl umgewandelt werden");
			}
		}
		
		String a ="1";
		String b = "2";
		
		double c = (String)a;
		double d = Double.valueOf(a);
		
		
		double f = 2.5;
		int e = (int)f ;
	}
}