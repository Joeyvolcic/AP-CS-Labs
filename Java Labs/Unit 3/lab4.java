import java.util.Scanner;
public class lab4 {
	public static void main(String [] args) {
	
		int run = 1;
		double total = 0.0;
		while(run <= 3)
		{
			System.out.println("[1] Hamburger ($2.00)");
			System.out.println("[2] Fries ($1.50)");
			System.out.println("[3] Soda ($1.25)");
			System.out.println("[4] Quit");
			System.out.print("Enter a selection:");
			
			Scanner myScan = new Scanner(System.in);
			String run1 = myScan.nextLine();
			run = Integer.parseInt(run1);
			
			if (run == 1) total += 2.00;
			else if (run == 2) total += 1.50;
			else if (run == 3) total += 1.25;
			else;
					
			
		}
		
		System.out.printf("The total cost is $" + total);
		
	}
	
}
