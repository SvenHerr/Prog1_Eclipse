package RonnyAufgaben;

public class Buch 
{
	private String autor;
	private String inhalt;
	private int erscheinungsjahr; 
	private String titel;
	
	private static Buch[] buch;
	
	public Buch(String autor, String inhalt, int erscheinungsjahr, String titel) 
	{
		this.setAutor(autor);
		this.inhalt = inhalt;
		this.erscheinungsjahr = erscheinungsjahr;
		this.titel = titel;
		
		if(buch == null) 
		{
			buch = new Buch[1];
			buch[0] = this;
		}else 
		{
			Buch[] tmp = new Buch[buch.length + 1];
			for(int i = 0; i < buch.length; i++)
			{
				tmp[i] = buch[i];
			}
			tmp[tmp.length - 1] = this;
			buch = tmp;
		}
	}
	
	public static Buch GibBuch(String titel) 
	{
		for(int i = 0; i<buch.length; i++) 
		{
			if(buch[i].titel.equals(titel)) 
			{
				return buch[i];
			}
		}
		return null;
	}
	public static Buch[] GibBuchNachErscheinungsjahr(int erscheinungsjahr) 
	{
		int count = 0;
		int temp = 0;
		for(int i = 0; i<buch.length; i++) 
		{
			if(buch[i].erscheinungsjahr == erscheinungsjahr) 
			{
				count++;
			}
		}
		
		Buch[] newArray= new Buch[count];
		for(int i = 0; i<buch.length; i++) 
		{
			if(buch[i].erscheinungsjahr == erscheinungsjahr) 
			{
				newArray[temp] = buch[i];
				temp++;
			}
		}
		return newArray;
	}

	public String getAutor() 
	{
		return autor;
	}

	public void setAutor(String autor) 
	{
		this.autor = autor;
	}
}
