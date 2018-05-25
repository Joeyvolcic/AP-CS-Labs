import java.util.Scanner;

public class RecursivePalindromeTester {
    public static void main(String[]args)
    {
    	String string   = "";
    	String input    = "";
    	String entiers  = "";
        Scanner scanner = new Scanner(System.in);
        
        while (!string.equals("quit")) {
        	System.out.print("Enter a atring or phrase or quit to quit:");
        	 string = scanner.nextLine();
	         string = RecursivePalindrome.remove(string);

        	if(RecursivePalindrome.isPalindrome(string) && !string.equals("quit")) {
        		entiers += string + " is a palindrome" + System.lineSeparator();
        	}else if(!string.equals("quit")){
        		entiers += string + " is not a palindrome" + System.lineSeparator();
        	}
        }
        System.out.print(entiers);
    }
}
