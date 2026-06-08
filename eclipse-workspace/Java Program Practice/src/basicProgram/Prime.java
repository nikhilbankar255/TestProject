package basicProgram;

public class Prime {
	/*
	 * Prime number is a number that is greater than 1 and divided by 1 or itself
	 * only. In other words, prime numbers can't be divided by other numbers than
	 * itself or 1. For example 2, 3, 5, 7, 11, 13, 17.... are the prime numbers.
	 */
public static void main(String[] args) {
	
	int num=14;
	int temp=0;
//		for(int i=2;i<=num-1;i++)
//		{
//			if(num%i==0)
//			{
//				
//				temp=temp+1;
//			}
//			
//		}
//		if (temp==0) {
//			
//			System.out.println("num is prime :" +num);
//			
//		} else {
//			System.out.println("Not prime");
//		}
	
	for(int i=2;i<=num-1;i++)
		{
			if(num%i==0)
			{
				
				System.out.println("not Primm");
				break;
			}
			else
				{
				System.out.println("Prime");
				break;
				}
		}
		
			
		
	
	
}
	

	

}