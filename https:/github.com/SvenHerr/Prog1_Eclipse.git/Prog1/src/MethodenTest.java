
public class MethodenTest {

	public static void main(String[] args) 
	{
		
		String name = "Isti";
		
		PrintName(name);
		
		
		//int ergebnis = Summiere(1,3);
		//System.out.println(ergebnis);
		
		int a = 10;
		double b = 10.5;
		System.out.println(a/b);

	}
	
	public static void PrintName(String name) 
	{
		System.out.println(name);
		PrintBestName();
	}
	
	public static void PrintBestName() 
	{
		System.out.println("Sven");
	}
	
	public static int Summiere(int a, int b) 
	{
		return a+b;
	}
}