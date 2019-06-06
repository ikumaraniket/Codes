/* @author 764034
 * Problem Statement: Write a function that deletes all matching elements from a list. [a, b, c, d, a, d, f, g].
 * Construct  many list on your and try.
 * 
 * @Logic
 * Converting list to set as set automatically eliminates duplicate elements
 * 
 * @Pseudo-Code
 * Step 1: Entered the list containing duplicate elements.
 * Step 2: Prints the distinct list.
 * */
package assignments;

import java.util.*;

public class RemoveDuplicateS3 {

	public static void main(String[] args) {
		List<String> l= new ArrayList<String>();
		l.add("a");
		l.add("b");
		l.add("c");
		l.add("d");
		l.add("a");
		l.add("d");
		l.add("g");
		
		// converting to set as it automatically deletes duplicate elements
		System.out.println("The List containing Duplicates is: "+l.toString());
		Set<String> s= new LinkedHashSet<String>(l);
		System.out.println("The Refined list without Duplicates is: "+s);
	}

}
