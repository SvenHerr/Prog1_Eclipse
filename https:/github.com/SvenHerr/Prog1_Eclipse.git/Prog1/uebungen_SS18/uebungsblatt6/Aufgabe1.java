package uebungsblatt6;

public class Aufgabe1 
{
	public static void main(String[]args) 
	{
		float gradCelsius = 0f;
		float gradCelsiusMitZweiNachkommastellen = 0f;
		int gradCelsiusAbgeschnitten = 0;
		
		System.out.println("Fahrenheit \t Celsius");
		for(int i = 0; i <= 300; i++) 
		{
			gradCelsius = (5.0f/9.0f) * (i - 32.0f);
			gradCelsiusAbgeschnitten = (int) (gradCelsius*100);
			gradCelsiusMitZweiNachkommastellen = (gradCelsiusAbgeschnitten / 100.0f);
			System.out.println(i + "\t\t" + gradCelsiusMitZweiNachkommastellen);
		}
	}
}
