package lec19_java_oop_polymorphism;

public class ModernCalculator extends LandCalculator {
	// summary: same method name, same signature/parameter but Overriding the logic of the method
	// Method overriding(same method name, same parameter but different syntax or logic)
	// Also called -- Late binding or dynamic binding or runtime polymorphism
	// 100% asked -- what is the difference between method overloading and method overriding?	

	// method -01
	@Override
	public int landCalculator(int a, int b, int c) {
		int total1 = a + b + c - 5;
		System.out.println("Total area from local calculator: " + total1);
		return total1;
	}

	// method -02
	@Override
	public int landCalculator(int a, int b) {
		int total2 = a + b * 2;
		System.out.println("Total area from local calculator: " + total2);
		return total2;
	}

	// method -03
	@Override
	public int landCalculator(int a, int b, String c) {
		int total3 = a + b/5 + Integer.parseInt(c);
		System.out.println("Total area from local calculator: " + total3);
		return total3;
	}

	// method -04
	// Final type method cannot be Overriden -- important interview question
	// Cannot override the final method from LandCalculator

	/*
	@Override
	public final int landCalculator(int a, int b, int c, int d) {
		int total4 = a + b + c + d;
		System.out.println("Total area from local calculator: " + total4);
		return total4;
	}
	*/

	// method -05
	// -- important interview question
	// The method landCalculator can't override or implemented
	// because static is a local method of a class)
	// So, static method can't be override, if we remove @override it will work as
	// static method of this modern calculator class
	
	/*
	@Override
	public static int landCalculator(int a, int b, int c, int d, int e) {
		int total5 = a + b + c + d + e;
		System.out.println("Total area from local calculator: " + total5);
		return total5;
	}
	*/

	// method -06
	@Override
	public void landCalculator(int a, int b, int c, int d, int e, int f) {
		int total6 = a/33 + b + c + d + e + f/15;
		System.out.println("Total area from local Calculator: " + total6);
	}

	// method -7
	@Override
	public void landCalculator() {
		System.out.println("This is from void type method from Local Calculator");
	}

}
