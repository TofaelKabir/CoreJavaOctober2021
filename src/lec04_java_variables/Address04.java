package lec04_java_variables;

public class Address04 {
// The variables were here, and we moved it under the main method
// it shows error with public and static
	public static void main(String[] args) {
		// static variables can't executed inside main method, because main method itself is static 
		// they must be non-static and also public access modifier must be removed
		String MyName = "Mohammad Sharkar";
		int houseNumber = 625;
		char houseLocation = 'W';
		int streetNumber = 57;
		String streetType = "th st";
		String state = "NY -";
		int zipCode = 10019;
		boolean inUSA = true;

		System.out.println(MyName);
		System.out.println(houseNumber);
		System.out.println(houseLocation);
		System.out.println(streetNumber);
		System.out.println(streetType);
		System.out.println(state);
		System.out.println(zipCode);
		System.out.println(inUSA);
	}

}
