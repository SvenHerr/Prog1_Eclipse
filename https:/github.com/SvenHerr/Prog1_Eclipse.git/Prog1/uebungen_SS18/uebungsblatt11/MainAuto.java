package uebungsblatt11;

public class MainAuto 
{
	public static void main(String[] args) 
	{
		Auto bmw = new Auto("BMW", 123.45, "Weiß", 150);
		Auto audi = new Auto("Audi", 90.0, "Schwarz", 90);
		Auto vw = new Auto("VW", 120.99, "Weiß", 200);
		
		if(bmw.getHubraum() > audi.getHubraum() && bmw.getHubraum() > vw.getHubraum()) 
		{
			System.out.println("bmw hat den größten Hubraum");
		}
		else if(audi.getHubraum() > bmw.getHubraum()  && audi.getHubraum() > vw.getHubraum())
		{
			System.out.println("audi hat den größten Hubraum");
		}else 
		{
			System.out.println("vw hat den größten Hubraum");
		}
	}
}
