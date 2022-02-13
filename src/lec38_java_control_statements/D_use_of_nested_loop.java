package lec38_java_control_statements;

public class D_use_of_nested_loop {

	public static void main(String[] args) {

		System.out.println("\n---------- nested loop (for loop inside a for loop) ----------\n");
		for (int i = 0; i <= 2; i++) {	// 0, 1, 2				
			for (int j = 0; j <= 3; j++) {		// 0, 1, 2, 3				
				System.out.println(i+j); 				
				//0+0, 1+0, 2+0, 3+0
				//0+1, 1+1, 2+1, 3+1
				//0+2, 1+2, 2+2, 3+2
			}
		}

		System.out.println("\n---------- nested loop (while loop inside a for loop) ----------\n");
		for (int k = 1; k <= 6; k += 2) { // 1, 2, 3, 4, 5, 6
			int l = 2;
			while (l <= 4) { //2, 3, 4
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
			}
				m += 2;
			
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
