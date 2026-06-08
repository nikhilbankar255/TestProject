package basicProgram;

public class NumberOfDigits {

	public static void main(String[] args) {

		int num=321456987;
		
		int count=0;
		
		while(num>0)
		{
			num=num/10;
			count++;
			
		}
		
//		for(int i=0;i<num+1;i++)
//		{
//			num=num/10;
//			count++;
//			
//		}
		System.out.println("Digits are ...:"+count);

		
//		for(int i=0;i<=num;i++)
//		{
//			count++;
//			
//		}
//		System.out.println(count);
		
	}

}
