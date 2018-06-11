

	import java.util.Scanner;

	public class Lab2 {
		public static void main(String [] args) {
			
			double sqrt,constant,log;
			int power;
			int min, max;
			Scanner input = new Scanner(System.in);
			
			System.out.println("Number caulator");
			System.out.print("\nEnter a number: ");
			String number = input.nextLine().trim();
			double num = Double.parseDouble(number);
			num = Math.abs(num);
			sqrt = (Double)(Math.sqrt(num));
			power = (int)Math.pow(num, 4);
			constant = (double)Math.pow(2.71, num);
			log = Math.log(num);
			
			
			System.out.println("square root: " + sqrt);
			System.out.println(num +"^4: " + power);
			System.out.println("e^" + num + ": " + constant);
			System.out.println("The natural log of " + num + " is: " + log);
			
			
	        System.out.print("\n Enter two numbers seperated by a space: ");
	        String  INT = input.nextLine();  
	        int num1 = Integer.parseInt(INT.substring(0,INT.indexOf(" ")));
	        int num2 = Integer.parseInt(INT.substring(INT.indexOf(" ")+1));
	        min = Math.min(num1, num2);
	        max = Math.max(num1, num2);
	        		
	        System.out.println("min: " + min);
	        System.out.println("max: " + max);
	        
			
			
		}

		
		
	}

