package lec17_java_oop_abstraction_inheritance_encapsulation_catchup;

public class H_TestEncapsulation {

	public static void main(String[] args) {
		G_EncapsulationClass encap = new G_EncapsulationClass("Dead of House","Thriller", 90, 4.5f);
		encap.setMediaType("Action");
		encap.setDuration(90);
		encap.setRating(8.88f);
		encap.setTitle("Tarzan");
		
		System.out.println(encap.getTitle()+"\n"+encap.getMediaType()+"\n"+encap.getDuration()+"\n"+encap.getRating());
		
		// something different when a student ask question
		System.out.println("\n---------------------- do while loop -----------------------");
		int hour = 22;
		
		do {
			hour--;
			System.out.println(hour);
		}
		while(hour > 16);
	}
}