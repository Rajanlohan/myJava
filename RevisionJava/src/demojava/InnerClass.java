package demojava;

interface InnerClass {
	
//	int i;
	
//	class Inner
//	{
//		int j;
//	}
     public void show();
//     {
//    	 System.out.println("show");
//     }
	
	

	public static void main(String[] args) {
		
//		InnerClass obj = new InnerClass();

//		InnerClass.Inner obj1 = obj.new Inner();
//		obj1.j = 2;
		
//		InnerClass.Inner obj1 = new Inner();
//		obj1.j= 6;
//		System.out.println(obj1.j);

//		InnerClass obj = new InnerClass()        //   Anonymous Class
//				{
//					public void show()
		
//   Using Lambda Expressions
		
		InnerClass obj = ()  ->System.out.println("show,view,pictures,weather");
				 	
		obj.show();
		
	}

}
//class Inner extends InnerClass
//{
//	public void show()
//	{
//		System.out.println("show,view,pictures,weather");
//	}
//}	
