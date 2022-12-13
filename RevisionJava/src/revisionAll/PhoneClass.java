package revisionAll;

public class PhoneClass {

	public void show()
	{
		System.out.println("call");
	}
	public static void main(String[] args) {
		
		PhoneClass p = new  PhoneClass()
				{
			     public void show()
			     {
			    	 System.out.println("call, camera, song");
			     }
				};
				
				p.show();

	}

}
