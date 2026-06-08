package stringProgram;

public class DuplicateCharCount {

	public static void main(String[] args) {
		
		String str="Nikhil BaNkr";
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
				if(str.charAt(i)==str.charAt(j))
				{
					System.out.print("Dulpicate characters :");
					System.out.println("  =  "+str.charAt(j));
					count++;
					break;
				}
		}
		}
		System.out.println("Repeated character :"+count);
	}

}
