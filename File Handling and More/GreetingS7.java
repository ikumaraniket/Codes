/* @author 764034
 * Problem Statement: Write a program that asks the user for their name and greets them with their name. 
 * The program obtains their name in command line and then prints out a GreetingS7.
 * 
 * @Logic
 * Java args contains the supplied command-line arguments as an array 
 * of String objects.In other words, if you run your program as java MyProgram 
 * one, two then args will contain ["one", "two"] . If you wanted to output the
 * contents of args. 
 * 
 * @Pseudo-Code
 * Step 1: Enter the Name/Argument.
 * Step 2: Printing the GreetingS7 through command line.
 * */

package assignments;

public class GreetingS7 {

	public static void main(String[] args) {
		
		// for GreetingS7
		if(args.length > 0)
		{
			System.out.println("Hello. How you doing?");
		
			// Using this we are supplying
			//argument directly with command line
			for(String val:args){
			System.out.println(val);		
			}
		}
		else{
			// no arguments provided
			System.out.println("No Command line arguments found");
			}

	}
	
}
