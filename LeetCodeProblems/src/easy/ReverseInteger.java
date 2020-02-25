/*
 * Given a 32-bit signed integer, reverse digits of an integer.
Example 1:
Input: 123
Output: 321
Example 2:
Input: -123
Output: -321
Example 3:
Input: 120
Output: 21
Note:
Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: 
[−231,  231 − 1]. For the purpose of this problem, assume that your function returns 0 when the reversed integer 
overflows.
 */

package easy;

public class ReverseInteger {
	public static void main(String args[]) {
	
		System.out.println(reverse(1534236469));
		System.out.println(reverse(210));
		System.out.println(reverse(-321));
	}
	public static int reverse(int x) {

		  String reverse = "";
		  
	     if (x<0){
	    	  reverse = reverse + String.valueOf(x).charAt(0);

	    	  for(int i = String.valueOf(x).length() - 1; i >= 1; i--)
		        {
		        
		        	reverse = reverse + String.valueOf(x).charAt(i);
		        }
	      }
	      else {
		        
		        for(int i = String.valueOf(x).length() - 1; i >= 0; i--)
		        {
		 
		        	reverse = reverse + String.valueOf(x).charAt(i);
		        }
		      }
	     try {
	    	 return Integer.parseInt(reverse);
	    	 
	     }
	     catch(NumberFormatException e) {
	    	 return 0;
	     }
		  
    }
}
