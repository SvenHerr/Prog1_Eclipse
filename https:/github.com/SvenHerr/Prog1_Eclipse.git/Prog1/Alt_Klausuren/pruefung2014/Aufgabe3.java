package pruefung2014;

public class Aufgabe3 
{
	public static int[] bytesUmrechnen(int zahl) 
	{
		int result[] = new int[4];
		int gb = 1024*1024*1024;
		int mb = 1024*1024;
		int kb = 1024;
		
		if(zahl / gb <= 0) 
		{
			result[0] = 0;
		}else
		{
			result[0] = zahl/ gb;
			zahl = zahl % gb;
		}
		
		if(zahl / mb <= 0) 
		{
			result[1] = 0;
		}else 
		{
			result[1] = zahl/ mb;
			zahl = zahl% mb;
		}
		
		if(zahl / kb <= 0) 
		{
			result[2] = 0;
		}else 
		{
			result[2] = zahl/ kb;
			zahl = zahl % kb;
		}
		
		result[3] = zahl;
		
		return result;	
	}
	
	public static void main(String[] args) 
	{
		int zahl1 = 658555422;
		int zahl2 = 1030;
		
		int result1[] = bytesUmrechnen(zahl1);
		int result2[] = bytesUmrechnen(zahl2);
		
		for(int i = 0; i< result1.length; i++) 
		{
			System.out.print(result1[i]);
		
			if(i != result1.length-1) 
			{
				System.out.print(", ");
			}			
		}
		System.out.println("");
		
		for(int i = 0; i< result2.length; i++) 
		{
			System.out.print(result2[i]);
			
			if(i != result2.length-1) 
			{
				System.out.print(", ");
			}
		}	
	}
}
