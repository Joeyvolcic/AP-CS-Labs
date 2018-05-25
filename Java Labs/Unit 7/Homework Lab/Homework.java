import java.util.ArrayList;

public abstract class Homework {
	public static void main(String [] args) {
		
	}
	private int page;
	private String homework;
	
	// constructors
	public Homework(int page, String homework) {
		this.page = page;
		this.homework = homework;setpages(0);
		typeHomework("None");
	}
	public Homework() {
		setpages(0);
		typeHomework("None");
	}

	// public methods
	public void pagesRead(int page) {
		this.page = page;
	}
	public void typeHomework(String homework) {
		this.homework = homework;
	}	
	public int getPagesRead(){
		return page;
	}
	public void setpages(int pages) {
		this.page = pages;
	}
	public void setTypeHomework(String homework) {
		this.homework = homework;
	}
	public String gettypeHomework() {
		return homework;
	}
		public abstract void createAssignment(int p);
	}
	
	
