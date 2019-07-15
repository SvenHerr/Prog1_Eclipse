package pruefung2013SS;

public class Aufgabe1 
{
	public int zaehleGrossbuchstaben(String satz) 
	{
		char a[] = satz.toCharArray();
		int count = 0;
		for(int i = 0; i < a.length; i++) 
		{
			if(a[i] >= 'A' && a[i] <= 'Z') 
			{
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[]args) 
	{
		Aufgabe1 a = new Aufgabe1();
		System.out.println(a.zaehleGrossbuchstaben("SS13-Programmieren")); // 3
	}

}
