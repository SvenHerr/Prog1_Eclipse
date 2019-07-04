package pruefung2012WS;

public class Aufgabe2 
{
	public static char[] verschluessle(char[] text, int stellen) 
	{
		if(stellen < 0) 
		{
			return null;
		}
		for(int i  = 0; i < text.length; i ++) 
		{
			if(text[i] < 'A' && text[i] > 'Z') 
			{
				return null;
			}
		}
		
		for(int i  = 0; i < text.length; i++) 
		{
			if((text[i] + stellen) > 'Z') 
			{
				int a = (int) (text[i] + stellen) - 'Z';
				text[i] = (char) (a + ('A'- 1));
			}
			else 
			{
				text[i] = (char) (text[i] + stellen);
			}
		}
		return text;
	}
	
	public static void main(String[] args) 
	{
		int stellen = 3;
		String textString = "CAESAR";
		char[] text = textString.toCharArray();
		
		char[] result = verschluessle(text, stellen);
		for(int i = 0; i < result.length; i++) 
		{
			System.out.print(result[i]);
		}
	}
}
