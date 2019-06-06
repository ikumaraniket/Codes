/* @author 764034
 * Problem Statement: Write a program that prints the next 20 leap years.
 * 
 * @Logic
 * logic used modulo with 4 doesn't confirm
 * so using yr != 100 guarantees a leap year.
 * 
 *  
 * @Pseudo-Code
 * Step 1: Enter the year.
 * Step 2: Check if it is a leap year or not.
 * Step 3: If a leap year then prints next 20 leap year.
 * Step 4: If not then prints not a leap year.
 * */
package assignments;

import java.util.*;

public class LeapYearS9 {

	public static void main(String[] args) {
		int yr;
		Scanner scan = new Scanner(System.in);
		
		// Entering the year you want to verify for leap year
		System.out.println("Enter Year: ");
		yr = scan.nextInt();
		
		// leap year logic
		if((yr % 4 == 0) && (yr%100 != 0))
		{
			System.out.println("This is a leap year");
			System.out.println("Next 20 leap years are: ");
	
			for(int i=0;i<20;i++){
				yr=yr+4;
				System.out.println(yr);
		}
		
		}
		else if((yr%100 == 0) && (yr%400 == 0))
		{
			System.out.println("This is a leap year\n");
			System.out.println("Next 20 leap years are: ");
			
			for(int i=0;i<20;i++){
				yr=yr+4;
				System.out.println(yr);
			}	
		}
		else if((yr%400 == 0))
		{
			System.out.println("This is a leap year");
			System.out.println("Next 20 leap years are: ");
			
			for(int i=0;i<20;i++){
				yr=yr+4;
				System.out.println(yr);
			}	
		}
		else
		{
			// if in this else case then no condition
			// above was followed
			System.out.println("This is not a leap year.");
		}
			
	}

}
