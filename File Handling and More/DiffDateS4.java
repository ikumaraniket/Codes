/* @author 764034
 * Problem Statement: Write a program to compute the difference between two dates (year, months, days)
 * 
 * @Logic
 * Using time library classes we took input of dates
 * then using period.between() and then passing objects
 * of two dates we printed the difference using get___() 
 * functions.
 * 
 * @Pseudo-Code
 * Step 1: Enter the two dates for difference between them
 * Step 2: Printing the difference using period.between().
 * */

package assignments;

import java.time.*;

public class DiffDateS4 {

	public static void main(String[] args) {
		
		// taking input of dates
		LocalDate pdate = LocalDate.of(2012, 01, 01);
		LocalDate now = LocalDate.of(2019, 05, 01);
		
		// difference between two dates
		Period diff = Period.between(pdate, now);
		
		// printing the output
		System.out.printf("\n Difference is %d years, %d months and %d days old \n \n",diff.getYears(),diff.getMonths(),diff.getDays());
	}

}
