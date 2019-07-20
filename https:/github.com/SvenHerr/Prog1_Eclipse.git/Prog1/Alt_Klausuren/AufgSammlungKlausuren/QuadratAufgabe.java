package AufgSammlungKlausuren;

public class QuadratAufgabe 
{
	public static void printQuadrat(int zeilen) 
	{
		for(int i = 0; i < zeilen; i++) 
		{
			for(int k = 0; k < zeilen; k++) 
			{
				if(i == 0 || i == zeilen-1 ) 
				{
					System.out.print("*");
				}
				else if(k == 0 || k == zeilen-1)
				{
					System.out.print("*");
				}else 
				{
					System.out.print(" ");
				}
			}
			System.out.println();
			
		}
	}
	
	public static void main(String[]args) 
	{
		printQuadrat(6);
	}
}
