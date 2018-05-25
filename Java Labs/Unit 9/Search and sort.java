import java.util.*;

public class Lab1 {
	private Music[] music = { new Music("First Kiss", 2005, "Kid Rock"), new Music("Kid A", 2000, "Radiohead"),
			new Music("The Blueprint", 2001, "Jay-Z"), new Music("American Idiot", 2004, "Green Day"),
			new Music("Love and Theft", 2001, "Bob Dylan"), new Music("The Truth about Love", 2012, "Pink"),
			new Music("Funhouse", 2008, "Pink"), new Music("Based on a True Story", 2013, "Blake Shelton"),
			new Music("Let it Go", 2007, "Tim McGraw"), new Music("Stay Trippy", 2013, "Juicy J") };
	public void printMusic() {
		for (Music i : music) {
			System.out.println(i);
		}
	}
	public String[] sortTitle(Music[] muse) {
		int i, j;
		String key;
		String[] inputArray = new String[music.length];
		for (int i1 = 0; i1 < music.length; i1++) {
			inputArray[i1] = muse[i1].getTitle().toLowerCase();
		}
		// System.out.println(Arrays.toString(inputArray));
		for (j = 1; j < inputArray.length; j++) { // the condition has changed
			key = inputArray[j];
			i = j - 1;
			while (i >= 0) {
				if (key.compareTo(inputArray[i]) > 0) {// here too
					break;
				}
				inputArray[i + 1] = inputArray[i];
				i--;
			}
			inputArray[i + 1] = key;
			// System.out.println(Arrays.toString(inputArray));
		}
		// System.out.println(Arrays.toString(inputArray));
		return inputArray;
	}
	public int[] sortYear(Music[] muse) {
		int[] arr = new int[music.length];
		for (int i1 = 0; i1 < music.length; i1++) {
			arr[i1] = muse[i1].getYear();
		}
		for (int i = 0; i < arr.length - 1; i++) {
			// System.out.println(Arrays.toString(arr));
			int index = i;
			for (int j = i + 1; j < arr.length; j++)
				if (arr[j] < arr[index])
					index = j;
			int smallerNumber = arr[index];
			arr[index] = arr[i];
			arr[i] = smallerNumber;
		}
		return arr;
	}
	public static String[] mergeSort(String[] list) {
		String[] sorted = new String[list.length];
		if (list.length == 1) {
			sorted = list;
		} else {
			int mid = list.length / 2;
			String[] left = null;
			String[] right = null;
			if ((list.length % 2) == 0) {
				left = new String[list.length / 2];
				right = new String[list.length / 2];
			} else {
				left = new String[list.length / 2];
				right = new String[(list.length / 2) + 1];
			}
			int x = 0;
			int y = 0;
			for (; x < mid; x++) {
				left[x] = list[x];
			}
			for (; x < list.length; x++) {
				right[y++] = list[x];
			}
			left = mergeSort(left);
			right = mergeSort(right);
			sorted = mergeArray(left, right);
		}
		return sorted;
	}
	

	public String[] sortArtist(Music[] muse) {
		String[] sorted = new String[music.length];
		String[] list = new String[music.length];
		for (int i = 0; i < music.length; i++) {
			list[i] = muse[i].getSinger();
		}
		if (list.length == 1) {
			sorted = list;
		} else {
			int mid = list.length / 2;
			String[] left = null;
			String[] right = null;
			if ((list.length % 2) == 0) {
				left = new String[list.length / 2];
				right = new String[list.length / 2];
			} else {
				left = new String[list.length / 2];
				right = new String[(list.length / 2) + 1];
			}
			int x = 0;
			int y = 0;
			for (; x < mid; x++) {
				left[x] = list[x];
			}
			for (; x < list.length; x++) {
				right[y++] = list[x];
			}
			left = mergeSort(left);
			right = mergeSort(right);
			sorted = mergeArray(left, right);
		}
		return sorted;
	}
	private static String[] mergeArray(String[] left, String[] right) {
		String[] merged = new String[left.length + right.length];
		int lIndex = 0;
		int rIndex = 0;
		int mIndex = 0;
		int comp = 0;
		while (lIndex < left.length || rIndex < right.length) {
			if (lIndex == left.length) {
				merged[mIndex++] = right[rIndex++];
			} else if (rIndex == right.length) {
				merged[mIndex++] = left[lIndex++];
			} else {
				comp = left[lIndex].compareTo(right[rIndex]);
				if (comp > 0) {
					merged[mIndex++] = right[rIndex++];
				} else if (comp < 0) {
					merged[mIndex++] = left[lIndex++];
				} else {
					merged[mIndex++] = left[lIndex++];
				}
			}
		}
		return merged;
	}
	public String searchArtist(Music[] music, String title )
	{
	   int mid;
	   int bot= 0, top = music.length-1;
	   while(bot<=top)  
	   {
	      int middle = (bot + top) / 2;
	      if (music[middle].getSinger().equals(title))  return "Found: " + music[middle].toString();
	      else
	         if (music[middle].getSinger().compareTo(title) == -1)
	            top = middle-1;
	         else
	            bot = middle+1;
	      mid = middle;
	   }
	   return"Found: " + music[1].toString();
	}
	
	
	public void searchTitle(String title, Music[] myMusic) {
		int counter = 0;
		Music a = null;
		for (int i = 0; i < myMusic.length; i++) {
			if (title.equals(myMusic[i].getTitle())) {
				a = myMusic[i];
				counter++;
				break;
			}
		}
		if (counter > 0) {
			System.out.println("Found: " + a.getTitle() + " " + a.getSinger() + " " + a.getYear());
		} else {
			System.out.println(title + "was not found.");
		}
	}

	
	public void searchYear(int year, Music[] myMusic) {
		int counter = 0;
		Music a = null;
		for (int i = 0; i < myMusic.length; i++) {
			if (year == myMusic[i].getYear()) {
				a = myMusic[i];
				counter++;
				if (counter > 0) {
					System.out.println("Found: " + a.getTitle() + " " + a.getSinger() + " " + a.getYear());
				}
				else {
				}
			}
		}
		if (counter == 0) {
			System.out.println(year + "was not found.");
		}
	}
	}
