
public class myMath extends Homework {
	public myMath() {
		super();	
	}



	public void createAssignment(int p) {
			typeHomework("Math");
			setpages(p);
	}
	public String toString() {
		return gettypeHomework() + " - must read " + getPagesRead() + " pages";
	}
}
