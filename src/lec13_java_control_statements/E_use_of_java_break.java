package lec13_java_control_statements;

/*
 for loop: most commonly used (1)
 all the loop contain initialization block (int i=0), 
 conditional block (i<=10) and incremental (i++) or decremental block
 */

public class E_use_of_java_break {

	public static void main(String[] args) {
		System.out.println("\n---------- for loop  ----------\n");		
		for(int i=0; i<=5; i++) {
			System.out.println(i);
		}
		
		System.out.println("\n---------- for loop after the break 01  ----------\n");
		for(int j=0; j<=10; j=j+2) {
			if(j==6) {
				break; // when we use break, then the loop is completed before the sysout
			}
			System.out.println(j);
		}	
		
		System.out.println("\n---------- while loop ----------\n");
		int i = 0;
		while(i<=5) {
			System.out.println(i);
			i++;
		}
		
		System.out.println("\n---------- while loop after break 01 ----------\n");
		int j = 0;
		while (j <= 10) { 
			if (j == 7) {
				break;
			}
			System.out.println("The value is: " + j);
			j=j+2;
		}
		
		System.out.println("\n---------- while loop after break 02 ----------\n");
		int n = 1;
		while (n <= 10) {
			if (n== 7) {
				break;
			}
			System.out.println("The value is: " + n);
			n +=2;
		}
		
		
		System.out.println("\n---------- do while loop ----------\n");
		int k = 0;
		do {
			System.out.println(k);
			k++;
		}while(k<=5);
		
		System.out.println("\n---------- do while loop after break 01 ----------\n");
		int l = 1;
		do {
			System.out.println("The value is: " + l);			
			if (l == 5) {
				break;
			}
			l = l + 2;
		} while (l <= 7);
		
		System.out.println("\n---------- do while loop after break 02 ----------\n");
		int m = 1;
		do {
			System.out.println("The value is: " + m);		
			if (m == 6) {  // condition is absent
				break;
			}
			m = m + 2;
		} while (m <= 7);
		

		

	}

}
