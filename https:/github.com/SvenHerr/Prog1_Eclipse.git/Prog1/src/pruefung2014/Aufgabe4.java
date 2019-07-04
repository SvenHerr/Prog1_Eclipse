package pruefung2014;

public class Aufgabe4 
{
	public static char[][] ersetzeZeichen(char[][]text, char altesZeichen, char neuesZeichen)
	{
		for(int i  = 0; i< text.length; i++) 
		{
			for(int k = 0; k < text[0].length; k++) 
			{
				if(text[i][k] == altesZeichen) 
				{
					text[i][k] = neuesZeichen;
				}
			}
		}
		return text;
	}
	
	public static char[][] dreheDokument(char[][]text)
	{
		char gedrehterText[][] = new char[text.length][text[0].length]; 
		
		for(int i  = 0; i< text.length; i++) 
		{
			for(int k = 0; k < text[0].length; k++) 
			{
				gedrehterText[i][k] = text[i][(text[0].length-1)-k]; 
			}
		}
		return gedrehterText;
	}
	
	public static void main(String[] args) 
	{		
		char array[][] = new char[3][5];
		System.out.println(array.length);  // 3
		System.out.println(array[0].length); // 5

		char[][] text = new char[2][3];
		text[0][0] = 'h';
		text[0][1] = 'a';
		text[0][2] = 'l';
		text[1][0] = 'l';
		text[1][1] = 'o';
		text[1][2] = 'o';
		
		char altesZeichen = 'l';
		char neuesZeichen = 'j';
		
		//System.out.println(text.length);
		//System.out.println(text[0].length);
		
		char [][] text1 = ersetzeZeichen(text,altesZeichen, neuesZeichen);
		
		for(int i  = 0; i< text1.length; i++) 
		{
			for(int k = 0; k < text1[0].length; k++) 
			{
				System.out.print(text1[i][k]);
			}
			System.out.println();
		}
		System.out.println();
		
		char gedrehterText[][] = dreheDokument(text);
		for(int i  = 0; i< gedrehterText.length; i++) 
		{
			for(int k = 0; k < gedrehterText[0].length; k++) 
			{
				System.out.print(gedrehterText[i][k]);
			}
			System.out.println();
		}
	}
}
