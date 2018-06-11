
import java.util.Scanner; 
import java.io.File; 
import java.io.IOException; 

public class lab3 {
	public static void main(String[] args) throws IOException { 
		String token = ""; 
		String token2 = ""; 
		int count = 0;
		double average = 0;
		
		Scanner input = new Scanner(System.in);
		Scanner inFile = new Scanner(new File("Roch Rain.txt"));
		while (inFile.hasNext()) { 
			inFile.nextLine();
		count++;
		} 
		inFile.close();
		
	 
		Scanner inFile1 = new Scanner(new File("Roch Rain.txt")); 	
		
		String[] months = new String[count];
		double[] percip = new double[count];
	
	for(count = 0; count < 12; count++) { 

			token = inFile1.next(); 
			token2 = inFile1.next();
			months[count] = token;
			double token3 = Double.parseDouble(token2);
			percip[count] = token3;
			
} 
	System.out.print("Do you want int in inches(1) or centimeters(2): ");
		int unit = input.nextInt();
	if (unit == 2) {
		for(int A = 0; A < count;A++)
		{
		    percip[A] = (percip[A] * 2.54);
		    percip[A] = Math.round(percip[A] * 100.0)/100.0;
		}
		
	}
		
		inFile1.close(); 
		System.out.println("***************************************************************************************************************");
		System.out.print("Months: ");
		for(String  item :months)
		{
		     System.out.print(item + "      "); 	
		}
		System.out.println();
		System.out.print("rain:   ");
		for(double rain :percip)
		{
		     System.out.print(rain + "     "); 	
		}
		System.out.println();
		System.out.println("***************************************************************************************************************");
		
		for(double rain :percip)
		{
		     average = (average + rain);
		}
		average = average / count;
		average =Math.round(average * 100.0)/100.0;
		System.out.print("Average: " + average);
		} 
	
	
	
	}

