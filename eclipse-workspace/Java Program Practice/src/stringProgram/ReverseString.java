package stringProgram;

public class ReverseString {
 
	public static void main(String[] args) {
		
//		StringBuffer a= new StringBuffer("gnitseT erawtfoS");
//		System.out.println(a.reverse());

		String str="lihkiN ma I", rev="";
		for(int  i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}

		System.out.println("Reverse String :"+rev);
	}

}
