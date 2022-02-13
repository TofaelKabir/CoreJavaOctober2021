package lec27_java_different_type_of_class;

import java.util.Random;

public class Use_of_random_class01 {

	public static void main(String[] args) {
		System.out.println("--------------- Use of nextInt without limit (int type) ------------------");
		Random random = new Random(); // choosing randomly, not inputting, so no System.in
		int a = random.nextInt(); // without limit of int (showing negative number too)
		int f = random.nextInt();
		System.out.println("Randomly chosen number 1 : " + a);
		System.out.println("Randomly chosen number 2 : " + random.nextInt());
		System.out.println("Randomly chosen number 3 : " + f);

		System.out.println("\n--------------- Use of nextInt with limit ------------------");
		int b = random.nextInt(100); // what happen if we put -100, try it
		int e = random.nextInt(1000);
		System.out.println("Randomly chosen number 4 : " + b);
		System.out.println("Randomly chosen number 5 : " + e);
		System.out.println("Randomly chosen number 6 : " + random.nextInt(200));

		// important interview question
		// by default boolean value is : false
		// by default int value is : 0
		// by default String value is : Null

		System.out.println("\n--------------- Use of nextBoolean without ------------------");
		boolean c = random.nextBoolean();
		boolean d = random.nextBoolean();
		System.out.println("Random Boolean value 1 : " + c);
		System.out.println("Random Boolean value 2 : " + d);
		System.out.println("Random Boolean value 3 : " + random.nextBoolean());

		System.out.println("\n--------------- Use of nextDouble, nextFloat, nextLong ------------------");
		double g = random.nextDouble();
		float h = random.nextFloat();
		long i = random.nextLong();
		System.out.println("Random Double value : " + g);
		System.out.println("Random Float value : " + h);
		System.out.println("Random Long value : " + i);

		System.out.println("\n--------------- Use of nextBytes ------------------");
		byte[] bytes = new byte[10]; // create byte array
		random.nextBytes(bytes); // put the next byte in the array
	
		System.out.print("Random bytes = [ "); // print random value of array
		for (int m = 0; m < bytes.length; m++) {
			System.out.printf("%d ", bytes[m]);
		}
		System.out.print("]");
		
		/*
		 There is no Random.nextShort() method, so you could use
		 short s = (short) Random.nextInt(Short.MAX_VALUE + 1);
		 The +1 is because the method returns a number up to the number specified (exclusive).
		 */
		
		

	}

}
