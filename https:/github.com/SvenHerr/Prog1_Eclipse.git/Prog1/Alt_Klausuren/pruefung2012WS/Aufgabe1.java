package pruefung2012WS;

public class Aufgabe1 
{
	public static double istDifferenz(double z1, double z2) 
	{
		double result = 0;
		if(z1 > z2) 
		{
			result = z1 - z2;
		}
		else 
		{
			result = z2 - z1;
		}
		return result;
	}
	
	public static void main(String[]args) 
	{
		double z1 = 45.5;
		double z2 = 33.2;
		
		double result = istDifferenz(z1,z2);
		
		System.out.println(result);
	}

}
