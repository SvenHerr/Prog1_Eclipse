package diverses;

public class Aufgabenblatt10Aufgabe4 
{
	public static void main(String[] args) 
	{
		String result = null;
		String anfang = "https:";
		String ende = ".png";
		
		String str = "<body id=\"www‐wikipedia‐org\">"
									+ "<div class=\"central‐textlogo\">"
									+ "<img src=\"https://upload.wikimedia.org/wikipedia/commons/thumb"
									+ "/b/bb/Wikipedia_wordmark.svg/174px‐Wikipedia_wordmark.svg.png\""
									+ "</div>"
									+ "</body>";
		
		
		int anfangIndex = str.indexOf(anfang);
		int endIndex = str.indexOf(ende)+ende.length();
		
		result = str.substring(anfangIndex,endIndex);
		System.out.println(result);
	}
}

