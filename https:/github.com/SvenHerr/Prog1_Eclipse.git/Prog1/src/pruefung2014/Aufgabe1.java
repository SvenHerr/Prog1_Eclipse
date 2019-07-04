package pruefung2014;

public class Aufgabe1 
{
	public static void main(String[]args) 
	{
		System.out.println(gueltigeMatrikelNr(5100000));
		System.out.println(gueltigeMatrikelNr1(5100000));
		System.out.println(gueltigeMatrikelNr2(5000000));
	}
	public static boolean gueltigeMatrikelNr(int matrikelnr) 
	{
		String matNrString = String.valueOf(matrikelnr);
		if(matNrString.length() != 7) 
		{
			return false;
		}else if((matNrString.charAt(0)== '5' && 
				 (matNrString.charAt(1) == '1' || matNrString.charAt(1) == '0')) || (matNrString.charAt(0) == '6' && 
			      matNrString.charAt(1) == '1')) 
		{
			return true;
		}else 
		{
			return false;
		}
	}
	
	public static boolean gueltigeMatrikelNr1(int matrikelnr) 
	{
		int matrikelNrSave = matrikelnr;
		int count = 0;
		
		while(matrikelnr != 0) 
		{
			matrikelnr = matrikelnr/10;
			count++;
		}
	
		if(count != 7) 
		{
			return false;
			
		}else 
		{
			int result[] = new int[7];
			matrikelnr = matrikelNrSave;
			for(int i = 0; i < 7; i++) 
			{
				result[6-i] = matrikelnr%10;
				matrikelnr = matrikelnr/10;
			}
			if((result[0]== 5 && (result[1] == 1 || result[1] == 0)) || (result[0] == 6 && result[1] == 1)) 
			{
				return true;
			}else 
			{
				return false;
			}
		}
	}
	public static boolean gueltigeMatrikelNr2(int matrikelnr) 
	{
		int matrikelNrSave = matrikelnr;
		int count = 0;
		
		while(matrikelnr != 0) 
		{
			matrikelnr = matrikelnr/10;
			count++;
		}
		if(count != 7) 
		{
			return false;
		}
		else if((matrikelNrSave < 5100000 || matrikelNrSave > 5199999) || (matrikelNrSave < 6100000 || matrikelNrSave >6199999 )) 
		{
			return false;
		}
		return true;
		
	}
}
