package lec27_java_coding_challenge;

public class L_makingPyramid {
	public static void pyramid(int n) {

		for (int i = 0; i < n; i++) { // 0

			for (int j = 0; j < n - i; j++) { // 0, 1, 2, 3, 4, 5
				System.out.print(" ");
			}

			for (int k = 0; k <= i; k++) { //
				System.out.print("* ");
			}

			System.out.println();
		}

	}	
	
	public static void main(String[] args) {
/*   Implement a large Pyramid of stars in the screen with java.
 
        *
       * *
      * * *
     * * * *
    * * * * *
   * * * * * *

*/
		pyramid(4);
}

}
