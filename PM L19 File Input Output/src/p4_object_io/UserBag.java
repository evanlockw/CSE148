package p4_object_io;

import java.io.Serializable;

public class UserBag implements Serializable{
	private User[] arr;
	private int nElems;
	
	public UserBag(int maxSize) {
		arr = new User[maxSize];
	}
	
	public void insert(User user) {
		arr[nElems++] = user;
	}
	
	public void display() {
		for(int i = 0; i < nElems; i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
	}
	
	public User[] getUserArray () {
		return arr;
	}
	
	public int size() {
		return nElems;
	}
 }
