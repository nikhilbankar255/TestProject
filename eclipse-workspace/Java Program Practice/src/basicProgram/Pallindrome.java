package basicProgram;

public class Pallindrome {

	// Pallindrome means if you reverse a number and still you get same number.
	// like 121 = 121, 454= 454

	int num = 121;// It is the number variable to be checked for palindrome
	int r;
	int sum = 0;

	int temp = num;

	public void pal() {
		while (num > 0) {
			r = num % 10;// getting remainder
			sum = (sum * 10) + r;
			num = num / 10;
		}
		if (temp == sum) {
			System.out.println("Given number " + temp + " is pallindrome");
		} else {
			System.out.println("Number is not pallindrome");
		}

	}

	public static void main(String[] args) {
		Pallindrome p = new Pallindrome();
		p.pal();
	}

}
