package diverses;

import java.util.Scanner;
public class Hangman 
{
	public static void main(String[] args) 
	{
		char a= 'A';
		String b = "BB";
		b.toLowerCase();
		Hangman h=new Hangman();
		h.start();
	}

	
	public void start() 
	{
		// Wähle zufälliges Wort und ermittle dessen Länge
		String word = RandomWord();
		//int laenge = word.length();
		playHangman(word);
	}

	private void playHangman(String word) 
	{
		// initiere counter der durchgegänge
		// missedLetters zählt die noch fehlenden Buchstaben
		// /guesses speichert die erratenen Buchstaben
		char wordArray[] = word.toCharArray();
		
		int counter = 0;
		int missedLetters = wordArray.length;
		Scanner read = new Scanner(System.in);
		
		char[] guesses = initGuesses(wordArray.length);

		while (counter < 15 && missedLetters > 0) 
		{
			char letter = readFromConsole(read);
			for (int i = 0; i < wordArray.length; i++) 
			{
				// sucht den Buchstaben im Wort und schreibt an entsprechende
				// Stelle in guesses
				if (Character.toUpperCase(letter) == Character.toUpperCase(word.charAt(i))) 
				{
					guesses[i] = word.charAt(i);
					--missedLetters;
				}
			}
			System.out.print(1 + counter++ + ". Versuch: ");
			System.out.println(guesses);
		}
		System.out.println("");
		
		
		Boolean youWin = false;
		for(int i = 0; i<word.length(); i++) 
		{
			if(wordArray[i] == guesses[i]) 
			{
				youWin = true;
				
			}else 
			{
				youWin = false;
				break;
			}
		}
		if(youWin) 
		{
			System.out.println("you win");
		}else 
		{
			System.out.println("you lose");
		}
		read.close();
	}

	private char[] initGuesses(int laenge) 
	{
		char[] guesses = new char[laenge];
		for (int i = 0; i < laenge; guesses[i++] = '-');
		System.out.println(guesses);
		return guesses;
	}

	private char readFromConsole(Scanner read) 
	{
		// lese solange bis eine sinnvolle Eingabe gemacht wurde
		// damit wird die Leere Eingabe verhindert.
		char response = 10;
		do 
		{
			try 
			{
				response = read.nextLine().charAt(0);
			
			} catch (Exception e) 
			{
				System.out.println("Bitte Buchstaben eingeben!");
			}
		} while (response == 10);
		return response;
	}

	public String RandomWord() 
	{
		int b=0;
		do 
		{
			double a = Math.random()*10;
			b = (int)a;
			
		}while(b >2);
		
		String[] words = { "programmiersprache","test","alter" }; // hier sollen 20Wörter sein danach die obere While schleife anpassen so das sie zahlen zwichen 0 und 19 auswählt
		//int n = (int) (Math.random() * words.length - 1);
		
		return words[b];
	}
}
