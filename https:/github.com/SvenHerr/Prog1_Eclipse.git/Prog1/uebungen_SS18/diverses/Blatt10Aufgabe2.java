package diverses;
import java.util.Scanner;
public class Blatt10Aufgabe2 
{

	public static void main(String []args) 
	{
		Scanner scan = new Scanner(System.in);
		String zahlA = scan.nextLine();
		String zahlB = scan.nextLine();
		
		String array[] = {zahlA,zahlB};
		
		//Blatt10Aufgabe2A kp = new Blatt10Aufgabe2A(array);
		new Blatt10Aufgabe2A(array);
		
		scan.close();
	}
}