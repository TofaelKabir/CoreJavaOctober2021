package lec05_01_java_variables_initialized;

public class MySelf {
	public String name = "Tofael"; // variable initialized
	public byte age = 46;
	public short houseRent = 30000;
	public int salary = 876874600;
	public long bankBalance = 57687682377768473l;
	public char sex = 'M';
	public float height = 1.3456f;
	public double grade = 2.75638746574;
	public boolean usCitizen = false;

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
