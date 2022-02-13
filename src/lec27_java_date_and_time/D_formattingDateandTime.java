package lec27_java_date_and_time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class D_formattingDateandTime {

	public static void main(String[] args) {
		LocalDateTime myDateObj = LocalDateTime.now();
	    System.out.println("Before formatting: " + myDateObj);
	    
	    /*
	    The ofPattern() method accepts all sorts of values, if you want to display the date and time in a different format
	    yyyy-MM-dd 
	    dd/MM/yyyy
	    dd-MMM-yyyy
	    E, MMM dd yyyy
	    */
	    
	    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss");
	    String formattedDate = myDateObj.format(myFormatObj);
	    System.out.println("After formatting: " + formattedDate);

	}

}
