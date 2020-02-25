package easy;

public class PlusOne {
	public static void main(String args[]) {
		int[] numbers = new int[] {9,9,9,9};
		int [] newnumbers =plusOne(numbers);
		System.out.println(newnumbers[0]);
		System.out.println(newnumbers[1]);
		System.out.println(newnumbers[2]);
		System.out.println(newnumbers[3]);
		System.out.println(newnumbers[4]);

		
	}
    public static int[] plusOne(int[] digits) {
    	int i = digits.length-1;
    	if (digits[i] == 9) {
    		for(i=digits.length-1; i>=0; i--) {
    			if(digits[i]==9) {
    				digits[i]=0;
    				if(i==0) {
        				int[] newDigits = new int[digits.length+1];
        				newDigits[0] = 1;
        				for (int j =0; j<digits.length-1; j++) {
        					newDigits[j+1] = digits[j];
        				}
        				digits=newDigits;
        			}
    			}
    			else {
    			 digits[i]++;
    			 break;
    			}
    		}
    	}
    	else {
    		digits[i]++;	
    	}
		return digits;
        
    }
}
