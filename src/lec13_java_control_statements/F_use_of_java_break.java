package lec13_java_control_statements;

/*
 for loop: most commonly used (1)
 all the loop contain initialization block (int i=0), 
 conditional block (i<=10) and incremental (i++) or decremental block
 
Java Break Statement with Inner Loop
It breaks inner loop only if you use break statement inside the inner loop.


 */

public class F_use_of_java_break {

	public static void main(String[] args) {
		// outer loop
		for (int i = 1; i <= 3; i++) { // 1, 2, 3
			// inner loop
			for (int j = 1; j <= 3; j++) { // 1, 2, 3
				if (i == 2 && j == 2) { // 1 1, 1 2, 1 3, 2 1, 3 1, 3 2, 3 3
					// using break statement inside the inner loop
					break;
				}
				System.out.println(i + " " + j);
			}
		}
	}
}
