package pruefung2013SS;

public class Aufgabe4 
{
	public static int geradesProdukt(int uGrenze, int oGrenze) 
	{
		if(uGrenze % 2 != 0) 
		{
			uGrenze += 1;
		}
		if(oGrenze % 2 != 0) 
		{
			oGrenze -= 1;
		}
		
		int result = 1;
		for(int i = uGrenze; i <= oGrenze; i = i+2) 
		{
			result = result*i;
		}
		return result;
	}
	
	public static void main(String[] args) 
	{
		int a  = geradesProdukt(4,8);
		
		System.out.println(a);
	}
}
