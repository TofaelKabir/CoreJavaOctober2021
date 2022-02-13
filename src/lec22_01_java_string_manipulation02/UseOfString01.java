package lec22_01_java_string_manipulation02;

// https://docs.oracle.com/javase/7/docs/api/java/lang/String.html

public class UseOfString01 {

	public static void main(String[] args) {
		String s = "Lorem ipsum dolor sit amet consectetur adipisicing elit. Voluptas tempora debitis maiores nemo modi! Alias pariatur nulla rem ipsum, molestiae modi atque dignissimos eius impedit, dolorem iusto voluptatem qui ea?";
		
		// The Java String class length() method finds the length of a string.
		System.out.println("\n");
		System.out.println(s + "\n");
		System.out.println("The length of the String is: " + s.length());
		
		// The java string toUpperCase() method returns the string in uppercase letter.
		System.out.println("\n");
		System.out.println(s.toUpperCase());
		
		// The java string toLowerCase() method returns the string in lowercase letter.
		System.out.println("\n");
		System.out.println(s.toLowerCase());
		
		// charAt() -- Returns the char value at the specified index.
		// The index number starts from 0 and goes to n-1, where n is the length of the string. 
		System.out.println("\nThe character at a specific position(0): " + s.charAt(0));
		System.out.println("\nThe character at a specific position(10): " + s.charAt(10));
		System.out.println("\nThe character at a specific position(126): " + s.charAt(126));
		
		// The Java String class indexOf() method returns the position of the first occurrence of the specified character or string in a specified string.
		System.out.println("\nThe character 'L' is, at the position of: " + s.indexOf('L')); // String indexing starts from 0
		System.out.println("\nThe character 'V' is, at the position of: " + s.indexOf('V')); 
		System.out.println("\nThe character 'v' is, at the position of: " + s.indexOf('v')); // case sensitive
		System.out.println("\nThe character 'm' is, at the position of: " + s.indexOf('m')); // if present more than one, the first own is recognized
		System.out.println("\nThe character 'x' is, at the position of: " + s.indexOf('x')); // if any character is absent, it shows -1.
		
		// Returns the index within this string of the first occurrence of the specified substring.
		System.out.println("\nThe index of 'dolor' word is: " +s.indexOf("dolor") );
		System.out.println("\nThe index of 'Dolor' word is: " +s.indexOf("Dolor")); // case sensitive
		System.out.println("\nThe index of 'debitis' word is: " +s.indexOf("debitis")); 
		System.out.println("\nThe index of 'pariatur' word is: " +s.indexOf("pariatur")); 
		
		// that is used not that much instead the last one
		// To know the position of the repetitive character in which index: s.indexOf('a', s.indexOf('a')+1)) 
		System.out.println("\nThe first 'r' character is - at the position of: " +s.indexOf('r')); // (2)
		System.out.println("\nThe second 'r' character is - at the position of: " +s.indexOf('r', s.indexOf('r') + 1)); // this is not used much (16)
		System.out.println("\nThe third 'r' character is - at the position of: " +s.indexOf('r', s.indexOf('r', s.indexOf('r')+2) + 1)); // this is not used much (37)
		System.out.println("\nThe last 'r' character is - at the position of: " +s.lastIndexOf('r')); // 184
				
		
		// The substring begins with the character at the specified index and extends to the end of this string.
		System.out.println("\n");
		System.out.println(s.substring(10));

		// The java string substring() method returns a part of the string.
		// this substring is important
		// The substring begins at the specified beginIndex and extends to the character
		// at index (endIndex - 1)
		// start index 0, end index (25-1), similar like initialization block and conditional block
		System.out.println("\n");
		System.out.println(s.substring(0, 25));
		System.out.println("\n");
		System.out.println(s.substring(5, 65));
		
	}

}
