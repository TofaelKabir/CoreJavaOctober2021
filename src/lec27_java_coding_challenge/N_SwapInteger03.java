package lec27_java_coding_challenge;

public class N_SwapInteger03 {

	public static void main(String[] args) {
		int x = 10;
		int y = 5;

		// using * operator

		x = x * y;
		y = x / y;
		x = x / y;

		System.out.println("The x is : " + x);
		System.out.println("The y is :" + y);

	}

}
