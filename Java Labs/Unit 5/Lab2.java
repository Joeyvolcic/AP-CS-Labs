import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class Lab2 {
	public static void main(String[] args) throws IOException { 	
		ArrayList<String> months;
		months = new ArrayList<String>();
		ArrayList<Integer> temps;
		temps = new ArrayList<Integer>();
		Scanner input = new Scanner(System.in);
		String token = "";
		double A = 0;
		double sum = 0;
		Scanner inFile = new Scanner(new File("Roch Temps (1).txt"));
		String temp;
		while (inFile.hasNext()) {
			// read the month
			token = inFile.next( );
//			System.out.println (token);
			months.add(token);
			// read the temps
			token = inFile.next( );
//			System.out.println (token);
			temps.add(Integer.parseInt(token));
			}
			
		inFile.close();
			System.out.println("Do you want farenheight or celcius:");
			temp = input.nextLine();
		
			int count = 0;
			if(temp.charAt(0) == 'C' || temp.charAt(0) == 'c' ) {
			while(count < temps.size()) {
				
					System.out.print (months.get(count)+"              ");
					
					if (temps.get(count) != 0) {
					System.out.println ((temps.get(count) - 32) / 1.8);
					}
				
				count++;
			}
			
		}else {
		// loop through the array lists
count = 0;
		while(count < months.size())
		{
			System.out.print (months.get(count)+"                    ");
			
			
			System.out.println (temps.get(count));
	
			count++;
		}
		
		}
			if(temp.charAt(0) == 'C' || temp.charAt(0) == 'c' ) {
				
						
						for(int run = 0; run < temps.size(); run++) {
							sum = (sum + ((temps.get(run)- 32  ) /1.8));
							
						}}else {
			
			
			for(int run = 0; run < temps.size(); run++) {
			sum = sum + temps.get(run);
		}}
			System.out.print("Average          " +sum / temps.size());
			
			

}
}
