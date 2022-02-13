package lec27_java_date_and_time;

/*

What are Java Dates?
-- Java does not have a built-in Date class, but we can import the java.time package to work with the date and time API. The package includes many date and time classes. For example:
LocalDate -- Represents a date (year, month, day (yyyy-MM-dd))
LocalTime -- Represents a time (hour, minute, second and nanoseconds (HH-mm-ss-ns))
LocalDateTime -- Represents both a date and a time (yyyy-MM-dd-HH-mm-ss-ns)
DateTimeFormatter	 -- Formatter for displaying and parsing date-time objects 
-- To display the current date, we have to import the java.time.LocalDate class, and use its now() method.
-- To display the current time (hour, minute, second, and nanoseconds), we have to import the java.time.LocalTime class, and use its now() method.
-- To display the current date and time, we have to import the java.time.LocalDateTime class, and use its now() method.
-- We can use the DateTimeFormatter class with the ofPattern() method in the same package to format or parse date-time objects. It will remove both the "T" and nanoseconds from the date-time (described above.
-- The ofPattern() method accepts all sorts of values, if you want to display the date and time in a different format
	    yyyy-MM-dd 
	    dd/MM/yyyy
	    dd-MMM-yyyy
	    E, MMM dd yyyy

*/

public class E_infoJavaDateAndTime {

}
