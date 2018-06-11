import java.util.ArrayList;
import java.util.Scanner;

public class lab4 {
	public static void main(String [] args) {
		
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> nums;
		nums = new ArrayList<Integer>();
		ArrayList<Integer> even;
		even = new ArrayList<Integer>();
		ArrayList<Integer> odd;
		odd = new ArrayList<Integer>();
		ArrayList<Integer> prime;
		prime = new ArrayList<Integer>();
		int evencount = 0;
		int oddcount = 0;
		double ran;
		int num3;
		System.out.print("How big would you like yout array: ");
		int length = input.nextInt();
		
		for(int a = 0; a < length; a++) {
			ran = Math.random()*100;
			nums.add((int)ran);
		}
		
		System.out.print("your array: ");
		for(int B = 0; B < length; B++) {
			System.out.print(" " + nums.get(B));
		}
		System.out.println(" ");
		for(int A = 0; A < length; A++) {
			if( nums.get(A) % 2 == 0 ) {
			evencount++;
			}
		}

			for(int b = 0; b < length; b++) {
			if( nums.get(b) % 2 == 1) {
			oddcount++;
			}
		}
			System.out.println("Even numbers : " + evencount);
		
		
			System.out.println("Odd numbers : " + oddcount);
		
			
			for( int E = 0; E < nums.size(); E++) {
				 num3 = nums.get(E);
				for(int j = 2; j < num3; j++) {
					if( num3 % j == 0) {
						break;
					}
					if (j == num3 -1)
					{
						prime.add(num3);
						break;
						
					}
				}
				
}
			System.out.print("Prime numbers: ");
			for(int run3 :prime)
			{
			     System.out.print(run3 + " "); 	
			    
			}
}
}
