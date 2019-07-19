package AufgSammlungKlausuren;

public class WandleUmInCent 
{
	public static char[] wandleUmInCents(String betrag) 
	{
		betrag = betrag.replace(",", "");
		
		int k = Integer.valueOf(betrag);
		String s1 = String.valueOf(k);
		char[] result = s1.toCharArray();
		
		return result;
	}
	
	public static void main(String[]args) 
	{
		String s =  new String(wandleUmInCents("1,99"));
		String s1 =  new String(wandleUmInCents("0,99"));
		String s2 =  new String(wandleUmInCents("0,90"));
		String s3 =  new String(wandleUmInCents("0,09"));
		
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3 + "\n");
		
		// andere Möglichkeit
		System.out.println("andere Möglichkeit: \n");
		
		char[] a = wandleUmInCents("1,99");
		for(int i = 0; i < a.length; i++ ) 
		{
			System.out.print(a[i]);
		}
		System.out.println();
		
		char[] a1 = wandleUmInCents("0,99");
		for(int i = 0; i < a1.length; i++ ) 
		{
			System.out.print(a1[i]);
		}
		System.out.println();
		
		char[] a2 = wandleUmInCents("0,90");
		for(int i = 0; i < a2.length; i++ ) 
		{
			System.out.print(a2[i]);
		}
		System.out.println();
		
		char[] a3 = wandleUmInCents("0,09");
		for(int i = 0; i < a3.length; i++ ) 
		{
			System.out.print(a3[i]);
		}
		System.out.println();
	}
}
