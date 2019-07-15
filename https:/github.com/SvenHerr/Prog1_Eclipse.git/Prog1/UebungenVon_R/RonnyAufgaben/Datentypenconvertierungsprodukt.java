package RonnyAufgaben;

public class Datentypenconvertierungsprodukt 
{
	public static void main(String[] args) 
	{
		String a = "2.5";
		double b = 2.5;
		short c = 2;
		
		System.out.println(Convert(a,b,c));
	}

	public static String Convert(String str, double dob, short sh) 
	{
		double temp ;
		double result;
		try 
		{
			temp = Double.parseDouble(str);
		}catch(Exception e) 
		{
			return "-1";
		}
		
		result = temp * dob * sh;
		String a = String.valueOf(result);
		
		return a;
	}
}
