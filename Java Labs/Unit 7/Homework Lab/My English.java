
public class myEnglish extends Homework {
	public myEnglish() {
		super();	
	}

	public void createAssignment(int p) {
			typeHomework("Lang");
			setpages(p);
	}
	public String toString() {
		return gettypeHomework() + " - must read " + getPagesRead() + " pages";
	}
}
