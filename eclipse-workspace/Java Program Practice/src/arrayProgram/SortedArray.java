package arrayProgram;

public class SortedArray {

	public static void main(String[] args) {
		//Also try decending
		int [] arr= {60,10,20,50,40,90,30};
		int temp;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if (arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Ascending order");

		for(int i=0;i<arr.length;i++)
		{
			System.out.print(" "+arr[i]);
		}
	}

}
