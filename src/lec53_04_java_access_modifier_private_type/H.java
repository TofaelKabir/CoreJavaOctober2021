package lec53_04_java_access_modifier_private_type;

import lec53_06_java_access_modifier_class_from_outside_package.M;
import lec53_06_java_access_modifier_class_from_outside_package.N;

public class H extends M {

	public static void main(String[] args) {
		System.out.println("\n---------- In the same package, private type modifier content of different class can not be accessed by subclass (Here H) ----------");
		H h = new H();
		// h.i(); // I comment out because I changed to parent class of different package, use Class I when need to check inside same package
		
		System.out.println("\n---------- In the same package, private type modifier content of different class can not be accessed by non-subclass (Here I) ----------");
		// I i = new I();  // because private constructor don't allow to instantiate the object
				
		System.out.println("\n---------- From different package, private type modifier content of different class can not be accessed by subclass (Here H)  ----------");
		System.out.println("---------- The below code is coming from class M of package 'lec14_06_java_access_modifier_class_from_outside_package' ----------\n");
		// h.m3();
		
		System.out.println("\n---------- From different package, private type modifier content of different class can not be accessed by non-subclass (Here Calculator02) ----------");
		System.out.println("---------- The below code is coming from class N of package 'lec14_06_java_access_modifier_class_from_outside_package' ----------\n");
		N n3 = new N();
		// n3.n3();
		
	}

}
