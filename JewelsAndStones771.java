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
