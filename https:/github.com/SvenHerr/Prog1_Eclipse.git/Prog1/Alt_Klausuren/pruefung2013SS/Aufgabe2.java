package pruefung2013SS;

public class Aufgabe2 
{
	public static boolean feldEnthalten(int array[], int feld[]) 
	{
		int temp = 0;
		for(int i = 0; i < array.length-1; i++) 
		{
			for(int k = 0; k < feld.length-1; k++) 
			{
				if(array[i] == feld[k] && array[i+1] == feld[k+1]) 
				{
					for(int m = 0; m < feld.length; m++) 
					{
						if(array[(i+m)] == feld[m]) 
						{
							temp++;
						}	
					}
				}
				if(temp < feld.length) 
				{
					temp = 0;
				}
			}
		}
		if(temp == feld.length) 
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	
	public static void main(String[]args) 
	{
		int array[] = {6,9,6,4,3,1,2};
		int feld[] = {6,4,3};
		System.out.println(feldEnthalten(array, feld));
		
		int array1[] = {7,9,6,1,2,4,2};
		int feld1[] = {1,2,3};
		System.out.println(feldEnthalten(array1, feld1));
	}
}
