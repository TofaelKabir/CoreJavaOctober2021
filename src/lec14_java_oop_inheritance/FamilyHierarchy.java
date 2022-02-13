package lec14_java_oop_inheritance;

public class FamilyHierarchy {

	public static void main(String[] args) {
		
		GrandFather grandFather = new GrandFather();
		grandFather.eyeColor = "Blue";
		grandFather.grandFatherInfo();
		
		Aunt aunt = new Aunt();
		aunt.auntInfo();
		aunt.eyeColor = "Green";
		aunt.grandFatherInfo();
		
		Cousin01 cousin01 = new Cousin01();
		cousin01.cousin01Info();
		cousin01.auntInfo();
		cousin01.grandFatherInfo();
		
		Uncle uncle = new Uncle();
		uncle.uncleInfo();
		uncle.grandFatherInfo();
		
		Cousin02 cousin02 = new Cousin02();
		cousin02.cousin02Info();
		cousin02.uncleInfo();
		cousin02.grandFatherInfo();
		
		Father father = new Father();
		father.fatherInfo();
		father.grandFatherInfo();
		
		Sister sister = new Sister();
		sister.sisterInfo();
		sister.fatherInfo();
		sister.grandFatherInfo();
		
		Niece niece = new Niece();
		niece.nieceInfo();
		niece.sisterInfo();
		niece.fatherInfo();
		niece.grandFatherInfo();
		
		GrandChild grandChild = new GrandChild();
		grandChild.grandChildInfo();
		grandChild.nieceInfo();
		grandChild.sisterInfo();
		grandChild.fatherInfo();
		grandChild.grandFatherInfo();
		
		MySelf mySelf = new MySelf();
		mySelf.myInfo();
		mySelf.fatherInfo();
		mySelf.grandFatherInfo();
		
		Daughter daughter = new Daughter();
		daughter.daughterInfo();
		daughter.myInfo();
		daughter.fatherInfo();
		daughter.grandFatherInfo();
		
		
		


	}

}
