package lec22_01_java_string_manipulation02;

// This class is for your record, you can see when you have enough time, specially before interview
// https://docs.oracle.com/javase/7/docs/api/java/lang/String.html

public class UseOfString03 {

	public static void main(String[] args) {
		// The Java String class compareTo() method compares the given string with the
		// current string lexicographically. It returns a positive number, negative number, or 0.
		String s1 = "hello";
		String s2 = "hello";
		String s3 = "meklo";
		String s4 = "hemlo";
		String s5 = "flag";
		System.out.println(s1.compareTo(s2)); // 0 because both are equal
		System.out.println(s1.compareTo(s3)); // -5 because "h" is 5 times lower than "m"
		System.out.println(s1.compareTo(s4)); // -1 because "l" is 1 times lower than "m"
		System.out.println(s1.compareTo(s5)); // 2 because "h" is 2 times greater than "f"
		
		// The Java String class contains() method searches the sequence of characters in this string.
		String s6 = "what do you know about me";
		System.out.println("\n"+s6.contains("do you know"));
		System.out.println(s6.contains("about"));
		System.out.println(s6.contains("hello"));
		
		// The java string startsWith() method checks if this string starts with given prefix.
		String s7 = "java by javatpoint";
		System.out.println("\n"+s7.startsWith("j"));
		System.out.println(s7.startsWith("java"));
		System.out.println(s7.startsWith("Nava"));

		// The Java String class endsWith() method checks if this string ends with a given suffix.

		System.out.println("\n"+s7.endsWith("t"));
		System.out.println(s7.endsWith("point"));
		System.out.println(s7.endsWith("pointer"));
		
		// The Java String class isEmpty() method checks if the input string is empty or not.
		String s8 = "";
		String s9 = "javatpoint";

		System.out.println("\n"+s8.isEmpty());
		System.out.println(s9.isEmpty());
		
		// The Java String class join() method returns a string joined with a given delimiter.
		System.out.println("\n");
		String joinString = String.join("-", "welcome", "to", "javatpoint");
		System.out.println(joinString);
		
		
		// The Java String class lastIndexOf() method returns the last index of the
		// given character value or substring.
		String s10 = "this is index of example"; // there are 2 's' characters in this sentence		
		System.out.println(s10.indexOf('s')); // First one: 3
		// returns last index of 's' char value
		System.out.println(s10.lastIndexOf('s')); // 6
		
		// The java string valueOf() method converts different types of values into string.
		// how to turn int, float etc. to String
		int age = 30;
		String s11 = String.valueOf(age);
		System.out.println(s11 + 10); // concatenating string with 10
		
	}

}
