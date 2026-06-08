package basicProgram;

public class SwapNumbers {

	int a=10, b=12, c;
	public void swap()
	{
		System.out.println("Numbers before swapping a=" +a+ "and b=" +b );
		c=a;
		a=b;
		b=c;
		System.out.println("Numbers after swapping a=" +a+ "and b=" +b );
		
//		 System.out.println("before swapping numbers: "+a +" "+ b);  
//	       /*Swapping without 3rd variable*/  
//	        a = a + b;   
//	        b = a - b;   
//	        a = a - b;   
//	        System.out.println("After swapping: "+a +"  " + b);   
	}
	public static void main(String[] args) {
		
		SwapNumbers s= new SwapNumbers();
		s.swap();
		
		
	}

}
