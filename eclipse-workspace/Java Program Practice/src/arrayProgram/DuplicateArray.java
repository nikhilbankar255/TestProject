package arrayProgram;

public class DuplicateArray {

	public static void main(String[] args) {

		int[] arr=  {1,2,3,3,4,5,4,6,7,2};
	
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if (arr[i]==arr[j]) {
					
					System.out.println("Duplicate elements in given array::"+arr[j]);
					
				}
			}
			
		}
	}

}
