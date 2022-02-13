package lec25_java_coding_challenge;

// Can you print your name revere and vertically?

public class B02_characterOneByOneVerticallyButReverse {

	public static void main(String[] args) {
		String s = "Tofael Kabir";
		// how the last letter is s.length()-1
		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.println(s.charAt(i));
		}

	}

}

// ribaK leafoT
