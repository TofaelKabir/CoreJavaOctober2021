package lec24_java_coding_challenge;

import java.util.HashSet;
import java.util.Set;

// findMoreThanOneElement
public class G02_findStringWhichPresentMoreThanOne {

	public static void main(String[] args) {
		String [] language = { "Java", "C++", "C#", "Python", "Java", "C++", "Java", "Python", "Javascript" };
		Set <String> moreThanOne = new HashSet<String>();
		
		for(int i=0; i<language.length; i++) { 
			
			for (int j = i+1; j<language.length; j++) {
				
				if(language[i].equals(language[j])) {
					
					moreThanOne.add(language[i]);
				}
			}
		}
		System.out.println("Duplicated Strings are : "+moreThanOne);
	}

}
