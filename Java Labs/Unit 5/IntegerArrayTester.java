
public class IntegerArrayTester {
public static void main(String [] args){
	int [] x = {45, 63, 12, 10, 13, 22, 67, 99, 51, 2, 3 ,19, 20};
	IntegerArray test = new IntegerArray(x);
	int y [] = test.sortArray();
	System.out.println(y[2]);  //Expect 10
	System.out.println(test.sumElements());
	System.out.println(test.numberOfOdds()); //Expects 8
	int z [] = test.evenNumbers();
	System.out.println(z[1]); //Expects 10
	
}
}
