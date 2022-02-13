package lec24_java_coding_challenge;

public class F01_UseOfArray {

	public static void main(String[] args) {
		// when multiple data present, which are similar type, we use Array
		// Below is one of the way to present an Array
		int [] ar = new int [5];
		// here int = type of variable, ar = name of the Array
		// int [5]= there are 5 int type variable
		
		ar[0]=365;
		
		ar[2]=33;
		
		ar[4]=8;
		
		System.out.println(ar.length);
		System.out.println(ar[0]);
		System.out.println(ar[1]);
		System.out.println(ar[2]);
		System.out.println(ar[3]);
		System.out.println(ar[4]);
		
		// Other way to represent Array
		int [] number = {100, 5, 56, 323, 2, 44, 12, 456, 6, 4, 5, 5};
		// here the Array name is 'number'
		System.out.println(number.length);

	}

}
