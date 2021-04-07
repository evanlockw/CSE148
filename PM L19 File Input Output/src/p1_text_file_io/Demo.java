package p1_text_file_io;

import utils.BackupRestoreTools;

public class Demo {

	public static void main(String[] args) {
		UserBag userBag = new UserBag(1000);
		BackupRestoreTools.importUser(userBag, "data/users.txt");
		userBag.display();
		BackupRestoreTools.exportUser(userBag, "data/usernames.txt");
		System.out.println("Done exporting!");
	}

}
