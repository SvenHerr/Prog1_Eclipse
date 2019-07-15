package diverses;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
	
public class Aufgabenblatt10Aufgabe4Rauch 
{
	
	public static void main(String[] args) throws IOException
	{
		String downloadUrl = CutLinkOutJPG();
		//String downloadUrl = CutLinkOutPNG();
		//String downloadUrl = "https://upload.wikimedia.org/wikipedia/commons/7/7b/Gr%C3%BCne_Augen_einer_Katze.JPG"; 
		URL url = new URL(downloadUrl);
		BufferedImage image = ImageIO.read(url);
		ImageIO.write(image, "jpg", new File("bild3.jpg"));
	}
	
	private static String CutLinkOutPNG() 
	{
		String result = null;
		String anfang = "https:";
		String ende = ".png";
		
		// Dieser Link funkktioniert nicht!
		String str = "<body id=\"www‐wikipedia‐org\">" + "<div class=\"central‐textlogo\">" 
						+ "<img src=\"https://upload.wikimedia.org/wikipedia/commons/thumb" 
						+ "/b/bb/Wikipedia_wordmark.svg/174px‐Wikipedia_wordmark.svg.png\"" + "</div>" + "</body>";
	
		int anfangIndex = str.indexOf(anfang);
		int endIndex = str.indexOf(ende)+ende.length();
		
		result = str.substring(anfangIndex,endIndex);
		System.out.println(result);
		
		return result;
	}
	private static String CutLinkOutJPG() 
	{
		String result = null;
		String anfang = "https:";
		String ende = ".JPG";
		
		
		String str = "<body id=\"www‐wikipedia‐org\">" + "<div class=\"central‐textlogo\">" 
						+ "<img src=\"https://upload.wikimedia.org/wikipedia/commons/7/7b/Gr%C3%BCne_Augen_einer_Katze.JPG\"" + "</div>" + "</body>";
	
		int anfangIndex = str.indexOf(anfang);
		int endIndex = str.indexOf(ende)+ende.length();
		
		result = str.substring(anfangIndex,endIndex);
		//System.out.println(result);
		
		return result;
	}
}
