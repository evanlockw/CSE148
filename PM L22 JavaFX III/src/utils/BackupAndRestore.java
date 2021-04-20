package utils;

import model.TrailBag;
import model.UserBag;

public class BackupAndRestore {

	public static void backupUsers(UserBag userBag) {

	}

	public static void backupTrails(TrailBag trailBag) {

	}
	
	public static void restoreUsers(UserBag userBag) {

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
