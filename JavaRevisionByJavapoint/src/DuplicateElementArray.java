
public class DuplicateElementArray {

	public static void main(String[] args) {
		
		int a[] = new int[] {2,3,4,6,7,4,2,7,8,3,7};
		int count=1;
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]==a[j])
				{
					count = ++count;
					
				}
			}
	
			System.out.println(count);
			count=1;
		}

	}

}
