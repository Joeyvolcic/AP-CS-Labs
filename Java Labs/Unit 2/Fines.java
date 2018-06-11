import java.util.Scanner;

public class Fines {
	public static void main(String [] args){


String[] commands = {};
                Scanner myScan = new Scanner(System.in);
                String input1 = "";
                String title = "";
                String dateOut = "";
                String daysLate = "";
                double dailyFine;
               
                System.out.print("Enter name (Last, First): ");
                input1 = myScan.nextLine();
            
               
                System.out.print("\nEnter Book title: ");
                title = myScan.nextLine();
               
                System.out.print("\nEnter Date Out (mm/dd/yy): ");
                dateOut = myScan.nextLine();
               
                System.out.print("\nDays Late: ");
                daysLate = myScan.nextLine();
               
                System.out.print("\nDaily fine: ");
                dailyFine = myScan.nextDouble();
               
                System.out.println("\nTo: "+input1+"\tAccount #: SHCS-XXXX");
                System.out.println("From :Joey volcic");
                System.out.println("Subject: Overdue book");
                System.out.println("******************************************");
                System.out.println(title+" was checked out on "+dateOut);
                System.out.println("This book is currently " + daysLate + " days late");
                Double Late = Double.parseDouble(daysLate);
                System.out.print("your fine has accumulated to: " + (Late *dailyFine ));

	}
}
