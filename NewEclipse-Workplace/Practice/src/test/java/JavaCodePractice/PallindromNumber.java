package JavaCodePractice;

public class PallindromNumber {

	public static void main(String[] args) {

		// Pallindrome means if you reverse a number and still you get same number.
		// like 121 = 121, 454= 454
		
		int num = 121;
		
		int sum=0;
		int temp = num;
		while(num>0)
		{
			int digit = num%10;
			sum=sum*10+digit;
			num=num/10;
		}
		System.out.println(sum);
		
		if(temp==sum)
		{
			System.out.println("Number is pallindrome");
		}else {
			System.out.println("Number is not pallindrome");
		}
	}

}
