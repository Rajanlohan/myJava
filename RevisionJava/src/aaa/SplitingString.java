package aaa;

public class SplitingString {

	public static void main(String[] args) {
		
	String str = " Tarun, Manu, Varun, Rajan";
	String name[] = str.split(",");
	
	for(String a : name)
	System.out.println(a);
		
	}

}
