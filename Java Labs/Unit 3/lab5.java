imimport java.util.Scanner;
public class odd {
	public static void main(String[] args) {
	
		int x = 0;
		int evenCount = 0;
		int length = 0;
		int run = 0;
		int yn =1;
		
		while(yn == 1) {
			System.out.print("Enter a number: ");
		Scanner myScan = new Scanner(System.in);
		String y = myScan.nextLine();
		length = y.length();
		
		
		
		
		while(run < length) {
			x = Integer.parseInt(y.substring(run, run+1));
			if (x % 2 == 0) {
				evenCount++;
			}
			run++;
		}
		
		if (evenCount == 0) {
			System.out.println("All numbers are odd.");
		}
		else
		{
			System.out.println("Not all numbers are odd.");
		}
			
		System.out.println("Would you like to run again (Enter 1 for yes 2 for no);");
		String Yn = myScan.nextLine();
		yn = Integer.parseInt(Yn);
	}
				
		
		
	
	
	
	
	
}
	
}
