package Udemy;

public class StringClass {

	String s = "Hello World";
	String s1 = "Hello world";
	
//	public void show() {
//		
//		In a = 
//		System.out.println(s.trim() +" "+s1);
//		System.out.println(s.trim().concat(" "+s1));
//		System.out.println(s.toString().toUpperCase());
//		System.out.println(s.toLowerCase());
//		
//		System.out.println(s.trim().concat(" "+s1).toUpperCase());
//		
//	}
	public void compare() {
		
//		if(s.toUpperCase().equals(s1.toUpperCase()))
//			System.out.println("same");
//		else
//			System.out.println("not same");
	
	if(s.compareToIgnoreCase(s1)==0)
		System.out.println("same");
	else 
		System.out.println("not same");
	}
	
}