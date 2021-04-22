package model;

public class User {
	private Name name;
	private String userName;
	private String password;
	private boolean isAdmin;
	private HikeHistory hikes;

	User(String firstName, String lastName, String userName, String password, boolean isAdmin,
			HikeHistory hikes) {
		super();
		this.name = new Name(firstName, lastName);
		this.userName = userName;
		this.password = password;
		this.isAdmin = isAdmin;
		this.hikes = hikes;
	}
	
	public User(String firstName, String lastName, String userName, String password,
			HikeHistory hikes) {
		super();
		this.name = new Name(firstName, lastName);
		this.userName = userName;
		this.password = password;
		this.isAdmin = false;
		this.hikes = hikes;
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isAdmin() {
		return isAdmin;
	}

	public void setAdmin(User user) {
		if (this.isAdmin) {
			user.isAdmin = true;
		} else {
			user.isAdmin = false;
		}
	}
	
	public void unSetAdmin(User user) {
		if(this.isAdmin) {
			user.isAdmin = false;
		} 
	}

	public HikeHistory getHikes() {
		return hikes;
	}

	public void setHikes(HikeHistory hikes) {
		this.hikes = hikes;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", userName=" + userName + ", password=" + password + ", isAdmin=" + isAdmin
				+ ", hikes=" + hikes + "]";
	}

	
}
