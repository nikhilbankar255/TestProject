package JavaCodePractice;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {

		int [] arr = {1,2,3,4,12,57,23,55,11,34};
		int temp ;
		
		//Simple way- By using sort method present in array
//		Arrays.sort(arr);
//		System.out.println("Order :");
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i]+" ");
//		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
			System.out.print("Order:");
			
			for(int k=0; k<arr.length;k++)
			{
				System.out.print(arr[k]+" ");
			}
			
		}
	}
