import java.util.*;

public class Music{
	// instance variables
	private int year;
	private String title;
	private String singer;
	private Music[] myMusic;
	/**
	 * Constructor for objects of class music
	 */
	Music(String t, int y, String s) {
		// initialize instance variables
		title = t;
		year = y;
		singer = s;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String t) {
		title = t;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String s) {
		singer = s;
	}
	public int getYear() {
		return year;
	}

	public void setYear(int y) {
		year = y;
	}

	public String toString() {
		String m;
		m = title + ", " + year + ", " + singer;
		return m;
	}
	public void printMusic(Music[] myMusic) {
		for (Music i : myMusic) {
			System.out.println(i);
		}
		System.out.println(" ");
	}
}
