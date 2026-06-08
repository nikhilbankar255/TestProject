package JavaCodePractice;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		//here to check strings with each other but 2nd string is having character randomly ordered. 
		//Both Strings if matches irrespect of order should show success/true 
		String s1 = "aaabb";
		String s2 = "ababa";

		char[] a1=s1.toCharArray();
		char[] a2=s2.toCharArray();

	
		Arrays.sort(a1);
		Arrays.sort(a2);

		System.out.println(Arrays.equals(a1,a2));
	}

}
