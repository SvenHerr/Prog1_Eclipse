package uebungsblatt3;

public class Aufgabe4 
{
	public static void main(String[]args) 
	{
		double a = Math.random()* 6 + 1;
		int zahl = (int)a;
		
		// Option A
		if(zahl == 1) 
		{
			System.out.println("Eins gewürfelt");
		}
		else if(zahl == 2) 
		{
			System.out.println("Zwei gewürfelt");
		}
		else if(zahl == 3) 
		{
			System.out.println("Drei gewürfelt");
		}
		else if(zahl == 4) 
		{
			System.out.println("Vier gewürfelt");
		}
		else if(zahl == 5) 
		{
			System.out.println("Fünf gewürfelt");
		}
		else if(zahl == 6) 
		{
			System.out.println("Sechs gewürfelt");
		}
		
		// Option B
		/* 
		switch(zahl) 
		{
			case 1: System.out.println("Eins gewürfelt"); 
					break;
			case 2: System.out.println("Zwei gewürfelt"); 
					break;
			case 3: System.out.println("Drei gewürfelt"); 
					break;
			case 4: System.out.println("Vier gewürfelt"); 
					break;
			case 5: System.out.println("Fünf gewürfelt"); 
					break;
			case 6: System.out.println("Sechs gewürfelt"); 
					break;
		}
		*/
	}
}
