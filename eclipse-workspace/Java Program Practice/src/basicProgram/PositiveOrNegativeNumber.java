package basicProgram;

import java.util.Scanner;

public class PositiveOrNegativeNumber {

	public static void main(String[] args) {

		Scanner scan= new Scanner(System.in);
		System.out.println("please enter a number..:");
		double in = scan.nextDouble();
		System.out.println("user has entered::"+in);
		if(in > 0 )
		{
			System.out.println("Given num is positive");
		}
		else if(in==0)
		{
			System.out.println("Num is zero");
		}
		else {
			System.out.println("Given num is Negative");
		}
		
		
		
		
		
		
	}

}
