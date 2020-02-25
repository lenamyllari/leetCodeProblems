package easy;

public class PalindromeNumber {
	 public static boolean isPalindrome(int x) {
		   // Find the appropriate divisor 
	        // to extract the leading digit 
		 if (x<0 && x>-10) {
			 return false;
		 }
	        int divisor = 1; 
	        while (x / divisor >= 10) {
	            divisor *= 10; 
	        	System.out.println("divisor " + divisor );
	        }
	        while (x != 0) 
	        { 
	            int leading = x / divisor;  
	            int trailing = x % 10; 
	            System.out.println("divisor " + divisor );
	            System.out.println("leading " + leading );
	            System.out.println("trailing " + trailing );
	            // If first and last digit  
	            // not same return false 
	            if (leading != trailing)   
	                return false; 
	       
	            // Removing the leading and trailing 
	            // digit from number 
	            x = (x % divisor) / 10; 
	       
	            // Reducing divisor by a factor  
	            // of 2 as 2 digits are dropped 
	            divisor = divisor / 100; 
	        } 
	        return true; 
	    }
		public static void main(String args[]) {
			
		
			System.out.println(isPalindrome(-2));
			System.out.println(isPalindrome(-212));
		}
}
