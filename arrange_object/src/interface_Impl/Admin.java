package interface_Impl;

public interface Admin extends Staff {
	
	String ROLE = "Admin";
	
	void removeRole();
	
	void addRole();
	
}