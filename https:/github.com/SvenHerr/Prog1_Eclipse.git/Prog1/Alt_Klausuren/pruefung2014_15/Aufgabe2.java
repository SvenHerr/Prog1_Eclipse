package pruefung2014_15;

public class Aufgabe2
{
	public static int[] sortiereAbsteigend(int[] feld) 
	{
		int temp = 0;
		for(int i = 0; i < feld.length; i++) 
		{
			for(int k = 0; k < feld.length-1; k++) 
			{
				if(feld[k] < feld[k+1]) 
				{
					temp = feld[k+1];
					feld[k+1] = feld[k];
					feld[k] = temp;
				}
			}
		}
		return feld;
	}
	
	public static int [] sortiereAbsteigend1(int[] w) 
	{
		int temp = 0;
		int max = w[0];
		for(int i  = 0; i < w.length; i++) 
		{
			//max = w[i];
			for(int k = 0; k < w.length; k++) 
			{
				if( max < w[k]) 
				{
					max = w[k];
				}
			}
			temp = w[i];
			w[i] = max;
			max = temp;
		}
		return w;
	}
	
	
	
	public static void main(String []args) 
	{
		
		int[] feld = {22,5,2,8,10,3};
		int [] feld1 = sortiereAbsteigend(feld); // bublesort
		
		for(int i  = 0; i< feld1.length; i++) 
		{
			System.out.print(feld1[i]+", ");
		}
		
		int [] feld2 = sortiereAbsteigend1(feld); // bublesort
		
		for(int i  = 0; i< feld2.length; i++) 
		{
			//System.out.print(feld2[i]+", ");
		}
		
	}
}
