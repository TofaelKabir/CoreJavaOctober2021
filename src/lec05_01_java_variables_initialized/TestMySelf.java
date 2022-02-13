package lec05_01_java_variables_initialized;

public class TestMySelf {

	public static void main(String[] args) {
		// object is also called reference data type
		// Class in instantiated
		MySelf mySelf1= new MySelf(); // default constructor initialized
		mySelf1.myInformation(); // method initialized here
		
		MySelf mySelf2 = new MySelf();
		MySelf mySelf3 = new MySelf();
		MySelf mySelf4 = new MySelf();
	}

}
