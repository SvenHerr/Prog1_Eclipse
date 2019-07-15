import java.util.Scanner;

public class Stars 
{
	public static void main(String[] args) 
	{
		int temp;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bitte Zahl eingeben: ");
		int zahl = scan.nextInt();
		
		System.out.println("Bitte Anzahl der Sterne eingeben: ");
		int sterne = scan.nextInt();
	
		if(zahl <= 0 || sterne < 0) 
		{
			System.out.println("Fehler! Zahl und Anzahl Sterne muss > 0 sein ");
			
		}else 
		{
			while(zahl != 0)
			{
				temp = zahl%10; 
				zahl = zahl - temp; 
				zahl = zahl / 10;
				
				System.out.print(temp); 
				int zahl1 = zahl%10;
				
				if(zahl1 != 0) 
				{
					for(int i = 0; i<sterne; i++) 
					{
						System.out.print("°"); 
					}
				}
			}
		}
		scan.close();
	}
}
