package basicProgram;

public class EvenOdd {

	int num = 47;

	public void eve() {

		if (num % 2 == 0)// if num%2 is equal to zero, the number is even
		{
			System.out.println("Number is Even...");
		} else {

			System.out.println("Number is Odd...");
		}
	}

	public static void main(String[] args) {
		EvenOdd e = new EvenOdd();
		e.eve();

	}

}
