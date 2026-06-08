package JavaCodePractice;

public class ReverseNumber {

	public static void main(String[] args) {

		int num = 1224;
		System.out.println("number is :"+num);
//		String reversed = new StringBuilder(String.valueOf(num)).reverse().toString();
//		//int rev = Integer.parseInt(reversed);
//		 System.out.println(reversed);
		
		int reversed = 0;
		
		while(num>0)
		{
			int digit = num%10;   // Get last digit
			reversed = reversed*10+digit;  // Append digit
			num =num/10;	   // Remove last digit
		}
		
		System.out.println("reversed num :"+reversed);
		
		
	}

}
