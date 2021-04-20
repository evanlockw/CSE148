package model;

import utils.BackupRestoreTools;

public class Demo {

	public static void main(String[] args) {
		UserBag userBag = new UserBag(10000);
		BackupRestoreTools.restoreUsers(userBag);
	}

}
