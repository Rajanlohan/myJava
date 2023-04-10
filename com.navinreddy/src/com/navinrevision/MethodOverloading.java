package com.navinrevision;

public class MethodOverloading {

	public static void main(String[] args) {
		
		Calc obj = new Calc();
		
		

	}

}

class Calc{
	
	public Calc() {
		System.out.println("Hii..");
	}
	
	public Calc(int i) {
		System.out.println(i);
	}
	
	public Calc(int i,int j) {
		System.out.println(i+j);
	}
}
