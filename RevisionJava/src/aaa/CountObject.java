package aaa;

public class CountObject {

	public static void main(String[] args) {

		Aa obj = new Aa();
		Aa obj1 = new Aa();
		Aa obj2 = new Aa();
		obj1.count();
	}

}  

class Aa {
	static int i;

	public Aa() {
		i++;
	}

	public void count() {
		System.out.println(i);
	}
}