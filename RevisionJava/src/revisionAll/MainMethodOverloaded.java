package revisionAll;

public class MainMethodOverloaded {

	static {
		System.out.println(" hello ");
	}
	
	public static void main(String[] args) {
     
		System.out.println("main method execution");
		main(2,3);
	}

	public static void main(int a) {
		System.out.println("main method with single parameter");
	}
	
	public static void main(int a, int b) {
		System.out.println("main method with double parameter");
	}
	public static void main(String ac) {
		
	}
}
