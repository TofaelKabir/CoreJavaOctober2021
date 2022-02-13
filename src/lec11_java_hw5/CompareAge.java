package lec11_java_hw5;

public class CompareAge {

	public static void main(String[] args) {
		 int ageOfAlex = 21;
		 int ageOfJenifer = 21;
		 
		 
		 if(ageOfAlex%2==0 && (ageOfAlex<ageOfJenifer)) {
			 System.out.println("Alex is " +ageOfAlex+", which is an even number and he is younger than Jenifer. " + ageOfJenifer+ ", the age of Jenifer.");
		 } else if(ageOfAlex%2==0 && (ageOfAlex>ageOfJenifer)) {
			 System.out.println("Alex is " +ageOfAlex+", which is an even number and he is older than Jenifer. " + ageOfJenifer+ ", the age of Jenifer.");
		 }

	}

}

// add other 9 condition
