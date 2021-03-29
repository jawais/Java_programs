/**
 * 
 */
package w3source;

import java.util.Scanner;

/**
 * @author Abdoulsalam
 * Java program to get a number from the user and print whether it is positive or negative.
 *
 */
public class positive_or_negative {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Input a number: ");
		double number = in.nextDouble();
		
		if (number >= 0) {
			System.out.println("Positive");
		}
		else {
			System.out.println("Negative");
		}
	}

}
