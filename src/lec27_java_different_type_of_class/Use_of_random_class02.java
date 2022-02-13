package lec27_java_different_type_of_class;

import java.util.Random;

public class Use_of_random_class02 {

	public static void main(String[] args) {
		Random random = new Random();
		int val1 = random.nextInt(1000);
		int val2 = random.nextInt(1000);

		if (val1 % 2 == 0 && val1 < val2) {
			System.out.println(val1 + " is an even number and less than " + val2);
		} else if (val1 % 2 == 0 && val1 > val2) {
			System.out.println(val1 + " is an even number and greater than " + val2);
		} else if (val1 % 2 == 1 && val1 < val2) {
			System.out.println(val1 + " is an odd number and less than " + val2);
		} else if (val1 % 2 == 1 && val1 > val2) {
			System.out.println(val1 + " is an odd number and greater than " + val2);
		} else if (val1 % 2 == 0 && val1 != val2) {
			System.out.println(val1 + " is an even number and not equal to " + val2);
		} else if (val1 % 2 == 0 && val1 == val2) {
			System.out.println(val1 + " is an even number and equal to " + val2);
		} else if (val1 % 2 == 1 && val1 != val2) {
			System.out.println(val1 + " is an odd number and not equal to " + val2);
		} else if (!(val1 % 2 == 1 && val1 == val2)) {
			System.out.println(val1 + " is not an off number and not equal to " + val2);
		} else if (val1 % 2 == 0 && val1 >= val2) {
			System.out.println(val1 + " is an even number and greater than (or equal to)  " + val2);
		} else if (val1 % 2 == 0 && val1 <= val2) {
			System.out.println(val1 + " is an even number and less than (or equal to) " + val2);
		} else if (val1 % 2 == 1 && val1 == val2) {
			System.out.println(val1 + " is an odd number and equal to " + val2);
		} else {
			System.out.println("This is not a vliad case");
		}

	}

}
