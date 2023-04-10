package arrayString;

public class Overriding {

	public static void main(String[] args) {
		
		A obj =new B();
		System.out.println("ssssa+b"+obj.getClass().getName()+" "+obj.add(2, 3));
		
		
	}

}

class A
{
	public A() {
		System.out.println("hi..");
	}
	public A(int i) {
		System.out.println("A with parameter");
	}
	public int add(int a, int b) {
		return a+b;
	}
}

class B extends A
{
	public B() {
	
		System.out.println("hello...");
	}
	
	public B(int i) {
		super(i);
		System.out.println("B with parameter");
	}
	
	
	public int add(int a, int b) {
		int c= super.add(a, b);
		return a + c;
	
	}
	
}


