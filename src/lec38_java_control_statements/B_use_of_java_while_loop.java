package lec38_java_control_statements;

/*
while loop:
all the loop contain: initialization block, conditional block and increment or decremental block
common mistakes: type of variable (like: int), semicolon (;) -- we put coma instead, forgot ; after incremental or decremental block (i++)
 */

public class B_use_of_java_while_loop {

	public static void main(String[] args) {

		System.out.println("\n---------- for loop  ----------\n");
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
		}

		System.out.println("\n---------- while loop 01  ----------\n");
		int i = 0;
		while (i <= 10) {
			System.out.println(i);
			i++;
		}

		System.out.println("\n---------- while loop 02 ----------\n");
		int j = 3;
		while (j <= 10) {
			System.out.println("The value is: " + j);
			j = j + 2;
		}

		// decremental block is used
		System.out.println("\n---------- while loop 03 ----------\n");
		int k = 10;
		while (k >= 5) {
			System.out.println("The value is: " + k);
			k--;
		}
		
		System.out.println("\n---------- while loop 04, condition false ----------\n");
		// as condition is false, nothing will execute
		int n = 20;
		while (n <= 5) {
			System.out.println("The value is: " + n);
			n-=2;
		}
		
		System.out.println("\n---------- while loop 05 ----------\n");
		int m = 2;
		int l = 16;
		while (l > 5) { //16, 13, 10, 7
			System.out.println("The value is: " + l*m);
			l = l - 3;
		}	
		
		
		
		
		
		

	}

}
