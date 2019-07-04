package RonnyAufgaben;

public class BuecherFinden 
{
	
	public static void main(String[] args) 
	{
		Buch a = new Buch("test", "test1", 2, "test2");
		
		Buch b = a.GibBuch("test2");
		
		
		System.out.println(b.getAutor());
		
	}

}
