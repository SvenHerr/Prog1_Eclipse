package diverses;

public class TestAlgorithmus 
{
	
	public static int[] X(int []b) 
	{
		int c;
		for(int d = 0; d < b.length; d++) 
		{
			for(int d1 = 0; d < b.length-d; d++ ) 
			{
				if(b[d] > b[d+1]) 
				{
					c = b[d];
					b[d] = b[d+1];
					b[d+1] = c;
				}
			}
	
		}
		return b;
	}
	
	public static void main(String[]args) 
	{
		int b[] = {2,1,6,3,9};
		
		int b1[] = X(b);
		
		for(int i  = 0; i< b1.length; i++) 
		{
			System.out.println(b1[i]);
		}
	}
}
