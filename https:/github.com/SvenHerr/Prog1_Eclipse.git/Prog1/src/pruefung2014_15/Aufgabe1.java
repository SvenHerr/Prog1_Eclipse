package pruefung2014_15;

public class Aufgabe1 
{
	public static boolean palindromTest(char[]feld) 
	{
		for(int i = 0; i < feld.length; i++) 
		{
			if(feld[i] != feld[(feld.length-1) - i]) 
			{
				return false;
			}
		}		
		return true;
	}
	
	public static void main(String[]args) 
	{
		char[] feld= {'o','t','t','o'};
		String a = "lagerregal";
		char[] feld1 = a.toCharArray();
		
		String b = "bob";
		char[] feld2 = b.toCharArray();
		
		System.out.println(palindromTest(feld));
		System.out.println(palindromTest(feld1));
		System.out.println(palindromTest(feld2));
	}

}
