package stringProgram;

public class PallindromeString {

	public static void main(String[] args) {
		String str="abma",temp,rev="";
		temp=str;
		
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
			
			
		}
			
		if (temp.equals(rev)) {
			System.out.println("String is Pallindrome");
		}
		else {
			System.out.println("String is not Pallindrome");
		}
	}

}
