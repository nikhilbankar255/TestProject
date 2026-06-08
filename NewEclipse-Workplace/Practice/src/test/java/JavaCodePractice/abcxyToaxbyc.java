package JavaCodePractice;

public class abcxyToaxbyc {

	public static void main(String[] args) {

		String input= "abc xyz123"; //output= axbyzc123
		 String[] part= input.split(" ");
		 String s1=part[0];
		 String s2= part[1];
		 
		 int minLength= Math.min(s1.length(), s2.length());
		 
		StringBuilder result = new StringBuilder();
		for(int i=0; i<minLength; i++)
		{
			result.append(s1.charAt(i));
			result.append(s2.charAt(i));
		}
		if(s1.length()>s2.length())
		{
			result.append(s1.substring(minLength));
		}
		else
		{
			result.append(s2.substring(minLength));
		}
		
		System.out.println(result.toString());
		
		
	}

}
