package lec08_java_recap_variables_method_constrcutor;

public class BalanceCheck {
	
	//Naming convention
	//package = lower, class = Upper, constructor = Upper, variable = lower, method = lower
	
	//8 types of primitive variables, 9 types of data variables
	//boolean, byte, char, short, float, int, double, long : premitive 
	//String is a collection of char
	
	//variables, methods, constructors
	//Class, interface, objects
	
	//Variable declaration = Define the data type + declare a name
	
	//When we create an instance/copy of a class it become an object
	//type of object + instance reference

	//every method returns either void or different types of data
	
	
	public String accountHolder;
	public int accountNumber;
	public int currentBankBalance, takeoutAmmount, remainingBalance;
	
	public BalanceCheck() {}
	
	public BalanceCheck(String accountHolder, int accountNumber, int currentBankBalance, int takeoutAmount) {
		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;
		this.currentBankBalance = currentBankBalance;
		this.takeoutAmmount = takeoutAmount;
	}
	
	public BalanceCheck(int currentBankBalance, int takeoutAmount) {
		this.currentBankBalance = currentBankBalance;
		this.takeoutAmmount = takeoutAmount;
	}
	
	public int getAmmount() {
		return currentBankBalance;
	}
	
	public int getTakeoutAmmount() {
		return takeoutAmmount;
	}
	
	public int getRemainingBalance() {
		remainingBalance = currentBankBalance - takeoutAmmount;
		return remainingBalance;
	}
	
	public void getName() {
		accountHolder = "A new accountholder";
		return;
	}
	
	String aMethodThatReturnStringValue(){
		return "Any String";
	}
	
	void aVoidMethod() {
		System.out.println("I am a void method");
	}
}
