package easy;

public class CountAndSay {
	public static void main(String args[]) {
		String number = countAndSay(3);
		/*
		 * 1.     1
		 * 2.     11
		 * 3.     21
		 * 4.     1211
		 * 5.     111221
		 */
		System.out.println(number);
	}
    public static String countAndSay(int n) {
    	String result = "1";
    	if(n==1) {
    		return result;
    	}
    	int i =2;
        while(i <= n) {
        	StringBuilder newResult = new StringBuilder();
        	int amount = 1;
        	amount=1;
        	for(int j = 1; j< result.length(); j++) {
        		if(result.charAt(j)==result.charAt(j-1)) {
        			amount++;
        		}
        		else {
        			newResult.append(amount);
        			newResult.append(result.charAt(j-1));
        			amount = 1;
        		}
        	}
        newResult.append(amount);
        newResult.append(result.charAt(result.length()-1));
    	result = newResult.toString();
        i++;
        }
        return result;
    }
}
