package uebungsblatt2;

public class Aufgabe1 
{
	public static void main(String[] args) 
	{
		int x = 5;
		int y = 7;
        //Vor dem Tausch
        System.out.println(x);
		System.out.println(y);
		                 
		//Tausch
		int temp = x;
		x = y;
	    y = temp;
		System.out.println();
		                                
		//Nach dem Tausch
		System.out.println(x);
		System.out.println(y);
	} 
}
