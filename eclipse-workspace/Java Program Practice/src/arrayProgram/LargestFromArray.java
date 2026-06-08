package arrayProgram;

public class LargestFromArray {

	public static void main(String[] args) {

		int[] a = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };

		int temp;

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {

				if (a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}

			}
		}
		System.out.println(a[0]); /// change a[i] th value with i=1 or 2 etc. to get 2nd largest or smallest
									/// number
									// a[0] will be largest number
									// a[1] will be 2nd largest number

//		for(int i=0;i<a.length;i++)
//		{
//				System.out.println(a[i]);
//			
//		} to sort array

	}

}
