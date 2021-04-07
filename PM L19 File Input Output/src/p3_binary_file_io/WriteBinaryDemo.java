package p3_binary_file_io;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteBinaryDemo {

	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("data/binaryFile.dat");
			DataOutputStream dos = new DataOutputStream(fos); // wrapper class
//			dos.writeInt(100);
//			dos.writeUTF("Hello");
//			dos.writeDouble(1.1);
			
			for(int i = 0; i < 100; i++) {
				dos.writeUTF("Hi");
				dos.writeInt((int)(Math.random() * 100));
			}
			System.out.println(dos.size());
			dos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
