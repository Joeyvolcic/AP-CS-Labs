import java.util.Scanner;

public class lab7 {
	public static void main (String [] args) {
		
		 char yn = 'Y';
		 String S = "";
			while(yn == 'Y') {
			
		
		 Scanner myScan = new Scanner(System.in);
		 String input = "";
		
		 System.out.print("Enter a possible palidrome: ");
		 String entery = myScan.nextLine();
		 
		 String n = entery;
		 n = n.replaceAll("\\s","");
		 n = n.replaceAll("\\.","");
		 n = n.replaceAll(",","");
		 n = n.replaceAll("!","");
	
		 n = n.toLowerCase();
		 System.out.println(n);
		 int length = n.length();
		 int count = 0;
		 int num = 0;
		 int j = 0;
		 
		 
		 for(int i = 0;  i < length; i++,j++) {
			 if(n.charAt(num + i ) != n.charAt(length - 1 - j)) {
				 count = count += 1;
			
			 }
			 else
			 {
				count = count +=0;
			 }
			
			 if (count == 0) {
				 System.out.print(entery + " is a palidrome");
				 break;
			 }else {
				 System.out.print(entery + " not a palidrome");
				 break;
		 }
			 
	}
		 System.out.println("Would you like to continue: ");
		 S = myScan.nextLine();
		 yn = S.charAt(0);	
}}}
