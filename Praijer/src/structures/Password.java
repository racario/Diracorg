package structures;

public class Password {
	
	private char[] password;
	
	public Password(char[] password){
		setPassword(password);
	}

	public char[] getPassword() {
		return password;
	}

	public void setPassword(char[] password) {
		this.password = password;
	}

	@Override
	public int hashCode() {
		String passHash = "PasswordHash";
		char[] password = this.getPassword();
		return passHash.hashCode() + password.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		
		if (obj == null)
			return false;
		if (obj instanceof Password){
			Password other = (Password) obj;
			
			result = other.getPassword().equals(this.getPassword()) ? true : false;
		}
		return result;
	}
	
	
}
