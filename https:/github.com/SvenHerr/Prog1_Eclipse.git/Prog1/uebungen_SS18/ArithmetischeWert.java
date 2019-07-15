
import java.util.Scanner;
public class ArithmetischeWert 
{
 	public static void main (String[] args)
	{
		System.out.println("einzulesenden Wert:");
		Scanner sc =new Scanner(System.in);
		int werteeingabe = sc.nextInt();
		
		double sum=0;
		double arth = werteeingabe;
		double arthmittel;
		if(werteeingabe <= 0)
		{
			System.out.println("Fehlerhafte Eingabe");
			sc.close();
			return;	
		}
		double[]zahlen=new double[werteeingabe];
		for(int i = 0; i <werteeingabe; i++)
		{
			System.out.println("Eingabe");
			zahlen[i]=sc.nextDouble();
			sum +=zahlen[i];
		}
		
		double min=zahlen[0];
		double max=zahlen[0];
		for(int k = 0; k <zahlen.length; k++)
		{
			if(zahlen[k]<min)min=zahlen[k];
			if(zahlen[k]>max)max=zahlen[k];
			System.out.println((k+1)+"Wert: "+zahlen[k]);
		}
			
		arthmittel=sum/arth;
		
		System.out.println("Arithmetisches Mittel: "+ Math.round(arthmittel * 100.0) / 100.0 );
		System.out.println("Min : "+min+"\nMax : "  + max );
		System.out.println("Abweichung Arthmittel :"+ Math.round(standAb(zahlen,arthmittel) * 100.0) / 100.0);	
		
		sc.close();
	}
	
	
 	public static double standAb(double[] zahlen, double arthmittel)
 	{
 		double abweichung=0;
 		for(int i=0;i<zahlen.length;i++)
 		{
 			abweichung +=1.0/zahlen.length*(Math.sqrt(Math.pow(zahlen[i]-arthmittel, 2)));
 		}
 		return abweichung;
 	}
}
