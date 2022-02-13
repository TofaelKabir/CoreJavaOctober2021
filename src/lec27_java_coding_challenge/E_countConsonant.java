package lec27_java_coding_challenge;

public class E_countConsonant {

	public static void main(String[] args) {
		String s = "the quick brown fox jumps over the lazy dog";
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != 'a' && s.charAt(i) != 'e' && s.charAt(i) != 'i' && s.charAt(i) != 'o'
					&& s.charAt(i) != 'u' && s.charAt(i) != ' ') {
				count++;
			}
		}
		System.out.println(count);

	}

}
