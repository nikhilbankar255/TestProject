package stringProgram;

public class StringSplitIMP {

	public static void main(String[] args) {
		// length vs length()

		String s = "NIKHIL nik tuyi bank";
		String s1= "N-i-k";
//		String m = s.strip();
//		System.out.println(m);
//		
//		int f = s.compareTo(s1);
//		System.out.println(f);
//		
//		 String a = s.replace("N", "j");
//		System.out.println(a);
//		
		
		//System.out.println(s);
		String[] u = s.split(" ");
		String aa = u[1];
		System.out.println("After spliting get 2nd :"+aa);
		for(int i=0;i<u.length;i++)
		{
			System.out.println("++++++"+u[i]);
			
		}

		String[] t=s.split(",");
		System.out.println("Spliting s");
		
		for(int i=0;i<t.length;i++)
		{
			System.out.println("------>"+t[i]);
		}
		
	
			String z = s.concat(s1);
			System.out.println("Concating s and s1:"+z);
			
			String[] x=s1.split("-");
			System.out.println("Spliting s1");
			for(int j=0;j<s1.length();j++)
			{
						System.out.println("=====>>"+x[j]);
			}
			
		StringBuffer n =new StringBuffer("LKJHGG");	
		StringBuilder k=new StringBuilder("LKJHGG");
		System.out.println("Compairing n with k");
		
			
	}
}
