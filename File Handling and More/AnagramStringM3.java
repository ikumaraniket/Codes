/* @author 764034
 * Problem Statement: Write a function to check whether two given strings are anagram of each other or not.
 * An anagram of a string is another string that contains same characters, only the order 
 * of characters can be different. For example, “abcd” and “dabc” are anagram of each other.
 * 
 * @logic
 * Converting the string into lowercase so that it can be checked for anagrams correctly as 
 * the lowercase and uppercase will be seen differently then converting it to separate values
 * then sorting the array using arrays.sort() 
 * using tochararray() then checking if it is equal using equals()
 * 
 * @Pseudo-Code
 * Step 1: Enter two comma separated strings.
 * Step 2: Converts them to lower case.
 * Step 3: Converts to separate characters.
 * Step 4: Sort them and check if it equals.
 * Step 5: If equal then an Anagram.
 * */

package assignments;

import java.util.*;  

public class AnagramStringM3 {  
    static void isAnagram(String str1, String str2) {  
    	
        String s1 = str1.replaceAll("\\s", "");  
        String s2 = str2.replaceAll("\\s", "");  
        
        boolean tf = true;
        
        // if string length not same then cannot be an anagram
        if (s1.length() != s2.length()) {  
            tf = false;  
        } else { 
        	
        	// converting to lower case and separate letter using CharArray
            char[] ArrayS1 = s1.toLowerCase().toCharArray();  
            char[] ArrayS2 = s2.toLowerCase().toCharArray();
            
            // sorting the array
            Arrays.sort(ArrayS1);  
            Arrays.sort(ArrayS2);

            // Checking if equal or not using equals function
            tf = Arrays.equals(ArrayS1, ArrayS2);  
        }  
        
        if (tf) {  
            System.out.println(s1 + " and " + s2 + " are anagrams");  
        } else {  
            System.out.println(s1 + " and " + s2 + " are not anagrams");  
        }  
    }  
   
    public static void main(String[] args) {
    	// passing two strings in isAnagram()
        isAnagram("mother", "Peek");  
        isAnagram("Mother In Law", "Hitler Woman");  
    }  
}  