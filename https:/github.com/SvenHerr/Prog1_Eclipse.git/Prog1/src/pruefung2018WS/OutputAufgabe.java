package pruefung2018WS;

public class OutputAufgabe 
{
	public static String wasTueIch(int a) 
	{
		String b ="";
		
		while(a > 0) 
		{
			if(a % 2 == 0) 
			{
				b = "0" + b;
			}
			if(a % 2 == 1) 
			{
				b = "1" + b;
			}
			a = a/2;
		}
		return b;
	}
	
	public static void main(String[]args) 
	{
		System.out.println(wasTueIch(8));
		System.out.println(wasTueIch(6));
	}
}
