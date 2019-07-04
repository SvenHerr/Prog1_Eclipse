import java.util.Scanner;
public class Sinus 
{
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Geben Sie die Zahl, dessen Sinus berechnet werden soll ein ");
		double x = scanner.nextDouble();
		System.out.println("Das Ergebnis ist : " + sinus(x));
		scanner.close();	
	}

	public static double sinus(double x)
	{
		double summand=1;
		double ergebnis=0;
		for (int k=0; CheckIfNumberIsNegativ(summand)> 1E-15 ; k++)
		{
			summand=0;
			summand=(Math.pow(-1, k))*(Math.pow(x, 2*k+1)/fakultät(2*k+1));
			ergebnis=ergebnis+summand;
		}
		return ergebnis;
	}
	
	public static double CheckIfNumberIsNegativ(double number) 
	{
		if(number < 0) 
		{
			number = number*-1;
			return number;
		}
		return number;
	}
	
	public static double fakultät(int zahl)
	{
		while (zahl > 0)
		{
			return zahl*fakultät(zahl-1);
		}
	return 1;
	}
}
