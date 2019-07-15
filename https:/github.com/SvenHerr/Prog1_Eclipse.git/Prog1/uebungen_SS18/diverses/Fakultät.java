package diverses;

public class Fakultät {

	public static void main(String[] args) 
	{
		System.out.println(Fakultaet(3));
		
		
		//Fakultaet(5);
	}
	
	public static int Fakultaet(int zahl) 
	{
		while(zahl > 0) 
		{
			zahl = zahl * Fakultaet(zahl-1);
			return zahl;
		}
		return 1;
	}
}
