package RonnyAufgaben;

public class Collegeblock 
{
	public static int blattgrößeInQM = 297*210;
	public int anzahlAnBloecken[][];
	
	public Collegeblock(int[][] anzahlAnBloecken) 
	{
		this.anzahlAnBloecken = anzahlAnBloecken;	
	}
	
	public int Berechne(int anzahlAnBloecken[][]) 
	{
		int result=0;
		int temp = 0;
		for(int i = 0; i< anzahlAnBloecken.length; i++) 
		{
			if(anzahlAnBloecken[i][1] == 40 || anzahlAnBloecken[i][1] == 80 || anzahlAnBloecken[i][1] == 160) 
			{
				temp += anzahlAnBloecken[i][0] * anzahlAnBloecken[i][1]; 
			}else 
			{
				return -1; 
			}
		}
		result = blattgrößeInQM* temp;
		return result;
	}
}
