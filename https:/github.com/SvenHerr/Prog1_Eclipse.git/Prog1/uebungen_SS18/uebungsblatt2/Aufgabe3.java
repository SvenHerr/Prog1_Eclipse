package uebungsblatt2;

public class Aufgabe3 
{
	public static void main(String[]args) 
	{
		double p = 4.0;
		double q = 3.0;
		double pDurch2 = p/2.0;
		
		double x1 = - pDurch2 + (Math.sqrt((pDurch2)*(pDurch2)) - q);
		double x2 = - pDurch2 - (Math.sqrt((pDurch2)*(pDurch2)) - q);
		
		System.out.println("x1 = " + x1);
		System.out.println("x2 = " + x2);
		
	}
}
