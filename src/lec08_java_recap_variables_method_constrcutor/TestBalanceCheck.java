package lec08_java_recap_variables_method_constrcutor;

public class TestBalanceCheck {
	
	public static void main(String[] args) {
	//	BalanceCheck johnBankBalanceCheck = new BalanceCheck("John", 5555, 8000, 43);
	//	BalanceCheck johnBankBalanceCheck = new BalanceCheck();
		BalanceCheck johnBankBalanceCheck = new BalanceCheck(9000, 600);
		System.out.println(johnBankBalanceCheck.getRemainingBalance());
		System.out.println(johnBankBalanceCheck.getTakeoutAmmount());
		System.out.println(johnBankBalanceCheck.getAmmount());
		System.out.println(johnBankBalanceCheck.takeoutAmmount + johnBankBalanceCheck.remainingBalance);
		
	//	BalanceCheck jerryBankBalace = new BalanceCheck("Jerry", 6879, 10000, 700);
	//	BalanceCheck jerryBankBalace = new BalanceCheck();
		BalanceCheck jerryBankBalace = new BalanceCheck(200, 88);
		System.out.println("jerry's Remaing : " + jerryBankBalace.getRemainingBalance());
	}
}
