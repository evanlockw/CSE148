package p3_binary_file_io;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadBinaryDemo {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("data/binaryFile.dat");
			DataInputStream dis = new DataInputStream(fis);

//			int n = dis.readInt();
//			System.out.println(n);
//			
//			String str = dis.readUTF();
//			System.out.println(str);
//			
//			double d = dis.readDouble();
//			System.out.println(d);

			while (true) {
				try {
					String str = dis.readUTF();
					System.out.print(str + ":");
					int n = dis.readInt();
					System.out.print(n + " ");
				} catch (EOFException e) {
					break;
				} 
			}

			dis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
