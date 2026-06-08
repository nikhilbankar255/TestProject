package JavaCodePractice;

public class DuplicateInArray {

	public static void main(String[] args) {

		int[] num = { 1, 2, 3, 4, 5, 8, 5, 3, 2, 1, 3, 8, 9 };
		int count = 0;

		System.out.println("Duplicate numbers :");
		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] == num[j]) {
					System.out.print(" " + num[j]);
					count++;
				}
			}
		}
		System.out.println();
		System.out.println("Total duplicate numbers  :" + count);

		// comparing 2 arrays

		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] b = { 2, 4, 6, 8, 9, 10, 12, 15 };

		int countsArray = 0;
		System.out.print("Duplicates in array b :");

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					System.out.print(" " + b[j]);
					countsArray++;
				}
			}
		}
		System.out.println();
		System.out.println("Total Duplicate numbers are :" + countsArray);

	}

}
