package lec05_01_java_variables_initialized;

public class TestMyInfo {

	public static void main(String[] args) {
		// MyInfo is a Class
		// myInfo is an object (most of the places, it is called object)
		// myInfo is also called a reference variable
		// object always starts with lowercase
		// = equal operator
		// new is a keyword
		// MyInfo() is a newly created Class name 'MyInfo'
		// an object is created (myInfo) from MyInfo class which is a new MyInfo type
		// This action is called "Instantiation". A class (MyInfo) is instantiated
		MyInfo myInfo = new MyInfo(); // from this line the Constructor is initialized
		myInfo.myInformation(); // method is initialized here

	}

}
