package p1;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Demo2 {

	public static void main(String[] args) {
		try {
			PrintWriter pw = new PrintWriter("Data.txt");
			pw.write("hello", 2, 3);
			pw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("done");
	}

}
