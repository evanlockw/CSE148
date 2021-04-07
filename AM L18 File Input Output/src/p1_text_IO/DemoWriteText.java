package p1_text_IO;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class DemoWriteText {

	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("data/data.txt", false);
			PrintWriter pw = new PrintWriter(fw); // wrapper class
			boolean b = false;
			pw.print("\nhello world!");
			pw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
