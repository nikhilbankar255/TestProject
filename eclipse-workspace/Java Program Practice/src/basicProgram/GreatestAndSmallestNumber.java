package basicProgram;

public class GreatestAndSmallestNumber {

	public static void main(String[] args) {

		int x= 400;
		int y = 500;
		int z= 200;
		
		if(x>y && x>z)
		{
			System.out.println("x is the greatest number...." +x);
		}
		else if(y>z)
		{
			System.out.println("y is the greatest num" +y);
		}
		else
		{
			System.out.println("z is smallest" +z);
			
		}
	}

}
