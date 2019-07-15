
public class Sortierverfahren {

	public static void main(String[] args) 
	{
		int array[] = {2,1,3,2,8,9,3,2};
		int array1[] = SortierenDurchVertauschen(array); 
		System.out.print("Ergebnis sortieren durch Vertauschen: ");
		for(int i = 0; i< array.length; i++) 
		{
			System.out.print(array1[i]);
			System.out.print(" ");
		}
		System.out.println(" ");
		
		System.out.print("Ergebnis sortieren durch kleinstes nach vorne schreiben: ");
		int array2[] = SortiereSucheDasKleinsteZuerst(array); 
		for(int i = 0; i< array.length; i++) 
		{
			System.out.print(array2[i]);
			System.out.print(" ");
		}
	}
	
	
	
	private static int[] SortierenDurchVertauschen(int []array) 
	{
		int temp = 0;
		for(int k = 0; k < array.length; k++) 
		{
			for(int i = 0; i< array.length-1; i++) 
			{
				if(array[i] > array[i+1]) 
				{
					temp = array[i];
					array[i]= array[i+1];
					array[i+1] = temp;
				}
			}
		}
		return array;
	}
	private static int[] SortiereSucheDasKleinsteZuerst(int[] array) 
	{
		int kleinstezahl;
		int []arrayNew= new int[array.length];
		
		for(int k = 0; k< array.length; k++) 
		{
			kleinstezahl = array[k];
			int i = k;
			for(; i< array.length-1; i++) 
			{
				if(kleinstezahl >= array[i]) 
				{
					kleinstezahl = array[i];	
				}
			}
			arrayNew[i] = kleinstezahl;
		}
		return array;
	}
}
