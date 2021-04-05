package model;

public class UserBag {
	private User[] arr;
	private int nElems;
	
	public UserBag(int maxSize) {
		arr = new User[maxSize];
	}
	
	public void insert(User user) {
		arr[nElems++] = user;
	}
	
//	public boolean login(String username, String password) {
//		
//	}
}
