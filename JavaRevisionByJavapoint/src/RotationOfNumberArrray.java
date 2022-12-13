
public class RotationOfNumberArrray {

	public static void main(String[] args) {

		int a[] = new int[] { 3, 6, 8, 5, 4, 9 };
		int n = 1;
		System.out.println("the original array is :");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		for (int i = 0; i < n; i++) {
			int j, first;
			first = a[0];
			for (j = 0; j < a.length - 1; j++) {

				a[j] = a[j + 1];
			}
			a[j] = first;
		}
		System.out.println(" ");

		System.out.println("the rotation array");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
