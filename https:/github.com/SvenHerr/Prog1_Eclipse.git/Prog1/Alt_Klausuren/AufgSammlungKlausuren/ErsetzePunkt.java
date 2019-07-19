package AufgSammlungKlausuren;

public class ErsetzePunkt 
{
	static String name =  "Graphik.Init.Datei.ini";
	static char[] dateiName1 = name.toCharArray();
	
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
				dateiName1[i] = '_';
				//dateiName[i] = '_';
				result++;
			}
		}
		
		return result;
	}
	
	public static void main(String[]args) 
	{
		String name =  "Graphik.Init.Datei.txtxt";
		char[] dateiName = name.toCharArray();
		System.out.println("Anzahl umgewandelter Punkte: " +ersetze(dateiName));
		//String result = new String(dateiName);
		/*for(int i = 0; i < dateiName.length; i++) 
		{
			System.out.print(dateiName[i]);
		}*/
		String result = new String(dateiName1);
		System.out.println(result);
	}
}
