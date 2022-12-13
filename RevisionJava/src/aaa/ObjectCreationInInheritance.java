package aaa;

public class ObjectCreationInInheritance {

	public static void main(String[] args) {
      C1 a= new C1(2);
	}

}

class A1 
{
	public A1()
	{
	   System.out.println("in constructor A");
	}
	public A1(int i)
	{
	   System.out.println("in constructor A with parameter");
	}
}
class B1 extends A1
{
	public B1()
	{ 
		System.out.println("in constructor B");
	}
	public B1(int i)
	{
		super(i);
		System.out.println("in costructor B with parameter");
	}

}
class C1 extends B1
{
	public C1()
	{
		System.out.println("in constructor C");
	}
	public C1(int i)
	{
//		super(i);
		System.out.println("in costructor C with parameter");
	}

}
