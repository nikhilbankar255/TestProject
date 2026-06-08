package basicProgram;

public class Factorial {
	//4! = 4*3*2*1 = 24  
	//5! = 5*4*3*2*1 = 120  
	
	int fact=1;
	int num=5;
	
	public void fact()
	{
		
		for(int i=1; i<=num; i++)
		{
		fact=fact*i;
		
		}
		System.out.println("factorial of a given number is:"+fact);
	}

	public static void main(String[] args) {
		Factorial f= new Factorial();
		f.fact();

	}

  
}  
