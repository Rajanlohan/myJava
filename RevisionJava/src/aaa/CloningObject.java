package aaa;

public class CloningObject {

	public static void main(String[] args) throws CloneNotSupportedException {
		Cloning obj = new Cloning();
		obj.i = 5;
		obj.j = 6;
//		System.out.println(obj);
		
		Cloning obj1 = (Cloning)obj.clone();
//		obj1.i = obj.i;
//		obj1.j = obj.j;
		
		obj1.j=9;
		
		System.out.println(obj);
		System.out.println(obj1);
		

	}

}

class Cloning implements Cloneable 
{
	int i;
	int j;
	@Override
	public String toString() {
		return "Cloning [i=" + i + ", j=" + j + "]";
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}	
	
}