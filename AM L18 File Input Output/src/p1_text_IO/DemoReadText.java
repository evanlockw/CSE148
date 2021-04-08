package p1_text_IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import utils.ImportExportTools;

public class DemoReadText {

	public static void main(String[] args) {
		UserBag theBag = new UserBag(1000);
		
		ImportExportTools.importUsers(theBag, "data/users.txt");

//		boolean isValid = theBag.login("AdmiN", "Admin1234");
//		System.out.println("Valid? " + isValid);
		
		ImportExportTools.exportUsers(theBag, "data/UsernamesPasswords.txt");
		System.out.println("Done exporting!");
	}

}
