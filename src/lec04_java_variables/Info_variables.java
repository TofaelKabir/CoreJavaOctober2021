package lec04_java_variables;

/*
1) What does a class body contain?
-- class body contain:
			-- i) Variable --- Declared and/or Initialize
			-- ii) Constructor  --- Declared and/or Initialize
			-- iii) Method  --- (not declared) Implemented and/or Initialize *** interview question

2) What is a Variable?
-- A variable is a container that holds values that are used in a Java program. 
-- Every variable must be declared to use a data type. 
-- Variable is also called field

3) What are the most commonly used variables?
-- String, int, char, boolean, double.

4) what does it mean by -- variable declared?
-- it means we did not assign any value for variables.

5) what does it mean by -- variable initialized?
-- it means we assign value for variables.

6) What is the Info about String type variables?
-- String type variable start with Uppercase, String type variable is inside double quotation.
-- By default, the value of String is null. (important interview question)

7) What is the Info about int (called Integer) type variables?
-- int type variable start with lowercase, int type variable doesn't have any quotation
-- By default, the value of int is zero. (important interview question)

8) What is the Info about char type variables?
-- char type variable start with lowercase, char type variable is inside single quotation

9) What is the Info about boolean type variables?
-- boolean type variable start with lowercase, boolean type variable doesn't have any quotation, only true or false.
-- By default, the value of Boolean is False. (important interview question)

10) Can you call a non-static variable or method inside the main method?
-- a non-static variable (or non-static method) can't be called inside a main method (which is a static method).
-- solved by 2 way 
i) By making the variables static outside the main method
ii) Or by moving (initialized) the variables inside the main method without access modifier and without static keyword
						
11) " " -- is it called?
--  empty/null String

12) How to call a Variable in the main method?
-- We don't need to put it inside double quotation or single quotation like String, Just call the variables by it's name, inside sysout to see the initialized value of the variable.

13) Can we call multiple variables inside one sysout by + symbol and see the outcome?
-- Yes

14) Can we call multiple variables and String inside one sysout by + symbol and see the outcome?
-- Yes

15) Is the Constructor name the same as Class Name?
-- Yes

16) What are the features of the method?
-- method name is always starts with lowercase
-- class doesn't have a parentheses, but the method have
-- when {curly braces} is present, then we can say, the method is implemented
-- method can not be declared (only implemented) like variables or constructor inside a class.
-- method name can be the same as Class name, but must be in lower case. -- important interview question

17) What is the naming convention for variables?
-- non-constant field/variable names start with lowerCase. Exception is String type, they start with UpperCase.
-- variable names must be specific and meaningful
-- no duplication is accepted. example below.
 	public  int houseNumber = 625; // variable initialized
	public  int avenueNumber; // variable declared

18) What is the naming convention for Constant?
-- Constant names are written with all upper case letters with words separated by underscores. Example below -
 	public String WEDDING_REGISTRY_PAGE_TITLE = "Amazon Wedding";
	public int LONG_WAIT = 10;

19) Can we use variable types as variable Names or any other Java keyword?
-- No, Names like "string1, myarray1, no_1" are not acceptable as variable names
-- because they are are not specific and can cause confusion like the variable below:
	public  String string = "String"; x
	
20) What is the naming convention for methods?
-- method names starts with lowerCase
-- method names are usually verbs or verb phrase	

 */

public class Info_variables {

}
