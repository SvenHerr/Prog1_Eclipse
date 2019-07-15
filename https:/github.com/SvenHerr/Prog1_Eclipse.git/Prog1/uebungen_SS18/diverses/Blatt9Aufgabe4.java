package diverses;

public class Blatt9Aufgabe4 {

	public static void main(String[] args) 
	{
		// Option A bedeutet es ist Übersichtlicher 
		char param1[] = new char[4];
		param1[0] = 'a';
		param1[1] = 'b';
		param1[2] = 'c';
		param1[3] = 'd';
		
		char param2[] = new char[4];
		param2[0] = 'e';
		param2[1] = 'f';
		param2[2] = 'g';
		param2[3] = 'h';
		
		//int sumLength = param1.length + param2.length;
		
		char result[] = Konkatenieren(param1,param2);
		
		for(int i = 0; i < result.length; i++) 
		{
			System.out.print(result[i]);
		}
		
		// Option B
		/*
		char param3[] = {'a','b','c','d'};
		char param4[] = {'e','f','g','h'};
		char result1[] = Konkatenieren(param3,param4);
		
		for(int i = 0; i < param3.length + param4.length; i++) 
		{
			System.out.println(result1[i]);
		} */
	}
	
	public static char[]Konkatenieren(char parameter1[], char parameter2[])
	{
		int lengthParameter1 = parameter1.length; // Option A
		int lengthParameter2 = parameter2.length; // Option A
		int sumLength = lengthParameter1 + lengthParameter2; // Option A
		
		//int sumLength1 = parameter1.length + parameter2.length; // Option B: mit dieser zweile brauchst du die 3 Zeilen darüber nicht.
		
		char result[] = new char[sumLength];
		
		int i =0; // "i" muss hier sein damit wir es bei der zweiten Schleife auch verwenden können
		for(i = 0; i < lengthParameter1; i++) 
		{
			result[i] = parameter1[i];	
		}
		
		for(int j = 0; j < lengthParameter2; j++) // "j" startet wie gewohnt bei "0". "i" startet aber bei "4". Nicht bei "0" das ist wichtig!
		{
			result[i] = parameter2[j];
			i++;
		} 
		return result;
	}
}
