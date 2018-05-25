
public class Recurse {
	
	public void countDown(int n){
		if(n != 0) {
			System.out.println(n);
			countDown(n - 1);
		} else {
			System.out.println(0);
		}
	}

	public String printRev(String s){
	     char c = s.charAt(s.length()-1);
	     if(s.length() == 1) return Character.toString(c);   

	     return c + printRev(s.substring(0,s.length()-1));
	    }


	public int sumLessThan(int n){
		int sum = 0  ;
		if(n - 1 >= 0) {
			sum  = sumLessThan(n - 1) + n;
		}
		return sum;
	}

	public double average(int[] nums, double index){
		  double result = 0;
		  double avg = 0;
		  if (index + 1 < nums.length) {
			  return nums[(int) index] +  average(nums, index += 2.5 ) / index;
	      }
		
	      return (result)/ index;
	}
	
	public int countVowels(String s) {
		 if(s.length() ==0){
		      return 0;
		    } else if (s.toLowerCase().charAt(0) == 'i') {
		        return 1 + countVowels(s.substring(1));
		    } else if (s.toLowerCase().charAt(0) == 'o') {
		        return 1 + countVowels(s.substring(1));
		    } else if (s.toLowerCase().charAt(0) == 'u') {
		        return 1 + countVowels(s.substring(1));
		    } else if (s.toLowerCase().charAt(0) == 'e') {
		        return 1 + countVowels(s.substring(1));
		    } else if (s.toLowerCase().charAt(0) == 'a') {
		        return 1 + countVowels(s.substring(1));
		    } else {
		        return 0 + countVowels(s.substring(1));
		    }
		}
	
	
public static void main(String [] args){
	Recurse tester = new Recurse();
	int [] n = {3, 10, 11, 9, 4};
	tester.countDown(5); //5 - 0 on separate lines
  	System.out.println(tester.printRev("Hello world")); //dlrow olleH
	System.out.println(tester.sumLessThan(4));//10
	System.out.println(tester.average(n, 0)); //7.4
	System.out.println(tester.countVowels("I love to eat bugs.")); //7
	}
}
