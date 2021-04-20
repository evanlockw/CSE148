package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import model.Address;
import model.Trail;
import model.Trail.TrailLevel;
import model.Trail.TrailType;
import model.TrailBag;
import model.UserBag;

public class BackupRestoreTools {
	
	public static void importTrails(TrailBag trailBag, String fileName) {
		try {
			File file = new File(fileName);
			Scanner scanner = new Scanner(file);
			while(scanner.hasNextLine()) {
				String trailLine = scanner.nextLine();
				String[] trailTokens = trailLine.split("; ");
				String[] addressTokens = trailTokens[1].split(", ");
				Address address = new Address(addressTokens[0], addressTokens[1], 
						addressTokens[2], addressTokens[3], addressTokens[4]);
				Trail trail = new Trail(trailTokens[0], address, TrailType.valueOf(trailTokens[2]), 
						Double.parseDouble(trailTokens[3]), TrailLevel.valueOf(trailTokens[4]), 
						Double.parseDouble(trailTokens[5]));
				trailBag.insert(trail);
			}
			BackupRestoreTools.backupTrails(trailBag);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void exportTrails(TrailBag trailBag, String fileName) {
		
	}

	public static void backupUsers(UserBag userBag) {
		try {
			FileOutputStream fos = new FileOutputStream("data/userbackup.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(userBag);
			oos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void restoreUsers(UserBag userBag) {
		File file = new File("data/userbackup.dat");
		if(file.exists()) {
		try {
			FileInputStream fis = new FileInputStream("data/userbackup.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);
			userBag = (UserBag)ois.readObject();
			ois.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		} else {
			return;
		}
	}
	
	public static void backupTrails(TrailBag trailBag) {
		
	}
	
	public static void restoreTrails(TrailBag trailBag) {
		
	}
}
