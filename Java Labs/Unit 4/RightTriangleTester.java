public class RightTriangleTester {
public static void main(String [] args){
	RightTriangle one = new RightTriangle(5, 9);
	System.out.println(one.getHeight()); //Expects 9
	System.out.println(one.getHypotenuse()); //Expects 10.2956...
	one.setBase(7);
	System.out.println(one.getArea()); //Expects 31.5
	System.out.println(one.getPerimeter()); //Expects 27.40175...
	
	
	
}
}
