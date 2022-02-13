package lec07_02_java_constructor;

public class MyInfo {
	
	// we can create parameterized constructor by -- select variables, right click
	// The go to source -- generate constructor using fields
	// Choose where you want to create it by choosing insertion point -- click Generate
	// another way from top of the page -- select source -- follow same
	
	public String myName;
	public int myAge;
	public int myYearlySalary; 
	public long myBankBalance;
	public char mySex;
	public float myHeight;
	public double myGrade;
	public boolean usCitizen;
	
	public MyInfo() {
		System.out.println("This below information is to know about my self");
	}

	public MyInfo(String myName, int myAge, char mySex, boolean usCitizen) {
		this.myName = myName;
		this.myAge = myAge;
		this.mySex = mySex;
		this.usCitizen = usCitizen;
		System.out.println("My Name is: " + myName + "\nMy Age: " + myAge + "\nSex: " + mySex + "\nAm I US Citizen? Ans: " + usCitizen);
	}

	public MyInfo(String myName, int myAge, int myYearlySalary, long myBankBalance, char mySex,
			float myHeight, double myGrade, boolean usCitizen) {
		this.myName = myName;
		this.myAge = myAge;
		this.myYearlySalary = myYearlySalary;
		this.myBankBalance = myBankBalance;
		this.mySex = mySex;
		this.myHeight = myHeight;
		this.myGrade = myGrade;
		this.usCitizen = usCitizen;
		
		System.out.println("My Name is: " + myName + "\nMy Age: " + myAge + "\nYearly Salary: " + myYearlySalary + "\nMy Bank Blance" + myBankBalance + "\nSex: " + mySex
				+ "\nMy Height: " + myHeight + "\nMy Grade: " + myGrade + "\nAm I US Citizen? Ans: " + usCitizen);
	}
}
