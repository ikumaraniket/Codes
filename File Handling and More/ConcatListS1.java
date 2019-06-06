/* @author 764034
 * Problem Statement: Write a function that concatenates two lists. 
 * 
 * @Logic
 * A simple usage of ArrayList in which two
 * lists are created and joined together in
 * the final list.
 * 
 * @Pseudo-Code
 * Step 1: Enter the Values of List A.
 * Step 2: Enter the Values of List B.
 * Step 3: Using addAll() to merge into same List Final.
 * Step 4: Printing the Final List.
 */
package assignments;

import java.util.*;

public class ConcatListS1 {

    public static void main(String[] args) {
    	
    	// list A contains {a,b}
    	List<String> listA= new ArrayList<String>();
    	listA.add("a, b");
    	
    	// list B contains {1,2,3,4}
    	List<String> listB= new ArrayList<String>();
    	listB.add("1, 2, 3, 4");
    	
    	// Final list contain all the elements of 
    	// list A and list B
    	List<String> listFinal= new ArrayList<String>();
    	listFinal.addAll(listA);
    	listFinal.addAll(listB);
    	
    	System.out.println("listA: "+ listA);
    	System.out.println("listB: "+ listB);
    	System.out.println("listFinal: "+ listFinal);
    }
}
