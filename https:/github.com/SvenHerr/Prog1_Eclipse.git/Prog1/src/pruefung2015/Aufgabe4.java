package pruefung2015;

public class Aufgabe4 
{
	public static void main(String[] args) 
	{
		Aufgabe3[] t = new Aufgabe3[100];
		
		for (int i = 0; i < t.length; i++)
		{
			t[i] = new Aufgabe3(i+1);
			t[i].setIsOpen(false);
		}
		
		//Durchgänge Hausmeister
		int temp = 0;
		for (int i = 0; i < t.length; i++)
		{
			temp++;
			
			for (int j = i; j < t.length; j=j+temp)
			{	
				if (t[j].getIsOpen() == true)
				{
					t[j].setIsOpen(false);
				}else 
				{
					t[j].setIsOpen(true);
				}
			}
			
			for (int k = 0; k < t.length; k++)
			{
				System.out.print(t[k]);
			}
			System.out.println();
		}
		
		// Aufgabe c
		int zählen = 0;
		for (int i = 0; i < t.length; i++)
		{
			if(t[i].getIsOpen() == true)
			{
				zählen++;
			}
		}
		System.out.println("Es sind " + zählen + " Türen geöffnet!");		
	}
}
