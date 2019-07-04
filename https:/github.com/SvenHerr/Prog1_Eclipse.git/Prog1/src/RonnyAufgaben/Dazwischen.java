package RonnyAufgaben;

public class Dazwischen 
{
	public static int [] Einfuegen(int element, int position) 
	{
		int [] array = {2,3,5};
		int [] arrayNew = new int [array.length + 1];
		int temp = 0;
		
		for(int i = 0; i < arrayNew.length; i++) 
		{
			if(i != position) 
			{
				arrayNew[i] = array[temp];
				temp++;
			}else 
			{
				arrayNew[i] = element;
			}
		}
		return arrayNew;
	}
	
	public static void main(String []args) 
	{
		int a[] = Einfuegen(4,1);
		for(int i = 0; i< a.length; i++) 
		{
			System.out.println(a[i]);
		}		
	}
}
