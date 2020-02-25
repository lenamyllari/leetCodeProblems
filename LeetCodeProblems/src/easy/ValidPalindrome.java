package easy;

/*
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
 * Note: For the purpose of this problem, we define empty string as valid palindrome.
 */

public class ValidPalindrome {
	public static void main(String args[]) {
		String testing = "0p";
		System.out.println(isPalindrome(testing));

	}
	
    public static boolean isPalindrome(String s) {
    	s=s.toLowerCase();
    	if(s.length()==0) {
    		return true;
    	}
    	int i =0;
    	int j = s.length()-1;
    	for (i=0; i<s.length(); i++){
    		System.out.println(s.charAt(i));
    		System.out.println(s.charAt(j));
    		if(!Character.isLetterOrDigit(s.charAt(i))) {
    		//if((s.charAt(i) >= 'a')==false && (s.charAt(i)<= 'z')==false){
    			System.out.println("i " + i);
    			
    			j++;
    			
    		}
    		else if(!Character.isLetterOrDigit(s.charAt(j))) {
    		//else if((s.charAt(j) >= 'a')==false && (s.charAt(j)<= 'z')==false) {
    			System.out.println("j " + j);   			
    			i--;
    		}
    		else if(s.charAt(i)!=s.charAt(j)) {
    			return false;
    		}
    		j--;
    	}
    	return true;
    /*
    	String newString = s.trim();
    	newString = newString.replaceAll("[^a-zA-Z]+", "");
    	newString = newString.toLowerCase();
    	if(newString.length()==1) {
    		return false;
    	}
    	System.out.println(newString);
    	for(int i=0; i<newString.length(); i++) {
    		if(newString.charAt(i) != newString.charAt(newString.length()-i-1)) {
    			
    			return false;
    		}
    	}
        return true;*/
    }
}
