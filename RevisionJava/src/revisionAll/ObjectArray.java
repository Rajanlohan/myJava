package revisionAll;

public class ObjectArray {

	public static void main(String[] args) {
		
		Object ob[]= new Object[4];
		
		ob[0] = 34;
		ob[1] = 'A';
		ob[2] = "Rajan";
		ob[3] = 23.23;
		
		for(int i=0; i<ob.length; i++)
		{
			System.out.print(ob[i] +" : ");
		}
		

	}

}
