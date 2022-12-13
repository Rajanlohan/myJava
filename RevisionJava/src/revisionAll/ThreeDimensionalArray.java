package revisionAll;

public class ThreeDimensionalArray {

	public static void threeArray()
	{
		int a[][][] = new int[3][4][2];
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[i].length; j++)
			{
				for(int k=0; k<a[i][j].length; k++)
				{
					a[i][j][k]= i+j+k;
				}
			
			}
			
		}
		
		
		for(int i[][] : a)
		{
			for(int j[] : i)
			{
				for(int k : j)
				{
					System.out.print(k+" ");
				}
				System.out.print(" ");
			}
			System.out.println(" ");
		}
	}
	
	public static void main(String[] args) {
		
		threeArray();

	}

}
