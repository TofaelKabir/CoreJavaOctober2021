package lec12_java_control_statements;

public class D_use_of_nested_loop {

	public static void main(String[] args) {

		System.out.println("\n---------- nested loop (for loop inside a for loop) ----------\n");
		for (int i = 0; i <= 2; i++) {
			for (int j = 0; j <= 3; j++) {
				System.out.println(j + i);
			}
		}

		System.out.println("\n---------- nested loop (while loop inside a for loop) ----------\n");
		for (int k = 1; k <= 6; k += 2) {
			int l = 2;
			while (l <= 4) {
				System.out.println(l * k);
				l++;
			}
		}

		System.out.println("\n---------- nested loop (while loop inside a while loop) ----------\n");
		int m = 1;
		while (m <= 6) {
			int n = 2;
			while (n <= 4) {
				System.out.println(n * m);
				n++;
				m += 2;
			}
		}

		System.out.println("\n---------- nested loop----------\n");
		// as double type is used , we can get decimal for that
		for (double i = 1; i <= 2; i++) {
			for (double j = 2; j <= 4; j++) {
				System.out.println(j / i);
			}
		}

	}

}
