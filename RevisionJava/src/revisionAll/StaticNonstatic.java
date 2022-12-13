package revisionAll;

public class StaticNonstatic {

	String name = "Rajan";
	static int age = 24;
	
	public void show()
	{
		System.out.println("show method");
	}
	
	public static void print() {
		System.out.println("print method");
	}
	
	public static void main(String[] args) {
		
		print();
		StaticNonstatic.print();
		System.out.println(age);
		System.out.println(StaticNonstatic.age);
		
		StaticNonstatic a = new StaticNonstatic();
		a.show();
		System.out.println(a.name);
		
//		a.print();
        Abc.sum();
         
	}

}

  abstract class Abc{
	     
	 final int i=6;
	  
	public static void sum() {
		
		System.out.println("sum method is there");
//		System.out.println("the value of i is: " +i );
	}
	
 }
