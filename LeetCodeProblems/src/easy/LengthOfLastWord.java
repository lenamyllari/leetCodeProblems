package easy;

public class LengthOfLastWord {
	public static void main(String args[]) {
		System.out.println(lengthOfLastWord("	     "));
		
		System.out.println(lengthOfLastWord("Lena on 	alykas 		"));
		
		
	}
	 public static int lengthOfLastWord(String s) {
	       if(s.replaceAll("\\s+","").length()==0) {
	    	   return 0;
	       }
	       else {
	    	   s = s.replace("\t", "");
	    	   String[] arrayOfStr = s.split(" ");
	    	   int indexOfLast = arrayOfStr.length;
	    	   return arrayOfStr[indexOfLast-1].length();
	       }
	    }
}
