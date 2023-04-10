package com.navinrevision;

public class OverridingDemo {

	public static void main(String[] args) {
		
		Abc obj = new Bbc();
		obj.show();
		obj = new Cbc();
		
		obj.show();

	}

}

class Abc{
	public void show() {
		System.out.println("in A");
	}
}
class Bbc extends Abc{
	public void show() {
		System.out.println("in B");
	}
}
class Cbc extends Abc{
	public void show() {
		System.out.println("in C");
	}
}