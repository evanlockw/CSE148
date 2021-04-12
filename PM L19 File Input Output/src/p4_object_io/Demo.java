package p4_object_io;

import utils.BackupRestoreTools;

public class Demo {

	public static void main(String[] args) {
		User user1 = new User("John", "Doe", "jdoe@gmail.com", "jdoe", "Password1", "jd.jpeg");
		UserBag theBag = BackupRestoreTools.restore();
		
		theBag.insert(user1);
		
		theBag.display();
		BackupRestoreTools.backup(theBag);
		
	}
		

}
