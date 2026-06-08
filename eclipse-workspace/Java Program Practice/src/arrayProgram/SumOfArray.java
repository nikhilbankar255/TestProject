package arrayProgram;

public class SumOfArray {

	public static void main(String[] args) {

		int[] a = { 5, 6, 4, 7, 8 };

		int sum = 0;
		int count=0;

		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
			count++;

		}
		System.out.println("Total number of elements within array:"+count);
		System.out.println("Sum of array elements:" + sum);
	
	}

}
