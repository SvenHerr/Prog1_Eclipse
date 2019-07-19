package AufgSammlungKlausuren;

public class GanzzahligVielfacheVon3 
{
	public static int ganzzahligeVielfacheVon3(int[] wert) 
	{
		int result = 0;
		
		for(int i = 0; i < wert.length; i++) 
		{
			if(wert[i] % 3 == 0 && wert[i] != 0) 
			{
				System.out.println(wert[i]);
				result++;
			}
		}
		
		return result;
	}
	
	public static void main(String[]args) 
	{
		int[] arr = {3,0,-3,1,30,8,7};
		
		System.out.println("Anzahl der Teilbaren Zahlen: " + ganzzahligeVielfacheVon3(arr));
	}
}
