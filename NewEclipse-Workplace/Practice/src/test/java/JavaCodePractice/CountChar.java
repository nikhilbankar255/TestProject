package JavaCodePractice;

public class CountChar {

	public static void main(String[] args) {

		String str = "Nikhil bankar";
		str= str.toLowerCase();
		int [] freq= new int [256];   // to store chars
		
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(ch!=' ')    // to eleminate space and count other characters
			{
				freq[ch]++;    // add chars
			}	
			
		}
		System.out.println("Character occurrences:");
		for (int i = 0; i < freq.length; i++) {
			if (freq[i]>0) {
				System.out.println((char)i+" : "+ freq[i]);
			}
		}
	}

}
