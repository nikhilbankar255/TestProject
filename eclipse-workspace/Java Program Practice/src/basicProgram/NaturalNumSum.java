package basicProgram;

public class NaturalNumSum {

	public static void main(String[] args) {

		//1+2+3+4+5...+10
		int num=10;
		int sum=0;
		
		for(int i=0;i<=num;i++)
		{
			sum=sum+i;
		}
		System.out.println("sum is:" +sum);
	}
}
