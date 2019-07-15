
public class Test 
{
	public static void main(String[]args) 
	{
		System.out.println("Random Zahl von 1 bis 100: " + ZieheRandomZahl()); // bekommt eine random Zahl zurück;
		
		
		float flieskommaZahl = 22.555555f;
		int nachkommastellen = 2;
		System.out.println("Flieskommazahl (" + flieskommaZahl + ") mit "+ nachkommastellen + " Nachkommastellen = " + Flieskommazahl(flieskommaZahl,nachkommastellen));
		
		
		System.out.println("Flieskommazahl (" + flieskommaZahl + ") mit "+ nachkommastellen + " Nachkommastellen = " + RoundToXDecimal(flieskommaZahl,nachkommastellen));
		
		
		int anfangszahl = 12345678;
		int[] result = ZahlUmdrehen(anfangszahl);
		System.out.print("Anfangszahl: "+anfangszahl+" umgedrehte Zahl: ");
		for(int i = 0; i < result.length; i++) 
		{
			System.out.print(result[i]);
		}
		System.out.println("");
		
		
		String a = "Hallo";
		char array[] = ConvertStringToCharArray(a);
		System.out.println("Convert from String ("+a+") to Char: ");
		for(int i = 0; i < a.length(); i++) 
		{
			System.out.println("char an der stelle " + i+ " = "+ array[i]);
		}
		
		
		int ar[] = {1,2};
		int ar1[] = {3,4};
		System.out.println("Gesamtergebnis der Summe von zwei Arrays " + Sum(ar,ar1));
		
		int arrayZahl[] = {1,2,3,4,5};
		System.out.println("Zahlen im Array sind 1,2,3,4,5 "+ "Ergebnis ist: " +ConvertStringToInt(arrayZahl)); 
	}
	
	private static int ZieheRandomZahl() // Zahl zwischen 1 und 100
	{
		int result;
		
		do 
		{
			double zahl = Math.random()*100;
			result = (int)zahl;
			
		}while(result < 0 && result > 100);
		
		return result;
	}
	
	private static float Flieskommazahl(float flieskommaZahl, int anzahlNachkommaStellen) 
	{
		float faktor = 10.0f;
		for(int i = 1; i< anzahlNachkommaStellen; i++) // schliefe, weil man kann nicht z.B. 10*anzahlNachkommaStellen machen, 
		{												// weil das würde dann z.B. 10*2 ergeben und wir wollen nicht 20 sondern 100 haben
			faktor = faktor * 10.0f; 
		}
	
		int zahl1 = (int) (flieskommaZahl * faktor); 
		float ergebnis =  zahl1/faktor; 
		
		return ergebnis;
	}
	
	private static float RoundToXDecimal(float flieskommaZahl, int anzahlNachkommaStellen) 
	{
		float faktor = 10.0f;
		anzahlNachkommaStellen +=1; 
		for(int i = 1; i< anzahlNachkommaStellen; i++) 
		{												
			faktor = faktor * 10.0f; 
			
		}
		float tempFaktor = faktor;
		
		faktor = faktor/10;
		int zahl1 = (int) (flieskommaZahl * faktor); 
		
		int tempZahl = (int) (flieskommaZahl * tempFaktor); // tempFaktor muss sein, weil man die Stelle anschauen muss die nicht angezeigt wird
		if(tempZahl%10 > 4) 
		{
			zahl1 = zahl1 +1;
		}	
		float ergebnis =  zahl1/faktor; 
	
		return ergebnis;
	}
	private static int[] ZahlUmdrehen(int zahl) 
	{
		int temp;
		int lengthOfZahl=0;
		int tempZahl = zahl;
		
		while(tempZahl > 0) 
		{
			lengthOfZahl++;
			tempZahl = tempZahl/10;
		}
		
		int array[] = new int[lengthOfZahl];
		for(int i = 0; i <lengthOfZahl; i++) 
		{
			temp = zahl%10;
			zahl = zahl/10;
			array[i] = temp;
		}
		return array;
	}
	
	private static char[] ConvertStringToCharArray(String value) 
	{
		char array[] = new char[value.length()];
		
		for(int i = 0; i < value.length(); i++) 
		{
			array[i] = value.charAt(i);
		}
		return array;
	}
	
	private static int Sum(int array[], int array1[]) 
	{
		int result = 0;
		for(int i = 0; i < array.length; i++) 
		{
			result = result + array[i];
		}
		for(int i = 0; i < array1.length; i++) 
		{
			result = result + array1[i];
		}
		
		return result;
	}
	
	private static int ConvertStringToInt(int zahl[]) 
	{
		double a = 0;
		int b;
		double temp = 0.1;
		
		for(int i = zahl.length-1; i >= 0; i--) 
		{
			temp = temp * 10;
			a = temp * zahl[i] + a;
		}
		b = (int) a;

		return b;
	}
}
	
