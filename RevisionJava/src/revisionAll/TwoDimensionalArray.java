package revisionAll;

public class TwoDimensionalArray {

	public static void array()
	{
//		int x[]= {5,6,7,8,};
//		int y[]= {6,7,8,9,};
//		int z[]= {7,8,6,4,};
//		
		int p[][]= {
				{5,6,7,8,4},
				{6,7,8,9},
				{7,8,6},
				{1,2,6,5}
		};
	
		for(int i[] : p)
		{
//			for(int j : i)
//			{
				System.out.print(i+ " ");
//			}
			System.out.println(" ");
		}
	 
//		for(int i=0; i<4; i++)
//		{
//			for(int j=0; j<5; j++)
//			{
//				System.out.print(p[i][j]+" ");
//			}
//	        System.out.println(" ");
//				  
		}
		
//		public static void jaggedarray()
//		{
//			int a[][]= new int[3][];
//			
//			a[0] = new int[3];
//			a[1] = new int[2];
//			a[2] = new int[5];
//			
//			for(int i=0; i<a.length; i++)
//			{
//				for(int j=0; j<a[i].length; j++)
//				{
//					
//					System.out.print(j +" ");
//					
//				}
//				System.out.println(" ");
//			}
//		}
	
	
	public static void main(String[] args) {
		
		array();

	}

}
