package chapitre413052023;

public class User {
	
	private boolean student;
	
	public boolean isStudent() {
		return student;
	}
	public void setStudent(boolean student) {
		this.student = student;
	}
	private String password;
	private String login;
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		// demande code secret
		this.password = password;
	}
	public User() {
	}
	public User(String password, String login) {
		this.password = password;
		this.login = login;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}

}
