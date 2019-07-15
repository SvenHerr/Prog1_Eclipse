package diverses;

public class Umlaute 
{
	public static void main(String[]args) 
	{
		//char a[] = {'ü', 'b', 'e','l'}; 
		char a[] = {'s', 'c', 'h','ö','n'}; 
		char bNeu[] = new char[a.length + 1];
		
		int temp = 0;
		for(int i  = 0; i < bNeu.length; i++) 
		{
			
			if(a[temp] == 'ü') 
			{
				bNeu[i] = 'u'; 
				bNeu[i+1] = 'e'; 
				temp++;
				i = i +1;
			}
			else if(a[temp] == 'Ü') 
			{
				bNeu[i] = 'U'; 
				bNeu[i+1] = 'e'; 
				temp++;
				i = i +1;
			}
			else if(a[temp] == 'ä') 
			{
				bNeu[i] = 'a'; 
				bNeu[i+1] = 'e'; 
				temp++;
				i = i +1;
			}
			else if(a[temp] == 'Ä') 
			{
				bNeu[i] = 'a'; 
				bNeu[i+1] = 'e'; 
				temp++;
				i = i +1;
			}
			else if(a[temp] == 'ö') 
			{
				bNeu[i] = 'o'; 
				bNeu[i+1] = 'e'; 
				temp++;
				i = i +1;
			}
			else if(a[temp] == 'Ö') 
			{
				bNeu[i] = 'o'; 
				bNeu[i+1] = 'e'; 
				temp++;
				i = i +1;
			}
			else 
			{
				bNeu[i] = a[temp];
				temp++;
			}
		}
		for(int i  = 0; i < bNeu.length; i++) 
		{
			System.out.print(i +" ");
			System.out.println(bNeu[i]);		
		}
	}
}
