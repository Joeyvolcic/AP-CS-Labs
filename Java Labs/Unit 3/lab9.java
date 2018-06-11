import java.util.Random;
import java.util.Scanner;
import java.io.IOException; 
import java.io.PrintWriter;
import java.io.File; 
public class lab9 {

   public static void main (String [ ] args) throws IOException
    {
	   
	   
	  Scanner input = new Scanner(System.in);
	  Random rand = new Random();
	  PrintWriter outFile = new PrintWriter (new File("Password.txt"));    
	  int One;	
	  char x;
	  String password = "";
	  int S = 0;
	  while (S < 5) {
	   System.out.println("pasword generation menu");
	   System.out.println("*********************************************************");
	   System.out.println("* [1] Lower case letters                                *");
	   System.out.println("* [2] Lower case and upper case                         *");
	   System.out.println("* [3] Lower case, Upper case, and Numbers               *");
	   System.out.println("* [4] Lower case, Upper case, Numbers, and Punctuation  *");
	   System.out.println("* [5] Quit                                              *");
	   System.out.println("*********************************************************");
	   password = "";
	 
	   
	 
		   System.out.print("Enter selection(1-5)");
		   String selection = input.nextLine();
		    S = Integer.parseInt(selection);
	   
	   
	   int L = 0;
	
	     System.out.print("Enter Length(1-14) ");
	     String Length = input.nextLine();
	     L = Integer.parseInt(Length);
	 
	   
	   if(S == 1) {
		   System.out.print("Password : ");

		   for(int i = 0; i < L; i++) {
			   One = rand.nextInt(25)+97;	
			   x = (char) One;
			   System.out.print(x);
			   password = password + x;		
		   }}	
		   else if(S == 2) {
			   System.out.print("Password : ");
			   for(int i = 0; i < L; i++) {
				   One = rand.nextInt(57)+65;
				   
						   if (91 > One || One > 96) {
							   x = (char) One;
							   System.out.print(x);  
							   password = password + x;		
						   }else {
							   i--;
						   }
	   }
   
			   }else if(S == 3){
				   System.out.print("Password : ");
				   for(int i = 0; i < L; i++) {
					   One = rand.nextInt(74)+48;
					   
							   if (91 > One && One < 58 || 64 < One&&One > 96) {
								   x = (char) One;
								   System.out.print(x);
								   password = password + x;								
							   }else {
								   i--;
							   }
	   
	   
    } 
    }else if(S == 4) {
    	System.out.print("Password : ");
    	   for(int i = 0; i < L; i++) {
			   One = rand.nextInt(89)+33;
			   
			   if (91 > One && One < 58 || 64 < One&&One > 96 || 32 < One && One <58 ) {
				   x = (char) One;
				   System.out.print(x);
				   password = password + x;		
			   }else {
				   i--;
			   }
    	
    }
}else {
	System.out.print("Program terminated");
}
System.out.println("");

	   
        outFile.println(password); 
     
	   
	  }
	     outFile.close ( ); 
}}





















