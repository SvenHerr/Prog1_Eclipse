package RonnyAufgaben;
import java.util.Scanner;
public class GuessZahl {

	public static void main(String[] args) 
	{
		int randomNumber = GenerateNumer();
		System.out.println(randomNumber);
		Gibhinweis(randomNumber);
	}
	
	public static int GenerateNumer() 
	{
		int temp;
		do {
				double zahl = (Math.random()*100)+1;
				temp = (int)zahl;
			
			}while(temp < 1 || temp > 100);
		
		return temp;
	}
	public static int GenerateNumer1() 
	{
		int zahl =(int) (Math.random()*100)+1;
		
		return zahl;
	}

	public static void Gibhinweis(int zahl) 
	{
		Scanner scan = new Scanner(System.in);
		for(int i = 1; i< 6; i++) 
		{
			int a = scan.nextInt();
			if(a == zahl) 
			{
				System.out.println("Gewonnen");
				scan.close();
				return;
			}
			if(a < zahl) 
			{
				System.out.println("gesuchte Zahl ist größer");
			}
			if(a > zahl) 
			{
				System.out.println("gesuchte Zahl ist kleiner");
			}
			System.out.println("noch " + (5-i) + " versuche");
		}
		System.out.println("verloren");
		scan.close();
	}
}
