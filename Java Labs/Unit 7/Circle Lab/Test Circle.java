import java.util.ArrayList;

public class TestCircle {
public static void main(String [] args) {
	ArrayList <Object> circle = new ArrayList<Object>();
	
	Circle one = new Circle(5, 10, 5);
	Circle two = new Oval(14,6,9,4);
	Circle three = new Cylinder(56,87,23,13);
	Circle four = new OvalCylinder(23,24,1,2,3);
	circle.add(one);
	circle.add(two);
	circle.add(three);
	circle.add(four);
	
	for(Object num: circle) {
		System.out.print(num + "'s ");
		System.out.println(((Circle) num).center());
	}
	//Fill the array list with an object of each type of Circle  (Polymorphism)
	
	
	//Use an enhanced for loop to call the method for each object
	
	
	
	
	/**
	 * Below is the method showCenter.  It should have a parameter of type Circle
	 * It should then Print the a line like the one in the example.
	 * 
	 */
	
	
}
}
