package lec53_02_java_access_modifier_public_type;

import lec53_06_java_access_modifier_class_from_outside_package.M;
import lec53_06_java_access_modifier_class_from_outside_package.N;

public class B extends M {
	public static void main(String[] args) {
		System.out.println("\n---------- In the same package, public type modifier content of different class can be accessed by subclass (Here B) ----------");
		B b = new B();
		// b.c();   // I comment out because I changed to parent class of different package, use Class C when need to check inside same package
		
		System.out.println("\n---------- In the same package, public type modifier content of different class can be accessed by non-subclass (Here A) ----------");
		A a1 = new A();
		System.out.println(a1.info1);
		a1.msg1(); 
						
		System.out.println("\n---------- From different package, public type modifier content of different class can be accessed by subclass (Here B)  ----------");
		System.out.println("---------- The below is coming from class M of package 'lec14_06_java_access_modifier_class_from_outside_package' ----------\n");
		b.m1();
		
		System.out.println("\n---------- From different package, public type modifier content of different class can be accessed by non-subclass (Here Calculator02) ----------");
		System.out.println("---------- The below coded is coming from class N of package 'lec14_06_java_access_modifier_class_from_outside_package' ----------\n");
		N n1 = new N();
		n1.n1();
				
	}

}
