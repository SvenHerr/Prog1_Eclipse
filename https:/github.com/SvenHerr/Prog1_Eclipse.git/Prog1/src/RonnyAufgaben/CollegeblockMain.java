package RonnyAufgaben;

public class CollegeblockMain 
{

	public static void main(String[] args) 
	{
		int array[][] = new int[2][2];
		array[0][0] = 2; 				// anzahl Blöcke
		array[0][1] = 80; 				// anzahl Blätter pro Block
		
		array[1][0] = 2; 				// anzahl Blöcke
		array[1][1] = 160;				// anzahl Blätter pro Block
		
		
		Collegeblock a = new Collegeblock(array);
		
		System.out.println(a.Berechne(array));
	}
}
