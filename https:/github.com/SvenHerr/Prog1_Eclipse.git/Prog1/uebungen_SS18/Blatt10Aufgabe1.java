
public class Blatt10Aufgabe1 
{
	public static void main(String[] args) 
	{
		String wort = "spIel mit mir";
		System.out.println("Anfangswort: " + wort);
		System.out.println("Ergebnis: " + GibWort( wort));
	}
	private static String GibWort(String wort ) 
	{
		char wort1[] =  wort.toCharArray();
		
		int count = 0;
		for(int i = 0; i< wort1.length; i++) 
		{
			if(wort1[i] == 'a'||wort1[i] == 'e'||wort1[i] == 'i'||wort1[i] == 'o'||wort1[i] == 'u'|| wort1[i] == 'A'||wort1[i] == 'E'||wort1[i] == 'I'||wort1[i] == 'O'||wort1[i] == 'U') 
			{
				count= count +2;
			}
		}
		char c[] = new char[count+wort1.length];
		
		int temp = 0;
		for(int i = 0; i<c.length; i++) 
		{
			if(wort1[temp] == 'a'||wort1[temp] == 'e'||wort1[temp] == 'i'||wort1[temp] == 'o'|| wort1[temp] == 'u'|| wort1[temp] == 'A'||wort1[temp] == 'E'||wort1[temp] == 'I'||wort1[temp] == 'O'|| wort1[temp] == 'U') 
			{
				c[i] = wort1[temp];
				c[i+1] = 'b';
				c[i+2] = wort1[temp];
				
				i=i+2;
				temp++;
				
			}else 
			{
				c[i] = wort1[temp];
				temp++;
			}
		}
		String result = String.valueOf(c);
		return result;
	}
}
