package uebungsblatt4;

import java.util.Scanner;
public class Aufgabe4 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Bitte Jahr eingeben: ");
		int jahr = scan.nextInt();
		scan.close();
		
		if((jahr % 4 == 0)) 
		{
			if(jahr % 100 ==0 ) 
			{
				if(jahr % 400 == 0) 
				{
					System.out.println(jahr + " ist ein Schaltjahr, da ganzzahlig durch 4 und 100 teilbar, aber auch durch 400");
				}else 
				{
					System.out.println(jahr + " ist kein Schaltjahr, da ganzzahlig durch 4 und 100 teilbar, aber nicht durch 400");
				}
			}else 
			{
				System.out.println(jahr + " ist ein Schaltjahr, da ganzzahlig durch 4 teilbar");
			}
		}
		else 
		{
			System.out.println(jahr + " Ist kein Schaltjahr, da nicht ganzzahlig durch 4 teilbar");
		}
	}
}
