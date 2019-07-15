package diverses;


import java.util.Scanner;

public class Isti 
{
	/*public static void main(String[] args) 
	{
	  Scanner keyboard = new Scanner(System.in);
	  double ergebnis = 1.0;
	  System.out.println("Geben Sie die Basis ein : ");
	    double a = keyboard.nextDouble();
	    System.out.println("Geben Sie die Exponenten ein : ");
	    int b = keyboard.nextInt();
	    
	    if (b==0)
	    {
	    System.out.println("Das Ergebnis ist " + ergebnis);  
	    }
	    if (b==1)
	    {
	      ergebnis = a;
	        System.out.println("Das Ergebnis ist " + ergebnis);  
	    }
	    if (b > 1)
	    {
	      for (int i=0; i < b; i++)
	      {
	        ergebnis = ergebnis*a;
	          }
	      System.out.println("Das Ergebnis ist " + ergebnis);
	    }
	    if (b<0)
	    {
	      for(int i=0;i>b;i--)
	      {
	        ergebnis = ergebnis/a;
	      }
	      System.out.println(ergebnis);

	    }
	    
	    keyboard.close();

	  }*/
	
	public static void main(String[] args) 
	  {
	    Scanner sc=new Scanner(System.in);
	    double erg =1.0;
	    System.out.println("kasih basis");
	    double a = sc.nextDouble();
	    System.out.println("kasih exponent");
	    int b = sc.nextInt();
	    int tempB = b;
	    double tempA = a;
	    
	    if(b == 0)
	    {
	      System.out.println(erg);
	    }
	    
	    if(b == 1)
	    {
	      erg=a;
	      System.out.println(erg);
	    }
	    
	    if(tempB<0) 
	    {
	    	b = b * (-1);
	    }
	    if(a<0) 
	    {
	    	a = a * (-1);
	    }
	    
	    if (b>1)
	    {
	      for (int i=0; i<b; i++)
	      {
	        erg=erg*a;
	      }
	      if(tempA<0 || tempB < 0) 
		  {
	    	 erg = erg ;
		  }
	      System.out.println(erg);
	    }
	    
	    
	    if(b < 0)
	    {
	      for(int i=0; i>b; i--)
	      {
	        erg=erg/a;
	      }
	      System.out.println(erg);
	    }
	    
	    sc.close();
	  }
}
