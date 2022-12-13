package demojava;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileHandling {

	public static void main(String[] args) throws Exception
	{
		File f = new File("demo1.text");
		FileOutputStream fos = new FileOutputStream(f);
		DataOutputStream dos = new DataOutputStream(fos);
		dos.writeUTF("demo content text is starting once again");
		
		
		FileInputStream fis = new FileInputStream(f);
		DataInputStream dis = new DataInputStream(fis);
        String st = dis.readUTF();
        System.out.println(st);
	}

}
