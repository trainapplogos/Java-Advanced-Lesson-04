package ua.lviv.trainapplogos;

public class UserAccount {
	private String forstName;
	private String lastName;
	private String email;
	private String password;
	
	public UserAccount(String forstName, String lastName, String email, String password) {
		super();
		this.forstName = forstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
	}

	public String getForstName() {
		return forstName;
	}

	public void setForstName(String forstName) {
		this.forstName = forstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [forstName=" + forstName + ", lastName=" + lastName + ", email=" + email + ", password=" + password
				+ "]";
	}
}
