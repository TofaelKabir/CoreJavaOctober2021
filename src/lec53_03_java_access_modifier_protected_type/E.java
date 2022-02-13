package lec53_03_java_access_modifier_protected_type;

import lec53_06_java_access_modifier_class_from_outside_package.M;
import lec53_06_java_access_modifier_class_from_outside_package.N;

public class E extends M{
	public static void main(String[] args) {
		System.out.println("\n---------- In the same package, protected type modifier content of different class can be accessed by subclass (Here E) ----------");
		E e = new E();
		// e.f();   // I comment out because I changed to parent class of different package, use Class F when need to check inside same package
		
		System.out.println("\n---------- In the same package, protected type modifier content of different class can be accessed by non-subclass (Here D) ----------");
		D d1 = new D();
		System.out.println(d1.info2);
		d1.msg2();
			
		System.out.println("\n---------- From different package, protected type modifier content of different class can be accessed by subclass (Here E)  ----------");
		System.out.println("---------- The below is coming from class M of package 'lec14_06_java_access_modifier_class_from_outside_package' ----------\n");
		e.m2();
		
		System.out.println("\n---------- From different package, protected type modifier content of different class can not be accessed by non-subclass (Here Calculator02) ----------");
		System.out.println("---------- The below code is coming from class N of package 'lec14_06_java_access_modifier_class_from_outside_package' ----------\n");
		N n2 = new N();
		// n2.n2();

		
		
	}
}
