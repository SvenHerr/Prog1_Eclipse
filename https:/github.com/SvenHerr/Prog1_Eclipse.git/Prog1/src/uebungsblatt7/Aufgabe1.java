package uebungsblatt7;

public class Aufgabe1 
{
	public static void main(String[] args) 
	{
		System.out.println(rekursiveBerechnung(2,3));
	}
	
	public static int rekursiveBerechnung(int x, int n ) 
	{
		if(n == 1) 
		{
			return x;
		}
		else 
		{
			return x * rekursiveBerechnung(x, n-1);
		}
	}
}