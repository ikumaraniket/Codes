/* @author 764034
 * Problem Statement: Write a program to find out a missing number in an Array.
 *
 *@ Logic
 *	simple maths logic used to devise the algorithm.
 * @Pseudo-Code
 * Step 1: Entered the array.
 * Step 2: Checks which number is missing.
 * */
package assignments;

public class MissingNumberM4 {

	public static void main(String[] args) {
		int total_num;
		
		// entered the value already
		// no need for try-Catch block
		int[] numbers = new int[]{1,2,3,4,5,7};
		total_num = 7;
				int expected_num_sum = total_num * ((total_num + 1) / 2);
		int num_sum = 0;
		for(int i: numbers){
			num_sum += i;
		}
		
		// Prints the missing number
		System.out.print("The missing number from the array is: ");
		System.out.print(expected_num_sum - num_sum);
		System.out.print("\n");
	}

}
