package basicProgram;

public class ReverseNum {
	
	int n=987654321, rev=0;

	public void res()
	{
		while (n>0) {
		
			rev=rev*10;
			rev=rev+n%10;
			n=n/10;
		}
		System.out.println("The reverse of the given number is:" +rev);
	}

	public static void main(String[] args) {
		ReverseNum r= new ReverseNum();
		r.res();

	}

}
