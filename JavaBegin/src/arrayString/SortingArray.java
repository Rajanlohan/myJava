package arrayString;

public class SortingArray {

	public static void main(String[] args) {

		int a[] = { 5, 23, 34, 32, 12, 1, 7, 3, 8 };

		for (int i = 0; i < a.length-1; i++) {
           
			for (int j = i; j < a.length; j++) {
				if (a[i] > a[j]) {
					int t = a[i];
					a[i] = a[j];
					a[j] = t;
				}
			}

		}
		for (int i = 0; i < a.length; i++) {

			System.out.print(" "+a[i]+" ");
		}
	}

}
