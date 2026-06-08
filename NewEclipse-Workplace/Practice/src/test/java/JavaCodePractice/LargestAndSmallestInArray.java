package JavaCodePractice;

public class LargestAndSmallestInArray {

	public static void main(String[] args) {
		int[] arr = { 12, 1, 0, 2, 3, 4, 20 };
		int temp;
		for (int i = 0; i <= arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {  //change > & < to check for largest and smallest
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}System.out.println(arr[0]);  //change index to get 2nd, 5th etc largest/smallest
	}
}
