package lec15_java_oop_encapsulation;

public class TestStudent {

	public static void main(String[] args) {
		Student student = new Student();
		student.setStName("Alex");
		student.setStId(2114854);
		student.setSex('M');
		student.setFullTimeSt(true);
		student.setGrade(3.223f);
		student.setTutionFees(40000l);

		System.out.println("Name: " + student.getStName() + ", \nID: " + student.getStId() + ", \nSex: "
				+ student.getSex() + ", \nFull Time student? : " + student.isFullTimeSt() + ", \nGrade: " + student.getGrade()
				+ " and \nTution Fees: " + student.getTutionFees());

	}

}
