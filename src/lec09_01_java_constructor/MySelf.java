package lec09_01_java_constructor;

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

	// Parameterized constructor declared
	public MySelf(String name, byte age, short houseRent, int salary, long bankBalance, char sex, float height, double grade, boolean usCitizen) {
		this.name = name;
		this.age = age;
		this.houseRent = houseRent;
		this.salary = salary;
		this.bankBalance = bankBalance;
		this.sex = sex;
		this.height = height;
		this.grade = grade;
		this.usCitizen = usCitizen;

		System.out.println("My Name is: " + name + "\nMy Age: " + age + "\nMy HouseRent: " + houseRent + "\nYearly Salary: " + salary + "\nMy Bank Blance" + bankBalance + "\nSex: " + sex + "\nMy Height: " + height + "\nMy Grade: " + grade + "\nAm I US Citizen? Ans: " + usCitizen);
	}
}
