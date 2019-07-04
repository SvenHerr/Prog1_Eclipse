package pruefung2013SS;

public class Player 
{
	public static void showPlaylist(Playlist list) 
	{
		Musikstueck b[] = list.createPlaylist();
		for(int i = 0; i < b.length; i++) 
		{
			System.out.println("InterPretName " +b[i].getInterpret() +"\n"+ "Länge "+ b[i].getLaenge()+ "\n");
		}
	}

	public static void main(String[]args) 
	{
		Playlist a = new Playlist();
		showPlaylist(a);
	}
}