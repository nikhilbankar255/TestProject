package JavaCodePractice;

public class VowelsInString {

	public static void main(String[] args) {
		String s= "kadambari Nikhil  bankar";
		int count=0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i)=='a' || s.charAt(i) == 'e'|| s.charAt(i) == 'i'|| s.charAt(i) == 'o'|| s.charAt(i) == 'u') {
				
				System.out.println("Vowels found : " +s.charAt(i));
				count++;
				
			}
		}
		System.out.println(count);
	}

}
