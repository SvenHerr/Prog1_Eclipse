package AufgSammlungKlausuren;

public class Passwort 
{
	String pw;
	
	public Passwort(String pw) 
	{
		if(alsPWgeeignet(pw)) 
		{
			this.pw = pw;
		}
		else 
		{
			this.pw = null;
		}
	}
	
	public boolean alsPWgeeignet(String pw) 
	{
		if(pw.length() < 8) 
		{
			return false;
		}
		
		int countUppercase = 0;
		int countLowercase = 0;
		int countZiffern = 0;
		for(int i = 0; i < pw.length(); i++) 
		{
			//if(Character.isUpperCase(pw.charAt(i))) 
			if(pw.charAt(i) >= 'A' && pw.charAt(i) <= 'Z') 
			{
				countUppercase++;
			}
			//if(Character.isLowerCase(pw.charAt(i))) 
			if(pw.charAt(i) >= 'a' && pw.charAt(i) <= 'z') 
			{
				countLowercase++;
			}
			if(pw.charAt(i) >= '0' && pw.charAt(i) <= '9') 
			{
				countZiffern++;
			}
		}
		
		if(countUppercase < 2 || countLowercase < 2 || countZiffern < 2) 
		{
			return false;
		}
		/*
		if(countUppercase >= 2 && countLowercase >= 2 && countZiffern >= 2) 
		{
			return true;
		}*/
		
		return true;
	}
	
	public String toString() 
	{
		if(pw == null) 
		{
			return "Kein gueltiges Passwort!";
		}
		
		String result = "";
		for(int i = 0; i < pw.length(); i++) 
		{
			result += "*";
		}
		
		return result;
	}
	
	public boolean pwAendern(String pwNeu) 
	{
		
		if(!alsPWgeeignet(pwNeu) || this.pw == null) 
		{
			return false;
		}
		
		if(pwNeu.charAt(0) == this.pw.charAt(0) || pwNeu.charAt(pwNeu.length()) == this.pw.charAt(this.pw.length())) 
		{
			return false;
		}
		
		pw = pwNeu;
		
		return true;
	}
	
	public static void main(String[]args) 
	{
		String pwFalsch = "12345678";
		String pwFalsch1 = "fFlol12O";
		String pwRichtig = "FFlol12o";
		
		Passwort p = new Passwort(pwFalsch);
		//System.out.println(p.alsPWgeeignet(pwRichtig));
		System.out.println(p.toString());
		
		Passwort p1 = new Passwort(pwRichtig);
		System.out.println(p1.toString());
		
		System.out.println(p1.pwAendern(pwFalsch));
		
	}
}
