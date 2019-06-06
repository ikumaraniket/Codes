/* @author 764034
 * Problem Statement: "Write Hangman game where the user would provide the word and computer would have 
 * to guess.It starts with user providing the number of letters and starts by computer guessing either 
 * a letter or a word and user marking the right letters in position or only the right letters."
 * 
 * @Pseudo-Code
 * Step 1: Enter the Number you think is the guessed number.
 * Step 2: Try guessing number if you don't succeed.
 * Step 3: Computer will prompt if the guessed number is higher or lower than your number.
 * */
package assignments;

import java.util.*;

public class HangManC2 {

    public static final String word = "MONSTER";
    public static final int MAX_GUESSES = 10;
    public static int score, guesses;
    public static Scanner scanner;

    public static void main(String[] args) {

        score = guesses = 0;
        scanner = new Scanner(System.in);

        printRules();
        playGame();
        gameFinished();

        // Close the scanner when we're done using it
        scanner.close();

    }

    public static void printRules() {

        System.out.println("Welcome to Hangman! These are the rules:\n" +
                "You have 10 guesses to guess the word.\n" +
                "The word is " + word.length() + " characters long.\n" +
                "Get " + word.length() + " points before you run out of turns to win!\n" +
                "Don't guess the same letter twice!\n\n");
    }

    public static void playGame() {

        for (int i = 0; i < MAX_GUESSES; i++) {

            char letter = getInput();
            System.out.println("You guessed: " + letter + "\n");

            checkIfLetterCorrect(letter);

            // Stop the game if the player wins
            if (score >= word.length()) {
                break;
            }

            guesses++;

            System.out.println("Number of guesses: " + guesses +"\nScore: " + score + "\n");
        }

    }

    public static char getInput() {

        System.out.println("Please guess a letter: ");
        String input = scanner.nextLine().toUpperCase();

        return input.charAt(0);
    }

    public static void checkIfLetterCorrect(char letter) {

        for (int i = 0; i < word.length(); i++) {

            // Check every letter to see if it matches. Helps with revealing.
            if (word.charAt(i) == letter) {
                score++;
            }

        }
    }

    public static void gameFinished() {

        if (score == word.length()) {

            System.out.println("Congratulations! You win!");

        } else {

            System.out.println("Ahh, too bad! Better luck next time!");

        }

        System.out.println("The word was: " + word + "\nThank you for playing!");
    }

}
