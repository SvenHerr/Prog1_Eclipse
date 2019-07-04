package RonnyAufgaben;

public class ArrayEinstieg8 {

	/*
	 * 	a) Schreibe ein Programm, das ein String-Array definiert und initialisiert, das folgende Werte enthält: hallo, hey, welt.
		b) Gib die Länge des Arrays aus.
		c) Füge an jeden String aus dem Array den Buchstaben a hinten an.
	 */
	public static void main(String[] args) 
	{
		String array[] = {"hallo", "hey", "welt"};
		System.out.println(array.length);
		
		for(int i = 0; i < array.length; i++) 
		{
			array[i] = array[i] + "a";
		}
		
		for(int i = 0; i < array.length; i++) 
		{
			System.out.println(array[i]);
		}
	}
}
