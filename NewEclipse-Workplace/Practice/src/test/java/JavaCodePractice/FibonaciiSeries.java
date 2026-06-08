package JavaCodePractice;

public class FibonaciiSeries {

	public static void main(String[] args) {

		/*
		 * In fibonacci series, next number is the sum of previous two numbers for example
		 *  0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc. 
		 *  The first two numbers of fibonacci series are 0 and 1.
		 */

		int n1=0, n2=1, n3, count=10;
		
		System.out.print("Fibonaci series is: "+n1+" "+n2);
		for (int j = 2; j < count; j++) {
			n3= n1+n2; 
			System.out.print(" "+n3);
			n1=n2; 
			n2=n3; 
		}
	}

}
