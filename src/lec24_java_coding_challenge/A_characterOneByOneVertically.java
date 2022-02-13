package lec24_java_coding_challenge;

/*
 Que: Print your name vertically by character
*/

public class A_characterOneByOneVertically {

	public static void main(String[] args) {
		String s = "Tofael Kabir";
		//System.out.println(s.length());
		
		for (int i=0; i<s.length(); i++) {
			System.out.println(s.charAt(i));
		}

	}

}

