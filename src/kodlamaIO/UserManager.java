package kodlamaIO;

public class UserManager {
	private User userType;
	public UserManager(User type) {
		this.userType = type;
	}
	
	public void register() {
		System.out.println("Kay�t olan ki�i : " +userType);
	}

}
