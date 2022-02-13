package lec05_01_java_variables_initialized;

public class MyInfo {
	public String MyName = "Tofael"; // String is not a pure primitive type Data
	public byte myAge = 80;
	public short myHouseRent = 28000;
	public int myYearlySalary = 250000; // mostly used
	public long myBankBalance = 765762765365873l;
	public char mySex = 'M';
	public float myHeight = 1.70f;
	public double myGrade = 3.34237479237;
	public boolean usCitizen = false;

	// Constructor is declared
	public MyInfo() {
		System.out.println("This below information is to know about my self");
	}

	// method
	public void myInformation() { // method is implemented
		System.out.println("My Name is: " + MyName + "\nMy Age: " + myAge + "\nMy HouseRent: " + myHouseRent
				+ "\nYearly Salary: " + myYearlySalary + "\nMy Bank Blance" + myBankBalance + "\nSex: " + mySex
				+ "\nMy Height: " + myHeight + "\nMy Grade: " + myGrade + "\nAm I US Citizen? Ans: " + usCitizen);
	}

	
// We removed the main method to a different class, but kept it below as we can also use it at the end of methods
	
	
	
//	public static void main(String[] args) {
//		MyInfo myInfo = new MyInfo();
//		myInfo.myInformation();
//
//	}

}
