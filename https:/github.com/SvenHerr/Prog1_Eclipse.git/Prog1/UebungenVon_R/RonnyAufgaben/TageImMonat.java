package RonnyAufgaben;

public class TageImMonat 
{

	public static void main(String[] args) 
	{
		int monat = 12;
		System.out.println(TageImMonat(monat));

	}
	public static int TageImMonat(int monat) 
	{
		if(monat == 0 || monat > 12) 
		{
			return -1;
		}if(monat == 2) 
		{
			return 28;
		}
		if(monat %2 == 0 && monat != 10 && monat != 12) 
		{
			return 30;
		}else 
		{
			return 31;
		}
	}
}
