package uebungsblatt7;

public class Aufgabe4 
{
	public static void main(String[]args) 
	{
		int zahl = 5;
		int temp = 0;
		
		for(int i = 0; i < zahl; i++) 
		{
			temp++;
			for(int k = 0; k < temp; k ++) 
			{
				System.out.print(" * ");	
			}
			System.out.println();
		}	
	}
}
