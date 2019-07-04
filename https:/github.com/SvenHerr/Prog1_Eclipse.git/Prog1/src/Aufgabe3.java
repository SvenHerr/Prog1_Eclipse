
public class Aufgabe3 
{
	public static void main(String[] args) 
	{
		
		char ersterWert = 'f';
		char zweiterWert = 't';
		
		//int a = Standartausgabe('f','t');
		//System.out.println(a);
		
		if(ersterWert == 'f' && zweiterWert== 'f') 
		{
			System.out.println(0);
		}
		else if(ersterWert == 'f' && zweiterWert== 't') 
		{
			System.out.println(1);
		}
		else if(ersterWert == 't' && zweiterWert== 'f') 
		{
			System.out.println(2);
		}
		else if(ersterWert == 't' && zweiterWert== 't') 
		{
			System.out.println(3);
		}	
	}
	
	public static int Standartausgabe(char erstesZeichen, char zweitesZeichen) 
	{
		if(erstesZeichen == 'f' && zweitesZeichen== 'f') 
		{
			return 0;
		}
		else if(erstesZeichen == 'f' && zweitesZeichen== 't') 
		{
			return 1;
		}
		else if(erstesZeichen == 't' && zweitesZeichen== 'f') 
		{
			return 2;
		}
		else if(erstesZeichen == 't' && zweitesZeichen== 't') 
		{
			return 3;
		}	
		return -1;
	}
}
