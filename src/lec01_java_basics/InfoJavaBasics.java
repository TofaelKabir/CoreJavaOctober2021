package lec01_java_basics;

/*

1) What is a Programming language?
-- Programming language is a computer language, which contains (comprises of) a set of instructions used to produce various kinds of output (code) understood by a machine. 

2) What is Java?
-- Java is an object-oriented programming language developed by James Gosling and colleagues at Sun Microsystems in the early 1990s. Java version 1.0 was first released by Sun Microsystems in 1996. Oracle bought Java in 2008 and presently Java belongs to Oracle. Open source language.

3) What is Eclipse?
-- This is an IDE. IDE stands for Integrated Development Environment. 
-- An IDE is a collection of software (software suite) that combines (consolidates) basic tools required to write and test software.

4) How to create a Project, package and Class?

-- Project: File -- New -- Java Project -- Name starts with Upper Case.
-- Package: Expand the Project name and then select src file --> right click --> New --> select package (yellow 4 box)  --> Name starts with lowercase 
-- Class: select package --> right click --> New --> Select Class (Green circular) --> Name starts with UpperCase --> Select main method

6) What is JRE? 
-- Java Runtime Environment. Function: Help Compilation of code and run Java

7) What is a Camel case feature?  
-- When the second words start with uppercase in Class, Enum, method, constructor, interface, package, project name.
-- Camel case example for a project --> October2021CoreJava
-- Camel case example for a package --> lec01JavaBasics
-- Camel case example for a class --> NamingConventions

What is an alternative to the camel case?
-- Underscore and then start with lowercase. 
-- Alternative example of Camel case, for a project --> October_2021_core_java 
-- Alternative example of Camel case, for a package --> lec01_java_basics
-- Alternative example of Camel case, for a class --> Naming_conventions

8) What is the Main method?
-- Entry point for Java. 
represented by - 
public static void main(String[] args) {
}
-- The method is static

9) Who are the access modifier? ***important interview question
-- public, protected, private, default
-- To learn more:
https://www.javatpoint.com/access-modifiers#:~:text=The%20access%20modifiers%20in%20Java,types%20of%20Java%20access%20modifiers%3A&text=It%20cannot%20be%20accessed%20from%20outside%20the%20class.

10) how to print sysout by shortcut when content assist is absent?
-- Syso + ctrl + space bar 

11) How to write the main method when you forgot to select and you already set up content assist?
-- main + enter

12) What is Java_comments?
-- The Java comments are the statements that are not executed by the compiler and interpreter. The comments can be used to provide information or explanation about the variable, method, class or any statement. It can also be used to hide program code.
-- 2 types -- multiple line comments and single line comment
-- In multiple line comments, It is not necessary that you must have to write multiple lines. If you put single slash + start, then star + single slash, then this format is used for multiple line comments.
 -- In single line comment, a single line is used for commenting
-- How to create a single line comment?
-- for Windows user: we use control + / 
-- for Mac user: we use command + /

13) What is the current version of Java? ****
--> 17 (update accordingly)

14) What is the most stable version of Java? ****
--> 1.8

15) What is the advantage of using Java 1.8?
--> It has compatibility with other applications.

16) What is the command to check the Java version?*****
--> command: java -version

17) What is the command to check the Git version?*****
--> command: git --version

18) Write some names of IDE’s other than Eclipse. ****
-- IntelliJ IDEA, WebStorm (for Javascript), PyCharm (for python), Visual Studio Code, Atom etc.




 */


public class InfoJavaBasics {

	public static void main(String[] args) {
		System.out.println("Info of Java Basics described here");

	}

}
