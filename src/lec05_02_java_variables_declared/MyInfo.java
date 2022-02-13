package lec05_02_java_variables_declared;

public class MyInfo {
	// Here all the variables declared
	public String MyName;
	public byte myAge;
	public short myHouseRent;
	public int myYearlySalary; 
	public long myBankBalance;
	public char mySex;
	public float myHeight;
	public double myGrade;
	public boolean usCitizen;

	// Constructor is declared
	public MyInfo() {
		System.out.println("This below information is to know about my self");
	}

	// void type method
	public void myInformation() { // method is implemented
		System.out.println("My Name is: " + MyName + "\nMy Age: " + myAge + "\nMy HouseRent: " + myHouseRent
				+ "\nYearly Salary: " + myYearlySalary + "\nMy Bank Blance" + myBankBalance + "\nSex: " + mySex
				+ "\nMy Height: " + myHeight + "\nMy Grade: " + myGrade + "\nAm I US Citizen? Ans: " + usCitizen);
	}

	
// We removed the main method to a different class
	
//	public static void main(String[] args) {
//		MyInfo myInfo = new MyInfo();
//		myInfo.myInformation();
//
//	}

}
