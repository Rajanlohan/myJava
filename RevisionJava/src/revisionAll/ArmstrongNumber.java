package revisionAll;

public class ArmstrongNumber {
		public static void isArmstrong(int num) {
		
		int cube=0;
		int r;
		int t;
		t=num;
		
		while(num>0) {
			
			r=num%10;
			cube = cube+(r*r*r);
			num=num/10;
		}
		
		if (t==cube) {
			System.out.println("no. is armstrong");
		} else {
			System.out.println("no. is not armstrong");
		}
	}

	public static void main(String[] args) {
	
		isArmstrong(371);
		
	}

}
