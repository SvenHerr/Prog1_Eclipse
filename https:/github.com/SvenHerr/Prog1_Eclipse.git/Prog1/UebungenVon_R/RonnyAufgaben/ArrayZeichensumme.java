package RonnyAufgaben;

public class ArrayZeichensumme {

	public static void main(String[] args) 
	{
		
		String array[] = new String[10];
		
		array[0] = "hallo";
		array[1] = "halloa";
		array[2] = "ich bin toll";
		array[3] = "test";
		array[4] = "langweilig";
		array[5] = "ooooooo";
		array[6] = "otto";
		array[7] = "Auto";
		array[8] = "bebe";
		array[9] = "lool";
		
		System.out.println(Summe(array));
		
		String arr[]= AddZ(array);
		for(int i  = 0; i< arr.length; i++) 
		{
			System.out.println(arr[i]);
		}
		

	}
	public static int Summe(String arr[]) 
	{
		int count = 0;
		for(int i= 0; i< arr.length; i++) 
		{
			count += arr[i].length();
		}
		return count;
	}

	public static String[] AddZ(String arr[]) 
	{
		int temp = 0;
		String tempString = "";
		String tempString1 ="";
		
		for(int i = 0;  i<arr.length; i++) 
		{
			temp = arr[i].length()/2;
			tempString = arr[i];
			tempString1 = tempString.substring(0, temp);
			tempString1 += "z";
			tempString = arr[i].substring(temp, arr[i].length());
			arr[i] = tempString1 + tempString;
		}
		return arr;
	}
}
