package lec27_java_coding_challenge;

// Que: How many 'z' (They don't say upper or lower) inside the provided String?
// you have to ask is it upper case or lower case?
// Better not to ask if they don't define

public class C_countASpecificCharacter {
	public static void main(String[] args) {
		String s = "Ziyad Alz Khilanliez";
		int count=0;
		for (int i=0; i<s.length(); i++) {
			// you have to understand what toLowerCase() method do here
			if(s.toLowerCase().charAt(i)=='z') {
				count ++;
			}
		}
		System.out.println(count);
		
		
	}

}
