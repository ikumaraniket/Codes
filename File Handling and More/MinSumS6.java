/* @author 764034
 * Problem Statement: Given an array of distinct integers arr[], 
 * the task is to find a pair which has the minimum sum and print
 * the sum.
 *
 * @Pseudo-Code
 * Step 1: Entered the array.
 * Step 2: Checks the minimum pair sum.
 * */
package assignments;

public class MinSumS6 {
	
	// Function to return the sum of the
	// minimum pair from the array
	public static int smallest_pair(int[] a, int n)
	{
		int min = Integer.MAX_VALUE, secondMin = Integer.MAX_VALUE;
		for (int j=0; j<n;j++)
		{
			// If found new minimum
			if(a[j]< min)
			{
				// Minimum now becomes second minimum
				secondMin=min;
				
				// update minimum
				min=a[j];
			}
			// if current element is > min and < secondMin
			else if((a[j]< secondMin) && (a[j] != min))
				// update secondMin
				secondMin=a[j];
			}
			// return the sum of the minimum pair
			return (secondMin+ min);
		}

	public static void main(String[] args) {
		int[] arr = {2,3,4,5};
		int n = arr.length;
		
		System.out.println("The smallest pair sum is: "+smallest_pair(arr,n));

	}

}
