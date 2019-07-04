
public class Blatt9Aufgabe1 
{

	public static void main(String[] args) 
	{
		int a[] = fillArray();
			
		for(int j = 0; j <a.length; j++) 
		{
			System.out.println(a[j]);
		}
	}
	
	public static int[] SortiereArray(int a[]) 
	{
		int b[] = new int[a.length];
		int kleinsteZahl = a[0];
		int temp = -99;
		
		for(int i = 0; i <a.length; i++) 
		{
			if(kleinsteZahl > a[i]) 
			{
				temp = kleinsteZahl;
				kleinsteZahl = a[i];
				a[i] = temp;
			}
			b[i] = a[i];
			
		}
		
		return b;
	}
	
	public static int[] fillArray() 
	{
		int a[] = new int[6];
		
		for(int i = 0; i < a.length; i++) 
		{
			a[i] = ZieheZahl();
		}
		
		int b[] = checkAufDoppelteZahlen(a); 
		int c[] = SortiereArray(b); 
		return c;
	}
	
	public static int[] checkAufDoppelteZahlen(int[] a) 
	{
		int b[] = new int[a.length];
		
		for(int i = 0; i < a.length-1; i++) 
		{
			if(a[i] == a[i+1]) 
			{
				a[i] = ZieheZahl() ;
				i=0;
			}else 
			{
				b[i] = a[i];
			}
		}
		
		return a;
	}
	
	public static int ZieheZahl() 
	{
		int a1 = 0;
		
		do 
		{
			double a = Math.random()*1000/10;
			a1 = (int)a;
			
		}while(a1 >49 || a1 == 0);
			
		return a1;	
	}
}
