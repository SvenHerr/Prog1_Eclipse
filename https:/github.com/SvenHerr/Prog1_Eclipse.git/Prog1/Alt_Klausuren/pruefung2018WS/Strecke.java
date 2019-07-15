package pruefung2018WS;

public class Strecke 
{
	private int A;
	private int B;
	
	public Strecke(int A, int B) 
	{
		if(A < B) 
		{
			this.A = A;
			this.B = B;
		}
		else
		{
			this.A = B;
			this.B = A;
		}
	}
	public boolean checkUeberschneidung(Strecke a, Strecke b) 
	{
		if(a.A == b.A && a.B == b.B) 
		{
			return true;
		}
		else if(a.A < b.A && a.B == b.B) 
		{
			return true;
		}
		else if(a.A > b.A && a.B == b.B) 
		{
			return true;
		}
		else if(a.A == b.A && a.B < b.B) 
		{
			return true;
		}
		else if(a.A == b.A && a.B > b.B) 
		{
			return true;
		}
		else if(a.A < b.A && a.B > b.B) 
		{
			return true;
		}
		else if(a.A > b.A && a.B > b.B) 
		{
			return true;
		}
		else if(a.A > b.A && a.B < b.B) 
		{
			return true;
		}
		else if(a.A < b.A && a.B < b.B) 
		{
			return true;
		}
		return false;
	}
	
	public String toString() 
	{
		int temp = 0;
		String erg = "";
		
		if(this.A == this.B) 
		{
			return erg + this.A;
		}
		
		temp = this.B - this.A;
		
		for(int i = 0; i < temp; i++) 
		{
			erg = "-" + erg;
		}
		erg = this.A + erg + this.B;
		
		return erg;
	}
	
	public static void main(String[]args) 
	{
		Strecke a = new Strecke(1,4);
		Strecke b = new Strecke(3,4);
		
		System.out.println(a.checkUeberschneidung(a, b));
		System.out.println(a.toString());
	}
}
