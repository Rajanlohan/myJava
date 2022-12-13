package revisionAll;

public class MethodOverloading {

	public void show() {
		System.out.println("show method is printed");
	}
	
	public String show(String i) {
		
//		System.out.println(i);
		return  i;
	}
	
	public int show(int i) {
//		int a = i;
		return i;
	}
	
//	public void show(int i, double j) {
//		double m = (i*j);
//		System.out.println(m);
//	}
//	
//	public double show(double i, double j) {
//		double d = i/j;
//		return d;	
//	}
//	
//	public void show(String q) {
//		System.out.println(q);
//		String s1= "RAJAN";
//		String s2= "LOHAN";
//		
//		System.out.println("--> "+s1+"\n    "+s2+" <--");
//		
//	}
//	
	public static void main(String[] args) {
		
		MethodOverloading a = new MethodOverloading();
		
		a.show(10);
//        double s = a.show(105.0, 10.5);
//        System.out.println(s);
        
        a.show("Hello");
//        System.out.println(as)
	}

}
