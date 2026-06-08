package JavaCodePractice;

public class Swap2Numbers {

	public static void main(String[] args) {

		int a= 10, b=20, c;
		
		
		
		c=a;
		a=b;
		b=c;
		
		System.out.println("A is :"+a +" B is :"+b);
		
		//Without using 3rd veriable
		a=a+b;  //30
		b=a-b;  // 30-20= 10
		a=a-b;// 30-10= 20
		System.out.println("A is :"+a +" B is :"+b);
	}

}
