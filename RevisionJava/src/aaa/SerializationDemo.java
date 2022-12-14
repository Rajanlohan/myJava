package aaa;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationDemo {

	public static void main(String[] args) throws Exception 
	{
		
		Save obj = new Save();
		obj.i=5;
		
		File f = new File("file.txt");
		FileOutputStream fos = new FileOutputStream(f);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(obj);

		
//		File f = new File("file.txt");
		FileInputStream fis = new FileInputStream(f);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Save obj1 = (Save) ois.readObject();
		System.out.println(obj1.i);
	}

}
class Save implements Serializable
{
	int i;
}
