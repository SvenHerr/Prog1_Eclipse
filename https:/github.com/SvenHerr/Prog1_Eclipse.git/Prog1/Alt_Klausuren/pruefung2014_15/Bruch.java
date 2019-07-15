package pruefung2014_15;

public class Bruch 
{
	public int zaehler;
	public int nenner;

	public static Bruch multipliziereBruche(Bruch eins, Bruch zwei) 
	{
		Bruch drei = new Bruch();
		
		drei.zaehler = eins.zaehler * zwei.zaehler;
		drei.nenner = eins.nenner * zwei.nenner;
		
		return drei;
	}
	public static Bruch addiereBrueche(Bruch eins, Bruch zwei) 
	{
		Bruch drei = new Bruch();
		
		drei.zaehler = eins.zaehler + zwei.zaehler;
		drei.nenner = eins.nenner * zwei.nenner;
		
		return drei;
	}
	
	public void multipliziereMitBruch(Bruch eins) 
	{
		this.zaehler = eins.zaehler * this.zaehler;
		this.nenner = eins.nenner * this.nenner;
	}
	
	public String toString()
	{
		return zaehler + "/" + nenner;
	}

	public static void main(String[]args) 
	{
		Bruch a = new Bruch();
		a.zaehler = 2;
		a.nenner = 3;
		
		Bruch b = new Bruch();
		b.zaehler = 3;
		b.nenner = 4;
		
		System.out.println("Bruch " + a + " mal " + b);
		//System.out.println("Bruch " + a.zaehler +"/"+a.nenner + " mal " + b.zaehler + "/"+ b.nenner); // ohne toString methode
		System.out.println(Bruch.multipliziereBruche(a, b));
		
		System.out.println("Bruch " + a + " plus " + b);
		System.out.println(Bruch.addiereBrueche(a, b));
		
		a.multipliziereMitBruch(b);
		System.out.println(a);
	}
}
