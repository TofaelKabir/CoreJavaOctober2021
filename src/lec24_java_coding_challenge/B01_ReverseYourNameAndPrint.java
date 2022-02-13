package lec24_java_coding_challenge;

// Can you print your name in revere?

public class B01_ReverseYourNameAndPrint {

	public static void main(String[] args) {
		String s = "Tofael Kabir";
		// how the last letter is s.length()-1
		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.print(s.charAt(i));
		}

	}

}

// ribaK leafoT
