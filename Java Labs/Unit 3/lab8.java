import java.io.IOException; 
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.File; 
public class lab8 {
	public static void main (String [ ] args) throws IOException
	{
			int Boy = 0;
		int girl = 0;
		int boyGirl = 0;
		int totalFamilies = 0 ;
		double perBoy;
		double perGirl;
		double perBoth;
 	String token = ""; 
 	String token2 = ""; 
 	Scanner inFile = new Scanner(new File("MaleFemaleInFamily (2).txt")); 
	Scanner inFile1 = new Scanner(new File("MaleFemaleInFamily2 (1).txt")); 	
	while (inFile.hasNext())
	{ 
 		token = inFile.nextLine(); 
 		
 			if( token.equals("BB"))
 			{
 				Boy = Boy += 1;
 				totalFamilies = totalFamilies += 1;
 			}
 			else if( token.equals("BG") || token.equals("GB")) 
 			{
 			boyGirl = boyGirl += 1;
 			totalFamilies = totalFamilies += 1;
 			}
 			else if(token.equals("GG")) 
 			{
 				girl = girl += 1;
 				totalFamilies = totalFamilies += 1;
 			}
	}
 		
 		while (inFile1.hasNext())
 			{ 
 				token2 = inFile1.nextLine(); 
 		 		
 		 			if( token2.equals("BB"))
 		 			{
 		 				Boy = Boy += 1;
 		 				totalFamilies = totalFamilies += 1;
 		 			}
 		 			else if( token2.equals("BG") || token2.equals("GB")) 
 		 			{
 		 				boyGirl = boyGirl += 1;
 		 			totalFamilies = totalFamilies += 1;
 		 			}
 		 			else if(token2.equals("GG"))
 		 			{
 		 				girl = girl += 1;
 		 				totalFamilies = totalFamilies += 1;
 		 			}
 		 				
		} 
 	inFile.close(); 
	perBoy = ((double) Boy / totalFamilies);
	perGirl = ((double) girl / totalFamilies);
	perBoth = ((double) boyGirl / totalFamilies);
	System.out.println("Total familys: " + totalFamilies);
	System.out.println("Percent boys : " + perBoy +"%");
	System.out.println("Percent girls: " + perGirl +"%");
	System.out.print("Percent 1 boy 1 girl: " + perBoth +"%");
		}
	 
	}


