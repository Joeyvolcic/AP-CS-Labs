import java.util.Scanner;

public class TargetHeartRate {
	public static void main(String [] args){
		
		String[] commands = {};
		Scanner myscan = new Scanner(System.in);
		String age = "";
		String restingHeartRate = "";
		String heartRateAfter = "";
		
		System.out.print("Enter your age: ");
		age = myscan.nextLine();
		
		System.out.print("Enter your resting heart rate: ");
		restingHeartRate = myscan.nextLine();
		
		System.out.print("Enter your heart rate after exercising: ");
		heartRateAfter = myscan.nextLine();
		
		Double Age = Double.parseDouble(age);
		Double RHR = Double.parseDouble(restingHeartRate);
		Double RHA = Double.parseDouble(heartRateAfter)
				
				
				;
		int a = 220;
		double MaxHR = (a-Age);
		double HHR = ( MaxHR - RHR);
		double traningRange = (HHR * 0.60);
		double maxRange = (HHR * 0.80);
		double target = (traningRange + RHR);
		double Target = (maxRange + RHR);
		
		System.out.println("your target heart rate is between " + target + " and " +Target);
		
		if(target < RHA&&RHA < Target){
			System.out.println("your heart rate falls in between the target range.");
		}else{
			System.out.print("Your heart rate is not between the target zone.");
		}
		
		
		
		
		
	}
}
