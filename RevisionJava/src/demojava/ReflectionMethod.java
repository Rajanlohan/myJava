package demojava;

import java.lang.reflect.Method;



public class ReflectionMethod {

	public static void main(String[] args) throws Exception
	{
		
		Class c = Class.forName("Demo"); 
		Object o = c.newInstance();
	    
	    Method m = c.getDeclaredMethod("show", null);
	    m.setAccessible(true);
	    m.invoke(o, null);

	}

}

class Demo{
	
	private void show()
	{
		System.out.println("show the reflection method");
	}
}
