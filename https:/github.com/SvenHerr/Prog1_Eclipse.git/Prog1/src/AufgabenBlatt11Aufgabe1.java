
public class AufgabenBlatt11Aufgabe1 
{

	public static void main(String[] args) 
	{
		String satzString = "Im Jahre 1492 segelte Columbus nach Indien.";
		char[] satz = satzString.toCharArray();
		
		int a = ZähleZiffern(satz);
		System.out.println(a);
	}
	
	private static int ZähleZiffern(char[] satz) 
	{
		int count = 0;
		for(int i = 0; i<satz.length; i++) 
		{
			if(satz[i] >= 48 && satz[i]<= 57) 
			{
				count++;
			}
		}
		return count;
	}
}
