
public class SalesEmployee extends GoogleEmployee {
	private String consumer,projline;
	public SalesEmployee(String name, String age, String salery, String job, String consumer, String projline ) {
		super(name, age, salery, job);
		this.consumer = consumer;
		this.projline = projline;
	}
	public void setconsumer(String consumer) {
		this.consumer = consumer;
	}
	public void setprojline(String projline) {
		this.projline = projline;
	}
	public String toString() {
		return super.toString() + System.lineSeparator() + consumer + System.lineSeparator() + projline;
	}
}
