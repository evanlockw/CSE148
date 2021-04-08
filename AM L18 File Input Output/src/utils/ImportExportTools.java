package utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import p1_text_IO.User;
import p1_text_IO.UserBag;

public class ImportExportTools {

	public static void importUsers(UserBag userBag, String fileName) {
		try {
			File file = new File(fileName);
			if (file.exists()) {
				Scanner scanner = new Scanner(file);
				while (scanner.hasNextLine()) {
					String str1 = scanner.nextLine();
					String[] tokens = str1.split(" ");
					User user = new User(tokens[0], tokens[1], tokens[2], tokens[3], tokens[4], tokens[5]);
					userBag.insert(user);
				}
				scanner.close();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void exportUsers(UserBag userBag, String fileName) {
		try {
			FileWriter fw = new FileWriter(fileName, true);
			PrintWriter pw = new PrintWriter(fw);
			User[] arr = userBag.getArray();
			
			for(int i = 0; i < userBag.size(); i++) {
				 pw.println(arr[i].getUsername() + ", " + arr[i].getPassword());
			}
			pw.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
