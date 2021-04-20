package model;

public class UserBag implements Bagable {
	private User[] arr;
	private int nElems;

	public UserBag(int maxSize) {
		arr = new User[maxSize];
	}

	public boolean isSignedIn(String username, String password) {
		for (int i = 0; i < nElems; i++) {
			if (arr[i].getUserName().equals(username) && arr[i].getPassword().equals(password)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public void display() {

	}

}
