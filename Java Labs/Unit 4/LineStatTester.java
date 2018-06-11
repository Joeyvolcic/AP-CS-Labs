
public class LineStatTester {
public static void main (String [] args){
	Lab3 myTester = new Lab3 (1, 4, -7, 9);
	System.out.println("The slope is "+ myTester.calcSlope());  //Expected -.625
	System.out.println("The distance is "+ myTester.calcDistance()); //Expected 9.4339...
	System.out.println("The midpoint is " + myTester.calcMid()); //Expected (-3.0, 6.5)
}
}
