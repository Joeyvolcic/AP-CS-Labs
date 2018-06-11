import java.util.Scanner;

public class BodyMassIndex {

		public static void main(String [] args){
			
			String[] commands = {};
			Scanner myscan = new Scanner(System.in);
			String name = "";
			String height = "";
			String Weight = "";
			
			System.out.print("Enter your name: ");
			name = myscan.nextLine();
			
			System.out.print("Enter your height in feet and inches: ");
			height = myscan.nextLine();
			
			System.out.print("Enter your weight in pounds: ");
			Weight = myscan.nextLine();
			
			System.out.println("Body mass index caculator");
			System.out.println("  =======================  ");
			System.out.println("Name: " + name);
			
		
		double Height = ((Double.parseDouble(height.substring(0, height.indexOf(" ")))*12) 
			                +
			                (Double.parseDouble(height.substring(height.indexOf(" ")+1))))  
			                ;
		double H = (Height * 0.0254);
			
		
			double weight = Double.parseDouble(Weight);
			double KG = (weight * 0.453592);
			double BMI = ((KG) / (H * H));
			
			System.out.println("height(m): " + H);
			System.out.println("weight(Kg): " + KG);
			System.out.println("Body mass index: "+ BMI);
			
			
			if(BMI < 18.5)
				   System.out.println("Category: Bellow average");
				else if(18.5 <= BMI&&BMI <= 24.9) 
				   System.out.println("Category: normal");
				else if(25.0 <= BMI&&BMI<= 29.9) 
					System.out.println("Category: Overweight");
				else if(BMI >= 30.0) 
					System.out.println("Category: Obese");
				


			
			

		}
}
