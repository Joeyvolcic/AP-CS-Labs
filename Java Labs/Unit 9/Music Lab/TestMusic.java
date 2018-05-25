import java.util.Arrays;

public class TestMusic {
	public static void main(String... args) {
		Music[] songs = { new Music("First Kiss", 2005, "Kid Rock"), new Music("Kid A", 2000, "Radiohead"),
				new Music("The Blueprint", 2001, "Jay-Z"), new Music("American Idiot", 2004, "Green Day"),
				new Music("Love and Theft", 2001, "Bob Dylan"), new Music("The Truth about Love", 2012, "Pink"),
				new Music("Funhouse", 2008, "Pink"), new Music("Based on a True Story", 2013, "Blake Shelton"),
				new Music("Let it Go", 2007, "Tim McGraw"), new Music("Stay Trippy", 2013, "Juicy J") };
		Lab1 music = new Lab1();
		System.out.println(Arrays.toString(music.sortArtist(songs)));
		System.out.println(Arrays.toString(music.sortYear(songs)));
		System.out.println(Arrays.toString(music.sortTitle(songs)));
		System.out.println();
		music.searchTitle("American Idiot", songs);
		music.searchYear(2013, songs);
		System.out.println(music.searchArtist(songs, "Tim McGraw"));
	}
}

