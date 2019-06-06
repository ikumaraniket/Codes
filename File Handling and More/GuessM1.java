/* @author 764034
 * Problem Statement: Write a guessing game where the user has to guess a secret number. After every guess 
 * the program tells the user whether their number was too large or too small. 
 * At the end the number of tries needed should be printed
 * 
 * @Logic
 * Using the random function to generate a random number for the guessing game
 * then it asks us to enter the probable number then tells us higher or lower
 * on the basis of our number to random number (PlusMinus 10 range).
 * It tells us higher or lower on the basis of that.
 * 
 * @Pseudo-Code
 * Step 1: Enter the Number you think is the guessed number.
 * Step 2: Try guessing number if you don't succeed.
 * Step 3: Computer will prompt if the guessed number is higher or lower than your number.
 * */
package assignments;

import java.util.*;

public class GuessM1 {

	public static void main(String[] args) {
		// for input
		Scanner input = new Scanner(System.in);
		
		int count=0;
		// rand function
		int a = 1 + (int) (Math.random() * 99);
		int guess = 0;
		
		System.out.println("anisngh is thinking of a number from 1 to 100"+"... Guess what it is?" );
		
		while (guess != a) {
			
			guess = input.nextInt();
			count++;
			
			if( guess > a) {
				System.out.println("Number anisngh guessed, was lower!");
			} else if (guess < a) {
				System.out.println("Number anisngh guessed, was higher!");
			}
		}
		
		//printing the number of tries using counter
		System.out.println("Congratulations. You guessed the number with "+ count+" tries!");
		
		input.close();
	}

}
