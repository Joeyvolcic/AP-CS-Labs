import java.util.ArrayList;

public class testHomework{
		public static void main(String [] args) {
			ArrayList<Object> homeworks;
			homeworks = new ArrayList<Object>();
			
			myEnglish lang = new myEnglish();
			lang.createAssignment(5);
			homeworks.add(lang);
			
			myMath math = new myMath();
			math.createAssignment(6);
			homeworks.add(math);
			
			myScience science = new myScience();
			science.createAssignment(10);
			homeworks.add(science);			
			
			for(Object x: homeworks) {
				System.out.println(x.toString());
			}
		}

		
	}
