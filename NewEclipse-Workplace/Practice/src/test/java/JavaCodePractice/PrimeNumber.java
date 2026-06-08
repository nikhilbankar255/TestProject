package JavaCodePractice;

public class PrimeNumber {

	public static void main(String[] args) {
		/*
		 * Prime number is a number that is greater than 1 and divided by 1 or itself
		 * only. In other words, prime numbers can't be divided by other numbers than
		 * itself or 1. For example 2, 3, 5, 7, 11, 13, 17.... are the prime numbers.
		 */
		
		int num = 13;
		
		for (int i = 2; i < num-1; i++) {
		
			if(num%i==0)
			{
				System.out.println("Number is not prime");
				break;
			}
			else {
				System.out.println("Number is prime");
				break;
			}
		}
		
	}

}
