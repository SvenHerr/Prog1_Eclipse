
import java.util.InputMismatchException;
import java.util.Scanner;

public class Test1 
{
	static Scanner scan = new Scanner(System.in);		// scanner ist Static
	public static void main(String[]args) 
	{
		KonstruktorTest a = new KonstruktorTest(12);
		KonstruktorTest b = new KonstruktorTest(14);
		System.out.println(a.getAlter());
		System.out.println(b.getAlter1());
		//KonstruktorTest b = new KonstruktorTest(44, "Herbert");
		
		IntScannerTest() ;
		//CharScannerTest();
		//FloatScannerTest();
		//SwitchTest(0);
		//WhichNumberIsBigger();
		
		//Test1 neuesObjekt = new Test1();
		//neuesObjekt.ObjektTestMethode(1);
		
		//Minsort();
		//countUpperCaseCharacters();
		//findStringInString();
		//replaceTest();
		//containsTest();
		//testUeberladenVonMethoden(2,2);
		//exceptionTest();
		//exceptionTest1();
		//runtimeExceptionTest();
		//lottozahlen();
		//lottozahlen1();
		//arrayTest();
	}
	public static void arrayTest() // Methode von Dennis
	{
		int[]A_Array = new int[] {1,2,3,4,5};
		
		System.out.println("A:");
		for(int a : A_Array) 
		{
			System.out.print(a + " ");
		}
		
		int[]B_Array = A_Array;
		
		B_Array[0] = 10;
		
		System.out.println("\n\nA:");
		for(int a : A_Array) 
		{
			System.out.print(a + " ");
		}
		
		System.out.println("\nB:");
		for(int a : B_Array) 
		{
			System.out.print(a + " ");
		}
	}
	
	public static void lottozahlen() 
	{
		int[] lottozahlen = new int[6];
		initArray(lottozahlen);
		for (int i = 0; i < lottozahlen.length; i++) 
		{
		      System.out.print(lottozahlen[i] + " ");
		}
	}
	public static void lottozahlen1() 
	{
		int[] lottozahlen = new int[6];
		initArray1(lottozahlen);
		for (int i = 0; i < lottozahlen.length; i++) 
		{
		      System.out.print(lottozahlen[i] + " ");
		}
	}
	
	public static void initArray1(int[] lottozahlen)
	  {
		int[] zahlen = new int[6];
	    for (int i = 0; i < zahlen.length; i++)
	    {
	    	zahlen[i] = (int)(Math.random()*49+1); 
	    }
	    lottozahlen = zahlen;
	}
	public static void initArray(int[] lottozahlen)
	  {
		
	    for (int i = 0; i < lottozahlen.length; i++)
	    {
	    	lottozahlen[i] = (int)(Math.random()*49+1); 
	    }
	}

	public static void runtimeExceptionTest() 
	{
		int a = 0;
		
		if(a == 1) 
		{
			System.out.println("ok1");
		}else if(a == 2) 
		{
			System.out.println("ok2");
		}else
		{
			throw new RuntimeException("Zahl nicht zulässig");
		}
	}
	
	
	public static void exceptionTest1() 
	{
		Scanner scanner = new Scanner(System.in);
		boolean fehlerGefunden;
		do
			{
				try 
				{
					System.out.println("Bitte geben Sie eine Zahl ein: ");
					String eingabe = scanner.nextLine();
					int zahl = Integer.valueOf(eingabe);
					fehlerGefunden = false;
					System.out.println(zahl);
				}
				catch (NumberFormatException e)
				{
					System.out.println("Fehler beim Einlesen der Zahl!");
					fehlerGefunden = true;
				}
			} while (fehlerGefunden);
		scanner.close();
	}
	
	public static void exceptionTest() 
	{
		Scanner scanner = new Scanner(System.in);
		boolean fehlerGefunden;
		do
		{
			try 
			{
				
				System.out.println("Bitte geben Sie eine Zahl ein: ");
				int zahl = scanner.nextInt();
				fehlerGefunden = false;
				System.out.println(zahl);
			}
			catch (InputMismatchException e)
			{
				System.out.println("Fehler beim Einlesen der Zahl!");
				scanner.nextLine();
				fehlerGefunden = true;
			}
		 }
		 while (fehlerGefunden);
		 scanner.close();
	}
	
	
	public static void testUeberladenVonMethoden(int a, int b) 
	{
		System.out.println("ich bin bei 2 int");
	}
	
