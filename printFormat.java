import java.util.Arrays;

public class printFormat {
	
	public static int[] intList = {1, 2, 3, 4};
	
	public static int[] reverse(int[] list) {
		   int[] result = new int[list.length];

		   for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {
		      result[j] = list[i];
		   }
		   return result;
		}
	

	public static void main(String [] agrs) {
		
		double floatVar =  3.77;
		String stringVar = "wde";
		int intVar = 2;
		System.out.printf("The value of the float variable is " +
                "%f, while the value of the integer " +
                "variable is %d, and the string " +
                "is %s", floatVar, intVar, stringVar);
		
		double[] myList = {1.9, 2.9, 3.4, 3.5};

	      // Print all the array elements
	      for (double element: myList) {
	         System.out.println(element);
	      }
	      
	   //print out a list
	   System.out.println(Arrays.toString(reverse(intList)));	
	   
	   
	      
	}
}
