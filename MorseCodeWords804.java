import java.util.HashSet;
import java.util.Set;

public class MorseCodeWords804 {
	
	public static int uniqueMorseRepresentations(String[] words) {
		
		String [] morses = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
		
		Set<String> results = new HashSet<String>();
		
		for (int i = 0; i < words.length; i++) {
			
			char[] chars = words[i].toCharArray();
			
			StringBuilder sb = new StringBuilder();
			
			for(char c : chars) {
				sb.append(morses[c - 'a']); // what is this mean????
			}
			
			results.add(sb.toString());
		}
        
		return results.size();
    }
	
	public static void main(String [] args) {
		
		String[] words = {"gin", "zen", "gig", "msg"};
		
		System.out.println(uniqueMorseRepresentations(words));
		
	}
	
}
