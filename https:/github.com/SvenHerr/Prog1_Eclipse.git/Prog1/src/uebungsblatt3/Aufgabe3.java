package uebungsblatt3;
import java.util.Scanner;
public class Aufgabe3 
{
	public static void main(String[]args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Bitte geben Sie ein Zeichen ein: ");
		char einzelZeichen = scan.nextLine().charAt(0);
		scan.close();
		
		boolean istUnbekannt = true;
		
		if(einzelZeichen >= 'A' && einzelZeichen <= 'Z') 
		{
			System.out.println("Großbuchstabe");
			istUnbekannt = false;
		}
		if(einzelZeichen >= '0' && einzelZeichen <= '9' || einzelZeichen >= 'a' && einzelZeichen <= 'f' || einzelZeichen >= 'A' && einzelZeichen <= 'F') 
		{
			System.out.println("Hexadezimale Ziffer");
			istUnbekannt = false;
		}
		
		if(einzelZeichen == '0' || einzelZeichen == '1') 
		{
			System.out.println("binäre Ziffer");
			istUnbekannt = false;
		}
		
		if(einzelZeichen >= '0' && einzelZeichen <= '7') 
		{
			System.out.println("oktale Ziffer");
			istUnbekannt = false;
		}
		
		if(istUnbekannt)
		{
			System.out.println("Unbekannt");
		}
	}
}
