
public class ArrayBasics 
{
	/*
	Folgende Zahlen seien gegeben. 8, 9, 10, 6
a)
	Schreiben Sie eine Methode, die die Zahlen in der verkürzten Schreibweise in ein Array speichert und dieses zurückgibt.
b)
	Schreiben Sie eine Methode, die als Parameter ein beliebiges Array übergeben bekommen kann, 
	dessen einzelne Elemente vom Datentyp int sind. Sie soll alle Elemente aus dem Array ausgeben.
c)
	Schreiben Sie eine Methode, die als Parameter ein beliebiges Array übergeben bekommen kann, 
	dessen einzelne Elemente vom Datentyp int sind. Sie soll die Länge des Arrays ausgeben und zurückgeben.
d)
	Schreiben Sie eine Testklasse, in der alle Methoden aufgerufen werden. Es soll soweit möglich jeweils überprüft werden, 
	ob der Rückgabewert korrekt ist. (Nicht nur lesen, sondern auch das Programm überprüfen lassen, ob es stimmt.)
	 */
	public static void main(String[] args) 
	{
		int []array = GibAlsArrayZurück(8,9,10,6);
		for(int i = 0; i< array.length; i++) 
		{
			System.out.println(array[i]);
		}
	}
	
	public static int[] GibAlsArrayZurück(int zahl1, int zahl2, int zahl3,int zahl4) 
	{
		int array[] = {zahl1,zahl2,zahl3,zahl4};
		return array;	
	}
}
