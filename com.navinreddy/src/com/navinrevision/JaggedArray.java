package com.navinrevision;

public class JaggedArray {

	public static void main(String[] args) {
		
		int a[][] = 
			{   
				{1,2,3,4},
				{3,4,5},
				{6,7,8,9,7},
				{3,2}
			};
//		for(int i=0; i<a.length; i++) {
//			for(int j=0; j<a[i].length; j++) {
//				System.out.print(" "+a[i][j]);
//			}
//			System.out.println("");
//		}

		for(int k[] : a) {
			for(int l : k) {
				System.out.print(" "+l);
			}
			System.out.println("");
		}
		
	}

}
