package easy;

public class SingleNumber {
	public static void main(String args[]) {
		int[] nums= new int[]{2,2,1};
		int unique = singleNumber(nums);
		System.out.println(unique);
	}
	
	 public static int singleNumber(int[] nums) {

	       int unique = nums[0];
	      
	       for(int i = 0; i<nums.length; i++) {
	    	  int amountFound = 0;
	    	  unique = nums[i];
	    	  for (int j=0; j<nums.length; j++) {
	    		  if(nums[j]==unique) {
	    			  amountFound++;
	    			  if(amountFound==2) {
		    			  break;
		    		  }
	    		  }
	    	  }
	    	  if(amountFound ==1) {
	    			return unique;
	    		} 
	       }
	       return unique;
	}
}
