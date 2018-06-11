import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;


public class MusicLibraryTester {
public static void main(String [] args){
	
	ArrayList<String> m = new ArrayList<String>();
	//You can ignore this code.  It is for reading the text file.
	try {
		File file = new File("song titles.txt");
		Scanner fileReader = new Scanner(file);
		
		String line;
		while (fileReader.hasNext()) {
			m.add(fileReader.nextLine());
			
		}
		fileReader.close();
		
	} catch (IOException e) {
		e.printStackTrace();
	}
	
	//Tester Code
	MusicLibrary test = new MusicLibrary(m);
	System.out.println(test.sortList()); //Should print library of music
	test.addSong("Goodbye Earl");
	System.out.println (test.getList("G"));  //Expects [Get Lucky, Glitter in the Air, Goodbye Earl]
	test.removeSong("Baby Got Back");
	System.out.println(test.getList("B")); //Expects [Bad, Bad Touch, Beds, Blank Space]

}
}