
public class BusinessEmployee extends GoogleEmployee {
	private String accountInCharge;
	public BusinessEmployee(String name, String age, String salery, String job, String accountInCharge) {
		super(name, age, salery, job);
		this.accountInCharge = accountInCharge; 
	}
	public void setAccountInCharge(String accountInCharge) {
		this.accountInCharge = accountInCharge;
	}
	public String toString() {
		return super.toString() + System.lineSeparator() + accountInCharge;
	}
}

