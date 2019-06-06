/* @author 764034
 * Problem Statement: Write a program that asks the user for a number n and prints the sum of the numbers 1 to n
 * 
 * @Logic
 * Taking input from the user and then printing the sum of the
 * first n numbers using a for loop which starts from 1 to n and
 * value of i increments itself using i++.
 * 
 * @Pseudo-Code
 * Step 1: Enter the Number to which you want the sum till.
 * Step 2: Printing the sum of the first n Numbers.
 * */
package assignments;

import java.util.*;

public class SumOfNumS11
{
	
public static void main(String args[]) {
	// Variables used	
	int sum = 0;
	
	// Inputting the Value
	Scanner input = new Scanner(System.in);  
	System.out.println("Enter n number till which you want sum: ");
	
    
	int n = input.nextInt();
    
	// Logic for printing sum of n Numbers
	for(int i = 1;i <= n;i++)
		{
			sum = sum + i;
		}
	
	// printing the sum of n numbers
	System.out.println("The Sum Of "+n+" Numbers are:" + sum);
	
	input.close();
	
	}

}
