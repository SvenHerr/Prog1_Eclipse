package RonnyAufgaben;

public class DruckeASCI {

	/*
	 *  Wissen zu Schleifen vorausgesetzt
		Schreibe ein Programm, das die ASCII-Tabelle mit den ersten 256 Werte ausgibt.
	 */
	public static void main(String[] args) 
	{
		//Lösung A
		for(int i = 0; i < 256; i++) 
		{
			char a = (char)i;
			System.out.println(i +" : "+ a);
		}
		
		// Alternative 
		for(int i = 0; i < 32; i++)
		{
			for(int j = i; j < 256; j += 32)
			{
				char print = (char)j;
				if(j < 32 || j == 133 || j == 127)
				{
					print = 32; 
				}
				System.out.print(String.format("%3d - %s  " , j, print));
			} 
			System.out.println();
		}
	}
}
