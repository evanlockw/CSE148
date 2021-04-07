package p1;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class Demo3 {

	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("data.dat");
			DataOutputStream dos = new DataOutputStream(fos);
			dos.writeFloat(1.5f);
			int n = dos.size();
			System.out.println("size: " + n);
			dos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
