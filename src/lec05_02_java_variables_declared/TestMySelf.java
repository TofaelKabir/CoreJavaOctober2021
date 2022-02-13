package lec05_02_java_variables_declared;

public class TestMySelf {

	public static void main(String[] args) {
		MySelf mySelf1= new MySelf(); // default constructor initialized
		mySelf1.name = "Tofael";
		mySelf1.age = 46;
		mySelf1.houseRent = 31000;
		mySelf1.salary = 3764872;
		mySelf1.bankBalance = 8245687633l;
		mySelf1.sex = 'M';
		mySelf1.height= 1.60f;
		mySelf1.grade = 2.458734;
		mySelf1.usCitizen= false;
		mySelf1.myInformation(); // method initialized here
		
		System.out.println("\n*******************************\n");
		
		MySelf mySelf2= new MySelf(); // default constructor initialized
		mySelf2.name = "Oshay";
		mySelf2.age = 22;
		mySelf2.houseRent = 20000;
		mySelf2.salary = 31764872;
		mySelf2.bankBalance = 82245687633l;
		mySelf2.sex = 'M';
		mySelf2.height= 1.80f;
		mySelf2.grade = 3.458734;
		mySelf2.usCitizen= true;
		mySelf2.myInformation(); // method initialized here
		
        System.out.println("\n*******************************\n");
		
		MySelf mySelf3= new MySelf(); // default constructor initialized
		mySelf3.name = "Hasan";
		mySelf3.age = 22;
		mySelf3.houseRent = 30000;
		mySelf3.salary = 41764872;
		mySelf3.bankBalance = 81245687633l;
		mySelf3.sex = 'M';
		mySelf3.height= 1.70f;
		mySelf3.grade = 4.0734;
		mySelf3.usCitizen= true;
		mySelf3.myInformation(); // method initialized here
		
		
	}

}
