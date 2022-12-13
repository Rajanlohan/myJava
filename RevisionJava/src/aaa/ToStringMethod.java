package aaa;

public class ToStringMethod {
	
	public static void main(String[] args) {
		
		Student s1 = new Student(101,"Rajan");
		System.out.println(s1);
//		System.out.println(s1.rollno);
//		Reverse.reverse("RAMAYAN ");
	}

}
class Student
{
	int rollno;
	String name;
	public Student(int rollno, String name) {
		
		this.rollno = rollno;
        this.name = name;
        
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + "]";
	}
	 
//}
//class Reverse{
//	
//	public static void reverse(String str) {
//	  String st="";
//	  char ch;
//	  System.out.println("the original STRING is :" +str);
//		for(int i=0;i<str.length(); i++) {
//		  ch= str.charAt(i);
//			st = ch+ st;
			
//		}
//		System.out.println("the reverse STRING is :" +st);
		
	}
