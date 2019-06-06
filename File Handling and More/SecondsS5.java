/* @author 764034
 * Problem Statement: Write a program to find seconds since 1970.
 * 
 * @Logic
 * currentMillis() and dateTime() records the time from 1.1.1970
 * That's why using currentMillis() in this particular statement 
 * 
 * @Pseudo-Code
 * Step 1: Calculates the seconds since 1.1.1970
 * */
package assignments;

public class SecondsS5 {

	public static void main(String[] args) {
		
		// dateTime() can also be used
		// currentMillis() records the 
		// since 1.1.1970
		long seconds = System.currentTimeMillis() / 1000l;
		System.out.println("\nSeconds since 1970: "+seconds);
	}

}
