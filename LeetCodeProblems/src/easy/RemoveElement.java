package easy;

public class RemoveElement {

	public static void main(String args[]) {
		int[] nums= new int[]{};
		int newNums = removeElement(nums,3);
		System.out.println(newNums);
		for(int i =0; i <newNums; i++ ) {
			System.out.println(nums[i]);
		}
	}
	
	  public static int removeElement(int[] nums, int val) {
		  int j = 0;
	        for(int i =0; i < nums.length; i++){
	        	
	            if (nums[i]!=val) {
	            	nums[j]=nums[i];
	            	j++;
	            }
	        }
	        return j;
	    }
}
