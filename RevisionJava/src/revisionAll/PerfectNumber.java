package revisionAll;

import java.util.Scanner;

public class PerfectNumber {

	static int a;
	
	public static int perfect(int n)
	{
		int sum=0;
		
			for(int i=1; i<=n/2; i++)
		    {
			    if(n%i==0)
				sum=sum+i;
		    }
		    if(n==sum)
				  System.out.println("No. is perfect");
		    else
				  System.out.println("Its not perfect");
		
		
	    return sum;
	}
	
	
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number -->" );
		a= sc.nextInt();
		
	    perfect(a);	

	}

}
