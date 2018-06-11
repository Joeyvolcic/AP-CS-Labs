import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class MusicLibrary {
	//Instance variables
private ArrayList <String> myLibrary  = new ArrayList<String>();
private String find;
private String fill;


//Set myLibrary to the value in the parameter and others to null.
public MusicLibrary(ArrayList<String> l){
	myLibrary = l;
}



//Searches to see if song is in list. If not, it adds it and returns the sorted list
public ArrayList<String> addSong(String song){
	boolean songtest = false;
	for(int run = 0; run < myLibrary.size(); run++) {
		if( myLibrary.get(run).equals(song)) {
			songtest = true;
		}	
	}
	if(songtest == false) {
	myLibrary.add(song);
	}
	return myLibrary;
}
//Returns the sorted list of music in alphabetical order.
public ArrayList<String> sortList(){
	Collections.sort(myLibrary);
	
   return myLibrary;
}

//Removes a given song from the list (if it is in the list) and returns the sorted list
public ArrayList<String> removeSong(String s){
	for(int run = 0; run < myLibrary.size(); run++) {
		if(s.equals(myLibrary.get(run))) {
			myLibrary.remove(myLibrary.get(run));
			
		}
	}
	Collections.sort(myLibrary);
	return myLibrary;
}
//Returns a list of songs that start with the given letter
public ArrayList<String> getList(String s){
	ArrayList <String> Library  = new ArrayList<String>();
	char S = s.charAt(0);
	for (int run = 0; run < myLibrary.size(); run++) {
		char num = (myLibrary.get(run).charAt(0));
		if(num == S ) {
			Library.add(myLibrary.get(run));
		}
	}
	return Library;
	
	
}
}
