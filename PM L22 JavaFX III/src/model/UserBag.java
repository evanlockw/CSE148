package model;

public class UserBag implements Bagable {
	private User[] arr;
	private int nElems;

	public UserBag(int maxSize) {
		arr = new User[maxSize];
		User user = new User("Admin", "Admin", "admin", "Admin123", new HikeHistory());
		setAdmin(user.getUserName());
		insert(user);
	}
	
	public void insert(User user) {
		arr[nElems++] = user;
	}

	public boolean isSignedIn(String username, String password) {
		for (int i = 0; i < nElems; i++) {
			if (arr[i].getUserName().equalsIgnoreCase(username) && arr[i].getPassword().equals(password)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public void display() {
		for(int i = 0; i < nElems; i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
	}
	
	public User getAdmin() {
		return arr[0];
	}
	
	public boolean setAdmin(String username) {
		User user = searchByUsername(username);
		if(user != null) {
			user.setAdmin(user);
			return true;
		}
		return false;
	}

	public User searchByUsername(String username) {
		for(int i = 0; i < nElems; i++) {
			if(arr[i].getUserName().equals(username)) {
				return arr[i];
			}
		}
		return null;
	}

}
