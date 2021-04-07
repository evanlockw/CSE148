package p4_object_io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import utils.BackupRestoreTools;

public class Demo {

	public static void main(String[] args) {
		User user1 = new User("John", "Doe", "jdoe@gmail.com", "jdoe", "Password1", "jd.jpeg");
		UserBag theBag = BackupRestoreTools.restore();
		
		theBag.insert(user1);
		
		BackupRestoreTools.backup(theBag);
		theBag.display();
		
	}
		

}
