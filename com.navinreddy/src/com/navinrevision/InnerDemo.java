package com.navinrevision;

public class InnerDemo {

	public static void main(String[] args) {
		
	
		Outer obj = new Outer();
		obj.show();

//		Outer.Inner obj1= obj.new Inner();     //when class is non-static
		
		Outer.Inner obj1 = new Outer.Inner();   //when class is static
		obj1.display();

	}

}

class Outer{
	
	int i;
	public void show() {
		System.out.println("in outer");
	}
	
	static class Inner{
		
		public void display() {
			System.out.println("in display");
		}
	}
}