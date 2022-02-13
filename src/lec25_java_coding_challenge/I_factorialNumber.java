package lec25_java_coding_challenge;

/*
 5! = 5x4x3x2x1
 4! = 4x3x2x1
 1! = 1
 0! = 1 (exception)
 
 Explaining:
 5! = 5x4x3x2x1
 	 = 5x(5-1)x(5-2)x(5-3)x(5-4)
 	 = n(n-1)(n-2)(n-3)(n-4)................. 
 */

//1st way: doing by recursive method
public class I_factorialNumber {
	public static int recFactorial(int n) {
		if (n==0) {
			return 1;
		} else {
			return n * recFactorial(n-1); // recursive method: when a method is called inside the same method
		}
	}

	// 2nd way: Doing by for loop
	//1x2x3x4x5x6
	
			public static int factorial(int m) {
				int total = m; //5
				for(int i= m-1; i>=1; i-- ) {
					total = total*i; 
					// 5x(5-1)
					// 20x3
					// 60x2
					//120x1
				}
				return total;
	}
			
	public static void main(String[] args) {
		System.out.println(recFactorial(5));
		System.out.println(factorial(5));



		
		
		
		
		
		

	}

}
