package pruefung2013_14;

public class Aufgabe2 
{
	boolean[][] brett = new boolean[8][8];
	
	public void setzeTurm ( int x, int y ) 
	{
		for(int i = 0; i< brett.length; i++) 
		{
			brett[x][i] = true;
			brett[i][y] = true;
		}
	}
	
	// andere Möglichkeit mit zwei For-Schleifen
	public void setzeTurm1 ( int x, int y ) 
	{
		for(int i = 0; i< brett.length; i++) 
		{
			for(int k = 0; k< brett.length; k++) 
			{
				if(i == x) 
				{
					brett[i][k] = true;
				}
				if(k == y) 
				{
					brett[i][k] = true;
				}
			}
		}	
	}
	
	public void gibBedrohteFelderAus() 
	{
		for(int i = 0; i < brett.length; i++) 
		{
			for(int k = 0; k < brett.length; k++) 
			{
				if(brett[i][k]) 
				{
					System.out.print("x");
				}else 
				{
					System.out.print("o");
				}
			}
			System.out.println();
		}
	}
	
	public static void test() 
	{
		System.out.println("hier");
	}
	
	public static void main(String[]args) 
	{
		Aufgabe2 alpha = new Aufgabe2();
		alpha.setzeTurm(3, 5);
		alpha.gibBedrohteFelderAus();
		
	}
}
