package basicProgram;

public class BinnaryNum {

	public static void main(String[] args) {

		int[] a = { 0, 0, 0, 1, 2, 1, 2, 0, 1, 0, 1, 0, 1 };
		int temp = 0;

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}

			}

			System.out.print(" "+a[i]);
		}
	}

}
