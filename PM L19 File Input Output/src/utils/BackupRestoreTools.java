package utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import p1_text_file_io.User;
import p1_text_file_io.UserBag;

public class BackupRestoreTools {
	
	public static void importUser(UserBag userBag) {
		
		try {
			File file = new File("data/users.txt");
			Scanner scanner = new Scanner(file);
			while (scanner.hasNextLine()) {
				String str = scanner.nextLine();
				String[] tokens = str.split(", ");
				User user = new User(tokens[0], tokens[1], tokens[2], tokens[3], tokens[4], tokens[5]);
				userBag.insert(user);
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void exportUser(UserBag userBag, String fileName) {
		FileWriter fw;
		try {
			fw = new FileWriter(fileName, false);
			PrintWriter pw = new PrintWriter(fw);
			User[] arr = userBag.getUserArray();
			for(int i = 0; i < userBag.size(); i++) {
				User user = arr[i];
				pw.println(user.getFirstName() + ", " + user.getLastName());
			}
			pw.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
