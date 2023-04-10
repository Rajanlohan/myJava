package com.navinrevision;

import java.util.Scanner;

public class InputVar {

	public static void main(String[] args) {
		
//		System.out.print("Please enter your name : ");
//		Scanner in = new Scanner(System.in);
//		String name = in.nextLine();
//		int m = Integer.parseInt(name);
//		System.out.println("Hello... "+name);
	
//	Sum obj = new Sum();
//	
//	int a= obj.sum(15, 5);
//	int b= obj.sub(11, 8);
//	obj.mul(a, b);
	
		Greatest g = new Greatest();
		g.great(5, 7, 3);
	}
}
//class Sum{
//	public int sum(int a, int b	) {
//		return (a+b);
//	}	
//	
//	public int sub(int a, int b) {
//		return (a-b);
//	}
//	
//	public void mul(int a, int b) {
//		System.out.println((a*b));
//	
//	}
//}

  class Greatest{
	  public void great(int a,int b, int c){
		 if(a>b &&a>c) {
			 System.out.println(a+" is greater");
		 }
		 else if(b>a && b>c) {
			 System.out.println(b+" is greater");
		 }
		 else {
			 System.out.println(c+" is greater");
		 }
		  
	  }
  }



