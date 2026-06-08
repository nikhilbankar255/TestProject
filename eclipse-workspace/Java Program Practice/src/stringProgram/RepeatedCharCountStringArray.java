package stringProgram;

public class RepeatedCharCountStringArray {

	public static void main(String[] args) {
		String str="Nikhil baNkar";
		int count=0;
		
		char[] revStr= str.toCharArray();
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
				if(revStr[i]==revStr[j])
				{
					count++;
					break;
				}
			}
		}
		System.out.println("Repeated character Using Array::"+count);
		
	}

}
