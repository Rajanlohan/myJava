 package aaa;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileHandling {

	public static void main(String[] args) throws Exception
	{
	    FileOutputStream fos = new FileOutputStream("Demo.txt");
		DataOutputStream dos = new DataOutputStream(fos);
		dos.writeUTF("Demo Content");

		
		FileInputStream fis = new FileInputStream("Demo.txt");
		DataInputStream dis = new DataInputStream(fis);
		String str = dis.readUTF();
		System.out.println(str );
	}

}
