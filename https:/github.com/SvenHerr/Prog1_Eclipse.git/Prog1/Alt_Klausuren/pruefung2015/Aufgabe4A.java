package pruefung2015;

public class Aufgabe4A 
{
	public static void main(String []args) 
	{
		Aufgabe3[] t = new Aufgabe3[100];
		
		for(int i = 0; i < t.length; i++) 
		{
			t[i] = new Aufgabe3(i+1);
			t[i].setIsOpen(false);
		}
		
		int n = 0;
		for(int i = 0; i< 100; i++) 
		{
			n++;
			
			for(int k = i; k < t.length; k = k + n) 
			{
				{
					if(t[k].getIsOpen() == true) 
					{
						t[k].setIsOpen(false);
					}
					else 
					{
						t[k].setIsOpen(true);
					}
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
