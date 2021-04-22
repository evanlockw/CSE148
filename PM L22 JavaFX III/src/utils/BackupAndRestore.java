package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import model.TrailBag;
import model.UserBag;

public class BackupAndRestore {

	public static void backupUsers(UserBag userBag) {
		try {
			FileOutputStream fos = new FileOutputStream("data/userBag.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(userBag);
			oos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void backupTrails(TrailBag trailBag) {

	}
	
	public static void restoreUsers(UserBag userBag) {
		try {
			FileInputStream fis = new FileInputStream("data/userBag.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);
			userBag = (UserBag)(ois.readObject());
			ois.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void restoreTrails(TrailBag trailBag) {

	}
	
	public static void backupAll(UserBag userBag, TrailBag trailBag) {
		backupUsers(userBag);
		backupTrails(trailBag);
	}
	
	public static void restoreAll(UserBag userBag, TrailBag trailBag) {
		restoreUsers(userBag);
		restoreTrails(trailBag);
	}
}
