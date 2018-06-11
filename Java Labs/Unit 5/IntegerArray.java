import java.lang.reflect.Array;
import java.util.Arrays;

public class IntegerArray {
private int myArray [];
private int sum, odds;
private int evenArray[];

public IntegerArray(int [] x){
	int evenCount = 0;
myArray = x;
	for(int run = 0; run <= myArray.length - 1; run++) {
		if (myArray[run] % 2 == 0) {
			evenCount++;
			
		}
		
	}
	evenArray = new int[evenCount];
	
}

//Returns the original array in ascending order
public int[] sortArray(){
	Arrays.sort(myArray);
	return myArray;
}

//Returns the sum of all elements in the array.
public int sumElements(){
	
	for(int run1 = 0; run1 <= myArray.length - 1; run1++) {
		
		sum += myArray[run1];
	}

	return sum;
}

//Returns an array will all the even numbers in the array
public int[] evenNumbers(){
	int evencount = 0;
	for(int run = 0; run <= myArray.length - 1; run++) {
		if (myArray[run] % 2 == 0) {
			evenArray[evencount] = myArray[run];
			evencount++;
			
		}
	}
	Arrays.sort(evenArray);
	return evenArray;
}

//Returns the number of odd numbers in the array.
public int numberOfOdds(){
	for(int j = 0; j <= myArray.length - 1;j++) {
		if (myArray[j] % 2 == 1) {
			odds++;
	}
}
	return odds;
}
}
