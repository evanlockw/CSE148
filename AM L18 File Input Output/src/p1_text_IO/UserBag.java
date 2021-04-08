package p1_text_IO;

public class UserBag {
	private User[] arr;
	private int nElems;
	
	public UserBag(int maxSize) {
		arr = new User[maxSize];
	}
	
	public void insert(User user) {
		arr[nElems++] = user;
	}
	
	public void display() {
		for (int i = 0; i < nElems; i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
	}
	
	public boolean login(String username, String password) {
		for(int i = 0; i < nElems; i++) {
			if(arr[i].getUsername().equalsIgnoreCase(username) && arr[i].getPassword().equals(password)) {
				return true;
			}
		}
		return false;
	}
	
	public int size() {
		return nElems;
	}
	
	public User[] getArray() {
		return arr;
	}
}
