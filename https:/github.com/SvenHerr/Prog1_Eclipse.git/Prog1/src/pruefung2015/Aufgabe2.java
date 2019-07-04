package pruefung2015;
import java.util.Scanner;
public class Aufgabe2 
{
	public static void main(String[]args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Bitte geben Sie die ISBN ein:");
		String isbn = scan.nextLine();
		
		System.out.println("Die eingegebene ISBN ist: " + pruefeISBN(isbn));
		scan.close();
	}
	
	public static boolean pruefeISBN(String ISBN)
	{
		int temp = 0;
		char[] isbnChar = ISBN.toCharArray();
		
		for(int i = 0; i < isbnChar.length; i++) 
		{
			if(isbnChar[i] == '-') 
			{
				temp++;
			}
		}
		char[] isbnNew = new char[isbnChar.length - temp];
		temp = 0;
		for(int i = 0; i < isbnChar.length; i++) 
		{
			if(isbnChar[i] != '-') 
			{
				isbnNew[temp] = isbnChar[i];
				temp ++;
			}
		}
		temp = 0;
		int count = 0;
		for(int i = 0; i< isbnNew.length; i++) 
		{
			count = count +((i+1)*isbnNew[i]);
		}
		int erg = count%11;
		if(erg == 0) 
		{
			return true;
		}else 
		{
			return false;
		}
	}
}
