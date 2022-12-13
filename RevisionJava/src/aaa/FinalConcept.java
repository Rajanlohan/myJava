package aaa;

public class FinalConcept {

	public static void main(String[] args) {

		D d = new D();
		d.a = 4;
		System.out.println(d.a);
	}
}

class C {
	static int a = 8;

	public C() {
		System.out.println("method C without parameter");
	}

	public C(int i) {
		System.out.println("method C with single parameter");
	}
}

class D extends C {

	public D() {

		System.out.println("method D without parameter");
	}

	public D(int i) {
		super(i);
		System.out.println("method D with single parameter");
	}

}