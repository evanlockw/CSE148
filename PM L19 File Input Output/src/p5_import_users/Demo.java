package p5_import_users;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

import p1_text_file_io.User;

public class Demo {

	public static void main(String[] args) {
		try {
			File file = new File("data/userImport.txt");
			Scanner scanner = new Scanner(file);
			while (scanner.hasNextLine()) {
				String userStr = scanner.nextLine();
				int numberOfHikes = Integer.parseInt(scanner.nextLine());
				ArrayList<Hike> hikingHistory = new ArrayList<>();
				for (int i = 0; i < numberOfHikes; i++) {
					String hikeStr = scanner.nextLine();
					String[] hikeTokens = hikeStr.split(", ");
					Hike hike = new Hike(hikeTokens[0], hikeTokens[1], Double.parseDouble(hikeTokens[2]));
					hikingHistory.add(hike);
				} 
				String[] userTokens = userStr.split(", ");
				User user = new User(userTokens[0], userTokens[1], userTokens[2], userTokens[3], userTokens[4], userTokens[5], userTokens[6], hikingHistory )
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
