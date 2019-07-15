package RonnyAufgaben;

public class Groeserkleiner {

	public static void main(String[] args) 
	{
		
		int[] feld = { -62, 1, 10, 65,60,-3 }; 
		KleinerGroesser(feld);

	}
	
	public static void KleinerGroesser(int [] arr) 
	{
			for (int i = 0; i < arr.length; i++) 
			{ 
				if (arr[i] > 60) 
				{
					arr[i] = 100; 
				}
				if (arr[i] < -60) 
				{ 
					arr[i] = - 100;
				} 
			}
			
			for (int i = 0; i < arr.length; i++) 
			{ 
				System.out.println(arr[i]);
			}
	}
}
