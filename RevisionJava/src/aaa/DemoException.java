package aaa;

public class DemoException 
{

	public static void main(String[] args) 
	{
		
        int i,j,k=0;
        i=9;
        j=2;
        int a[] = new int[4];
        try 
        {
        k=i/j;
        {
        for(int m=0; m<4; m++)
        
        	a[m] = m+1;
        }
        for(int value : a)
        {
        	System.out.println(value);
        }
        }
        catch(ArithmeticException e)
        {
        System.out.println("cant divide with zero :"+e);
        }
        catch(ArrayIndexOutOfBoundsException v)
        {
        	System.out.println("the maximum value of array is: 4  "+v);
        }
        System.out.println(k);

	}

}
