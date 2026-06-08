package basicProgram;

public class LeapYear {

	public static void main(String[] args) {

		//% will give reminder
		// '/' will give quotient
		int year = 2020;

		if (year % 4 == 0) {
			System.out.println(+year + " --->Year is leap year...");
		} else {
			System.out.println("Not leap");
		}
	}

}
