package utils;

import model.TrailBag;
import model.UserBag;

// handles binary files
public class BackupAndRestore {

	public static void backupUsers(UserBag userBag) {
		// writeObject(userBag)
	}

	public static void backupTrails(TrailBag trailBag) {
		// writeObject(trailBag)
	}
	
	public static void restoreUsers(UserBag userBag) {
		// (UserBag)readObject()
	}

	public static void restoreTrails(TrailBag trailBag) {
		// (TrailBag)readObject()
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
