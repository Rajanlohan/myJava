package revisionAll;

public class ClassCar {

	int model;
	String name;
	
	public static void main(String[] args) {
	    
		ClassCar a = new ClassCar();
		ClassCar b = new ClassCar();
		ClassCar c = new ClassCar();
		
		a.model= 2010;
		a.name= "Honda";
		
		b.model= 2011;
		b.name= "Maruti";
		
		c.model= 2012;
		c.name= "Tata";
		
		System.out.print("Type A car : "+a.model +" : ");
		System.out.println(a.name);
		System.out.print("Type B car : "+b.model +" : ");
		System.out.println(b.name);
		System.out.print("Type C car : "+c.model +" : ");
		System.out.println(c.name);
		
		System.out.println("****************");
		a = b;
		a = c;
		b = a;
		
		System.out.print("Type A car : "+a.model +" : ");
		System.out.println(a.name);
		System.out.print("Type B car : "+b.model +" : ");
		System.out.println(b.name);
		System.out.print("Type C car : "+c.model +" : ");
		System.out.println(c.name);
		
		

	}

}
