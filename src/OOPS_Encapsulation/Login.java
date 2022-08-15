package OOPS_Encapsulation;

public class Login {
	
	private String username;
	private String password;
	private boolean successfull;
	
	public boolean isSuccessfull() {
		return successfull;
	}
	public void setSuccessfull(boolean successfull) {
		this.successfull = successfull;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
