package revisionAll;

import java.util.Random;

public class ArrayRevision {

	public static void array(int n)
	{
		
		Random r = new Random();
		int a[]= new int[n];
		for(int i=0; i<n;i++) {
			a[i] = r.nextInt(n);
			System.out.print(a[i]+" ");
		}
	
//		for(int i : a) 
//			a[i]= i+1;
//			System.out.print(a[i]+" ");
		
	}
	
	public static void main(String[] args) {
		
		array(20);
		
//		int a[] = new int[3];
//		
//		a[0] = 12;
//		a[1] = 23;
//		a[2] = 45;
////		a[3] = 34;
//		
//		System.out.println(a.length);
//		System.out.println(a[2]);
//
//		System.out.println("**************");
//		for(int i=0; i<a.length; i++) {
//			System.out.println(a[i]);
//		}
		
		
	}

}
