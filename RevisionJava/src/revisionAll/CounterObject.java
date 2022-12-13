  package revisionAll;

public class CounterObject {

	static int i;
	
	public CounterObject() {
		i++;
	}
	
	public void counter() {
		System.out.println(i);
	}
	
	public static void main(String[] args) {
	
	
		
		CounterObject ob1= new CounterObject();
		CounterObject ob2= new CounterObject();
		CounterObject ob3= new CounterObject();
		CounterObject ob4= new CounterObject();
	
		ob1.counter();
		ob3.counter();
	}

}
