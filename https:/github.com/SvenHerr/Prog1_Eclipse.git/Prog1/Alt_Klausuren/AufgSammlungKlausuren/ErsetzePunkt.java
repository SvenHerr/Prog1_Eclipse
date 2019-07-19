package AufgSammlungKlausuren;

public class ErsetzePunkt 
{
	static String name =  "Graphik.Init.Datei.ini";
	static char[] dateiName = name.toCharArray();
	
	public static int ersetze(char [] dateiName) 
	{
		int count = 0;
		int result = 0;
		for(int i = 0; i < dateiName.length; i ++) 
		{
			if(dateiName[i] == '.') 
			{
				count = i;
			}
		}
		
		for(int i = 0; i < count; i ++) 
		{
			if(dateiName[i] == '.') 
			{
				dateiName[i] = '_';
				result++;
			}
		}
		
		return result;
	}
	
	public static void main(String[]args) 
	{
		String name =  "Graphik.Init.Datei.ini";
		char[] dateiName = name.toCharArray();
		System.out.println(ersetze(dateiName));
		String result = new String(dateiName);
		System.out.println(result);
	}
}
