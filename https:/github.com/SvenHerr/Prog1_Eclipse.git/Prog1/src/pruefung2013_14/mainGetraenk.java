package pruefung2013_14;

public class mainGetraenk 
{
	public static void main(String[] args) 
	{
		Getraenk a = new Getraenk("n1", 0.5, 3.0);
		
		System.out.println(a.toString());
		
		
		SaftGetraenk b = new SaftGetraenk("n2", 2.7, 3.5, 33.0);
		System.out.println(b.toString());
		
	}

}
