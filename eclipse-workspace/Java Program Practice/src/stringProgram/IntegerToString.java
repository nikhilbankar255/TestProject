package stringProgram;

public class IntegerToString {

	double x=123.5;
	int y=456;
	public void str()
	{
		
		
		String s1=Double.toString(x);
		String s2=Integer.toString(y);
		
		System.out.println("String s1="+s1);
		System.out.println("String s2="+s2);
	}
	public static void main(String[] args) {

		IntegerToString i= new IntegerToString();
		i.str();
		
	}

	

}
