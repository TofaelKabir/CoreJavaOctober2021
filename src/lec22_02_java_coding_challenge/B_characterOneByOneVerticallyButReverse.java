package lec22_02_java_coding_challenge;

public class B_characterOneByOneVerticallyButReverse {

	public static void main(String[] args) {
		String s = "Tofael Kabir";
		// how the last letter is s.length()-1
		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.println(s.charAt(i));
		}

	}

}
