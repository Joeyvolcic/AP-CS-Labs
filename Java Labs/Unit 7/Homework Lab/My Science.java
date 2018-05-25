
public class myScience extends Homework {
	public myScience() {
		super();	
	}



	public void createAssignment(int p) {
			typeHomework("Science");
			setpages(p);
	}
	public String toString() {
		return gettypeHomework() + " - must read " + getPagesRead() + " pages";
	}
}
