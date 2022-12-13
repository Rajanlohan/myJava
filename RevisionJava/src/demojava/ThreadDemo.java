package demojava;

class Hi implements Runnable
{
	public void run()
	{
		for(int i=0; i<5; i++)
		{
			System.out.println("Hi...");
			try { Thread.sleep(500); } catch(Exception e) {}
		}
	}
}

class Hello implements Runnable
{
	public void run()
	{
		for(int i=0; i<5; i++)
		{
			System.out.println("Hello...");
			try { Thread.sleep(500); } catch(Exception e) {}
		}
	}
}

public class ThreadDemo {

	public static void main(String[] args) {
		
		Hi obj = new Hi();
		Hello obj1 = new Hello();
		
		obj.run();
		try { Thread.sleep(10); } catch(Exception e) {}
		obj1.run();

	}

}
