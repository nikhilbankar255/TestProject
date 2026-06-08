package JavaCodePractice;

public class StringTestOccurences {

	public static void main(String[] args) {

		//output- check occurrences Test-> 3 times 
		String s="Test the code Test and Test again Test";
		
		String [] words= s.split(" ");
		int count=0;
		
		for(String word: words)
		{
			if(word.equals("Test"))
			{
				count++;
			}
		}
		System.out.println("Test= "+count);
	}

}
