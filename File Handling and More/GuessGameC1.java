/* @author 764034
 * Problem Statement: Extend the M1 using User Interface through WebApplication.  
 * The user would have to input the guessing number in a field and the results are 
 * available in the screen.
 * 
 * @Logic
 * Using the random function to generate a random number for the guessing game
 * then it asks us to enter the probable number then tells us higher or lower
 * on the basis of our number to random number (PlusMinus 10 range).
 * It tells us higher or lower on the basis of that.
 * 
 * @Pseudo-Code
 * Step 1: Enter the Name/Argument.
 * Step 2: Printing the GreetingS7 through command line.
 * */
package assignments;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GuessGameC1 extends JFrame {

// Declare class variables
private static final long serialVersionUID = 1L;
public static Object prompt1;
private JTextField userInput;
private JLabel comment = new JLabel(" ");
private JLabel comment2 = new JLabel(" ");
private int randomNumber;
private int counter = 0;

public GuessGameC1() {
    super("Guessing Game");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // Content pane
    setLayout(new FlowLayout());
    Container c = getContentPane();

    // Create components
    JButton guessButton = new JButton("Check");
    JButton newGameButton = new JButton("New Game");
    JButton quitButton = new JButton("Quit");
    JLabel prompt1 = new JLabel("I have a number between 1 and 100.");
    JLabel prompt2 = new JLabel("Can you guess the number?");
    JLabel prompt3 = new JLabel("Please enter your guess: ");
    comment = new JLabel("");
    comment2 = new JLabel("");
    userInput = new JTextField(5);

    // Adding components to the pane
    c.add(prompt1);
    c.add(prompt2);
    c.add(prompt3);
    c.add(userInput);
    c.add(guessButton);
    c.add(newGameButton);
    c.add(quitButton);
    c.add(comment);
    c.add(comment2);

    // Set the mnemonic
    guessButton.setMnemonic('T');
    newGameButton.setMnemonic('N');
    quitButton.setMnemonic('Q');

    // Format pane
    setSize(500, 300);
    setLocationRelativeTo(null);
    setVisible(true);
    setResizable(false);

    initializeNumber();

    GuessButtonHandler ghandler = new GuessButtonHandler(); 
                                                            
    guessButton.addActionListener(ghandler); 

    NewButtonHandler nhandler = new NewButtonHandler();
    newGameButton.addActionListener(nhandler);

    QuitButtonHandler qhandler = new QuitButtonHandler();
    quitButton.addActionListener(qhandler);
} 

private void initializeNumber() {
    randomNumber
    = new Random().nextInt(101) + 1;
}

private class GuessButtonHandler implements ActionListener {
    public void actionPerformed(ActionEvent e) {

        // Declare class variables
        int getUserInput;
        int diff;
        int Difference;

        // Validate input and if statements for user input
        try {
            getUserInput = Integer.parseInt(userInput.getText().trim());
            counter++;

            if (getUserInput == randomNumber) {
                JOptionPane.showMessageDialog(null, "Correct! It took you "
                        + counter + " guesses", "Random Number: "
                        + randomNumber, JOptionPane.INFORMATION_MESSAGE);
                initializeNumber();
                return;
            }
            if (getUserInput > randomNumber) {
                comment2
                        .setText("The guess was too HIGH. Try a lower number.");
                comment2.setForeground(Color.BLACK);
                diff = getUserInput - randomNumber;
                Difference = Math.abs(diff);
            } else {
                comment2
                        .setText("The guess was too LOW. Try a higher number.");
                comment2.setForeground(Color.BLACK);
                diff = randomNumber - getUserInput;
                Difference = Math.abs(diff);
            }

            /*if (Difference >= 30) {
                comment.setText("You are Far from guess. ");
                comment.setForeground(Color.BLACK);
                //GuessGameC1.this.setBackgroundColor(Color.BLUE);
            }

            if (Difference <= 15) {
                comment.setText("You are close to guess");
                comment.setForeground(Color.BLACK);
                //GuessGameC1.this.setBackgroundColor(Color.RED);
            }*/
        } catch (NumberFormatException ex) {
            comment.setText("Enter a VALID number!");
        }
    }
} 

private class NewButtonHandler implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        GuessGameC1 app = new GuessGameC1();

    }
} 

private class QuitButtonHandler implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }
}

public static void main(String args[]) {
    // instantiate GuessGame object
    GuessGameC1 app = new GuessGameC1();

	}
}
