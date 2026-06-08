package stringProgram;

public class CountWordsString {

	public static void main(String[] args) {

		//String s="My name is Nikhil";
		String s="Nikhil";
		int count=0;
		
//		for(int i=0;i<s.length();i++)
//		{
//			if((s.charAt(i)==' ') && (s.charAt(i+1)!=' '))
//			{
//			
//				count++;
//			}
//		}
//		System.out.println("Number of  words in a String :" +count);
		
		
		//char[] n=s.toCharArray();
		

		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			{
				System.out.print(" "+s.charAt(i));
				count++;
			}	
			
		}
		System.out.println();
		System.out.println(" "+"Number of characters:"+count);
	
	}

}
