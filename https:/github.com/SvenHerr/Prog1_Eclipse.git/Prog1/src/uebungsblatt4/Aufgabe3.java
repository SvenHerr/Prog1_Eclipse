package uebungsblatt4;

public class Aufgabe3 
{
	public static void main(String[]args) 
	{
		char erstesZeichen = 'f';
		char zweitesZeichen = 't';
		
		if((erstesZeichen == 't' || erstesZeichen == 'f') && (zweitesZeichen == 't' || zweitesZeichen == 'f')) 
		{
			if(erstesZeichen == 'f' && zweitesZeichen == 'f') 
			{
				System.out.println("false und false = 0");
			}
			else if(erstesZeichen == 'f' && zweitesZeichen == 't')
			{
				System.out.println("false und true = 1");
			}
			else if(erstesZeichen == 't' && zweitesZeichen == 'f')
			{
				System.out.println("true und false = 2");
			}
			else if(erstesZeichen == 't' && zweitesZeichen == 't')
			{
				System.out.println("true und true = 3");
			}
		}
		else 
		{
			System.out.println("Das Zeichen darf nur t oder f sein");
		}
	}
}
