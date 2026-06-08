package basicProgram;

import java.util.Random;
import java.util.Scanner;

public class UserEnterNumPrint {

	public static void main(String[] args) {


		Scanner scanner= new Scanner(System.in);
		System.out.println("PLZ Enter a number");
		int num= scanner.nextInt();
		
		System.out.println("User entered number is:"+num);
		
//		Random r= new Random();
//		System.out.println(r.nextInt(1,100));
		
	}

}
