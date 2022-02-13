package lec27_java_coding_challenge;

public class N_swapInteger01 {

	public static void main(String[] args) {
		int x = 10;
		int y = 5;
		
		// using temp variable
		
		int temp;
		temp =x;
		x=y;
		y=temp;
		
		System.out.println("The x is : " + x);
		System.out.println("The y is :" + y);

	}

}
