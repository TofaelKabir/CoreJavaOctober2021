package lec15_java_oop_encapsulation;

public class Student {
	private String stName;
	private int stId;
	private char sex;
	private boolean fullTimeSt;
	private float grade;
	private long tutionFees;
	
	public String getStName() {
		return stName;
	}
	public void setStName(String Name) {
		this.stName = Name;
	}
	public int getStId() {
		return stId;
	}
	public void setStId(int stId) {
		this.stId = stId;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public boolean isFullTimeSt() {
		return fullTimeSt;
	}
	public void setFullTimeSt(boolean fullTimeSt) {
		this.fullTimeSt = fullTimeSt;
	}
	public float getGrade() {
		return grade;
	}
	public void setGrade(float grade) {
		this.grade = grade;
	}
	public long getTutionFees() {
		return tutionFees;
	}
	public void setTutionFees(long tutionFees) {
		this.tutionFees = tutionFees;
	}
	
	
	
	
}
