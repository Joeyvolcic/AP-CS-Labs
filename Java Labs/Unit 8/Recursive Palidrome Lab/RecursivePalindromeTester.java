import java.util.Scanner;

public class RecursivePalindrome extends RecursivePalindromeTester {
	
	   public static boolean isPalindrome(String s){  
	        if(s.length() == 0 || s.length() == 1)
	            return true; 
	        if(s.charAt(0) == s.charAt(s.length()-1))
	        return isPalindrome(s.substring(1, s.length()-1));

	        return false;
	    }
	   public static String remove (String string) {

         string = string.replaceAll("\\s+","");
     	 string = string.replaceAll("\\.","");
  	     string = string.replaceAll(",","");
		 string = string.replaceAll("!","");
  	     string = string.toLowerCase();
  	     return string;
	}
}
