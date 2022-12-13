package revisionAll;

public class PalindromeNumber {

	public static void method(int n) {

		int r;
		int sum = 0;
		int t;

		t = n;
		
		while (n > 0) {
			r = n % 10;
			sum = (sum * 10) + r;
			n = n / 10;
		}

		if (t == sum) {
			System.out.println("no. is palindrome");
		} else {
			System.out.println("no. is not palindrome");
		}
	}

	public static void main(String[] args) {

		method(1234543291);
	}

}
