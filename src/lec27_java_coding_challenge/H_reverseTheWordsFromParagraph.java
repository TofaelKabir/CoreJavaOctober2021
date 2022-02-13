package lec27_java_coding_challenge;

import java.util.Arrays;

/*

Interview question in comcast (PA)
Write a function to transform input, e.g.:
Input: "Hello Mohammad Tofael Kabir Sharkar"
Output: "Sharkar Kabir Tofael Mohammad Hello"

*/

public class H_reverseTheWordsFromParagraph {

	public static void main(String[] args) {
		String name = "Lorem ipsum dolor sit amet consectetur adipisicing elit. Voluptas tempora debitis maiores nemo modi! Alias pariatur nulla rem ipsum, molestiae modi atque dignissimos eius impedit, dolorem iusto voluptatem qui ea?";
		String [] words = name.split(" ");
		// System.out.println(Arrays.toString(words)); 
		// I did above line just to show that the sentence is splitted to a List
		
		for(int i = words.length-1; i>=0; i--) {
			System.out.print(words[i]+" ");
			// Why print not println?
			// why we use " " ?
		}

	}

}
