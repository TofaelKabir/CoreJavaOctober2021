package lec24_java_coding_challenge;

public class F04_findLargestAndsmallestNumber {

	public static void main(String[] args) {
		int [] number = {12, 13, 100, 77, 3, 5, 6, 6, 8, 55, 7, 8, 5, 56, 323, 1, 2, 44, 12, 456, 6, 4, 5, 5};
		int largest = number[0];
		int smallest = number[0];
		
		for(int i=1; i<number.length; i++) {
			if(number[i]>largest) {
				largest = number[i];
			}else if(number[i]<smallest) {
				smallest = number[i];
			}
		}
		System.out.println("Largest Number: "+largest);
		System.out.println("Smallest Number: "+smallest);

	}

}
