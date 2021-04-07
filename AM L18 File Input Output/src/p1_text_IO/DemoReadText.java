package p1_text_IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import utils.ImportExportTools;

public class DemoReadText {

	public static void main(String[] args) {
		UserBag theBag = new UserBag(1000);
		
		ImportExportTools.importUsers(theBag, "data/users.txt");

		boolean isValid = theBag.login("admin", "Admin123");
		System.out.println("Valid? " + isValid);
	}

}
