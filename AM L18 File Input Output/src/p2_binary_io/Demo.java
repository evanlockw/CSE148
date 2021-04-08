package p2_binary_io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo {

	public static void main(String[] args) {
		
		try {
			FileOutputStream fos = new FileOutputStream("data/binarydata1.dat");
			DataOutputStream dos = new DataOutputStream(fos);
//			dos.writeInt(-10000);
//			dos.writeInt(10000);
//			dos.writeDouble(1.1);
//			System.out.println(Integer.MIN_VALUE + " -- " + Integer.MAX_VALUE);
//			System.out.println(Double.MIN_VALUE + " -- " + Double.MAX_VALUE);
//			dos.writeChar('\u0B85');
			dos.writeUTF("Hello World!");
			dos.writeInt(1000);
			dos.writeUTF("Bye World!");
//			System.out.println(dos.size());
			dos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			FileInputStream fis = new FileInputStream("data/binarydata1.dat");
			DataInputStream dis = new DataInputStream(fis);
//			dos.writeInt(-10000);
//			dos.writeInt(10000);
//			dos.writeDouble(1.1);
//			System.out.println(Integer.MIN_VALUE + " -- " + Integer.MAX_VALUE);
//			System.out.println(Double.MIN_VALUE + " -- " + Double.MAX_VALUE);
//			dos.writeChar('\u0B85');
			String str = dis.readUTF();
			System.out.println(str);
			int n = dis.readInt();
			System.out.println(n);
			str = dis.readUTF();
			System.out.println(str);
			dis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
