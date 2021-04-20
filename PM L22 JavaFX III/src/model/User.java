package model;

public class User {
	private Name name;
	private String userName;
	private String password;
	private boolean isAdmin;
	private HikeHistory hikes;

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

	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

	public HikeHistory getHikes() {
		return hikes;
	}

	public void setHikes(HikeHistory hikes) {
		this.hikes = hikes;
	}

}
