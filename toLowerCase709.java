
public class toLowerCase709 {
	
	 public String toLowerCase(String str) {
	        
	        char[] charArray = str.toCharArray();
	        StringBuilder result = new StringBuilder();
	        
	        for(int i=0; i < charArray.length; i++){
	            charArray[i] = Character.toLowerCase(charArray[i]);
	            result.append(charArray[i]);
	        }         
	        
	        return result.toString();
	    }

}
