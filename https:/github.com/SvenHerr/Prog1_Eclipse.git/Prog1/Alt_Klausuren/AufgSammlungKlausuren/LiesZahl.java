package AufgSammlungKlausuren;

import java.util.Scanner;

public class LiesZahl 
{
	public static int liesZahl1() 
	{
		// Lösung mit TryCatch
		System.out.println("Bitte Zahl eingeben");
		Scanner scan = new Scanner(System.in);
		String s = "";
		int result = 0;
		boolean wiederholen;
		do 
		{
			s = scan.nextLine();
			try 
			{
				result = Integer.valueOf(s);
				wiederholen = false;
				scan.close();
				return result;
			}
			catch(NumberFormatException e ) 
			{
				System.out.println("Bitte Eingabe wiederhoilen");
				wiederholen = true;
			}
		}
		while(wiederholen);
		
		scan.close();
		return -1;
	}
	
	
	public static int liesZahl() 
	{
		// Lösung ohne Try-Catch
		System.out.println("Bitte Zahl eingeben");
		Scanner scan = new Scanner(System.in);
		String s = "";
		int result = 0;
		boolean wiederholen = false;
		char[] arr; 
		do 
		{
			s = scan.nextLine();
			arr = s.toCharArray();
			
			for(int i = 0; i < arr.length; i++) 
			{
				//if(arr[i] == '.' || (arr[i] >= 'A'&& arr[i] <= 'Z') || (arr[i] >= 'a'&& arr[i] <= 'z')) 
				if(arr[i] >= '0' && arr[i] <= '9')
				{
					wiederholen = false;
				}
				else 
				{
					System.out.println("Bitte Eingabe wiederhoilen");
					wiederholen = true; 
					break;
				}
			}
			
			if(! wiederholen) 
			{
				result = Integer.valueOf(s);
				scan.close();
				return result;
			}	
		}
		while(wiederholen);
		scan.close();
		return -1;
	}
	
	public static void main(String[]args) 
	{
		System.out.println(liesZahl1());
	}
}
