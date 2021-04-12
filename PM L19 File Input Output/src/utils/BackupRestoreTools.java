package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

import p4_object_io.User;
import p4_object_io.UserBag;

public class BackupRestoreTools {

	public static void importUser(UserBag userBag, String fileName) {

		try {
			File file = new File(fileName);
			if (file.exists()) {
				Scanner scanner = new Scanner(file);
				while (scanner.hasNextLine()) {
					String str = scanner.nextLine();
					String[] tokens = str.split(", ");
					User user = new User(tokens[0], tokens[1], tokens[2], tokens[3], tokens[4], tokens[5]);
					userBag.insert(user);
				}
				scanner.close();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	public static void exportUser(UserBag userBag, String fileName) {
		FileWriter fw;
		try {
			fw = new FileWriter(fileName, false);
			PrintWriter pw = new PrintWriter(fw); // PrintWriter known as a wrapper class
			User[] arr = userBag.getUserArray();
			for (int i = 0; i < userBag.size(); i++) {
				User user = arr[i];
				pw.println(user.getFirstName() + ", " + user.getLastName());
			}
			pw.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void backup(UserBag theBag) {
		try {
			FileOutputStream fos = new FileOutputStream("data/users.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(theBag);
			oos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static UserBag restore() {
		File file = new File("data/users.dat");
		if (file.exists()) {
			try {
				FileInputStream fis = new FileInputStream("data/users.dat");
				ObjectInputStream ois = new ObjectInputStream(fis);
				UserBag myBag = (UserBag) (ois.readObject());
				ois.close();
				return myBag;
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}

		} else {
			return new UserBag(1000);
		}
		return null;
	}

	public static UserBag restore2() {

		try {
			File file = new File("data/users.dat");
			if (file.exists()) {
				FileInputStream fis = new FileInputStream("data/users.dat");
				ObjectInputStream oos = new ObjectInputStream(fis);
				UserBag myBag = (UserBag) (oos.readObject());
				oos.close();
				return myBag;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return new UserBag(1000);

	}
}
