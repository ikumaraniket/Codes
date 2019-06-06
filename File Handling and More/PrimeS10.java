/* @author 764034
 * Problem Statement: Write a program that prints  n prime numbers. N is an input given in command line. 
 * 
 * @Logic
 * if a number n is not a prime. It can be factored into two
 * factors a and b, n=a*b. If both a and b were greater than 
 * the square root of n, a*b would be greater than n,
 * So at least one of those factors must be less than or equal 
 * to the square root of n, and to check if n is prime we only 
 * need to test for factors less than or equal to the square root.
 * */
package assignments;

import java.util.*;

public class PrimeS10 {

	public static void main(String[] args) {
		
		// Variables
		int n;
		int flag = 1;
		int num=3;
		
		// inputting first N value of prime to be Printed
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Value of n:");
		
		// The Entered value is stored in var n
		n = scanner.nextInt();
		
		if(n>=1)
		{
			System.out.println("First "+n+" prime numbers are:");
			
			// 2 is a known prime number
			System.out.println(2);
		}
		
		
		// Logic of printing the prime number
		// and discarding the number whose 
		// status(flag) is zero
	
		for ( int i=2; i<=n; )
		{
			for( int j=2; j<= Math.sqrt(num); j++)
			{
				if (num%j == 0)
				{
					flag = 0;
					break;
				}
			}
			
				if(flag != 0)
				{
				System.out.println(num);
				i++;
				}
			flag = 1;
			num++;
		}
		
		scanner.close();
		
	}

}
