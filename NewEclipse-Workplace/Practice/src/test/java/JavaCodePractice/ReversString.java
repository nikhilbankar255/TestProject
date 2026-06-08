package JavaCodePractice;

public class ReversString {

	public static void main(String[] args) {

		String str = "Nikhil";

		//Easy way by using reverse method of string builder
//		String stringBuild = new StringBuilder(str).reverse().toString();
//		System.out.println("String Builder : "+stringBuild);
		
		String reversed = "";
		
		System.out.println("String is :"+str);
		for (int i=str.length()-1;i>=0;i--)
		{
			 reversed = reversed+str.charAt(i);
		}
		System.out.println("Reversed string is :"+ reversed);
	
	}

}
