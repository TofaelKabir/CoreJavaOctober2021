package lec27_java_coding_challenge;

public class F03_smallestNumber {

	public static void main(String[] args) {
		int [] number = {12, 13, 100, 77, 1, 5, 6, 6, 8, 55, 7, 8, 5, 56, 323, 2, 44, 12, 456, 6, 4, 5, 5};
		
		int smallest = number[0];
		// why length, not length()? because Array use length property, not length method
		for(int i=1; i<number.length; i++) {
			if(number[i]<smallest) {
				smallest = number[i];
			}
		}
		System.out.println(smallest);
		

	}

}
