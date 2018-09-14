/*
 * You're given strings J representing the types of stones that are jewels, and S representing the stones you have.  Each character in S is a type of stone you have.  
 * You want to know how many of the stones you have are also jewels.

The letters in J are guaranteed distinct, and all characters in J and S are letters. 
Letters are case sensitive, so "a" is considered a different type of stone from "A".

Example 1:

Input: J = "aA", S = "aAAbbbb"
Output: 3
Example 2:

Input: J = "z", S = "ZZ"
Output: 0
Note:

S and J will consist of letters and have length at most 50.
The characters in J are distinct.
 */

import java.util.Arrays;

public class JewelsAndStones771 {
	
	public static int numJewelsInStones(String J, String S) {
        
        char[] j = J.toCharArray();
		char[] s = S.toCharArray();
		int result = 0;
		
		for(char c : s) {
			if (Arrays.asList(j).contains(c)) {
				result = result + 1;
			}
			
			else continue;
		}
		
		return result;       
    }	
	
	public static void main(String[] args) {
		
		String J = "aA";
		String S = "aAAbbbb";
		
		System.out.println(numJewelsInStones(J, S));
	}
}
