import java.util.Scanner;

public class Unit2Assingment {
	public static void main(String [] args){
	
		
		String[] commands = {};
        Scanner myScan = new Scanner(System.in);
        String input = "";
        String input2 = "";
        String input3 = "";
        System.out.println("Enter a string: ");
        input = myScan.nextLine().trim();
        System.out.println(input.trim());
        System.out.println("The length is: " + input.length());
       
        System.out.print("/nThe first letter of the string is: ");
        System.out.println(input.charAt(0));
       
        System.out.print("The last letter of the string is: ");
        System.out.println(input.charAt(input.length()-1));
       
        System.out.print("The substring (2nd to 6th) is ");
        System.out.println(input.substring(2,7));
       
        System.out.print("The index of the first space is: ");
        System.out.println(input.indexOf(" "));
       
        System.out.print("/nWhat word would you like to replace? ");
        input2 = myScan.nextLine().trim();
       
        System.out.print("/nWhat word would you like to replace it with? ");
        input3 = myScan.nextLine().trim();
       
        System.out.print(input.replaceAll(input2, input3));

		
		
		
		
	}
	
	
}
