import java.util.Scanner;

public class Geometry {
	public static void main(String [] args) {
		int height, radius;
		String input;
		
		 Scanner myScan = new Scanner(System.in);
		 System.out.print("Enter the radius: ");
         input = myScan.nextLine();
         radius = Integer.parseInt(input);
         
         System.out.print("Enter the height: ");
         input = myScan.nextLine();
         height = Integer.parseInt(input);
         
      System.out.println(cylinders.cylinderVolume(radius, height));
      System.out.println(cylinders.cyllinderSurface(radius, height));
      System.out.println(Sphere.sphereSurface(radius));
      System.out.println(Sphere.sphereVolume(radius));
    		  
    		  
	}
}
