package pruefung2018WS;

public class MagischesQuadrat 
{
	public static void main(String[]args) 
	{
		int arr[][] = new int[3][3];
		arr[0][0] = 3; arr[0][1] = 7; arr[0][2] = 5;
		arr[1][0] = 6; arr[1][1] = 3; arr[1][2] = 6;
		arr[2][0] = 6; arr[2][1] = 5; arr[2][2] = 4;
		
		System.out.println("Summe der diagonalen: " + berechneDiagonalSumme(arr));
		System.out.println("Summe der gegendiagonalen: " + berechneGegenDiagonalSumme(arr));
	}
	
	public static int berechneDiagonalSumme(int arr[][]) 
	{
		int erg = 0;
		for(int i  = 0; i < arr.length; i++) 
		{
			erg = erg + arr[i][i];
		}
		return erg;
	}
	public static int berechneGegenDiagonalSumme(int arr[][]) 
	{
		int erg = 0;
		for(int i  = 0; i < arr.length; i++) 
		{
			erg = erg + arr[i][(arr.length-1) - i];
		}
		return erg;
	}
}
