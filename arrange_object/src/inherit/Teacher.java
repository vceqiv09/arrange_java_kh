package inherit;

public class Teacher extends Person {
	
	private String subject;
	private String role;
	
	public Teacher() {
		super("선생님");
	}
	
	public String getSubject() {
		return subject;
	}
	public String getRole() {
		return role;
	}
	
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
}