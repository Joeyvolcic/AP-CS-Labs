package Unit6Assignments;

public class student {
	private String name; 
	private String id;
	private double math;
	private double lang;
	private double science;
	private double average;
/**
 * *
 * @param name1
 * @param iD
 * @param math1
 * @param lang1
 * @param science1
 */
	public student(String name1, String iD, double math1, double lang1, double science1) {
	name = name1;
	id = iD;
	math = math1;
	lang = lang1;
	science = science1;
	}
	
	/**
	 * Will get the name
	 * @returns name
	 */
	public String getname() {
		return name;
	}
	
	/**
	 * Will get the student id
	 * @return id
	 *
	 */
	public String getstudentnumber() {
		return id;
	}
	/**getmathGPA
	 * @return math GPA
	 */
	public double getmathGPA() {
		return math;
	}
	/**
	 * Will get lang GPA
	 * @return lang GPA
	 */
	public double getlangGPA() {
		return lang;
	}
	/**
	 * Will get science GPA
	 * @return science GPA
	 */
	public double getscienceGPA() {
		return science;
	}
	/**
	 * Will get the average GPA
	 * @return average GPA
	 */
	public double getaverageGPA() {
		average = ((math + lang + science)/3);
		return average;
	}
}
