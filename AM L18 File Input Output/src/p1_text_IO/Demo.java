package p1_text_IO;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Demo {

	public static void main(String[] args) {
		try {
			PrintWriter pw = new PrintWriter("data.txt");
			pw.print("123");
			pw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
