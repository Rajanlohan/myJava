package revisionAll;

import java.util.Arrays;

public class VarArgsMethod {

	public static void show(int... a) 
	{
		for (int i : a) 
		{
			System.out.println("a is :" + i);
		}

	}
	
	public static void show (int a)
	{
		System.out.println("a is the new value :" +a);
	}

    public static void main(String[] args) {

	
		show(4,5,6,8,5,4,3,4);
   
	}

}
