package lec19_java_oop_polymorphism;

public class TestCalculator {

	public static void main(String[] args) {
		
		System.out.println("\n-------- Local Calculator --------");
		LandCalculator lc = new LandCalculator();
		lc.landCalculator(23, 65, 74); // return type parameterized method -01 initialized
		lc.landCalculator(33, 65); // return type parameterized method -02 initialized
		lc.landCalculator(43, 65, "5"); // return type parameterized method -03 initialized
		lc.landCalculator(53, 65, 87, 45); // final method -04 initialized
		LandCalculator.landCalculator(63, 65, 87, 45, 11); // static method -05 initialized
		lc.landCalculator(99, 34, 53, 65, 87, 45); // void type parameterized method -06 initialized
		lc.landCalculator(); // void type method -07 initialized
		
		
		System.out.println("\n-------- Modern Calculator --------");
		ModernCalculator mc = new ModernCalculator();
		mc.landCalculator(23, 65, 74); // return type parameterized method -01 initialized
		mc.landCalculator(33, 65); // return type parameterized method -02 initialized
		mc.landCalculator(43, 65, "5"); // return type parameterized method -03 initialized
		mc.landCalculator(99, 34, 53, 65, 87, 45); // void type parameterized method -06 initialized
		mc.landCalculator(); // void type method -07 initialized

	}

}
