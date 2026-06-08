package starPattern;

public class BasicStar {
	/* * * * * 
	 * * * * 
	 * * * 
	 * * 
	 */ 

	public static void printStar(int n) {
		for (int i = 0; i < n; i++) 
	 {
		 for (int j = i; j < n; j++) 
		 {
			 System.out.print(" *"); 
			 
		 }
		 System.out.println(" ");
		 }
	}
	

	public static void main(String[] args) {

		printStar(5);

	}

}

//public static void printStarFrom1(int n) 
//{
//	/* 
//	* * 
//	* * * 
//	* * * * 
//	* * * * */
//int i, j;
//
//for (i = 0; i < n; i++) 
//{
//for (j = 0; j <= i; j++) 
//{
// System.out.print("* ");}
//
// System.out.println();
// }
//}
//public static void main(String[] args) {
//	printStarFrom1(5);
//}
//}