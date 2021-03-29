/**
 * 
 */
package w3source;

import java.util.Scanner;

/**
 * @author Abdoulsalam
 *Java Exercises: Find the penultimate word of a sentence
 *Java program to find the penultimate (next to last) word of a sentence.
 */
public class penultimate_word {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.print("Input a sentence: ");
		String line = in.nextLine();
		String[] words = line.split("[  ]+");
		System.out.println("Penultimate word: " + words[words.length - 2]);

	}

}
