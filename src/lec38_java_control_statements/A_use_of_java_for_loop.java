package lec38_java_control_statements;
/*
 for loop: most commonly used (1)
 all the loop contain initialization block (int i=0), 
 conditional block (i<=10) and incremental (i++) or decremental block
 common mistakes: type of variable (like: int), semicolon (;) -- we put coma instead

 i++ means increment by 1
 i=i+1 means increment by 1
 i +=1 means increment by 1
 
 i = i+2 means increment by 2
 i += 2 means increment by 2
 
i = i+3 means increment by 3
i +=3 means increment by 3

i-- means decrement by 1
i = i-1 means decrement by 1
i -= 1 means decrement by 1
i = i-2 means decrement by 2
i = i-3 means decrement by 3
i - = 3 means decrement by 3
 
 */
public class A_use_of_java_for_loop {

	public static void main(String[] args) {
		
		// incremental block is used here 
		System.out.println("\n-------------- for loop 01 --------------\n");		
		for(int i=0; i<=10; i++) {
			System.out.println(i);
		}
		
		System.out.println("\n---------- for loop 02  ----------\n");
		for (int i = 1; i <= 10; i = i + 2) {
			System.out.println(i);
		}
		
		System.out.println("\n---------- for loop 03  ----------\n");
		for (int i = -3; i <= 10; i += 2) {
			System.out.println(i);
		}
		
		System.out.println("\n---------- for loop 04  ----------\n");
		for (int i = 1; i < 10; i += 3) {
			System.out.println("The values are: " + i);
		}
		
		System.out.println("\n---------- for loop 05  ----------\n");
		int j = 2;
		for (int i = 1; i < 10; i = i + 3) { 
			System.out.println("The values are: " + i*j);
		}
		
		// decremental block is used
		System.out.println("\n---------- for loop 06  ----------\n");
		for(int i=10; i>=0; i--) {
			System.out.println(i-1);
		}
		
		System.out.println("\n---------- for loop 07  ----------\n");
		int k = 2;
		for (int i = 15; i > 10; i = i - 3) { // 15, 12
			System.out.println(i +  k);
		}
		
		System.out.println("\n---------- for loop 08  ----------\n");
		int l = 2;
		for (int i = 25; i > 10; i -= 3) { // 25, 22, 19, 16, 13
			System.out.println(i*l);
		}
		
		System.out.println("\n---------- for loop 09, condition is false  ----------\n");
		// as condition is false, nothing will execute/print
		int m = 2;
		for (int i = 25; i < 10; i -= 3) {
			System.out.println(i + m);
		}
		
	
		
		
		
		
		
		
		
		
		

	}

}
