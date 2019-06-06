/* @author 764034
 * Problem Statement: Write a function that takes a number and returns a list of its digits. So for 2342 it should return 
 * 2 3 4 2 
 * 
 * @Logic
 * We can separate digits of any integer value using the modulus and divison operators itself
 * Used % and / for separating the digits.
 * */

package assignments;

import java.util.Scanner;

public class ExtractDigitsS2 {
	public static void main(String args[])
    {
		System.out.println("/*This Program takes a number and returns a list of its digits.*/");
		// variables used
		int n, m, a;
        
        // Inputting value
		Scanner s = new Scanner(System.in);
        System.out.print("Enter any number:");
        
        n = s.nextInt();
        m = n;
        
        // Logic for extracting numbers from input value
        // like 
        while(n > 0)
        {
            n = n / 10;
        }
        while(m > 0)
        {
            a = m % 10;
            System.out.print(a+" ");
            m = m / 10;
        }
     s.close();
    }
}