package lec53_05_java_access_modifier_default_type;

import lec53_06_java_access_modifier_class_from_outside_package.M;
import lec53_06_java_access_modifier_class_from_outside_package.N;

public class K extends M {

	public static void main(String[] args) {
		
		System.out.println("\n---------- In the same package, default type modifier content of different class can be accessed by subclass (Here K) ----------");
		K k = new K();
		//k.l();   // I comment out because I changed to parent class of different package, use Class L when need to check inside same package
		
		System.out.println("\n---------- In the same package, default type modifier content of different class can be accessed by non-subclass (Here J) ----------");
		J j1 = new J();
		System.out.println(j1.info4);
		j1.msg4();
		
		System.out.println("\n---------- From different package, default type modifier content of different class can not be accessed by subclass (Here K)  ----------");
		System.out.println("---------- The below code is coming from class M of package 'lec14_06_java_access_modifier_class_from_outside_package' ----------\n");	
		// k.m4();
		
		System.out.println("\n---------- From different package, default type modifier content of different class can not be accessed by non-subclass (Here Calculator02) ----------");
		System.out.println("---------- The below code is coming from class N of package 'lec14_06_java_access_modifier_class_from_outside_package' ----------\n");
		N n4 = new N();
		// n4.n4();
		

	}

}