	public static void testUeberladenVonMethoden(int a, int b, int c) 
	{
		System.out.println("ich bin bei 3 int");
	}
	
	public static void containsTest() 
	{
		String link = "ejnbovjvneiolvswww.google.devuewvuntv";
		boolean a = link.contains("www.");
		System.out.println("gegebener link ist gültig? " + a );
	}
	
	public static void replaceTest() 
	{
		String link = "ejnbovjvneiolvswww.google.devuewvuntv".toLowerCase();
		String anfang = "www.".toLowerCase();
		String ende = ".de".toLowerCase();
		int anfangIndex = link.indexOf(anfang);
		int endeIndex = link.indexOf(ende) + ende.length();
		
		String linkCorrect = link.substring(anfangIndex, endeIndex);
		
		linkCorrect = linkCorrect.replace('.',',' ); 	// Replace nur zum test
		
		System.out.println("randomlink: " + link);
		System.out.println("Correct link: " + linkCorrect);
	}
	
	public static void findStringInString() 
	{
		String link = "ejnbovjvneiolvswww.google.devuewvuntv".toLowerCase();
		String anfang = "www.".toLowerCase();
		String ende = ".de".toLowerCase();
		int anfangIndex = link.indexOf(anfang);
		int endeIndex = link.indexOf(ende) + ende.length();
		
		String linkCorrect = link.substring(anfangIndex, endeIndex);
		System.out.println("randomlink: " + link);
		System.out.println("Correct link: " + linkCorrect);
	}
	
	public static void countUpperCaseCharacters() 
	{
		String sentence = "oTTo";
		int count = 0;
		for (int i = 0; i < sentence.length(); i++)
		{
			char c = sentence.charAt(i); 
			if (c >= 'A' && c <= 'Z')
			{
				count++;
			}
		}
		System.out.println(count);
	}
	
	public static void Minsort() 
	{
		int unsortedArray[] = {68,22,56,34,12,38,9,17}; 
		
		for (int i = 0; i < unsortedArray.length - 1; i++) 
		{
			for (int j = i + 1; j < unsortedArray.length; j++) 
			{
				if (unsortedArray[i] > unsortedArray[j]) 
				{
					int temp = unsortedArray[i];
					unsortedArray[i] = unsortedArray[j];
					unsortedArray[j] = temp;
				}
			}
		}
		
		for(int i = 0; i < unsortedArray.length; i++)
		{
			System.out.print(unsortedArray[i]);
			if(i < unsortedArray.length-1) 
			{
				System.out.print(", ");
			}else 
			{
				System.out.print(".");
			}
		}
	}
	
	public void ObjektTestMethode(int a ) 
	{
		System.out.println("Test OK");
	}
	
	public static void WhichNumberIsBigger() 
	{
		int a = 0;
		int b = 1;
		
		int max = a>b ? 2: 3;
		
		System.out.println(max);
	}
	
	public static void SwitchTest(int a ) 
	{
		switch (a) 
		{
			case 0: System.out.println(" a ist 0"); break;
			case 1: System.out.println(" a ist 1"); break;
			case 2: System.out.println(" a ist 2");	break;
			case 3: System.out.println(" a ist 3"); break;
			default: System.out.println(" a ist 4 oder höher");
		}
	}
	
	public static void CharScannerTest() 
	{
		char a = scan.nextLine().charAt(0);
			
		System.out.println(a);
	}
	
	public static void FloatScannerTest() 
	{	
		float a = scan.nextFloat();
		
		String b = scan.nextLine();
		
		System.out.println(b+a);
	}
	
	public static void IntScannerTest() 
	{
		int a = scan.nextInt();
		//String garbage = scan.nextLine(); // schluck den nächsten befehtl "\n"
		
		String b = scan.nextLine(); // Alternative den befehl zweimal ausführen
		
		b = scan.nextLine();
		
		int c = scan.nextInt();
		String d = scan.nextLine(); 
		
		System.out.println(a+b);
	}
}
