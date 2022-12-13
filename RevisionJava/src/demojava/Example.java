package demojava;

class Example extends A {

	 public void msg() {
		System.out.println("show the overridden method");
	}
	public static void main(String[] args) {
		Example e = new Example();
		e.msg();

	}

}

class A {
	
	protected void msg() {
		System.out.println("try it...");
		
	}
}
