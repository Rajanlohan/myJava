package revisionAll;

public class PrimeNumber {

	public static boolean primeno(int num) {

		if(num<= 1) {
			return false;
		}

		for(int i = 2; i<num; i++) {
			if (num% i == 0) {
				return false;
			}
		}
		return true;

	}

	public static void primeprint(int num) {

		for(int i=2;i<=num;i++) {
			if(primeno(i))
				System.out.println(i+ " is the prime no.");

		}
	}

	public static void main(String[] args) {
//		PrimeNumber p = new PrimeNumber();
		primeprint(20);

//	System.out.println(primeno(15));

	}

}
