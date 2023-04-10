package com.navinrevision;

public class VarargsDemo {

	public static void main(String[] args) {
		
		 Calc1 obj = new Calc1();
		 
         System.out.println(obj.add(3,4,5,6,2));
	}

}

  class Calc1{
	
	public int add(int ...i)    // is called variable length arguments
	{
		int sum =0;
		for(int n:i)
		{
	 	sum = sum+ n;
		}
		return sum;
	}
}
