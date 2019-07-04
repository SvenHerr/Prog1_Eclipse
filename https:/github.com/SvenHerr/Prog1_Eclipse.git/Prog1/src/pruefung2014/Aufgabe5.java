package pruefung2014;
import java.util.Scanner;
public class Aufgabe5 
{
	// Attribute
	private String typ_ref; 
	private int tachostand; 
	private double verbrauch; 
	private double einkaufspreis; 
	private double verkaufspreis;
	
	//symbolische Konstante
	public static final int KEINTACHOSTAND = -1; 
	public static final double KEINVERBRAUCH = -1.0;
	
	public Aufgabe5(String typ_ref, int tachostand, double verbrauch, double einkaufspreis) 
	{
		this.typ_ref = typ_ref;
		
		if(tachostand >= 0 && tachostand <= 200000) 
		{
			this.tachostand = tachostand;
		}
		else
		{
			this.tachostand = KEINTACHOSTAND;
		}
		
		if(verbrauch >= 3.0 && verbrauch <= 20.0) 
		{
			this.verbrauch = verbrauch; 
			
		}else 
		{
			this.verbrauch = KEINVERBRAUCH;
		}
		
		if(einkaufspreis >= 1000.0 && einkaufspreis <= 50000.0) 
		{
			this.einkaufspreis = einkaufspreis;
		}else 
		{
			this.einkaufspreis = 10000;
		}
		
		this.verkaufspreis = (this.einkaufspreis * 2);
	}
	
	public int kmzumKundendienst() 
	{
		if(this.tachostand == -1) 
		{
			return -1;
		}
		int temp = 20000;
		int result = 0;
		for(int i = 1; i <= 10; i++) 
		{
			if(this.tachostand < (temp*i)) 
			{
				return result = ((temp*i) - this.tachostand);
			}
		}
		return -1;
	}
	
	public static void main(String[]args) 
	{
		Aufgabe5[] a = new Aufgabe5[200];
		
		Scanner scan  = new Scanner(System.in);
		int werteVomTypInt;
		double verbrauch, einkaufspreis;
		String typ, garbage;
		
		for(int i = 0; i < a.length; i++) 
		{
			System.out.println("Wagen Nr. " + (i+1));
			
			System.out.println("Bitte Typ eingeben:");
			
			typ = scan.nextLine();
			
			System.out.println("Bitte Tachostand eingeben:");
			werteVomTypInt = scan.nextInt();
			
			System.out.println("Bitte Verbrauch eingeben:");
			verbrauch = scan.nextDouble();
			
			System.out.println("Bitte Einkaufspreis eingeben:");
			einkaufspreis = scan.nextDouble();
			garbage = scan.nextLine();
			
			a[i] = new Aufgabe5(typ,werteVomTypInt,verbrauch,einkaufspreis);
		}
		scan.close();	
	}
}
