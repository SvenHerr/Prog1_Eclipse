package uebungsblatt2;

public class Aufgabe2 
{
	public static void main(String[]args) 
	{
	//  We are not allowed to use Math.pow
		double radius = 5.0;
		double radiusPow2 = (radius*radius);
		double radiusPow3 = (radius*radius*radius);
		
		double ergKreisflaeche = radiusPow2 * Math.PI;
		double ergKreisUmfang = 2* Math.PI * radius;
		double ergKugelVolumen = ((4.0/3.0) * Math.PI * radiusPow3);
		
		System.out.println("Kreisflaeche von radius:"+ radius +" = " + ergKreisflaeche);
		System.out.println("Kreisumfang von radius:"+ radius +" = " + ergKreisUmfang);
		System.out.println("Kugelvolumen von radius:"+ radius +" = " + ergKugelVolumen);
	}
}
