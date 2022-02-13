package lec21_java_string_manipulation01;

/*
String Class:

1. What is the difference between String, String Buffer, String builder? ********* 
-- They are all Class, but differ below-

                       String                   StringBuffer  		    StringBuilder
              --------------------    ----------------------     ------------------------
Storage          String Pool                    Heap                             Heap
Modifiable 	     No (Immutable)	         Yes (Mutable)                Yes (Mutable)
Thread safe		Yes			    			 Yes			       			   	No
Synchronized		Yes			  			     Yes							   	No
Performance		Fast						    Slow								Fast

2. Why is String immutable? *************
-- String is Immutable because it can't be modified.
-- Once you assign a string object, that object can not be changed in memory. In summary, what you did is to change the reference of "a" to a new string object. 
Java String is immutable, String will Store the value in the form of an object. The string "a" remains the same.
https://www.youtube.com/watch?v=to9DPVsdByE

3. Which method finds the length of a string in Java String class?
-- length() method.

4. Which method returns the string in lower case letter in Java String class?
-- toLowerCase() method.

5. Which method returns the string in upper case letter in Java String class?
-- toUpperCase() method.

6. Which method returns the char value at the specified index in Java String class?
-- charAt() method.

7. How does the index number work in String Class?
-- The index number starts from 0 and goes to n-1, where n is the length of the string. 

8. Which method returns the position of the first occurrence of the specified character or string in a specified string in Java String class?
-- indexOf() method.

9. Which method returns a string that is a substring of a string and begins with the character at the specified index and extends to the end of this string?
-- substring (int beginIndex) method.

10. Which method returns a string that is a substring of a string and begins at the specified beginIndex and extends to the character at index endIndex - 1?
-- substring (int beginIndex, int endIndex) method.

11. Which method is used to compare Strings and return a boolean value?
-- equals() method

12. Which method is used to compare two strings which are considered equal ignoring cases if they are of the same length?
-- equalsIgnoreCase() method.

13) Which method is used to eliminate leading and trailing spaces from a Java String class?
--  trim() method.

14) Which method is used to return a string replacing all the old char or CharSequence to new char or CharSequence in Java String class
--  replace() method 

15) Which method returns a string replacing all the sequence of characters matching regex and replacement string?
-- replaceAll() method.

16) Which method combines the specified string at the end of this string and returns a combined string?
-- concat() method.

17) Which method splits this string against a given regular expression and returns a char array.
-- split() method.

18. Which method compares the given string with the current string lexicographically?
-- compareTo() method. It returns a positive number, negative number, or 0.

19. Which method searches the sequence of characters in this string?
-- contains() method. See no 8 for comparison.

20. Which method checks if this string starts with a given prefix?
-- startsWith() method.

21. Which method checks if this string ends with a given prefix?
-- endsWith() method.

22. Which method checks if the input string is empty or not?
-- isEmpty() method.

23. Which method returns a string joined with a given delimiter?
-- join() method.

24. Which method returns the last index of the given character value or substring?
-- lastIndexOf() method. See number of 8.

25. Which method converts different types (int, float etc.) of values into string?
-- valueOf() method.


*/


public class Info_java_string_class {

}
