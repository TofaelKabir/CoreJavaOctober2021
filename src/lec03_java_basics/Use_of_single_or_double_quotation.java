package lec03_java_basics;

public class Use_of_single_or_double_quotation {

	public static void main(String[] args) {

		System.out.println(
				"Gruden has been under fire since \'The Wall Street Journal\' reported last week that he sent an email in 2011, when he was working as an ESPN broadcaster, to an NFL coach that used racist language to describe NFL Players Association Director DeMaurice Smith. \n\"Dumboriss Smith has lips the size of michellin tires\", Gruden wrote to Bruce Allen, who was the coach of the NFL franchise now known as the Washington Football Team, according to the Journal. \nThe email in question was sent amid a tense moment between NFL team owners and their players, who were at a crossroads regarding a collective bargaining agreement that was still being negotiated during a months-long lockout.");

		System.out.println("************* Easy to understand from below **********");
		// common mistake -- missing of ; after the statement
		System.out.println("My Name is Tofael. I am your instructor.");
		System.out.println("My Name is \'Tofael\'. I am your instructor.");
		System.out.println("My Name is \"Tofael\". I am your instructor.");
		System.out.println("My Name is \\Tofael\\. I am your instructor.");
		System.out.println("Tofael"); // common mistake -- missing of " " in String

	} // common mistake -- missing of }, because we accidently delete it

}
