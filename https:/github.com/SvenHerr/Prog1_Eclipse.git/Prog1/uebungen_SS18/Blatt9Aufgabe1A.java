
public class Blatt9Aufgabe1A 
{

	public static void main(String[] args) 
	{
		int anfang[] = new int[6];
		
		for(int i = 0; i < anfang.length; i++) 
		{
			anfang[i] = ZieheZahl();
		}
		
		int geprueftesArray[] = PruefeArray(anfang);
		
		int result[] = Sortiere(geprueftesArray);
		
		for(int l = 0; l <result.length; l++) 
		{
			System.out.print(result[l]+ " ");
		}
	}
	
	public static int[] Sortiere(int ungepruefteLottozahlen[]) 
	{
		int temp;
		
		for(int k = 0; k < ungepruefteLottozahlen.length; k++) 
		{
			for(int i = 0; i<ungepruefteLottozahlen.length-1; i++) 
			{
				if(ungepruefteLottozahlen[i] > ungepruefteLottozahlen[i+1]) 
				{
					temp = ungepruefteLottozahlen[i+1];
					ungepruefteLottozahlen[i+1] = ungepruefteLottozahlen[i];
					ungepruefteLottozahlen[i] = temp;
				}
			}
		}
		int sortierteLottozahlen[] = ungepruefteLottozahlen; // ist nicht nötig nochmal ein Array zu erstellen. Ist nur zum besseren Verständniss
		
		return sortierteLottozahlen;
	}
	
	public static int [] PruefeArray(int ungepruefteLottozahlen[]) 
	{
		int i;
		for(int k = 0; k <ungepruefteLottozahlen.length; k++) // k = 0
		{
			int temp = ungepruefteLottozahlen[k]; 				// temp = 3
			
			for(i=k; i<ungepruefteLottozahlen.length-1; i++) 	//  i = 0
			{
				if(temp == ungepruefteLottozahlen[i+1]) 		// 3 == 3
				{
					ungepruefteLottozahlen[i+1] = ZieheZahl(); // ja
				}
			}
			ungepruefteLottozahlen[k] = temp;					// array[0] = 3
		}
		
		int gepruefteLottozahlen[] = ungepruefteLottozahlen; // ist nicht nötig nochmal ein Array zu erstellen. Ist nur zum besseren Verständniss
		
		return gepruefteLottozahlen;
	}
	
	public static int ZieheZahl() 
	{
		int zahl = 0;
		do 
		{
			double temp = Math.random()*100;
			zahl = (int)temp;
			
		}while(zahl >49 || zahl == 0);
			
		return zahl;	
	}
}
