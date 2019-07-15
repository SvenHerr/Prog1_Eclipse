package pruefung2013_14;

public class Aufgabe3 
{
	/*public static int[] addiere(int []a, int [] b) 
	{
		int zahlA = 0; int zahlB = 0; int count = 1;
		
		for(int i = 1; i < a.length; i++) 
		{
			count = count*10;
		}
		
		for(int i = 0; i < a.length; i++) 
		{
			zahlA = (a[i]* count)+zahlA;
			
			zahlB =(b[i]* count) + zahlB;
			count = count / 10;
		}
		
		int result = zahlA + zahlB;
		int erg[] = new int [a.length];
		int temp = 0;
		
		for(int i = 0; i < a.length; i++) 
		{
			temp = result % 10;
			erg[(a.length -1)-i] = temp;
			result = result / 10;
		}
		return erg;
	}*/
	
	
	public static int[] addiere(int []a, int [] b) 
	{
		int count = 1;
		int result = 0;
		int temp = 0;
		
		for(int i = 1; i < a.length; i++) 
		{
			count = count*10;
		}
		
		for(int i = 0; i < a.length; i++) 
		{
			result += (a[i]* count) + (b[i]* count);
			count = count / 10;
		}
		
		int erg[] = new int [a.length];
		
		for(int i = 0; i < a.length; i++) 
		{
			temp = result % 10;
			erg[(a.length -1)-i] = temp;
			result = result / 10;
		}
		return erg;
	}
	
	
	
	public static void main(String[]args) 
	{
		int a[] = {3,4,2};
		int b[] = {6,2,9};
		
		int a1[] = {1,4,0};
		int b1[] = {1,2,0};
		
		int a2[] = {3,4,0};
		int b2[] = {6,2,0};
		
		int ergebnis [] = addiere(a,b);
		int ergebnis1 [] = addiere(a1,b1);
		int ergebnis2 [] = addiere(a2,b2);
		
		for(int i  = 0; i < ergebnis.length; i ++) 
		{
			System.out.print(ergebnis[i]);
		}
		System.out.println();
		
		for(int i  = 0; i < ergebnis1.length; i ++) 
		{
			System.out.print(ergebnis1[i]);
		}
		System.out.println();
		
		for(int i  = 0; i < ergebnis2.length; i ++) 
		{
			System.out.print(ergebnis2[i]);
		}
	}
}
