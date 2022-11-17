package exception.custom;

public class Member {

	private String name;
	private String password;
	
	public void setName(String name) throws UserException {
		if(name.contains("*")) {
			throw new UserException("사용자 이름에는 * 이 들어가면 안됩니다.");
		}
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setPassword(String password) {
		// 패스워드는 대문자/소문자/숫자/특수문자(!@#$%^&*) 를 포함해야 합니다.
		if(!validUpperCase(password)) {
			throw new PasswordException("패스워드에는 대문자가 있어야 합니다.");
		} else if(!validLowerCase(password)) {
			throw new PasswordException("패스워드에는 소문자가 있어야 합니다.");
		} else if(!validNumber(password)) {
			throw new PasswordException("패스워드에는 숫자가 있어야 합니다.");
		} else if(!validSpecialChar(password)) {
			throw new PasswordException("패스워드에는 특수문자(!@#$%^&*)가 있어야 합니다.");
		}
		this.password = password;
	}
	
	public String getPassword() {
		return this.password;
	}

	private boolean validUpperCase(String password) {
		for(int i=0; i<password.length(); i++) {
			if(password.charAt(i) >= 'A' && password.charAt(i) <= 'Z') {
				return true;
			}
		}
		return false;
	}
	private boolean validLowerCase(String password) {
		for(int i=0; i<password.length(); i++) {
			if(password.charAt(i) >= 'a' && password.charAt(i) <= 'z') {
				return true;
			}
		}
		return false;
	}
	private boolean validNumber(String password) {
		for(int i=0; i<password.length(); i++) {
			if(password.charAt(i) >= '0' && password.charAt(i) <= '9') {
				return true;
			}
		}
		return false;
	}
	private boolean validSpecialChar(String password) {
		String specialChar = "!@#$%^&*";
		for(int i=0; i<specialChar.length(); i++) {
			if(password.contains(String.valueOf(specialChar.charAt(i)))) {
				return true;
			}
		}
		return false;
	}
	
}