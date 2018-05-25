
public class DesignEmployee extends GoogleEmployee {
	private String project, team;
	public DesignEmployee(String name, String age, String salery, String job, String project, String team) {
		super(name, age, salery, job);
		this.project = project;
		this.team = team;
	}
	public void setProject(String project) {
		this.project = project;
	}
	public void setTeamNumber(String team) {
		this.team = team;
	}
	public String toString() {
		return super.toString() + team +System.lineSeparator() + project;
	}
}
