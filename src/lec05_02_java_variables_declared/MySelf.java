package lec05_02_java_variables_declared;

public class MySelf {
	public String name; // variable declared
	public byte age;
	public short houseRent;
	public int salary;
	public long bankBalance;
	public char sex;
	public float height;
	public double grade;
	public boolean usCitizen;

	// default constructor declared
	public MySelf() {
		System.out.println("I am from Myself Class");
	}
	
	// method implemented here
	public void myInformation() {
		System.out.println("My Name is: " + name + "\nMy Age: " + age + "\nMy HouseRent: " + houseRent + "\nYearly Salary: " + salary + "\nMy Bank Blance" + bankBalance + "\nSex: " + sex
+ "\nMy Height: " + height + "\nMy Grade: " + grade + "\nAm I US Citizen? Ans: " + usCitizen);	
	}

}
