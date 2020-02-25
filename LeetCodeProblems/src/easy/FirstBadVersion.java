package easy;

public class FirstBadVersion {
	public static void main(String args[]) {
		int[] nums= new int[]{1,2,3,5};
	
		System.out.println(firstBadVersion(5));

	}
	
	
	
    public static int firstBadVersion(int n) {
    	int start =0;
        int end = n;
        while (start<end) {
        	int middle =start + (end-start)/2;
        	if(isBadVersion(middle)==true) {	
        		end=middle;
        	}
        	else {		
        		start=middle+1;
        	}
        }
        return start;
    }
    
    public static boolean isBadVersion(int n) {
    	if (n>=4) {
    		return true;
    	}
    	return false;
    }
}
