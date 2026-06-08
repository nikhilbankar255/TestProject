package basicProgram;

public class AlphabetOrNot {

	public static void main(String[] args) {

		char ch = 'h';

		if ((ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z')) {
			System.out.println(ch + "  Given Value is an ALphabet ");

		} else {
			System.out.println(ch + "  Given Value is NOT an ALphabet ");
		}

	}

}
