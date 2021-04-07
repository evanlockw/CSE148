package p2_textfile_intro;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteTextDemo {

	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("data/basics.txt", false);
			PrintWriter pw = new PrintWriter(fw);
//			pw.print(5.5); // 01100001
			pw.print('\u4EBA'); // unicode >1 million
			pw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
