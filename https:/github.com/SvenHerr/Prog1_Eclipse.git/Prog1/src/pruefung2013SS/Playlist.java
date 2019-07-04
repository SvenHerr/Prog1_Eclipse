package pruefung2013SS;

public class Playlist 
{
	public Musikstueck[] createPlaylist() 
	{
		Musikstueck a[] = new Musikstueck[3];
		a[0] = new Musikstueck("Eminem0", "8Mile0", 180);
		a[1] = new Musikstueck("Eminem1", "8Mile1", 170);
		a[2] = new Musikstueck("Eminem2", "8Mile2", 160);
		
		return a;
	}
}
