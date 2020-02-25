package easy;

public class LongestCommonPrefix { 
	
	public static void main(String args[]) {
		String [] words = new String [3];
		words[0] = "flower";
		words[1] = "flat";
		words[2] = "fuck";
		System.out.println(longestCommonPrefix(words));
		
		String [] words2 = new String [2];
		words2[0] = "aca";
		words2[1] = "cba";

		System.out.println(longestCommonPrefix(words2));
		//System.out.println(longestCommonPrefix("IV"));
		//System.out.println(longestCommonPrefix("LXIX"));
		//System.out.println(longestCommonPrefix("MMDCCCIV"));
		//System.out.println(longestCommonPrefix("MCMXCIV"));
		
	}
    public static String longestCommonPrefix(String[] strs) {
    	if (strs.length == 0) {
    		return "";
    	}
    	String commonPrefix = "";
        String smallest = strs[0];
        for (int k = 1; k < strs.length; k++) {
            if (strs[k].length() < smallest.length()) {
                smallest = strs[k];
            }
        }
    	for (int j = 0; j< smallest.length(); j++) {
    		int amount = 0;
    		for(int i = 0; i<strs.length; i++) {
    			 //System.out.println("amount ennen " + amount);
    			//System.out.println("i " + i + " smallest " + smallest.charAt(j));
    			//System.out.println("j " + j + " strs " + strs[i].charAt(j));
    			 if (smallest.charAt(j) == strs[i].charAt(j))
    				amount++;
    			// System.out.println("amount " + amount);
    			}
    		if(amount == strs.length) {
    			commonPrefix += smallest.charAt(j);
    		}
    		else {
    			break;
    		}
    	}	
        return commonPrefix;
    }
}
