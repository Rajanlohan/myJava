package aaa;

public class MethodOverriding {
	
	
	public static void main(String[] args) {

	A obj = new A();
	B obj1 = new B(2);	
	
	
	System.out.println(A.st);
	A.st="hi, welcome";
	System.out.println(A.st);
	System.out.println(obj.fst+" "+obj.s);
//	obj.fst="I am final";
			
	}

}

class A {
	static String st="welcome";
	final String fst="come";
	String s="ram";
	public A() 
	{
		
		System.out.println("method A without parameter");
	}
	public A(int i)
	{
		System.out.println("method A with parameter");
	}
}

class B extends A
{

	public B() 
	{
		System.out.println("method B without parameter");
	}
	
	public B(int i)
	{
		super(i);
		System.out.println("method B with parameter");
	}
}


